package androidx.savedstate;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/v;", "Lo4/g;", "owner", "<init>", "(Lo4/g;)V", "o4/a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes13.dex */
public final class Recreator implements androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public final o4.g f12322d;

    public Recreator(o4.g owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        this.f12322d = owner;
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        if (event != androidx.lifecycle.m.ON_CREATE) {
            throw new java.lang.AssertionError("Next event must be ON_CREATE");
        }
        source.mo133getLifecycle().c(this);
        o4.g gVar = this.f12322d;
        android.os.Bundle a17 = gVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a17 == null) {
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayList = a17.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new java.lang.IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (java.lang.String str : stringArrayList) {
            try {
                java.lang.Class<? extends U> asSubclass = java.lang.Class.forName(str, false, androidx.savedstate.Recreator.class.getClassLoader()).asSubclass(o4.c.class);
                kotlin.jvm.internal.o.f(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    java.lang.reflect.Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new java.lang.Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
                        kotlin.jvm.internal.o.f(newInstance, "{\n                constr…wInstance()\n            }");
                        ((androidx.lifecycle.w0) ((o4.c) newInstance)).a(gVar);
                    } catch (java.lang.Exception e17) {
                        throw new java.lang.RuntimeException("Failed to instantiate " + str, e17);
                    }
                } catch (java.lang.NoSuchMethodException e18) {
                    throw new java.lang.IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e18);
                }
            } catch (java.lang.ClassNotFoundException e19) {
                throw new java.lang.RuntimeException("Class " + str + " wasn't found", e19);
            }
        }
    }
}

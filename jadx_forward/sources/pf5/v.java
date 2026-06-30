package pf5;

/* loaded from: classes5.dex */
public final class v extends p012xc85e97e9.p093xedfae76a.j1 {

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.m1 f435471c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f435472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p093xedfae76a.m1 owner, p012xc85e97e9.p093xedfae76a.f1 factory) {
        super(owner.getViewModel(), factory);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(factory, "factory");
        this.f435471c = owner;
        java.lang.Object obj = pf5.z.f435484d.get(owner.getViewModel());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        this.f435472d = obj;
    }

    public final pf5.c c(java.lang.Class apiClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiClass, "apiClass");
        pf5.z zVar = pf5.z.f435481a;
        java.lang.Object obj = pf5.z.f435482b.get(apiClass.getName());
        if (obj != null) {
            java.lang.Object a17 = a((java.lang.Class) obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a17, "null cannot be cast to non-null type T of com.tencent.mm.ui.component.UICProviderImpl.ViewModelProviderProxy.api");
            return (pf5.c) a17;
        }
        throw new java.lang.RuntimeException(apiClass + " never import any instance.");
    }

    public final pf5.c d(java.lang.Class apiClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiClass, "apiClass");
        pf5.z zVar = pf5.z.f435481a;
        java.lang.Object obj = pf5.z.f435482b.get(apiClass.getName());
        if (obj == null) {
            return null;
        }
        java.lang.Object e17 = e((java.lang.Class) obj);
        if (e17 instanceof pf5.c) {
            return (pf5.c) e17;
        }
        return null;
    }

    public final pf5.b0 e(java.lang.Class uicClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uicClass, "uicClass");
        java.lang.Object obj = this.f435472d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, T of com.tencent.mm.ui.component.UICProviderImpl.ViewModelProviderProxy.getOrNull>");
        java.lang.Object obj2 = ((java.util.Map) obj).get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + uicClass.getCanonicalName());
        if (obj2 == null) {
            p012xc85e97e9.p093xedfae76a.l1 viewModel = this.f435471c.getViewModel();
            pf5.v0 v0Var = viewModel instanceof pf5.v0 ? (pf5.v0) viewModel : null;
            if (v0Var != null) {
                jz5.g gVar = v0Var.f435477f;
                if (((java.util.HashSet) ((jz5.n) gVar).mo141623x754a37bb()).contains(uicClass)) {
                    java.lang.String str = "getOrNull: new instance uicClass=" + uicClass + ", lazyInitSize=" + ((java.util.HashSet) ((jz5.n) gVar).mo141623x754a37bb()).size();
                    java.lang.Object[] objArr = new java.lang.Object[0];
                    if (pf5.t.f435466a != null) {
                        java.lang.Object[] obj3 = java.util.Arrays.copyOf(objArr, 0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj3, "obj");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UICProvider", str, obj3);
                    }
                    obj2 = a(uicClass);
                }
            }
        }
        return (pf5.b0) obj2;
    }
}

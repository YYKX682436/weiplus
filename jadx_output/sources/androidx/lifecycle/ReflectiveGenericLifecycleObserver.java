package androidx.lifecycle;

@java.lang.Deprecated
/* loaded from: classes13.dex */
class ReflectiveGenericLifecycleObserver implements androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f11587d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.b f11588e;

    public ReflectiveGenericLifecycleObserver(java.lang.Object obj) {
        this.f11587d = obj;
        this.f11588e = androidx.lifecycle.d.f11616c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
        java.util.HashMap hashMap = (java.util.HashMap) this.f11588e.f11602a;
        java.util.List list = (java.util.List) hashMap.get(mVar);
        java.lang.Object obj = this.f11587d;
        androidx.lifecycle.b.a(list, yVar, mVar, obj);
        androidx.lifecycle.b.a((java.util.List) hashMap.get(androidx.lifecycle.m.ON_ANY), yVar, mVar, obj);
    }
}

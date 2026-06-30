package p012xc85e97e9.p093xedfae76a;

@java.lang.Deprecated
/* renamed from: androidx.lifecycle.ReflectiveGenericLifecycleObserver */
/* loaded from: classes13.dex */
class C1121x20fbdf84 implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f93120d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b f93121e;

    public C1121x20fbdf84(java.lang.Object obj) {
        this.f93120d = obj;
        this.f93121e = p012xc85e97e9.p093xedfae76a.d.f93149c.b(obj.getClass());
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
        java.util.HashMap hashMap = (java.util.HashMap) this.f93121e.f93135a;
        java.util.List list = (java.util.List) hashMap.get(mVar);
        java.lang.Object obj = this.f93120d;
        p012xc85e97e9.p093xedfae76a.b.a(list, yVar, mVar, obj);
        p012xc85e97e9.p093xedfae76a.b.a((java.util.List) hashMap.get(p012xc85e97e9.p093xedfae76a.m.ON_ANY), yVar, mVar, obj);
    }
}

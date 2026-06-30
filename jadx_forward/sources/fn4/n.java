package fn4;

/* loaded from: classes15.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f346120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f346121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e f346122f;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e abstractActivityC18755xab3fd75e, java.util.List list, boolean z17) {
        this.f346122f = abstractActivityC18755xab3fd75e;
        this.f346120d = list;
        this.f346121e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e abstractActivityC18755xab3fd75e = this.f346122f;
        boolean z17 = abstractActivityC18755xab3fd75e.U;
        boolean z18 = this.f346121e;
        java.util.List list = this.f346120d;
        if (z17) {
            abstractActivityC18755xab3fd75e.f256675v.x(list, z18);
            abstractActivityC18755xab3fd75e.f256671r.m8146xced61ae5();
        } else {
            abstractActivityC18755xab3fd75e.f256671r.x(list, z18);
            abstractActivityC18755xab3fd75e.f256675v.m8146xced61ae5();
        }
    }
}

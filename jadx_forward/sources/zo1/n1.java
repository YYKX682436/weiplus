package zo1;

/* loaded from: classes5.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f556229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556230f;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f556228d = activityC12868xd8a7d79e;
        this.f556229e = h0Var;
        this.f556230f = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        po1.d dVar = (po1.d) this.f556229e.f391656d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 waitDialog = this.f556230f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(waitDialog, "$waitDialog");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e.U6(this.f556228d, dVar, waitDialog);
    }
}

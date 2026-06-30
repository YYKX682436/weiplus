package zo1;

/* loaded from: classes5.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f556286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f556288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556289g;

    public r1(yz5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f556286d = aVar;
        this.f556287e = activityC12868xd8a7d79e;
        this.f556288f = h0Var;
        this.f556289g = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f556286d.mo152xb9724478();
        po1.d dVar = (po1.d) this.f556288f.f391656d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 waitDialog = this.f556289g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(waitDialog, "$waitDialog");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e.U6(this.f556287e, dVar, waitDialog);
    }
}

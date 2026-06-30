package jm3;

/* loaded from: classes10.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a f381881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f381882e;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a, java.util.LinkedList linkedList) {
        this.f381881d = activityC16653xffd2636a;
        this.f381882e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activity = this.f381881d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.p1915x633fb29.p1916x2ffff9.C16646x38766471 c16646x38766471 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4.class)).f233024h;
        c16646x38766471.d(new jm3.q0(this.f381882e, c16646x38766471));
    }
}

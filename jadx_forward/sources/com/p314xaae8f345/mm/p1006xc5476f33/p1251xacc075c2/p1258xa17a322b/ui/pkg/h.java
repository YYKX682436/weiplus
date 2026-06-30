package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg;

/* loaded from: classes5.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd f174436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f174437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f174438f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd activityC12875x98f0bdfd, float f17, qo1.f0 f0Var) {
        super(0);
        this.f174436d = activityC12875x98f0bdfd;
        this.f174437e = f17;
        this.f174438f = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.RestoreTaskStatusView restoreTaskStatusView = this.f174436d.f174415d;
        if (restoreTaskStatusView != null) {
            restoreTaskStatusView.u(this.f174437e, this.f174438f);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("statueView");
        throw null;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12874xc6870bb2 f174424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f174425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 f174426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qo1.i0 f174427g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12874xc6870bb2 activityC12874xc6870bb2, qo1.j0 j0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var, qo1.i0 i0Var) {
        super(0);
        this.f174424d = activityC12874xc6870bb2;
        this.f174425e = j0Var;
        this.f174426f = n0Var;
        this.f174427g = i0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12874xc6870bb2 activityC12874xc6870bb2 = this.f174424d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12874xc6870bb2.BackupTaskStatusView backupTaskStatusView = activityC12874xc6870bb2.f174409e;
        if (backupTaskStatusView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("statueView");
            throw null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = activityC12874xc6870bb2.f174411g;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPkgInfo");
            throw null;
        }
        backupTaskStatusView.v(gVar, this.f174425e, this.f174426f, this.f174427g);
        return jz5.f0.f384359a;
    }
}

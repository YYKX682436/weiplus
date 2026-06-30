package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class x4 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.b f217925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.o f217926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wp.a f217927f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217928g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 f217929h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f217930i;

    public x4(bb2.b bVar, bb2.o oVar, wp.a aVar, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647, bb2.w1 w1Var) {
        this.f217925d = bVar;
        this.f217926e = oVar;
        this.f217927f = aVar;
        this.f217928g = s0Var;
        this.f217929h = c15442xfd56d647;
        this.f217930i = w1Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        bb2.b bVar = this.f217925d;
        this.f217926e.f100459a.m75939xb282bd08(6);
        bVar.f100337d.setBackground(null);
        this.f217927f.f529886x = true;
        android.view.KeyEvent.Callback callback = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) this.f217928g.p(com.p314xaae8f345.mm.R.id.ghd);
        if (callback == null) {
            callback = this.f217928g.p(com.p314xaae8f345.mm.R.id.frt);
        }
        if (callback != null) {
            ((cw2.ca) callback).t("exitBulletInput");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647 = this.f217929h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u4 u4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.A;
        c15442xfd56d647.g7(false);
        this.f217925d.g(this.f217926e);
        vp.x d17 = this.f217930i.d();
        d17.f520385d.N1(this.f217927f, this.f217925d);
    }
}

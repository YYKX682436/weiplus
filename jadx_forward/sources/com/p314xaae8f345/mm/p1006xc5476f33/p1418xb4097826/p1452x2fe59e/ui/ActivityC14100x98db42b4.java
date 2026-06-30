package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTingAudioCollectionUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/y00;", "Lcom/tencent/mm/plugin/finder/feed/w00;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTingAudioCollectionUI */
/* loaded from: classes2.dex */
public final class ActivityC14100x98db42b4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y00, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w00> {

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w00 f191101t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y00 f191102u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13852x2d33c3a1 f191103v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f191104w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.wm(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f191105x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vm(this));

    /* renamed from: y, reason: collision with root package name */
    public int f191106y;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w00 w00Var = this.f191101t;
        if (w00Var != null) {
            return w00Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y00 y00Var = this.f191102u;
        if (y00Var != null) {
            return y00Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public void f7() {
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f191106y = getIntent().getIntExtra("key_audio_collection_count", 0);
        mo54450xbf7c1df6(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f0b, java.lang.Integer.valueOf(this.f191106y)));
        java.lang.String stringExtra = getIntent().getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_biz_username");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13852x2d33c3a1 c13852x2d33c3a1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13852x2d33c3a1(stringExtra, V6);
        c13852x2d33c3a1.m56361x5fd54ec8(getIntent());
        c13852x2d33c3a1.f188927e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.tm(this, c13852x2d33c3a1);
        this.f191103v = c13852x2d33c3a1;
        int m75939xb282bd08 = V6 != null ? V6.m75939xb282bd08(5) : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13852x2d33c3a1 c13852x2d33c3a12 = this.f191103v;
        if (c13852x2d33c3a12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        this.f191101t = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w00(this, 2, m75939xb282bd08, c13852x2d33c3a12, stringExtra2 != null ? new jz5.l(stringExtra2, java.lang.Integer.valueOf(getIntent().getIntExtra("key_audio_category_type", -1))) : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y00 y00Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y00(this, 2, V6 != null ? V6.m75939xb282bd08(5) : 0, false, 0, ((java.lang.Boolean) ((jz5.n) this.f191105x).mo141623x754a37bb()).booleanValue() && ((java.lang.Boolean) ((jz5.n) this.f191104w).mo141623x754a37bb()).booleanValue(), 24, null);
        this.f191102u = y00Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w00 w00Var = this.f191101t;
        if (w00Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        y00Var.f187715o = w00Var;
        if (stringExtra2 == null || stringExtra2.length() == 0) {
            return;
        }
        dy1.a.f(this, iy1.c.FinderTingAudioCollectionUI);
        dy1.a.h(this, 12, 29426);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.um(stringExtra2));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ae8;
    }
}

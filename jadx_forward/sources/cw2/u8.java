package cw2;

/* loaded from: classes2.dex */
public final class u8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.h8 f305585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f, cw2.h8 h8Var) {
        super(1);
        this.f305584d = c15196x85976f5f;
        this.f305585e = h8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0 a76;
        cw2.da daVar = (cw2.da) obj;
        if (daVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305584d;
            c15196x85976f5f.m61515xab353f7e(daVar);
            cw2.h8 h8Var = this.f305585e;
            mn2.g4 g4Var = h8Var.f305280c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = h8Var.f305278a;
            c14989xf862ae88.m59124x87980ca();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(daVar.mo56696x9040359a(), h8Var.f305280c.n())) {
                cw2.ca seekBarLayout = c15196x85976f5f.getSeekBarLayout();
                if (seekBarLayout != null) {
                    seekBarLayout.m122862x901b6914(0);
                }
                daVar.m122872x52b5721c(0.0f);
                c15196x85976f5f.Q(daVar, g4Var, h8Var.f305283f, c14989xf862ae88);
            }
            if (daVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) {
                android.content.Context context = c15196x85976f5f.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                if (nyVar != null && (a76 = nyVar.a7(-1)) != null && (a76 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4)) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) daVar).m61403xc5f6eaef(a76.f206817h.m75939xb282bd08(5));
                }
            }
            daVar.mo56708x764cf626(c15196x85976f5f.isLoop);
            daVar.F();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15196x85976f5f.m61471xe56ce956(), "[FinderVideoLayout#prepareToPlay] layout=[" + c15196x85976f5f.getWidth() + ':' + c15196x85976f5f.getHeight() + "] videoView=[" + daVar.m122871x755bd410() + ':' + daVar.m122868x1c4fb41d() + "] video=[" + g4Var.f411535e.m75938x746dc8a6(4) + ':' + g4Var.f411535e.m75938x746dc8a6(5) + "] " + c15196x85976f5f.d0() + " media=" + g4Var + ' ');
        }
        return jz5.f0.f384359a;
    }
}

package rr;

/* loaded from: classes13.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr.z f480685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ va0.n f480686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f480687f;

    public w(rr.z zVar, va0.n nVar, android.content.Context context) {
        this.f480685d = zVar;
        this.f480686e = nVar;
        this.f480687f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/util/WetypeGuideHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WetypeGuideHolder", "VoiceInputWetypeGuideHolder onClick");
        rr.z zVar = this.f480685d;
        boolean b17 = zVar.b();
        cl0.g gVar = new cl0.g();
        try {
            gVar.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, zVar.f480692f);
            android.util.Pair c17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.p) this.f480686e).c(new vn3.c(48));
            if (c17.first == com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT && c17.second != null) {
                gVar.o("redDot", 1);
            }
            cl0.g gVar2 = new cl0.g();
            gVar2.h("wetype", gVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WetypeGuideHolder", "query:%s", gVar2.toString());
            wd0.z1 z1Var = (wd0.z1) i95.n0.c(wd0.z1.class);
            android.content.Context context = this.f480687f;
            java.lang.String gVar3 = gVar2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
            ((vd0.o3) z1Var).bj(context, gVar3);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WetypeGuideHolder", e17, "", new java.lang.Object[0]);
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(zVar.a());
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(48);
        lr.i1 i1Var = (lr.i1) zVar.f480691e;
        i1Var.getClass();
        rr.a aVar = i1Var.f402062a;
        if (aVar.f480655e) {
            zVar.c(false);
        }
        jz5.g gVar4 = rr.c.f480657a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomEmojiWetypeHelper", "onClicked");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6383x36aab795 c6383x36aab795 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6383x36aab795();
        c6383x36aab795.f137294d = 9L;
        c6383x36aab795.f137296f = b17 ? 1L : 0L;
        c6383x36aab795.f137295e = c6383x36aab795.b("tips", aVar.f480651a, true);
        c6383x36aab795.f137297g = b17 ? 2L : 0L;
        c6383x36aab795.k();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_WETYPE_AD_CLICKED_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        yj0.a.h(this, "com/tencent/mm/emoji/util/WetypeGuideHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

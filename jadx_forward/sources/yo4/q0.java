package yo4;

/* loaded from: classes10.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a f545836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f545837e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a c18794x5f9cad3a, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        super(0);
        this.f545836d = c18794x5f9cad3a;
        this.f545837e = abstractC15633xee433078;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar;
        android.graphics.Rect rect;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f545837e;
        java.lang.String str = abstractC15633xee433078.f219963e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getOriginalPath(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a c18794x5f9cad3a = this.f545836d;
        c18794x5f9cad3a.D = str;
        if (c18794x5f9cad3a.R1) {
            java.util.HashMap hashMap = so4.g.f492315g;
            if (hashMap.containsKey(abstractC15633xee433078.f219963e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "update select image path to image enhancement result path: " + ((java.lang.String) hashMap.get(abstractC15633xee433078.f219963e)));
                str = (java.lang.String) hashMap.get(abstractC15633xee433078.f219963e);
                if (str == null) {
                    str = abstractC15633xee433078.f219963e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getOriginalPath(...)");
                }
            }
        }
        ym5.x2 F = c18794x5f9cad3a.f257384s.F(str);
        dw3.g0 g0Var = c18794x5f9cad3a.S;
        g0Var.a("start", "get photo view");
        java.lang.String str2 = abstractC15633xee433078.f219963e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getOriginalPath(...)");
        gp4.j jVar = c18794x5f9cad3a.f257383r;
        jVar.getClass();
        jVar.f355945f.t(str2);
        bp4.k0 m72537x67c60a58 = c18794x5f9cad3a.m72537x67c60a58();
        java.lang.String str3 = abstractC15633xee433078.f219963e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getOriginalPath(...)");
        m72537x67c60a58.H(F, str3, true);
        java.lang.String str4 = abstractC15633xee433078.f219963e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getOriginalPath(...)");
        bp4.c2 c2Var = c18794x5f9cad3a.f257396z1;
        c2Var.getClass();
        c2Var.f104665x = str4;
        java.util.Iterator it = c18794x5f9cad3a.H.f257266g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj).f257149a, abstractC15633xee433078.f219963e)) {
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj;
        if (i1Var != null && (yVar = i1Var.f257157i) != null && (rect = yVar.f257320d) != null) {
            jVar.f355945f.w(rect);
            c18794x5f9cad3a.D1.m72705x7802efb4(rect);
            lt3.n.f402796d.set(rect);
        }
        android.content.Context context = c18794x5f9cad3a.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView().findViewById(android.R.id.content)).setAlpha(1.0f);
        c18794x5f9cad3a.B.z();
        c18794x5f9cad3a.M();
        c18794x5f9cad3a.setBackgroundColor(c18794x5f9cad3a.Q1);
        c18794x5f9cad3a.m72538xee20813a(c18794x5f9cad3a.m72537x67c60a58().f104744g.getStyle());
        g0Var.a("start", "load first image");
        c18794x5f9cad3a.f257393y0.z(true);
        c2Var.D();
        return jz5.f0.f384359a;
    }
}

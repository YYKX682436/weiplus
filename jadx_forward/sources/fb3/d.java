package fb3;

/* loaded from: classes9.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fb3.e f342388d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fb3.e eVar) {
        super(1);
        this.f342388d = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null && (str = (java.lang.String) kz5.n0.a0(c0Var.f527815b, 0)) != null) {
            fb3.e eVar = this.f342388d;
            if (eVar.f342391f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.String str2 = eVar.f342389d;
                g0Var.d(27809, 2, str2, str2, str, eVar.f342390e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 12);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.String str3 = eVar.f342389d;
                g0Var2.d(27809, 2, str3, str3, str, eVar.f342390e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 10);
            }
            o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
            android.app.Activity m80379x76847179 = eVar.m80379x76847179();
            java.lang.String string = eVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hqg);
            fb3.c cVar = new fb3.c(eVar, str);
            r35.k1 k1Var = (r35.k1) q1Var;
            k1Var.getClass();
            r35.i1 i1Var = new r35.i1(m80379x76847179);
            i1Var.l(str);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i1Var.f450668b.f293354b;
            aVar.f293245b0 = true;
            aVar.X = 20;
            aVar.Y = 20;
            i1Var.f450670d = string;
            i1Var.a(new r35.m1(k1Var, cVar));
            i1Var.k();
        }
        return jz5.f0.f384359a;
    }
}

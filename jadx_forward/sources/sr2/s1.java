package sr2;

/* loaded from: classes10.dex */
public final class s1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f493243a;

    public s1(sr2.y2 y2Var) {
        this.f493243a = y2Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        sr2.y2 y2Var = this.f493243a;
        if (i17 != 0 || fVar.f152149b != 0) {
            java.lang.String str = fVar.f152150c;
            java.lang.String string = str == null || str.length() == 0 ? y2Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eqz) : fVar.f152150c;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = y2Var.m158354x19263085();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x19263085);
            e4Var.f293309c = string;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            return e4Var.c();
        }
        java.lang.String string2 = y2Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572954op);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = y2Var.m158354x19263085();
        int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x192630852);
        e4Var2.f293309c = string2;
        e4Var2.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        e4Var2.c();
        ya2.p1 p1Var = y2Var.f493333d;
        if (p1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
            throw null;
        }
        ((yv2.b) p1Var).a().mo57388x93bf3962(y2Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m1a));
        ya2.p1 p1Var2 = y2Var.f493333d;
        if (p1Var2 != null) {
            ((yv2.b) p1Var2).a().mo57391x35760afd("");
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
        throw null;
    }
}

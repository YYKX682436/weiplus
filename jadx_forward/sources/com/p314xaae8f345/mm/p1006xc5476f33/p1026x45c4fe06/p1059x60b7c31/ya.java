package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class ya implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f165473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f165474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.za f165475c;

    public ya(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.za zaVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17) {
        this.f165475c = zaVar;
        this.f165473a = d0Var;
        this.f165474b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPhoneBindCardEntry", "on Activity result: %s", java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.za zaVar = this.f165475c;
        if (i17 != zaVar.f165486g) {
            return false;
        }
        int i19 = this.f165474b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f165473a;
        if (i18 == -1) {
            d0Var.a(i19, zaVar.o("ok"));
        } else if (i18 == 0) {
            d0Var.a(i19, zaVar.o("cancel"));
        } else {
            d0Var.a(i19, zaVar.o("fail"));
            if (!h45.y.c()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, h45.y.f360501a, "phoneBindCardEntry:fail");
            }
        }
        if (h45.y.c()) {
            return true;
        }
        h45.y.f360501a = null;
        return true;
    }
}

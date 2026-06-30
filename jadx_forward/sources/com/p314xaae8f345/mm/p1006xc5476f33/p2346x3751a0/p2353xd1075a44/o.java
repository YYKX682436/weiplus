package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44;

/* loaded from: classes14.dex */
public class o implements com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f258718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k f258719b;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k kVar, android.content.Intent intent) {
        this.f258719b = kVar;
        this.f258718a = intent;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k kVar = this.f258719b;
        if (!kVar.f258696n) {
            return vq4.n0.f(kVar.f258694i) || vq4.n0.h(kVar.f258694i);
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kde);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k kVar2 = this.f258719b;
        android.content.Intent intent = this.f258718a;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d17 = kVar.f258695m.d1();
        ((sg3.a) v0Var).getClass();
        kVar2.f(intent, string, c01.a2.e(d17), string, false);
        if (vq4.n0.f(kVar.f258694i) || vq4.n0.h(kVar.f258694i)) {
            kVar.f258692g = true;
            return true;
        }
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(40);
        kVar.b(false);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar = this.f258719b.f258689d;
        if (gVar != null) {
            gVar.f();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e
    public void c(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b) {
        boolean booleanExtra = intent.getBooleanExtra("Voip_Is_Talking", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k kVar = this.f258719b;
        if (booleanExtra) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 Ai = gq4.v.Ai();
            java.lang.String a17 = kVar.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.C18918x502f85f5 c18918x502f85f5 = Ai.f258520a;
            if (c18918x502f85f5 != null) {
                c18918x502f85f5.f(a17);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 Ai2 = gq4.v.Ai();
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kcf);
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.C18918x502f85f5 c18918x502f85f52 = Ai2.f258520a;
            if (c18918x502f85f52 != null) {
                c18918x502f85f52.e(string);
            }
        }
        if (kVar.f258696n && kVar.f258692g) {
            kVar.f258692g = false;
            kVar.f258690e = abstractC18931xc27fcc5b;
            kVar.d();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k kVar = this.f258719b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar = kVar.f258689d;
        if (gVar != null) {
            gVar.c(kVar);
        }
    }
}

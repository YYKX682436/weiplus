package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class z3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f161343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ui1.z f161344c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h4 f161345d;

    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, ui1.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h4 h4Var) {
        this.f161342a = yVar;
        this.f161343b = f0Var;
        this.f161344c = zVar;
        this.f161345d = h4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f161343b.f391649d = action.f161051d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n
    public void b(java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        this.f161344c.mo2041x3f8132ef(items);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n
    public void c(boolean z17, boolean z18, java.lang.String limitWording, java.lang.String avatarWording, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.o goAddUserPage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(limitWording, "limitWording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarWording, "avatarWording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(goAddUserPage, "goAddUserPage");
        ui1.z zVar = this.f161344c;
        if (!z17 && !z18) {
            zVar.mo2030x8f8b3d79(avatarWording);
            zVar.mo2031x5951856a(b3.l.m9702x7444d5ad(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5));
            d(zVar, true, goAddUserPage);
        } else {
            if (z17) {
                zVar.mo2030x8f8b3d79("");
            } else {
                zVar.mo2030x8f8b3d79(limitWording);
                zVar.mo2031x5951856a(b3.l.m9702x7444d5ad(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
            }
            d(zVar, false, goAddUserPage);
        }
    }

    public final void d(ui1.z dialog, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.o goAddUserPage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(goAddUserPage, "goAddUserPage");
        if (z17) {
            dialog.mo2029x3aaeeaf1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y3(this.f161345d, this.f161342a, goAddUserPage));
        } else {
            dialog.mo2029x3aaeeaf1(null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n
    /* renamed from: getAppId */
    public java.lang.String mo50593x74292566() {
        java.lang.String mo48798x74292566 = this.f161342a.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        return mo48798x74292566;
    }
}

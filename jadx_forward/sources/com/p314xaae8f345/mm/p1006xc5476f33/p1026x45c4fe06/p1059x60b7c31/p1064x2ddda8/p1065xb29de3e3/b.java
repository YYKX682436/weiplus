package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3;

/* loaded from: classes7.dex */
public final class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.p {

    /* renamed from: a, reason: collision with root package name */
    public final r45.sv6 f161018a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.jv5 f161019b;

    public b(r45.sv6 userAvatarInfo, r45.jv5 scopeInfo, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n nVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userAvatarInfo, "userAvatarInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scopeInfo, "scopeInfo");
        this.f161018a = userAvatarInfo;
        this.f161019b = scopeInfo;
        if (nVar != null) {
            java.util.LinkedList<r45.tv6> avatar_list = userAvatarInfo.f467517d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(avatar_list, "avatar_list");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(avatar_list, 10));
            for (r45.tv6 tv6Var : avatar_list) {
                java.lang.String str = tv6Var.f468356e;
                java.lang.String str2 = tv6Var.f468358g;
                java.lang.String str3 = this.f161019b.f459664d;
                boolean z17 = this.f161018a.f467520g == tv6Var.f468355d;
                java.lang.String avatarurl = tv6Var.f468357f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(avatarurl, "avatarurl");
                arrayList.add(new fl1.h1(0, str, str2, str3, z17, avatarurl, tv6Var.f468355d));
            }
            nVar.b(arrayList);
        }
        if (nVar != null) {
            java.lang.String str4 = this.f161018a.f467523m;
            nVar.c(true, true, "", str4 == null ? "" : str4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.a.f161015a);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.p
    public void a(fl1.h1 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.p
    public void b(android.view.View view, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }
}

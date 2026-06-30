package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class a3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f183532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183534c;

    public a3(android.content.Intent intent, java.lang.String str, java.lang.String str2, int i17) {
        this.f183532a = intent;
        this.f183533b = str;
        this.f183534c = str2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.n73 n73Var;
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.hv1 hv1Var = (r45.hv1) fVar.f152151d;
            java.lang.String str2 = this.f183534c;
            if (hv1Var == null || (m75941xfb821914 = hv1Var.m75941xfb821914(1)) == null) {
                n73Var = null;
            } else {
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    r45.z53 z53Var = (r45.z53) ((r45.n73) obj2).m75936x14adae67(1);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z53Var != null ? z53Var.m75945x2fec8307(0) : null, str2)) {
                        break;
                    }
                }
                n73Var = (r45.n73) obj2;
            }
            if ((n73Var != null ? (r45.s63) n73Var.m75936x14adae67(3) : null) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderGameLiveUtil", "detail null");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3 b3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpGamePostUI ");
                r45.z53 z53Var2 = (r45.z53) n73Var.m75936x14adae67(1);
                sb6.append(z53Var2 != null ? z53Var2.m75945x2fec8307(1) : null);
                sb6.append(", ");
                r45.z53 z53Var3 = (r45.z53) n73Var.m75936x14adae67(1);
                sb6.append(z53Var3 != null ? z53Var3.m75945x2fec8307(4) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveUtil", sb6.toString());
                r45.s63 s63Var = (r45.s63) n73Var.m75936x14adae67(3);
                java.lang.String str3 = "";
                if (s63Var == null || (str = s63Var.m75945x2fec8307(1)) == null) {
                    str = "";
                }
                r45.s63 s63Var2 = (r45.s63) n73Var.m75936x14adae67(3);
                if (s63Var2 != null && (m75945x2fec8307 = s63Var2.m75945x2fec8307(0)) != null) {
                    str3 = m75945x2fec8307;
                }
                android.content.Intent intent = this.f183532a;
                intent.putExtra("COVER_URL", str);
                intent.putExtra("DESC", str3);
                intent.putExtra("TICKET", this.f183533b);
                intent.putExtra("APPID", str2);
                intent.putExtra("POST_FROM_SCENE", 0);
                intent.putExtra("GameUserInfo", n73Var.mo14344x5f01b1f6());
                intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a.k(intent);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3 b3Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderGameLiveUtil", "CgiFinderLiveGetUserGameConfig failed.");
        }
        return jz5.f0.f384359a;
    }
}

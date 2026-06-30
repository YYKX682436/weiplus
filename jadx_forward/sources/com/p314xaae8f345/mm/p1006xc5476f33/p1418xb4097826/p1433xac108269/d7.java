package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes5.dex */
public final class d7 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f183621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ht0 f183622g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f183623h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f183624i;

    public d7(java.lang.String str, int i17, long j17, r45.ht0 ht0Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i18) {
        this.f183619d = str;
        this.f183620e = i17;
        this.f183621f = j17;
        this.f183622g = ht0Var;
        this.f183623h = abstractActivityC21394xb3d2c0cf;
        this.f183624i = i18;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.lang.String str = this.f183619d;
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            arrayList = stringArrayListExtra;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "share topic " + str + " to " + arrayList);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().h(arrayList);
        }
        if (this.f183620e == 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            boolean z17 = i18 == -1;
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ",");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "listToString(...)");
            long j17 = this.f183621f;
            r45.ht0 ht0Var = this.f183622g;
            java.lang.String m75945x2fec8307 = ht0Var != null ? ht0Var.m75945x2fec8307(0) : null;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f183623h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            o3Var.Nj(1, z17, c17, j17, m75945x2fec8307, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        boolean z18 = i18 == -1;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        int i19 = this.f183620e;
        long j18 = this.f183621f;
        java.lang.String c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ",");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "listToString(...)");
        o3Var2.Xj(1, z18, str2, i19, j18, c18, this.f183624i);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes4.dex */
public final class r implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f166621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f166623f;

    public r(int i17, java.lang.String str, int i18) {
        this.f166621d = i17;
        this.f166622e = str;
        this.f166623f = i18;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45 c12322x4a5c3c45;
        r45.k50 k50Var;
        r45.ie mo11484xe92ab0a8;
        r45.du5 du5Var;
        r45.k50 k50Var2;
        r45.ie mo11484xe92ab0a82;
        r45.ie mo11484xe92ab0a83;
        r45.du5 du5Var2;
        r45.ie ieVar;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u.f166736a;
        java.lang.String str = "";
        int i17 = this.f166621d;
        int i18 = -1;
        if (i17 < 0 || i17 >= 32) {
            c12322x4a5c3c45 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45("", -1, "");
        } else {
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.j50();
            lVar.f152198b = new r45.k50();
            lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/coldstartfetchdata";
            lVar.f152200d = 4024;
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ColdStartFetchDataRequest");
            r45.j50 j50Var = (r45.j50) fVar;
            j50Var.f459118e = this.f166622e;
            j50Var.f459117d = this.f166623f;
            j50Var.f459119f = i17;
            com.p314xaae8f345.mm.p944x882e457a.f b17 = com.p314xaae8f345.mm.p944x882e457a.l3.b(a17, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            java.lang.String str2 = null;
            if ((b17 != null && b17.f152148a == 0) && b17.f152149b == 0) {
                r45.k50 k50Var3 = (r45.k50) b17.f152151d;
                if ((k50Var3 == null || (ieVar = k50Var3.f76492x92037252) == null || ieVar.f458492d != 0) ? false : true) {
                    java.lang.String valueOf = java.lang.String.valueOf(k50Var3 != null ? k50Var3.f459912d : null);
                    r45.k50 k50Var4 = (r45.k50) b17.f152151d;
                    if (k50Var4 != null && (mo11484xe92ab0a83 = k50Var4.mo11484xe92ab0a8()) != null && (du5Var2 = mo11484xe92ab0a83.f458493e) != null) {
                        str2 = du5Var2.f454289d;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    c12322x4a5c3c45 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45(valueOf, 0, str2);
                }
            }
            if (b17 != null && (k50Var2 = (r45.k50) b17.f152151d) != null && (mo11484xe92ab0a82 = k50Var2.mo11484xe92ab0a8()) != null) {
                i18 = mo11484xe92ab0a82.f458492d;
            }
            if (b17 != null && (k50Var = (r45.k50) b17.f152151d) != null && (mo11484xe92ab0a8 = k50Var.mo11484xe92ab0a8()) != null && (du5Var = mo11484xe92ab0a8.f458493e) != null) {
                str2 = du5Var.f454289d;
            }
            if (str2 == null) {
                str2 = "";
            }
            c12322x4a5c3c45 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45("", i18, str2);
        }
        if (c12322x4a5c3c45 instanceof cf.h) {
            str = ((cf.h) c12322x4a5c3c45).I();
        } else {
            java.lang.String m51650x9616526c = c12322x4a5c3c45.m51650x9616526c();
            if (m51650x9616526c != null) {
                str = m51650x9616526c;
            }
        }
        boolean a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a();
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Utils.Profile", "runProfiled:log:MicroMsg.AppBrandCgiPrefetchBeforeLaunch|call cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a18 + ' ');
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / 16)) + " frames! runProfiled:log:MicroMsg.AppBrandCgiPrefetchBeforeLaunch|call cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a18 + ' ');
        }
        return c12322x4a5c3c45;
    }
}

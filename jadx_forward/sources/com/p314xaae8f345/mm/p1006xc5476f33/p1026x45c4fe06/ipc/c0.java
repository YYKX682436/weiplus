package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* loaded from: classes8.dex */
public class c0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11890x81fbda57 f159932a;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11890x81fbda57 activityC11890x81fbda57) {
        this.f159932a = activityC11890x81fbda57;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.p877xaf0210d9.C10922xde1959ec) {
            com.p314xaae8f345.mm.p877xaf0210d9.C10922xde1959ec c10922xde1959ec = (com.p314xaae8f345.mm.p877xaf0210d9.C10922xde1959ec) obj;
            if (c10922xde1959ec != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11890x81fbda57 activityC11890x81fbda57 = this.f159932a;
                if (activityC11890x81fbda57.f159902q != null) {
                    java.lang.String str = activityC11890x81fbda57.f159904s;
                    java.lang.String str2 = c10922xde1959ec.f150700e;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandTaskProxyUI", "MiniQbFloatBallMenuActionEvent event.filePath:%s filePath:%s", str2, activityC11890x81fbda57.f159904s);
                        return;
                    }
                    int i17 = c10922xde1959ec.f150699d;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTaskProxyUI", "MiniQbFloatBallMenuActionEvent event.action:%s", java.lang.Integer.valueOf(i17));
                    if (i17 != 1) {
                        if (i17 == 2) {
                            activityC11890x81fbda57.f159902q.B(false);
                            if (!activityC11890x81fbda57.f159910y) {
                                activityC11890x81fbda57.f159909x = false;
                                uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
                                java.lang.String str3 = activityC11890x81fbda57.f159906u;
                                java.lang.String str4 = activityC11890x81fbda57.f159904s;
                                ((th0.u) rVar).getClass();
                                com.p314xaae8f345.mm.p2829xfa87f9de.i.a(activityC11890x81fbda57, str3, str4);
                                uh0.s sVar = (uh0.s) i95.n0.c(uh0.s.class);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11890x81fbda57 activityC11890x81fbda572 = this.f159932a;
                                ((th0.w) sVar).Ai(false, false, false, false, activityC11890x81fbda572, activityC11890x81fbda572.f159904s, activityC11890x81fbda572.f159907v, activityC11890x81fbda572.f159905t, activityC11890x81fbda572.f159906u, 10, activityC11890x81fbda572.A, activityC11890x81fbda572.f159911z, true, activityC11890x81fbda572.f159903r, activityC11890x81fbda572.f159908w);
                                return;
                            }
                            uh0.s sVar2 = (uh0.s) i95.n0.c(uh0.s.class);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11890x81fbda57 activityC11890x81fbda573 = this.f159932a;
                            java.lang.String str5 = activityC11890x81fbda573.f159904s;
                            java.lang.String str6 = activityC11890x81fbda573.f159907v;
                            java.lang.String str7 = activityC11890x81fbda573.f159905t;
                            java.lang.String str8 = activityC11890x81fbda573.f159906u;
                            android.webkit.ValueCallback valueCallback = activityC11890x81fbda573.A;
                            android.webkit.ValueCallback valueCallback2 = activityC11890x81fbda573.B;
                            java.lang.String str9 = activityC11890x81fbda573.f159903r;
                            ((th0.w) sVar2).getClass();
                            vt0.c.g(false, false, false, activityC11890x81fbda573, str5, str6, str7, str8, 10, valueCallback, valueCallback2, true, str9, false);
                            return;
                        }
                        if (i17 == 4) {
                            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                            java.lang.String str10 = activityC11890x81fbda57.f159904s;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.b0 b0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.b0(this);
                            ((yb0.g) b0Var).getClass();
                            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.e(activityC11890x81fbda57, str10, null, b0Var2);
                            return;
                        }
                        if (i17 != 8) {
                            return;
                        }
                    }
                    activityC11890x81fbda57.f159902q.B(true);
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandTaskProxyUI", "MiniQbFloatBallMenuActionEvent fail");
        }
    }
}

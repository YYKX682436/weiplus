package q81;

/* loaded from: classes7.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f442249c;

    public p(java.lang.String str, java.lang.String str2, int i17) {
        this.f442247a = str;
        this.f442248b = str2;
        this.f442249c = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.f152148a);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(fVar.f152149b);
        java.lang.String str2 = fVar.f152150c;
        java.lang.String str3 = this.f442247a;
        java.lang.String str4 = this.f442248b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.CmdPreLaunch", "getContact(%s %s) back, errType %d, errCode %d, errMsg %s", str3, str4, valueOf, valueOf2, str2);
        r45.v54 v54Var = (r45.v54) fVar.f152151d;
        boolean z17 = false;
        if (v54Var != null && fVar.f152149b == 0 && fVar.f152148a == 0) {
            if (v54Var == null || (str = v54Var.f469441m) == null) {
                str = "";
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str4 = str;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i9 Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Zi();
            java.lang.String str5 = "appId = [" + str4 + "], storage = null? [%b]";
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(Zi == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.CmdPreLaunch", str5, objArr);
            if (Zi != null) {
                Zi.d(str4);
                if (Zi.z0(str4, (r45.v54) fVar.f152151d) != null) {
                    z17 = true;
                }
            }
        }
        int i17 = this.f442249c;
        if (z17) {
            r81.f.INSTANCE.b(i17, be1.r.f4230x366c91de);
        } else {
            r81.f.INSTANCE.b(i17, 170);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.CmdPreLaunch", "callInner: preLaunch res = [%b]", java.lang.Boolean.valueOf(z17));
        return jz5.f0.f384359a;
    }
}

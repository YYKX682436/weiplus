package bz;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bz.w f118241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118244g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(bz.w wVar, java.lang.String str, java.lang.String str2, java.lang.String str3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f118241d = wVar;
        this.f118242e = str;
        this.f118243f = str2;
        this.f118244g = str3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bz.s(this.f118241d, this.f118242e, this.f118243f, this.f118244g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bz.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bz.w wVar = this.f118241d;
        boolean z18 = wVar.f118249b;
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.String str = this.f118242e;
        if (z18) {
            java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(str, true);
            if (com.p314xaae8f345.mm.vfs.w6.j(str + "/and_file_count_check." + ((s17 != null ? kz5.n0.P(s17) : 0) - 1))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Download.SuperDownloaderWrapCore", "#unzipToFolder is exist(new way), return");
                return f0Var;
            }
        } else {
            if (com.p314xaae8f345.mm.vfs.w6.s(str, false) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Download.SuperDownloaderWrapCore", "#unzipToFolder is exist(old way), return");
                return f0Var;
            }
        }
        java.lang.String str2 = str + "_temp";
        java.lang.String str3 = this.f118243f;
        int i17 = 123456;
        if ((str3.length() == 0) || !com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Download.SuperDownloaderWrapCore", "#checkAndMakeToReady-checkAndUnzip zipFilePath:" + str3 + " unzip it");
            com.p314xaae8f345.mm.vfs.w6.f(str2);
            com.p314xaae8f345.mm.vfs.w6.f(str);
            com.p314xaae8f345.mm.vfs.w6.u(str2);
            i17 = com.p314xaae8f345.mm.vfs.w6.Q(str3, str2);
            z17 = com.p314xaae8f345.mm.vfs.w6.v(str2, str);
            if (wVar.f118249b) {
                java.lang.Iterable s18 = com.p314xaae8f345.mm.vfs.w6.s(str, true);
                int P = s18 != null ? kz5.n0.P(s18) : 0;
                com.p314xaae8f345.mm.vfs.w6.e(str + "/and_file_count_check." + P);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#unzipToFolder totalFileSize=");
                sb6.append(P);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Download.SuperDownloaderWrapCore", sb6.toString());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Download.SuperDownloaderWrapCore", "#unzipToFolder unzipStatus=" + i17 + " moveDirStatus=" + z17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("reportFor", "unzip");
        jSONObject.put("url", this.f118244g);
        jSONObject.put("isSuccess", i17 == 0 && z17);
        jSONObject.put("unzipStatus", i17);
        jSONObject.put("moveDirStatus", z17);
        yz5.l lVar = wVar.f118252e;
        if (lVar != null) {
            lVar.mo146xb9724478(jSONObject);
        }
        return f0Var;
    }
}

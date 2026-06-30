package bz;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bz.w f36708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f36709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f36710f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f36711g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(bz.w wVar, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f36708d = wVar;
        this.f36709e = str;
        this.f36710f = str2;
        this.f36711g = str3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bz.s(this.f36708d, this.f36709e, this.f36710f, this.f36711g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bz.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bz.w wVar = this.f36708d;
        boolean z18 = wVar.f36716b;
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str = this.f36709e;
        if (z18) {
            java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(str, true);
            if (com.tencent.mm.vfs.w6.j(str + "/and_file_count_check." + ((s17 != null ? kz5.n0.P(s17) : 0) - 1))) {
                com.tencent.mars.xlog.Log.i("Download.SuperDownloaderWrapCore", "#unzipToFolder is exist(new way), return");
                return f0Var;
            }
        } else {
            if (com.tencent.mm.vfs.w6.s(str, false) != null) {
                com.tencent.mars.xlog.Log.i("Download.SuperDownloaderWrapCore", "#unzipToFolder is exist(old way), return");
                return f0Var;
            }
        }
        java.lang.String str2 = str + "_temp";
        java.lang.String str3 = this.f36710f;
        int i17 = 123456;
        if ((str3.length() == 0) || !com.tencent.mm.vfs.w6.j(str3)) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("Download.SuperDownloaderWrapCore", "#checkAndMakeToReady-checkAndUnzip zipFilePath:" + str3 + " unzip it");
            com.tencent.mm.vfs.w6.f(str2);
            com.tencent.mm.vfs.w6.f(str);
            com.tencent.mm.vfs.w6.u(str2);
            i17 = com.tencent.mm.vfs.w6.Q(str3, str2);
            z17 = com.tencent.mm.vfs.w6.v(str2, str);
            if (wVar.f36716b) {
                java.lang.Iterable s18 = com.tencent.mm.vfs.w6.s(str, true);
                int P = s18 != null ? kz5.n0.P(s18) : 0;
                com.tencent.mm.vfs.w6.e(str + "/and_file_count_check." + P);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#unzipToFolder totalFileSize=");
                sb6.append(P);
                com.tencent.mars.xlog.Log.i("Download.SuperDownloaderWrapCore", sb6.toString());
            }
        }
        com.tencent.mars.xlog.Log.i("Download.SuperDownloaderWrapCore", "#unzipToFolder unzipStatus=" + i17 + " moveDirStatus=" + z17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("reportFor", "unzip");
        jSONObject.put("url", this.f36711g);
        jSONObject.put("isSuccess", i17 == 0 && z17);
        jSONObject.put("unzipStatus", i17);
        jSONObject.put("moveDirStatus", z17);
        yz5.l lVar = wVar.f36719e;
        if (lVar != null) {
            lVar.invoke(jSONObject);
        }
        return f0Var;
    }
}

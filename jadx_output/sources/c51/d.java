package c51;

/* loaded from: classes10.dex */
public final class d implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c51.e f38630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38632f;

    public d(c51.e eVar, java.lang.String str, java.lang.String str2) {
        this.f38630d = eVar;
        this.f38631e = str;
        this.f38632f = str2;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        c51.e eVar = this.f38630d;
        java.lang.String str = eVar.f38634g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cdncallback, mediaId:");
        sb6.append(mediaId);
        sb6.append(", startRet:");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.field_retCode) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (hVar == null) {
            return 0;
        }
        int i18 = hVar.field_retCode;
        java.lang.String str2 = this.f38632f;
        if (i18 == 0) {
            java.lang.String str3 = this.f38631e;
            boolean j17 = com.tencent.mm.vfs.w6.j(str3);
            long k17 = com.tencent.mm.vfs.w6.k(str3);
            com.tencent.mars.xlog.Log.i(eVar.f38634g, "success, fileExist:" + j17 + ", fileLength:" + k17);
            long d17 = com.tencent.mm.vfs.w6.d(str3, str2, false);
            com.tencent.mars.xlog.Log.i(eVar.f38634g, "copied length = " + d17);
            com.tencent.mm.vfs.w6.h(str3);
            eVar.getClass();
            org.libpag.PAGFile Load = org.libpag.PAGFile.Load(str2);
            boolean z18 = true;
            if ((Load != null ? Load : null) == null) {
                if (eVar.f38633f.f226525c) {
                    com.tencent.mars.xlog.Log.i(eVar.f38634g, "PAGFile.Load null , so del file path:" + str2);
                    com.tencent.mm.vfs.w6.h(str2);
                }
                z18 = false;
            }
            eVar.e(z18 ? new c51.b(str2) : new c51.a(str2, eVar.f38637m));
        } else {
            com.tencent.mars.xlog.Log.i(eVar.f38634g, "failed, " + hVar.field_retCode);
            eVar.e(new c51.a(str2, hVar.field_retCode));
        }
        eVar.b(fp0.u.f265290f);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(inbuf, "inbuf");
        return new byte[0];
    }
}

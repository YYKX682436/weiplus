package c51;

/* loaded from: classes10.dex */
public final class d implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c51.e f120163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120165f;

    public d(c51.e eVar, java.lang.String str, java.lang.String str2) {
        this.f120163d = eVar;
        this.f120164e = str;
        this.f120165f = str2;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        c51.e eVar = this.f120163d;
        java.lang.String str = eVar.f120167g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cdncallback, mediaId:");
        sb6.append(mediaId);
        sb6.append(", startRet:");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f69553xb5f54fe9) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (hVar == null) {
            return 0;
        }
        int i18 = hVar.f69553xb5f54fe9;
        java.lang.String str2 = this.f120165f;
        if (i18 == 0) {
            java.lang.String str3 = this.f120164e;
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str3);
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f120167g, "success, fileExist:" + j17 + ", fileLength:" + k17);
            long d17 = com.p314xaae8f345.mm.vfs.w6.d(str3, str2, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f120167g, "copied length = " + d17);
            com.p314xaae8f345.mm.vfs.w6.h(str3);
            eVar.getClass();
            org.p3363xbe4143f1.C29690xfae77312 m154716x243906 = org.p3363xbe4143f1.C29690xfae77312.m154716x243906(str2);
            boolean z18 = true;
            if ((m154716x243906 != null ? m154716x243906 : null) == null) {
                if (eVar.f120166f.f308058c) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f120167g, "PAGFile.Load null , so del file path:" + str2);
                    com.p314xaae8f345.mm.vfs.w6.h(str2);
                }
                z18 = false;
            }
            eVar.e(z18 ? new c51.b(str2) : new c51.a(str2, eVar.f120170m));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f120167g, "failed, " + hVar.f69553xb5f54fe9);
            eVar.e(new c51.a(str2, hVar.f69553xb5f54fe9));
        }
        eVar.b(fp0.u.f346823f);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inbuf, "inbuf");
        return new byte[0];
    }
}

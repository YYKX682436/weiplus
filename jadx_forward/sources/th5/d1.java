package th5;

/* loaded from: classes4.dex */
public final class d1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f500895f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500896g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f500897h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.p f500898i;

    public d1(java.lang.String str, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.String str3, p3325xe03a0797.p3326xc267989b.q qVar, yz5.p pVar) {
        this.f500893d = str;
        this.f500894e = str2;
        this.f500895f = c0Var;
        this.f500896g = str3;
        this.f500897h = qVar;
        this.f500898i = pVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cdnCallback mediaId=");
        sb6.append(mediaId);
        sb6.append(" startRet=");
        sb6.append(i17);
        sb6.append(" retCode=");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f69553xb5f54fe9) : null);
        sb6.append(" progress=");
        sb6.append(gVar);
        sb6.append(" scene=");
        java.lang.String str = this.f500893d;
        sb6.append(str.length() == 0 ? "-" : str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPhotoUrlDownloader", sb6.toString());
        if (gVar != null) {
            this.f500898i.mo149xb9724478(java.lang.Long.valueOf(gVar.f69500x8ab84c59), java.lang.Long.valueOf(gVar.f69496x83ec3dd));
        }
        if (hVar == null) {
            return 0;
        }
        int i18 = hVar.f69553xb5f54fe9;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f500895f;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f500897h;
        java.lang.String str2 = this.f500894e;
        if (i18 == 0) {
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str2);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("downloadToPath cdn success fileExist=");
            sb7.append(j17);
            sb7.append(" scene=");
            sb7.append(str.length() == 0 ? "-" : str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPhotoUrlDownloader", sb7.toString());
            if (!c0Var.f391645d) {
                c0Var.f391645d = true;
                if (j17) {
                    java.lang.String str3 = this.f500896g;
                    com.p314xaae8f345.mm.vfs.w6.w(str2, str3);
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("downloadToPath ok=true scene=");
                    if (str.length() == 0) {
                        str = "-";
                    }
                    sb8.append(str);
                    sb8.append(" path=");
                    sb8.append(str3);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPhotoUrlDownloader", sb8.toString());
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
                } else {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
                }
            }
        } else {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("downloadToPath cdn failed retCode=");
            sb9.append(hVar.f69553xb5f54fe9);
            sb9.append(" scene=");
            if (str.length() == 0) {
                str = "-";
            }
            sb9.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPhotoUrlDownloader", sb9.toString());
            com.p314xaae8f345.mm.vfs.w6.h(str2);
            if (!c0Var.f391645d) {
                c0Var.f391645d = true;
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inbuf, "inbuf");
        return new byte[0];
    }
}

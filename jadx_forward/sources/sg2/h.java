package sg2;

/* loaded from: classes4.dex */
public final class h implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f489435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f489436f;

    public h(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f489434d = str;
        this.f489435e = c0Var;
        this.f489436f = qVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#downloadCdnRes cdncallback, mediaId:");
        sb6.append(mediaId);
        sb6.append(", startRet:");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f69553xb5f54fe9) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGesturesFilesManager", sb6.toString());
        if (hVar == null) {
            return 0;
        }
        int i18 = hVar.f69553xb5f54fe9;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f489436f;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f489435e;
        if (i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGesturesFilesManager", "#downloadCdnRes success, fileExist:" + com.p314xaae8f345.mm.vfs.w6.j(this.f489434d));
            if (!c0Var.f391645d) {
                c0Var.f391645d = true;
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGesturesFilesManager", "#downloadCdnRes failed, " + hVar.f69553xb5f54fe9);
            if (!c0Var.f391645d) {
                c0Var.f391645d = true;
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
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

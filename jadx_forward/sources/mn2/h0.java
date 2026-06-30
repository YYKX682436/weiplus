package mn2;

/* loaded from: classes10.dex */
public final class h0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.h3 f411545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo0.b f411546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411547f;

    public h0(mn2.h3 h3Var, zo0.b bVar, java.lang.String str) {
        this.f411545d = h3Var;
        this.f411546e = bVar;
        this.f411547f = str;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaId ");
        sb6.append(mediaId);
        sb6.append(" startRet ");
        sb6.append(i17);
        sb6.append(" sceneResult ");
        sb6.append(hVar);
        sb6.append(" onlyCheckExist ");
        sb6.append(z17);
        sb6.append(" retCode ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f69553xb5f54fe9) : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCdnDownloader", sb6.toString());
        zo0.b bVar = this.f411546e;
        if (hVar != null) {
            if (this.f411545d == null) {
                return 0;
            }
            if (hVar.f69553xb5f54fe9 != 0) {
                bVar.a();
            } else {
                java.lang.String str = this.f411547f;
                bVar.b(new hp0.b(str, "", new hp0.a(str)));
            }
        } else if (i17 != 0) {
            bVar.a();
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

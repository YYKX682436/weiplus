package wt3;

/* loaded from: classes10.dex */
public final class i implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt3.j f530957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f530958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f530959f;

    public i(wt3.j jVar, java.lang.String str, java.lang.String str2) {
        this.f530957d = jVar;
        this.f530958e = str;
        this.f530959f = str2;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        wt3.j jVar = this.f530957d;
        java.lang.String str = jVar.f530962f;
        if (gVar != null) {
            gVar.m125797x9616526c();
        }
        if (hVar != null) {
            hVar.m125799x9616526c();
        }
        if (hVar != null) {
            if (hVar.f69553xb5f54fe9 == 0) {
                java.lang.String str2 = jVar.f530962f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download success ");
                sb6.append(mediaId);
                sb6.append(' ');
                java.lang.String str3 = this.f530958e;
                sb6.append(str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                com.p314xaae8f345.mm.vfs.w6.w(this.f530959f, str3);
                jVar.a(true, str3);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(jVar.f530962f, "download fail sceneResult " + hVar.f69553xb5f54fe9);
                jVar.a(false, null);
            }
        } else if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(jVar.f530962f, "download fail startRet " + i17);
            jVar.a(false, null);
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

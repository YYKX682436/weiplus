package hf4;

/* loaded from: classes10.dex */
public final class c implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf4.e f362754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo0.b f362755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362756f;

    public c(hf4.e eVar, zo0.b bVar, java.lang.String str) {
        this.f362754d = eVar;
        this.f362755e = bVar;
        this.f362756f = str;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.StoryDownloader", "mediaId " + mediaId + " startRet " + i17 + " sceneResult " + hVar + " onlyCheckExist " + z17);
        if (hVar == null || this.f362754d == null) {
            return 0;
        }
        java.lang.String str = this.f362756f;
        this.f362755e.b(new hp0.b(str, "", new hp0.a(str)));
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inbuf, "inbuf");
        return new byte[0];
    }
}

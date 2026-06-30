package fy2;

/* loaded from: classes10.dex */
public final class b implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fy2.d f348768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fy2.a f348769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f348770f;

    public b(fy2.d dVar, fy2.a aVar, yz5.l lVar) {
        this.f348768d = dVar;
        this.f348769e = aVar;
        this.f348770f = lVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        yz5.l lVar = this.f348770f;
        fy2.a aVar = this.f348769e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveDecorationSlice", "mediaId " + mediaId + " startRet " + i17 + " sceneResult " + hVar + " onlyCheckExist " + z17);
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveDecorationSlice", "skip fetch pag callback, sceneResult == null");
            return 0;
        }
        if (hVar.f69553xb5f54fe9 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LiveDecorationSlice", "skip fetch pag callback, fetch pag fail:" + hVar.f69553xb5f54fe9);
            return 0;
        }
        try {
            long m75942xfb822ef2 = ((mm2.e1) this.f348768d.m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            java.lang.String b17 = kk.k.b(new com.p314xaae8f345.mm.vfs.r6(aVar.G1), (int) com.p314xaae8f345.mm.vfs.w6.k(aVar.G1));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveDecorationSlice", "loadDecorationRes finish. localMd5:" + b17 + " taskMd5:" + aVar.S1 + " curLiveId:" + m75942xfb822ef2 + " taskLiveId:" + aVar.R1);
            if (m75942xfb822ef2 == aVar.R1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(b17, aVar.S1)) {
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                }
            } else if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveDecorationSlice", "loadDecorationRes err:" + e17.getMessage());
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
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

package xh3;

/* loaded from: classes12.dex */
public final class e implements dn.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xh3.h f536108d;

    public e(xh3.h hVar) {
        this.f536108d = hVar;
    }

    @Override // dn.f
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.f
    public int a(java.lang.String str, dn.g gVar, dn.h hVar) {
        java.util.List d17 = this.f536108d.d(str);
        xh3.h hVar2 = this.f536108d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("progressFinishLength:");
        sb6.append(gVar != null ? gVar.f69496x83ec3dd : -123456L);
        sb6.append(" sceneResultRet:");
        sb6.append(hVar != null ? hVar.f69553xb5f54fe9 : -123456);
        if (!xh3.h.a(hVar2, str, d17, "callback", "preloader", sb6.toString())) {
            return 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            it.next();
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it6.next());
            if (gVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMMarsTaskDistributor", "callback preload by onProgress mediaId:" + str + " progressFinishLength:" + gVar.f69496x83ec3dd + " task:null");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                throw null;
            }
        }
        return 1;
    }

    @Override // dn.f
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }

    @Override // dn.f
    public int x(java.lang.String str, dn.h hVar) {
        java.util.List d17 = this.f536108d.d(str);
        xh3.h hVar2 = this.f536108d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("retCode:");
        sb6.append(hVar != null ? hVar.f69553xb5f54fe9 : -123456);
        if (!xh3.h.a(hVar2, str, d17, "onPreloadCompleted", "preloader", sb6.toString())) {
            return 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            it.next();
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it6.next());
            if (hVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMMarsTaskDistributor", "onPreloadCompleted preload by onPreloadCompleted mediaId:" + str + " retCode:" + hVar.f69553xb5f54fe9 + " task:null");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                throw null;
            }
        }
        return 1;
    }
}

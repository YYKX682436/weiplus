package u03;

/* loaded from: classes10.dex */
public final class k implements u03.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f505001a = "MicroMsg.flutter.TingListenVideoCdnTaskFactory." + hashCode();

    @Override // u03.d
    public java.lang.Object a(byte[] bArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str = this.f505001a;
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m76746xaf65a0fc = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725.m76746xaf65a0fc();
            m76746xaf65a0fc.mo11468x92b714fd(bArr);
            dk4.a sj6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).sj(m76746xaf65a0fc);
            if (sj6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "createMediaInfo from FinderObject failed");
                return null;
            }
            ck4.c cVar = ck4.c.f124081a;
            java.lang.String mediaId = sj6.f316015s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaId, "mediaId");
            java.lang.String url = sj6.f316017u;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
            java.lang.String path = sj6.f316016t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "path");
            int i17 = sj6.f315997a;
            java.lang.String fileFormat = sj6.f315998b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fileFormat, "fileFormat");
            java.lang.String urlToken = sj6.f315999c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(urlToken, "urlToken");
            ck4.b b17 = cVar.b(mediaId, url, path, i17, fileFormat, urlToken, sj6.f316000d, sj6.f316014r, null, this.f505001a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "cdnTask url:" + b17.f323344z + ',' + b17.M1 + ", format:" + b17.f69610x4f5245a8 + ", flag:" + b17.X1);
            return b17;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "parse proto failed, " + e17.getMessage());
            return null;
        }
    }

    @Override // u03.d
    public u03.a b() {
        return u03.a.f504991g;
    }
}

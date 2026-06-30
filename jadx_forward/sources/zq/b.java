package zq;

/* loaded from: classes.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.lang.String rootPath, java.lang.String productId, java.lang.String url) {
        java.lang.String g17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootPath, "rootPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(productId) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiGroupDiskCache", "[cpan] get icon path failed. productid and url are null.");
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(productId) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiGroupDiskCache", "[cpan] product id and url are null.");
            g17 = null;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            byte[] bytes = productId.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            g17 = kk.k.g(bytes);
        } else {
            byte[] bytes2 = url.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
            g17 = kk.k.g(bytes2);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(productId)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
            return rootPath.concat(g17);
        }
        return rootPath + productId + '/' + g17;
    }
}

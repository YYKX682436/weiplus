package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes5.dex */
public final class p6 extends com.tencent.mm.plugin.appbrand.jsapi.media.p {
    public static final int CTRL_INDEX = 217;
    public static final java.lang.String NAME = "saveImageToPhotosAlbum";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.p
    public boolean D(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.toLowerCase().contains("image");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.p
    public java.lang.String E(java.lang.String str, java.lang.String str2) {
        return q75.c.a(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.p
    public void H(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.media.o6(this));
    }
}

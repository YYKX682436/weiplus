package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes5.dex */
public final class t6 extends com.tencent.mm.plugin.appbrand.jsapi.media.p {
    public static final int CTRL_INDEX = 216;
    public static final java.lang.String NAME = "saveVideoToPhotosAlbum";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.p
    public boolean D(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.toLowerCase().contains("video");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.p
    public java.lang.String E(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "mp4";
        }
        return q75.c.b(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.p
    public void H(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.media.s6(this, str));
    }
}

package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXMediaMessage */
/* loaded from: classes9.dex */
public final class C11286x34a5504 {

    /* renamed from: ACTION_WXAPPMESSAGE */
    public static final java.lang.String f33112x85c85fd0 = "com.tencent.mm.sdk.openapi.Intent.ACTION_WXAPPMESSAGE";

    /* renamed from: DESCRIPTION_LENGTH_LIMIT */
    public static final int f33113x8c3a9885 = 1024;

    /* renamed from: MEDIA_TAG_NAME_LENGTH_LIMIT */
    public static final int f33114x401e2276 = 64;

    /* renamed from: MESSAGE_ACTION_LENGTH_LIMIT */
    public static final int f33115xe5938013 = 2048;

    /* renamed from: MESSAGE_EXT_LENGTH_LIMIT */
    public static final int f33116x276dc7d8 = 2048;

    /* renamed from: MINI_PROGRAM__THUMB_LENGHT */
    public static final int f33117xbc219183 = 131072;

    /* renamed from: NATIVE_GAME__THUMB_LIMIT */
    public static final int f33118xc964c318 = 262144;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXMediaMessage";

    /* renamed from: THUMB_LENGTH_LIMIT */
    public static final int f33119x6ead48eb = 65536;

    /* renamed from: TITLE_LENGTH_LIMIT */
    public static final int f33120x29833ba9 = 512;

    /* renamed from: description */
    public java.lang.String f33121x993583fc;

    /* renamed from: mediaObject */
    public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject f33122xe4128443;

    /* renamed from: mediaTagName */
    public java.lang.String f33123xa4d390c1;

    /* renamed from: messageAction */
    public java.lang.String f33124x838b091d;

    /* renamed from: messageExt */
    public java.lang.String f33125x9b39409a;

    /* renamed from: msgSignature */
    public java.lang.String f33126x2a5bf237;

    /* renamed from: sdkVer */
    public int f33127xc9f07109;

    /* renamed from: thumbData */
    public byte[] f33128x4f3b3aa0;

    /* renamed from: thumbDataHash */
    public java.lang.String f33129x73ff1fce;

    /* renamed from: title */
    public java.lang.String f33130x6942258;

    /* renamed from: com.tencent.mm.opensdk.modelmsg.WXMediaMessage$Builder */
    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: KEY_IDENTIFIER */
        public static final java.lang.String f33131x1f5e3ea9 = "_wxobject_identifier_";

        /* renamed from: fromBundle */
        public static com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 m48469x63aa4ccc(android.os.Bundle bundle) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
            c11286x34a5504.f33127xc9f07109 = bundle.getInt("_wxobject_sdkVer");
            c11286x34a5504.f33130x6942258 = bundle.getString("_wxobject_title");
            c11286x34a5504.f33121x993583fc = bundle.getString("_wxobject_description");
            c11286x34a5504.f33128x4f3b3aa0 = bundle.getByteArray("_wxobject_thumbdata");
            c11286x34a5504.f33123xa4d390c1 = bundle.getString("_wxobject_mediatagname");
            c11286x34a5504.f33124x838b091d = bundle.getString("_wxobject_message_action");
            c11286x34a5504.f33125x9b39409a = bundle.getString("_wxobject_message_ext");
            c11286x34a5504.f33126x2a5bf237 = bundle.getString("_wxobject_msgsignature");
            c11286x34a5504.f33129x73ff1fce = bundle.getString("_wxobject_thumbdatadash");
            java.lang.String m48471xc48a4283 = m48471xc48a4283(bundle.getString(f33131x1f5e3ea9));
            if (m48471xc48a4283 != null && m48471xc48a4283.length() > 0) {
                try {
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject) java.lang.Class.forName(m48471xc48a4283).newInstance();
                    c11286x34a5504.f33122xe4128443 = iMediaObject;
                    iMediaObject.mo48451xe1e5b467(bundle);
                    return c11286x34a5504;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.TAG, "get media object from bundle failed: unknown ident " + m48471xc48a4283 + ", ex = " + e17.getMessage());
                }
            }
            return c11286x34a5504;
        }

        /* renamed from: pathNewToOld */
        private static java.lang.String m48470xac98f31(java.lang.String str) {
            if (str != null && str.length() != 0) {
                return str.replace("com.tencent.mm.opensdk.modelmsg", "com.tencent.mm.sdk.openapi");
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.TAG, "pathNewToOld fail, newPath is null");
            return str;
        }

        /* renamed from: pathOldToNew */
        private static java.lang.String m48471xc48a4283(java.lang.String str) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.TAG, "pathOldToNew, oldPath = ".concat(java.lang.String.valueOf(str)));
            if (str == null || str.length() == 0) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.TAG, "pathOldToNew fail, oldPath is null");
                return str;
            }
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf == -1) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.TAG, "pathOldToNew fail, invalid pos, oldPath = ".concat(str));
                return str;
            }
            return "com.tencent.mm.opensdk.modelmsg" + str.substring(lastIndexOf);
        }

        /* renamed from: toBundle */
        public static android.os.Bundle m48472x792022dd(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("_wxobject_sdkVer", c11286x34a5504.f33127xc9f07109);
            bundle.putString("_wxobject_title", c11286x34a5504.f33130x6942258);
            bundle.putString("_wxobject_description", c11286x34a5504.f33121x993583fc);
            bundle.putByteArray("_wxobject_thumbdata", c11286x34a5504.f33128x4f3b3aa0);
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject = c11286x34a5504.f33122xe4128443;
            if (iMediaObject != null) {
                bundle.putString(f33131x1f5e3ea9, m48470xac98f31(iMediaObject.getClass().getName()));
                c11286x34a5504.f33122xe4128443.mo48450xddd166e0(bundle);
            }
            bundle.putString("_wxobject_mediatagname", c11286x34a5504.f33123xa4d390c1);
            bundle.putString("_wxobject_message_action", c11286x34a5504.f33124x838b091d);
            bundle.putString("_wxobject_message_ext", c11286x34a5504.f33125x9b39409a);
            bundle.putString("_wxobject_msgsignature", c11286x34a5504.f33126x2a5bf237);
            bundle.putString("_wxobject_thumbdatadash", c11286x34a5504.f33129x73ff1fce);
            return bundle;
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject */
    /* loaded from: classes9.dex */
    public interface IMediaObject {

        /* renamed from: TYPE_APPBRAND */
        public static final int f33132xc8d4196b = 33;

        /* renamed from: TYPE_APPDATA */
        public static final int f33133x1f415126 = 7;

        /* renamed from: TYPE_BUSINESS_CARD */
        public static final int f33134xf2fa7fea = 45;

        /* renamed from: TYPE_CARD_SHARE */
        public static final int f33135x6d7c87f5 = 16;

        /* renamed from: TYPE_DESIGNER_SHARED */
        public static final int f33136xd091f134 = 25;

        /* renamed from: TYPE_DEVICE_ACCESS */
        public static final int f33137xf2c9328 = 12;

        /* renamed from: TYPE_EMOJI */
        public static final int f33138x125c9ee1 = 8;

        /* renamed from: TYPE_EMOJILIST_SHARED */
        public static final int f33139xbb67a1a5 = 27;

        /* renamed from: TYPE_EMOTICON_GIFT */
        public static final int f33140x1b53bb04 = 11;

        /* renamed from: TYPE_EMOTICON_SHARED */
        public static final int f33141xa9bad539 = 15;

        /* renamed from: TYPE_EMOTIONLIST_SHARED */
        public static final int f33142xb6b48930 = 26;

        /* renamed from: TYPE_FILE */
        public static final int f33143xc6c99361 = 6;

        /* renamed from: TYPE_GAME_LIVE */
        public static final int f33144x1c400654 = 70;

        /* renamed from: TYPE_GAME_VIDEO_FILE */
        public static final int f33145x7662ba48 = 39;

        /* renamed from: TYPE_GIFTCARD */
        public static final int f33146xb5b5e7a5 = 34;

        /* renamed from: TYPE_IMAGE */
        public static final int f33147x1294c7f6 = 2;

        /* renamed from: TYPE_LOCATION */
        public static final int f33148xf45ebb1a = 30;

        /* renamed from: TYPE_LOCATION_SHARE */
        public static final int f33149xe9583a5a = 17;

        /* renamed from: TYPE_MALL_PRODUCT */
        public static final int f33150xa8f29a89 = 13;

        /* renamed from: TYPE_MUSIC */
        public static final int f33151x12d10cc0 = 3;

        /* renamed from: TYPE_MUSIC_VIDEO */
        public static final int f33152x107efc1c = 76;

        /* renamed from: TYPE_NATIVE_GAME_PAGE */
        public static final int f33153xc670baf9 = 101;

        /* renamed from: TYPE_NOTE */
        public static final int f33154xc6cd4dd7 = 24;

        /* renamed from: TYPE_OLD_TV */
        public static final int f33155x4a34ec5f = 14;

        /* renamed from: TYPE_OPENSDK_APPBRAND */
        public static final int f33156x2d02523a = 36;

        /* renamed from: TYPE_OPENSDK_APPBRAND_WEISHIVIDEO */
        public static final int f33157x5fed25fd = 46;

        /* renamed from: TYPE_OPENSDK_LITEAPP */
        public static final int f33158xaf3cb3df = 68;

        /* renamed from: TYPE_OPENSDK_WEWORK_OBJECT */
        public static final int f33159x41d5d4eb = 49;

        /* renamed from: TYPE_PRODUCT */
        public static final int f33160x3c1aacca = 10;

        /* renamed from: TYPE_RECORD */
        public static final int f33161x4ef020f6 = 19;

        /* renamed from: TYPE_TEXT */
        public static final int f33162xc6cfe312 = 1;

        /* renamed from: TYPE_TV */
        public static final int f33163xf7f2e5a7 = 20;

        /* renamed from: TYPE_UNKNOWN */
        public static final int f33164x3d928c25 = 0;

        /* renamed from: TYPE_URL */
        public static final int f33165x669d2ca = 5;

        /* renamed from: TYPE_VIDEO */
        public static final int f33166x134a3316 = 4;

        /* renamed from: TYPE_VIDEO_FILE */
        public static final int f33167x9d03f105 = 38;

        /* renamed from: checkArgs */
        boolean mo48449x17b96605();

        /* renamed from: serialize */
        void mo48450xddd166e0(android.os.Bundle bundle);

        /* renamed from: type */
        int mo14189x368f3a();

        /* renamed from: unserialize */
        void mo48451xe1e5b467(android.os.Bundle bundle);
    }

    public C11286x34a5504() {
        this(null);
    }

    /* renamed from: checkArgs */
    public final boolean m48466x17b96605() {
        java.lang.String str;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        if (m48467xfb85f7b0() == 8 && ((bArr4 = this.f33128x4f3b3aa0) == null || bArr4.length == 0)) {
            str = "checkArgs fail, thumbData should not be null when send emoji";
        } else if (m48467xfb85f7b0() == 76 && com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33130x6942258)) {
            str = "checkArgs fail, Type = Music Video, but title == null";
        } else if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.a(m48467xfb85f7b0()) && ((bArr3 = this.f33128x4f3b3aa0) == null || bArr3.length > 131072)) {
            str = "checkArgs fail, thumbData should not be null or exceed 128kb";
        } else if (!com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(m48467xfb85f7b0()) || ((bArr2 = this.f33128x4f3b3aa0) != null && bArr2.length <= 262144)) {
            if ((com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.a(m48467xfb85f7b0()) || com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(m48467xfb85f7b0())) || (bArr = this.f33128x4f3b3aa0) == null || bArr.length <= 65536) {
                java.lang.String str2 = this.f33130x6942258;
                if (str2 == null || str2.length() <= 512) {
                    java.lang.String str3 = this.f33121x993583fc;
                    if (str3 != null && str3.length() > 1024) {
                        str = "checkArgs fail, description is invalid";
                    } else if (this.f33122xe4128443 == null) {
                        str = "checkArgs fail, mediaObject is null";
                    } else {
                        java.lang.String str4 = this.f33123xa4d390c1;
                        if (str4 == null || str4.length() <= 64) {
                            java.lang.String str5 = this.f33124x838b091d;
                            if (str5 == null || str5.length() <= 2048) {
                                java.lang.String str6 = this.f33125x9b39409a;
                                if (str6 == null || str6.length() <= 2048) {
                                    return this.f33122xe4128443.mo48449x17b96605();
                                }
                                str = "checkArgs fail, messageExt is too long";
                            } else {
                                str = "checkArgs fail, messageAction is too long";
                            }
                        } else {
                            str = "checkArgs fail, mediaTagName is too long";
                        }
                    }
                } else {
                    str = "checkArgs fail, title is invalid";
                }
            } else {
                str = "checkArgs fail, thumbData is invalid";
            }
        } else {
            str = "checkArgs fail, thumbData should not be null or exceed 256KB";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    /* renamed from: getType */
    public final int m48467xfb85f7b0() {
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject = this.f33122xe4128443;
        if (iMediaObject == null) {
            return 0;
        }
        return iMediaObject.mo14189x368f3a();
    }

    /* renamed from: setThumbImage */
    public final void m48468xb4dcc327(android.graphics.Bitmap bitmap) {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.f33128x4f3b3aa0 = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "setThumbImage exception:" + e17.getMessage());
        }
    }

    public C11286x34a5504(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject) {
        this.f33122xe4128443 = iMediaObject;
    }
}

package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider */
/* loaded from: classes13.dex */
public abstract class AbstractC26094xf8f651ae implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26090xef1182df {

    /* renamed from: DEBUG */
    private static final boolean f49814x3de9e33 = false;
    private static final java.lang.String TAG = "UrlTileProvider";

    /* renamed from: mHeight */
    private final int f49815x6a4b7f4;

    /* renamed from: mWidth */
    private final int f49816xbefb7959;

    public AbstractC26094xf8f651ae() {
        this(256, 256);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26090xef1182df
    /* renamed from: getTile */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce mo36666xfb85bb24(int i17, int i18, int i19) {
        java.net.URL mo36931xef6e0fab = mo36931xef6e0fab(i17, i18, i19);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce c26087x27c6ce = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26090xef1182df.f49802xaa56ea6c;
        if (mo36931xef6e0fab == null) {
            return c26087x27c6ce;
        }
        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde mo36977x1cc30727 = mo36977x1cc30727(mo36931xef6e0fab.toString());
        byte[] bArr = null;
        if (mo36977x1cc30727 != null) {
            if (!mo36977x1cc30727.mo36017xd4418ac9()) {
                return mo36977x1cc30727.f16981x584fd04f instanceof com.p314xaae8f345.map.p511x696c9db.net.p515x584fd04f.C4338xf5960604 ? mo36977x1cc30727.f16986xec0a8ff == 404 ? c26087x27c6ce : new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce(this.f49816xbefb7959, this.f49815x6a4b7f4, null) : mo36977x1cc30727.f16986xec0a8ff == 404 ? c26087x27c6ce : new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce(this.f49816xbefb7959, this.f49815x6a4b7f4, null);
            }
            bArr = mo36977x1cc30727.f16977x2eefaa;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce c26087x27c6ce2 = (bArr == null || bArr.length == 0) ? c26087x27c6ce : new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce(this.f49816xbefb7959, this.f49815x6a4b7f4, bArr);
        return c26087x27c6ce2.equals(c26087x27c6ce) ? com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce.f49783xdf8baa80 : c26087x27c6ce2;
    }

    /* renamed from: getTileUrl */
    public abstract java.net.URL mo36931xef6e0fab(int i17, int i18, int i19);

    /* renamed from: requestTileData */
    public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde mo36977x1cc30727(java.lang.String str) {
        try {
            return com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35934xdc3ef9b().url(str).m35995x5b4bacb();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public AbstractC26094xf8f651ae(int i17, int i18) {
        this.f49816xbefb7959 = i17;
        this.f49815x6a4b7f4 = i18;
    }
}

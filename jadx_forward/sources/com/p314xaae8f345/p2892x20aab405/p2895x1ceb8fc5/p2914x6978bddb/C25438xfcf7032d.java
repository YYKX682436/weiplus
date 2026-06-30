package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.HttpDataSource */
/* loaded from: classes13.dex */
public class C25438xfcf7032d implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e {

    /* renamed from: headers */
    private final java.util.Map<java.lang.String, java.lang.String> f46136x2f676f86;

    /* renamed from: mediaHTTPConnection */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61 f46137x5223226a;

    /* renamed from: service */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25397x444b4112 f46138x7643c6b5;
    private final android.net.Uri uri;

    public C25438xfcf7032d(android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> map, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25397x444b4112 interfaceC25397x444b4112) {
        this.uri = uri;
        this.f46136x2f676f86 = map;
        this.f46138x7643c6b5 = interfaceC25397x444b4112;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61 interfaceC25396xa9fd0b61 = this.f46137x5223226a;
        if (interfaceC25396xa9fd0b61 != null) {
            interfaceC25396xa9fd0b61.mo94092x1f9d589c();
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94257xaa5357a() {
        return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2907x38fb28bd.C25393x11c58fd.m94078xddbe0e37((com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e) this, false);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getSize */
    public long mo94260xfb854877() {
        return this.f46137x5223226a.mo94094xfb854877();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: open */
    public void mo94263x34264a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61 mo94097x1dba5ef4 = this.f46138x7643c6b5.mo94097x1dba5ef4();
        this.f46137x5223226a = mo94097x1dba5ef4;
        mo94097x1dba5ef4.mo94091x38b478ea(new java.net.URL(this.uri.toString()), this.f46136x2f676f86);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: readAt */
    public int mo94264xc8455469(long j17, byte[] bArr, int i17, int i18) {
        int i19 = 0;
        do {
            int i27 = i17 + i19;
            int mo94096xc8455469 = this.f46137x5223226a.mo94096xc8455469(i19 + j17, bArr, i27, i18 - i27);
            if (mo94096xc8455469 < 0) {
                return mo94096xc8455469;
            }
            if (mo94096xc8455469 == 0) {
                break;
            }
            i19 += mo94096xc8455469;
        } while (i19 < i18);
        return i19;
    }
}

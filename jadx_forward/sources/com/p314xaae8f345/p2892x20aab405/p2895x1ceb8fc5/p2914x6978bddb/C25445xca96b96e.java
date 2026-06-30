package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory */
/* loaded from: classes13.dex */
public class C25445xca96b96e {
    private static final java.lang.String TAG = "NativeDataSourceFactory";

    /* renamed from: soLoaded */
    private static final boolean f46144x21f4f581;

    static {
        boolean m93810x14104adb = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.m93810x14104adb(java.util.Arrays.asList(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.audioCommon, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.formatDetector, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.codecFactory, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.decoderJni, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.cppShared, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.xlog, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.xFFmpeg));
        f46144x21f4f581 = m93810x14104adb;
        if (m93810x14104adb) {
            return;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[static initializer] failed to load so!");
    }

    /* renamed from: fileDataSource */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45 m94317x91f28301(final java.lang.String str) {
        return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45() { // from class: com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory.1
            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45
            /* renamed from: getAudioType */
            public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94302xaa5357a() {
                return null;
            }

            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45
            /* renamed from: getNativeInstance */
            public long mo94303x27a10ec2() {
                if (!com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25445xca96b96e.f46144x21f4f581) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25445xca96b96e.TAG, "[getNativeInstance] so not loaded properly!");
                    return 0L;
                }
                try {
                    return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25445xca96b96e.m94319xb8239b87(str, 0);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25445xca96b96e.TAG, "[getNativeInstance] failed to create native data source!", th6);
                    return 0L;
                }
            }
        };
    }

    /* renamed from: localFile */
    public static native long m94319xb8239b87(java.lang.String str, int i17);

    /* renamed from: fileDataSource */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45 m94318x91f28301(final java.lang.String str, final int i17) {
        return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45() { // from class: com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory.2
            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45
            /* renamed from: getAudioType */
            public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94302xaa5357a() {
                return null;
            }

            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45
            /* renamed from: getNativeInstance */
            public long mo94303x27a10ec2() {
                if (!com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25445xca96b96e.f46144x21f4f581) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25445xca96b96e.TAG, "[getNativeInstance] so not loaded properly!");
                    return 0L;
                }
                try {
                    return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25445xca96b96e.m94319xb8239b87(str, i17 > 0 ? 1 : 0);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25445xca96b96e.TAG, "[getNativeInstance] failed to create native data source!", th6);
                    return 0L;
                }
            }
        };
    }
}

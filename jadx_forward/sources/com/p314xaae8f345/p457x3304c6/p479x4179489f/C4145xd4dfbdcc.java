package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* renamed from: com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg */
/* loaded from: classes5.dex */
public class C4145xd4dfbdcc extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs {

    /* renamed from: com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg$CompleteArg */
    /* loaded from: classes5.dex */
    public static class CompleteArg extends com.p314xaae8f345.p457x3304c6.p479x4179489f.C4145xd4dfbdcc {

        /* renamed from: error */
        public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f16121x5c4d208;

        public CompleteArg(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
            this.f16121x5c4d208 = c4093x6b88526b;
        }
    }

    /* renamed from: com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg$OnExportCompleteArgs */
    /* loaded from: classes5.dex */
    public static class OnExportCompleteArgs extends com.p314xaae8f345.p457x3304c6.p479x4179489f.C4145xd4dfbdcc {

        /* renamed from: checksum */
        public final java.lang.String f16122x5b9b5c43;

        /* renamed from: error */
        public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f16123x5c4d208;

        /* renamed from: isSoftwareEncoding */
        public final boolean f16124xb6191964;

        public OnExportCompleteArgs(java.lang.String str, boolean z17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
            this.f16122x5b9b5c43 = str;
            this.f16124xb6191964 = z17;
            this.f16123x5c4d208 = c4093x6b88526b;
        }
    }

    /* renamed from: com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg$OnExportCompleteWithDetailsArgs */
    /* loaded from: classes5.dex */
    public static class OnExportCompleteWithDetailsArgs extends com.p314xaae8f345.p457x3304c6.p479x4179489f.C4145xd4dfbdcc {

        /* renamed from: error */
        public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f16125x5c4d208;

        /* renamed from: resultDetails */
        public final com.p314xaae8f345.p457x3304c6.p479x4179489f.C4150x1d312f34 f16126x26b4d765;

        public OnExportCompleteWithDetailsArgs(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4150x1d312f34 c4150x1d312f34, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
            this.f16126x26b4d765 = c4150x1d312f34;
            this.f16125x5c4d208 = c4093x6b88526b;
        }
    }

    /* renamed from: com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg$OnExportProgressArgs */
    /* loaded from: classes5.dex */
    public static class OnExportProgressArgs extends com.p314xaae8f345.p457x3304c6.p479x4179489f.C4145xd4dfbdcc {

        /* renamed from: frameIndex */
        public int f16127xeea76b65;

        public OnExportProgressArgs(int i17) {
            this.f16127xeea76b65 = i17;
        }
    }

    /* renamed from: com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg$OnExportStartedArgs */
    /* loaded from: classes5.dex */
    public static class OnExportStartedArgs extends com.p314xaae8f345.p457x3304c6.p479x4179489f.C4145xd4dfbdcc {

        /* renamed from: totalFrameCount */
        public int f16128xd9e60606;

        public OnExportStartedArgs(int i17) {
            this.f16128xd9e60606 = i17;
        }
    }
}

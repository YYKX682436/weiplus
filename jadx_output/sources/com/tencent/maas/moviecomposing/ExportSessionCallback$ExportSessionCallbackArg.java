package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class ExportSessionCallback$ExportSessionCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

    /* loaded from: classes5.dex */
    public static class CompleteArg extends com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;

        public CompleteArg(com.tencent.maas.instamovie.base.MJError mJError) {
            this.error = mJError;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnExportCompleteArgs extends com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg {
        public final java.lang.String checksum;
        public final com.tencent.maas.instamovie.base.MJError error;
        public final boolean isSoftwareEncoding;

        public OnExportCompleteArgs(java.lang.String str, boolean z17, com.tencent.maas.instamovie.base.MJError mJError) {
            this.checksum = str;
            this.isSoftwareEncoding = z17;
            this.error = mJError;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnExportCompleteWithDetailsArgs extends com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;
        public final com.tencent.maas.moviecomposing.MJExportResultDetails resultDetails;

        public OnExportCompleteWithDetailsArgs(com.tencent.maas.moviecomposing.MJExportResultDetails mJExportResultDetails, com.tencent.maas.instamovie.base.MJError mJError) {
            this.resultDetails = mJExportResultDetails;
            this.error = mJError;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnExportProgressArgs extends com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg {
        public int frameIndex;

        public OnExportProgressArgs(int i17) {
            this.frameIndex = i17;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnExportStartedArgs extends com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg {
        public int totalFrameCount;

        public OnExportStartedArgs(int i17) {
            this.totalFrameCount = i17;
        }
    }
}

package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class MJImageSessionCallback$MJImageSessionCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

    /* loaded from: classes5.dex */
    public static class AddScenesCompleteArg extends com.tencent.maas.imagestudio.MJImageSessionCallback$MJImageSessionCallbackArg {
        public final java.lang.String[] addedSceneIDs;
        public final com.tencent.maas.instamovie.base.MJError error;

        public AddScenesCompleteArg(java.lang.String[] strArr, com.tencent.maas.instamovie.base.MJError mJError) {
            this.addedSceneIDs = strArr;
            this.error = mJError;
        }
    }

    /* loaded from: classes5.dex */
    public static class CompleteArg extends com.tencent.maas.imagestudio.MJImageSessionCallback$MJImageSessionCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;

        public CompleteArg(com.tencent.maas.instamovie.base.MJError mJError) {
            this.error = mJError;
        }
    }

    /* loaded from: classes5.dex */
    public static class ExportCompleteArg extends com.tencent.maas.imagestudio.MJImageSessionCallback$MJImageSessionCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;
        public final com.tencent.maas.imagestudio.MJImageExportResult exportResult;

        public ExportCompleteArg(com.tencent.maas.imagestudio.MJImageExportResult mJImageExportResult, com.tencent.maas.instamovie.base.MJError mJError) {
            this.exportResult = mJImageExportResult;
            this.error = mJError;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnHandleBoxSettingsDidChangeArg extends com.tencent.maas.imagestudio.MJImageSessionCallback$MJImageSessionCallbackArg {
        public final com.tencent.maas.moviecomposing.HandleBoxSettings handleBoxSettings;

        public OnHandleBoxSettingsDidChangeArg(com.tencent.maas.moviecomposing.HandleBoxSettings handleBoxSettings) {
            this.handleBoxSettings = handleBoxSettings;
        }
    }

    /* loaded from: classes5.dex */
    public static class ProgressArg extends com.tencent.maas.imagestudio.MJImageSessionCallback$MJImageSessionCallbackArg {
        public final float progress;

        public ProgressArg(float f17) {
            this.progress = f17;
        }
    }
}

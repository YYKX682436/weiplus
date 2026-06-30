package com.tencent.maas.moviecomposing;

/* loaded from: classes16.dex */
public class ProjectManagerCallback$ProjectManagerCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

    /* loaded from: classes16.dex */
    public static class CompleteArg extends com.tencent.maas.moviecomposing.ProjectManagerCallback$ProjectManagerCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;

        public CompleteArg(com.tencent.maas.instamovie.base.MJError mJError) {
            this.error = mJError;
        }
    }

    /* loaded from: classes16.dex */
    public static class FetchArg extends com.tencent.maas.moviecomposing.ProjectManagerCallback$ProjectManagerCallbackArg {
        public final boolean inCloud;

        public FetchArg(boolean z17) {
            this.inCloud = z17;
        }
    }

    /* loaded from: classes16.dex */
    public static class ProgressArg extends com.tencent.maas.moviecomposing.ProjectManagerCallback$ProjectManagerCallbackArg {
        public final float progress;

        public ProgressArg(float f17) {
            this.progress = f17;
        }
    }
}

package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class MJImageSceneCallback$MJImageSceneCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

    /* loaded from: classes5.dex */
    public static class SaveSnapshotCompleteArg extends com.tencent.maas.imagestudio.MJImageSceneCallback$MJImageSceneCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;
        public final java.lang.String path;

        public SaveSnapshotCompleteArg(java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError) {
            this.path = str;
            this.error = mJError;
        }
    }
}

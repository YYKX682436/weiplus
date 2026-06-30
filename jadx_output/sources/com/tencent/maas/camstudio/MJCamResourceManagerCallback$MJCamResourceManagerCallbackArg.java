package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

    /* loaded from: classes16.dex */
    public static class CompleteArg extends com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;

        public CompleteArg(com.tencent.maas.instamovie.base.MJError mJError) {
            this.error = mJError;
        }
    }

    /* loaded from: classes16.dex */
    public static class MaterialPackCompleteArg extends com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;
        public final com.tencent.maas.material.MJMaterialPack materialPack;

        public MaterialPackCompleteArg(com.tencent.maas.material.MJMaterialPack mJMaterialPack, com.tencent.maas.instamovie.base.MJError mJError) {
            this.materialPack = mJMaterialPack;
            this.error = mJError;
        }
    }

    /* loaded from: classes16.dex */
    public static class MusicCompleteArg extends com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;
        public final com.tencent.maas.model.MJMusicInfo musicInfo;

        public MusicCompleteArg(com.tencent.maas.model.MJMusicInfo mJMusicInfo, com.tencent.maas.instamovie.base.MJError mJError) {
            this.musicInfo = mJMusicInfo;
            this.error = mJError;
        }
    }

    /* loaded from: classes16.dex */
    public static class ProgressArg extends com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg {
        public final float progress;

        public ProgressArg(float f17) {
            this.progress = f17;
        }
    }
}

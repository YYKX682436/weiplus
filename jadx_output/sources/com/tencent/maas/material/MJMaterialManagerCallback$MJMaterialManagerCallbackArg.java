package com.tencent.maas.material;

/* loaded from: classes5.dex */
public class MJMaterialManagerCallback$MJMaterialManagerCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

    /* loaded from: classes5.dex */
    public static class CompleteArg extends com.tencent.maas.material.MJMaterialManagerCallback$MJMaterialManagerCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;

        public CompleteArg(com.tencent.maas.instamovie.base.MJError mJError) {
            this.error = mJError;
        }
    }

    /* loaded from: classes5.dex */
    public static class MaterialPackCompleteArg extends com.tencent.maas.material.MJMaterialManagerCallback$MJMaterialManagerCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;
        public final com.tencent.maas.material.MJMaterialPack materialPack;

        public MaterialPackCompleteArg(com.tencent.maas.material.MJMaterialPack mJMaterialPack, com.tencent.maas.instamovie.base.MJError mJError) {
            this.materialPack = mJMaterialPack;
            this.error = mJError;
        }
    }

    /* loaded from: classes5.dex */
    public static class ProgressArg extends com.tencent.maas.material.MJMaterialManagerCallback$MJMaterialManagerCallbackArg {
        public final float progress;

        public ProgressArg(float f17) {
            this.progress = f17;
        }
    }
}

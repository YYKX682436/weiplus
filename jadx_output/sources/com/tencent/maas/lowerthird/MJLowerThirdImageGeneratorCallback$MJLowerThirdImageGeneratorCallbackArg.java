package com.tencent.maas.lowerthird;

/* loaded from: classes5.dex */
public class MJLowerThirdImageGeneratorCallback$MJLowerThirdImageGeneratorCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

    /* loaded from: classes5.dex */
    public static class ImageCompleteArg extends com.tencent.maas.lowerthird.MJLowerThirdImageGeneratorCallback$MJLowerThirdImageGeneratorCallbackArg {
        public final android.graphics.Bitmap bitmap;
        public final com.tencent.maas.instamovie.base.MJError error;

        public ImageCompleteArg(android.graphics.Bitmap bitmap, com.tencent.maas.instamovie.base.MJError mJError) {
            this.bitmap = bitmap;
            this.error = mJError;
        }
    }
}

package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class MJCamSessionCallback$MJCamSessionCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

    /* loaded from: classes16.dex */
    public static class AIGCRequestConditionNotMetArg extends com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg {
        public final java.lang.String reason;

        public AIGCRequestConditionNotMetArg(java.lang.String str) {
            this.reason = str;
        }
    }

    /* loaded from: classes16.dex */
    public static class BeginAdjustSpatialDescCompleteArg extends com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg {
        public final com.tencent.maas.camstudio.MJCamSpatialDesc desc;
        public final com.tencent.maas.instamovie.base.MJError mjError;
        public final android.graphics.Bitmap originImage;

        public BeginAdjustSpatialDescCompleteArg(com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc, android.graphics.Bitmap bitmap, com.tencent.maas.instamovie.base.MJError mJError) {
            this.desc = mJCamSpatialDesc;
            this.originImage = bitmap;
            this.mjError = mJError;
        }
    }

    /* loaded from: classes16.dex */
    public static class BeginRequestAIGCArg extends com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg {
        public final com.tencent.maas.camerafun.MJAIGCParams params;

        public BeginRequestAIGCArg(com.tencent.maas.camerafun.MJAIGCParams mJAIGCParams) {
            this.params = mJAIGCParams;
        }
    }

    /* loaded from: classes16.dex */
    public static class CompleteArg extends com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;

        public CompleteArg(com.tencent.maas.instamovie.base.MJError mJError) {
            this.error = mJError;
        }
    }

    /* loaded from: classes16.dex */
    public static class FirstFrameDidPresentAfterSwitchTemplateArg extends com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg {
        public final java.lang.String templateID;

        public FirstFrameDidPresentAfterSwitchTemplateArg(java.lang.String str) {
            this.templateID = str;
        }
    }

    /* loaded from: classes16.dex */
    public static class GestureEventArg extends com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg {
        public final com.tencent.maas.camstudio.gesture.MJGestureEvent gestureEvent;

        public GestureEventArg(com.tencent.maas.camstudio.gesture.MJGestureEvent mJGestureEvent) {
            this.gestureEvent = mJGestureEvent;
        }
    }

    /* loaded from: classes16.dex */
    public static class OptionsCompleteArg extends com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;
        public final com.tencent.maas.camerafun.MJCaptureOptions options;

        public OptionsCompleteArg(com.tencent.maas.camerafun.MJCaptureOptions mJCaptureOptions, com.tencent.maas.instamovie.base.MJError mJError) {
            this.options = mJCaptureOptions;
            this.error = mJError;
        }
    }

    /* loaded from: classes16.dex */
    public static class ProgressArg extends com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg {
        public final float progress;

        public ProgressArg(float f17) {
            this.progress = f17;
        }
    }

    /* loaded from: classes16.dex */
    public static class RecordingTimeChangeArg extends com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg {
        public final com.tencent.maas.model.time.MJTime lastFrameTime;
        public final com.tencent.maas.model.time.MJTime maxRecordingDuration;

        public RecordingTimeChangeArg(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2) {
            this.lastFrameTime = mJTime;
            this.maxRecordingDuration = mJTime2;
        }
    }

    /* loaded from: classes16.dex */
    public static class SaveAIGCCraftCompleteArg extends com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg {
        public final com.tencent.maas.camstudio.MJAsyncAIGCInfo asyncAIGCInfo;
        public final com.tencent.maas.instamovie.base.MJError mjError;

        public SaveAIGCCraftCompleteArg(com.tencent.maas.camstudio.MJAsyncAIGCInfo mJAsyncAIGCInfo, com.tencent.maas.instamovie.base.MJError mJError) {
            this.asyncAIGCInfo = mJAsyncAIGCInfo;
            this.mjError = mJError;
        }
    }

    /* loaded from: classes16.dex */
    public static class StopRecordingArg extends com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;
        public final com.tencent.maas.camerafun.MJRecordingFinishInfo finishInfo;

        public StopRecordingArg(com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo, com.tencent.maas.instamovie.base.MJError mJError) {
            this.finishInfo = mJRecordingFinishInfo;
            this.error = mJError;
        }
    }

    /* loaded from: classes16.dex */
    public static class UseTemplateCompleteArg extends com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;
        public final com.tencent.maas.camstudio.MJCamUseTemplateFinishInfo finishInfo;

        public UseTemplateCompleteArg(com.tencent.maas.camstudio.MJCamUseTemplateFinishInfo mJCamUseTemplateFinishInfo, com.tencent.maas.instamovie.base.MJError mJError) {
            this.finishInfo = mJCamUseTemplateFinishInfo;
            this.error = mJError;
        }
    }
}

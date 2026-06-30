package com.p314xaae8f345.p457x3304c6.p470x35bb6d35;

/* renamed from: com.tencent.maas.instamovie.MJMoviePlayerCallback */
/* loaded from: classes5.dex */
public class C4074xdd02fcb9 {

    /* renamed from: com.tencent.maas.instamovie.MJMoviePlayerCallback$CompleteCallback */
    /* loaded from: classes5.dex */
    public static class CompleteCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.MJMoviePlayerCallbackArg.CompleteArg> {

        /* renamed from: onComplete */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete f15959x815f5438;

        public CompleteCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete) {
            super(c4073xbc40c54);
            this.f15959x815f5438 = onComplete;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33256x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.MJMoviePlayerCallbackArg.CompleteArg completeArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete = this.f15959x815f5438;
            if (onComplete == null || completeArg == null) {
                return;
            }
            onComplete.mo9354x815f5438(completeArg.f15960x5c4d208);
        }

        public CompleteCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete, boolean z17) {
            super(c4073xbc40c54, z17);
            this.f15959x815f5438 = onComplete;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMoviePlayerCallback$MJMoviePlayerCallbackArg */
    /* loaded from: classes5.dex */
    public static class MJMoviePlayerCallbackArg extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs {

        /* renamed from: com.tencent.maas.instamovie.MJMoviePlayerCallback$MJMoviePlayerCallbackArg$CompleteArg */
        /* loaded from: classes5.dex */
        public static class CompleteArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.MJMoviePlayerCallbackArg {

            /* renamed from: error */
            public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f15960x5c4d208;

            public CompleteArg(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
                this.f15960x5c4d208 = c4093x6b88526b;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMoviePlayerCallback$MJMoviePlayerCallbackArg$MediaTimeChangeArg */
        /* loaded from: classes5.dex */
        public static class MediaTimeChangeArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.MJMoviePlayerCallbackArg {

            /* renamed from: lastFrameTime */
            public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f15961xb58a07e4;

            /* renamed from: mediaTimeRange */
            public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f15962x6107feec;
            public long tag;

            public MediaTimeChangeArg(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, long j17) {
                this.f15961xb58a07e4 = c4128x879fba0a;
                this.f15962x6107feec = c4129xdee64553;
                this.tag = j17;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMoviePlayerCallback$MJMoviePlayerCallbackArg$OnPlaybackDidFinishArgs */
        /* loaded from: classes5.dex */
        public static class OnPlaybackDidFinishArgs extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.MJMoviePlayerCallbackArg {
        }

        /* renamed from: com.tencent.maas.instamovie.MJMoviePlayerCallback$MJMoviePlayerCallbackArg$ProgressArg */
        /* loaded from: classes5.dex */
        public static class ProgressArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.MJMoviePlayerCallbackArg {

            /* renamed from: progress */
            public final float f15963xc454c22d;

            public ProgressArg(float f17) {
                this.f15963xc454c22d = f17;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMoviePlayerCallback$MJMoviePlayerCallbackArg$TaskProgressArg */
        /* loaded from: classes5.dex */
        public static class TaskProgressArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.MJMoviePlayerCallbackArg {

            /* renamed from: progress */
            public final float f15964xc454c22d;

            /* renamed from: taskTracePBData */
            public final java.nio.ByteBuffer f15965x116e8b7c;

            /* renamed from: timestamp */
            public final double f15966x3492916;

            public TaskProgressArg(float f17, double d17, java.nio.ByteBuffer byteBuffer) {
                this.f15964xc454c22d = f17;
                this.f15966x3492916 = d17;
                this.f15965x116e8b7c = byteBuffer;
            }
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMoviePlayerCallback$MediaTimeChangeCallback */
    /* loaded from: classes5.dex */
    public static class MediaTimeChangeCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.MJMoviePlayerCallbackArg.MediaTimeChangeArg> {

        /* renamed from: onMediaTimeChange */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnMediaTimeChange f15967x51a35402;

        public MediaTimeChangeCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnMediaTimeChange onMediaTimeChange) {
            super(c4073xbc40c54);
            this.f15967x51a35402 = onMediaTimeChange;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33256x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.MJMoviePlayerCallbackArg.MediaTimeChangeArg mediaTimeChangeArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnMediaTimeChange onMediaTimeChange = this.f15967x51a35402;
            if (onMediaTimeChange == null || mediaTimeChangeArg == null) {
                return;
            }
            onMediaTimeChange.mo33254x51a35402(mediaTimeChangeArg.f15961xb58a07e4, mediaTimeChangeArg.f15962x6107feec, mediaTimeChangeArg.tag);
        }

        public MediaTimeChangeCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnMediaTimeChange onMediaTimeChange, boolean z17) {
            super(c4073xbc40c54, z17);
            this.f15967x51a35402 = onMediaTimeChange;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMoviePlayerCallback$OnPlaybackDidFinishCallback */
    /* loaded from: classes5.dex */
    public static class OnPlaybackDidFinishCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.MJMoviePlayerCallbackArg.OnPlaybackDidFinishArgs> {

        /* renamed from: onPlaybackDidFinish */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnPlaybackDidFinish f15968xdca825f8;

        public OnPlaybackDidFinishCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnPlaybackDidFinish onPlaybackDidFinish) {
            super(c4073xbc40c54);
            this.f15968xdca825f8 = onPlaybackDidFinish;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33256x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.MJMoviePlayerCallbackArg.OnPlaybackDidFinishArgs onPlaybackDidFinishArgs) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnPlaybackDidFinish onPlaybackDidFinish = this.f15968xdca825f8;
            if (onPlaybackDidFinish != null) {
                onPlaybackDidFinish.mo33255x7cf2e371();
            }
        }

        public OnPlaybackDidFinishCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnPlaybackDidFinish onPlaybackDidFinish, boolean z17) {
            super(c4073xbc40c54, z17);
            this.f15968xdca825f8 = onPlaybackDidFinish;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMoviePlayerCallback$TaskProgressCallback */
    /* loaded from: classes5.dex */
    public static class TaskProgressCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.MJMoviePlayerCallbackArg.TaskProgressArg> {

        /* renamed from: onTaskProgress */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnTaskProgress f15969xda309251;

        public TaskProgressCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnTaskProgress onTaskProgress) {
            super(c4073xbc40c54);
            this.f15969xda309251 = onTaskProgress;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33256x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.MJMoviePlayerCallbackArg.TaskProgressArg taskProgressArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3 c4090xe7a30da3;
            if (this.f15969xda309251 == null || taskProgressArg == null) {
                return;
            }
            java.nio.ByteBuffer byteBuffer = taskProgressArg.f15965x116e8b7c;
            if (byteBuffer != null) {
                try {
                    c4090xe7a30da3 = new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3(taskProgressArg.f15966x3492916, byteBuffer);
                } catch (java.lang.Exception e17) {
                    io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208("MJMovieSessionCallback", e17.getMessage());
                }
                this.f15969xda309251.mo9359xda309251(taskProgressArg.f15964xc454c22d, c4090xe7a30da3);
            }
            c4090xe7a30da3 = null;
            this.f15969xda309251.mo9359xda309251(taskProgressArg.f15964xc454c22d, c4090xe7a30da3);
        }

        public TaskProgressCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnTaskProgress onTaskProgress, boolean z17) {
            super(c4073xbc40c54, z17);
            this.f15969xda309251 = onTaskProgress;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMoviePlayerCallback$BaseCallback */
    /* loaded from: classes5.dex */
    public static abstract class BaseCallback<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

        /* renamed from: mjMoviePlayerRef */
        private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54> f15958xa100e79f;

        public BaseCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54) {
            this.f15958xa100e79f = new java.lang.ref.WeakReference<>(c4073xbc40c54);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
        /* renamed from: invoke */
        public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
            mo33256x48671b37(this.f15958xa100e79f.get(), callbackArgs);
        }

        /* renamed from: onInvoke */
        public abstract void mo33256x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, T t17);

        public BaseCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, boolean z17) {
            super(z17);
            this.f15958xa100e79f = new java.lang.ref.WeakReference<>(c4073xbc40c54);
        }
    }
}

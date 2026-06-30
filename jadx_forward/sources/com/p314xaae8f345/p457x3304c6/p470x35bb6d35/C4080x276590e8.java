package com.p314xaae8f345.p457x3304c6.p470x35bb6d35;

/* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback */
/* loaded from: classes5.dex */
public class C4080x276590e8 {

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$CompleteCallback */
    /* loaded from: classes5.dex */
    public static class CompleteCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.CompleteArg> {

        /* renamed from: onComplete */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete f15995x815f5438;

        public CompleteCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
            super(c4079x793f83);
            this.f15995x815f5438 = onComplete;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.CompleteArg completeArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete = this.f15995x815f5438;
            if (onComplete == null || completeArg == null) {
                return;
            }
            onComplete.mo9331x815f5438(completeArg.f15999x5c4d208);
        }

        public CompleteCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete, boolean z17) {
            super(c4079x793f83, z17);
            this.f15995x815f5438 = onComplete;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$ExportClipBundleCallback */
    /* loaded from: classes5.dex */
    public static class ExportClipBundleCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.ExportClipBundleArg> {

        /* renamed from: onExportClipBundle */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnExportClipBundle f15996xa36e96c5;

        public ExportClipBundleCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnExportClipBundle onExportClipBundle) {
            super(c4079x793f83);
            this.f15996xa36e96c5 = onExportClipBundle;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.ExportClipBundleArg exportClipBundleArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnExportClipBundle onExportClipBundle = this.f15996xa36e96c5;
            if (onExportClipBundle == null || exportClipBundleArg == null) {
                return;
            }
            onExportClipBundle.m33480xa36e96c5(exportClipBundleArg.f16001x346425, exportClipBundleArg.f16000x5c4d208);
        }

        public ExportClipBundleCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, boolean z17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnExportClipBundle onExportClipBundle) {
            super(c4079x793f83, z17);
            this.f15996xa36e96c5 = onExportClipBundle;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$ExportClipBundleCallbackExt */
    /* loaded from: classes5.dex */
    public static class ExportClipBundleCallbackExt extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.ExportClipBundleArgV2> {

        /* renamed from: onExportClipBundle */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.SnapshotAndExportClipBundleCallback f15997xa36e96c5;

        public ExportClipBundleCallbackExt(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.SnapshotAndExportClipBundleCallback snapshotAndExportClipBundleCallback) {
            super(c4079x793f83);
            this.f15997xa36e96c5 = snapshotAndExportClipBundleCallback;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.ExportClipBundleArgV2 exportClipBundleArgV2) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.SnapshotAndExportClipBundleCallback snapshotAndExportClipBundleCallback = this.f15997xa36e96c5;
            if (snapshotAndExportClipBundleCallback == null || exportClipBundleArgV2 == null) {
                return;
            }
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = exportClipBundleArgV2.f16002x5c4d208;
            if (c4093x6b88526b != null) {
                snapshotAndExportClipBundleCallback.mo33486xaf8aa769(c4093x6b88526b);
            } else {
                snapshotAndExportClipBundleCallback.mo33487xe05b4124(exportClipBundleArgV2.f16003x3164ae);
            }
        }

        public ExportClipBundleCallbackExt(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, boolean z17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.SnapshotAndExportClipBundleCallback snapshotAndExportClipBundleCallback) {
            super(c4079x793f83, z17);
            this.f15997xa36e96c5 = snapshotAndExportClipBundleCallback;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$ExportCompleteCallback */
    /* loaded from: classes5.dex */
    public static class ExportCompleteCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.ExportCompleteArg> {

        /* renamed from: onExportComplete */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnExportComplete f15998xdd715ccc;

        public ExportCompleteCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnExportComplete onExportComplete) {
            super(c4079x793f83);
            this.f15998xdd715ccc = onExportComplete;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.ExportCompleteArg exportCompleteArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnExportComplete onExportComplete = this.f15998xdd715ccc;
            if (onExportComplete == null || exportCompleteArg == null) {
                return;
            }
            onExportComplete.mo9328xdd715ccc(exportCompleteArg.f16004x54d80fc5, exportCompleteArg.f16005x5c4d208);
        }

        public ExportCompleteCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnExportComplete onExportComplete, boolean z17) {
            super(c4079x793f83, z17);
            this.f15998xdd715ccc = onExportComplete;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MediaTimeChangeCallback */
    /* loaded from: classes5.dex */
    public static class MediaTimeChangeCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.MediaTimeChangeArg> {

        /* renamed from: onMediaTimeChange */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnMediaTimeChange f16024x51a35402;

        public MediaTimeChangeCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnMediaTimeChange onMediaTimeChange) {
            super(c4079x793f83);
            this.f16024x51a35402 = onMediaTimeChange;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.MediaTimeChangeArg mediaTimeChangeArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnMediaTimeChange onMediaTimeChange = this.f16024x51a35402;
            if (onMediaTimeChange == null || mediaTimeChangeArg == null) {
                return;
            }
            onMediaTimeChange.mo33483x51a35402(mediaTimeChangeArg.f16006xb58a07e4, mediaTimeChangeArg.f16007x6107feec, mediaTimeChangeArg.tag);
        }

        public MediaTimeChangeCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnMediaTimeChange onMediaTimeChange, boolean z17) {
            super(c4079x793f83, z17);
            this.f16024x51a35402 = onMediaTimeChange;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$OnDidTapSegmentCallback */
    /* loaded from: classes5.dex */
    public static class OnDidTapSegmentCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.OnDidTapSegmentArg> {

        /* renamed from: onDidTapSegment */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnDidTapSegment f16025x50d81c50;

        public OnDidTapSegmentCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnDidTapSegment onDidTapSegment) {
            super(c4079x793f83);
            this.f16025x50d81c50 = onDidTapSegment;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.OnDidTapSegmentArg onDidTapSegmentArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnDidTapSegment onDidTapSegment = this.f16025x50d81c50;
            if (onDidTapSegment == null || onDidTapSegmentArg == null) {
                return;
            }
            onDidTapSegment.mo33479x50d81c50(onDidTapSegmentArg.ID, onDidTapSegmentArg.f16008x5eaf2cc);
        }

        public OnDidTapSegmentCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, boolean z17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnDidTapSegment onDidTapSegment) {
            super(c4079x793f83, z17);
            this.f16025x50d81c50 = onDidTapSegment;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$OnHandleBoxSettingsChangeCallback */
    /* loaded from: classes5.dex */
    public static class OnHandleBoxSettingsChangeCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.OnHandleBoxSettingsDidChangeArg> {

        /* renamed from: onHandleBoxSettingsChanged */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxSettingsChanged f16026x4961a10d;

        public OnHandleBoxSettingsChangeCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxSettingsChanged onHandleBoxSettingsChanged) {
            super(c4079x793f83);
            this.f16026x4961a10d = onHandleBoxSettingsChanged;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.OnHandleBoxSettingsDidChangeArg onHandleBoxSettingsDidChangeArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxSettingsChanged onHandleBoxSettingsChanged = this.f16026x4961a10d;
            if (onHandleBoxSettingsChanged == null || onHandleBoxSettingsDidChangeArg == null) {
                return;
            }
            onHandleBoxSettingsChanged.mo33482x2f975c0e(onHandleBoxSettingsDidChangeArg.f16010xe4cdf3c6);
        }

        public OnHandleBoxSettingsChangeCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, boolean z17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxSettingsChanged onHandleBoxSettingsChanged) {
            super(c4079x793f83, z17);
            this.f16026x4961a10d = onHandleBoxSettingsChanged;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$OnHanldeBoxCompleteCallback */
    /* loaded from: classes5.dex */
    public static class OnHanldeBoxCompleteCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.OnHandleBoxCompleteArg> {

        /* renamed from: onHandleBoxComplete */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxComplete f16027xf9e434bd;

        public OnHanldeBoxCompleteCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxComplete onHandleBoxComplete) {
            super(c4079x793f83);
            this.f16027xf9e434bd = onHandleBoxComplete;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.OnHandleBoxCompleteArg onHandleBoxCompleteArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxComplete onHandleBoxComplete = this.f16027xf9e434bd;
            if (onHandleBoxComplete == null || onHandleBoxCompleteArg == null) {
                return;
            }
            onHandleBoxComplete.mo33481xf9e434bd(onHandleBoxCompleteArg.f16009x9ef9a78e);
        }

        public OnHanldeBoxCompleteCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, boolean z17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxComplete onHandleBoxComplete) {
            super(c4079x793f83, z17);
            this.f16027xf9e434bd = onHandleBoxComplete;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$OnWillShowHandleBoxCallback */
    /* loaded from: classes5.dex */
    public static class OnWillShowHandleBoxCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.OnWillShowHandleBoxArg> {

        /* renamed from: onWillShowHandleBox */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnWillShowHandleBox f16028xd1776935;

        public OnWillShowHandleBoxCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnWillShowHandleBox onWillShowHandleBox) {
            super(c4079x793f83);
            this.f16028xd1776935 = onWillShowHandleBox;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.OnWillShowHandleBoxArg onWillShowHandleBoxArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnWillShowHandleBox onWillShowHandleBox = this.f16028xd1776935;
            if (onWillShowHandleBox == null || onWillShowHandleBoxArg == null) {
                return;
            }
            onWillShowHandleBox.mo33485xd1776935(onWillShowHandleBoxArg.ID, onWillShowHandleBoxArg.f16011x2c929929, onWillShowHandleBoxArg.f16013x683094a, onWillShowHandleBoxArg.f16012xfd990f7e);
        }

        public OnWillShowHandleBoxCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, boolean z17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnWillShowHandleBox onWillShowHandleBox) {
            super(c4079x793f83, z17);
            this.f16028xd1776935 = onWillShowHandleBox;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$ProgressCallback */
    /* loaded from: classes5.dex */
    public static class ProgressCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.ProgressArg> {

        /* renamed from: onProgress */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnProgress f16029x696ee52c;

        public ProgressCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnProgress onProgress) {
            super(c4079x793f83);
            this.f16029x696ee52c = onProgress;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.ProgressArg progressArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnProgress onProgress = this.f16029x696ee52c;
            if (onProgress == null || progressArg == null) {
                return;
            }
            onProgress.m33484x696ee52c(progressArg.f16014xc454c22d);
        }

        public ProgressCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnProgress onProgress, boolean z17) {
            super(c4079x793f83, z17);
            this.f16029x696ee52c = onProgress;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$RecommendCompleteCallback */
    /* loaded from: classes5.dex */
    public static class RecommendCompleteCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.RecommendCompleteArg> {

        /* renamed from: onRecommendComplete */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnRecommendComplete f16030x7c9af5f6;

        public RecommendCompleteCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnRecommendComplete onRecommendComplete) {
            super(c4079x793f83);
            this.f16030x7c9af5f6 = onRecommendComplete;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.RecommendCompleteArg recommendCompleteArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnRecommendComplete onRecommendComplete = this.f16030x7c9af5f6;
            if (onRecommendComplete == null || recommendCompleteArg == null) {
                return;
            }
            onRecommendComplete.mo9346x7c9af5f6(recommendCompleteArg.f16016xc84dc81d, recommendCompleteArg.f16015x5c4d208);
        }

        public RecommendCompleteCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnRecommendComplete onRecommendComplete, boolean z17) {
            super(c4079x793f83, z17);
            this.f16030x7c9af5f6 = onRecommendComplete;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$RecommendMusicCompleteCallback */
    /* loaded from: classes5.dex */
    public static class RecommendMusicCompleteCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.RecommendMusicCompleteArg> {

        /* renamed from: onRecommendComplete */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnMusicRecommendComplete f16031x7c9af5f6;

        public RecommendMusicCompleteCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnMusicRecommendComplete onMusicRecommendComplete) {
            super(c4079x793f83);
            this.f16031x7c9af5f6 = onMusicRecommendComplete;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.RecommendMusicCompleteArg recommendMusicCompleteArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnMusicRecommendComplete onMusicRecommendComplete = this.f16031x7c9af5f6;
            if (onMusicRecommendComplete == null || recommendMusicCompleteArg == null) {
                return;
            }
            onMusicRecommendComplete.mo9372x7c9af5f6(recommendMusicCompleteArg.f16018xc84dc81d, recommendMusicCompleteArg.f16017x5c4d208);
        }

        public RecommendMusicCompleteCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnMusicRecommendComplete onMusicRecommendComplete, boolean z17) {
            super(c4079x793f83, z17);
            this.f16031x7c9af5f6 = onMusicRecommendComplete;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$TaskProgressCallback */
    /* loaded from: classes5.dex */
    public static class TaskProgressCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.TaskProgressArg> {

        /* renamed from: onTaskProgress */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress f16032xda309251;

        public TaskProgressCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress) {
            super(c4079x793f83);
            this.f16032xda309251 = onTaskProgress;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.TaskProgressArg taskProgressArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3 c4090xe7a30da3;
            if (this.f16032xda309251 == null || taskProgressArg == null) {
                return;
            }
            java.nio.ByteBuffer byteBuffer = taskProgressArg.f16020x116e8b7c;
            if (byteBuffer != null) {
                try {
                    c4090xe7a30da3 = new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3(taskProgressArg.f16021x3492916, byteBuffer);
                } catch (java.lang.Exception e17) {
                    io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208("MJMovieSessionCallback", e17.getMessage());
                }
                this.f16032xda309251.mo9321xda309251(taskProgressArg.f16019xc454c22d, c4090xe7a30da3);
            }
            c4090xe7a30da3 = null;
            this.f16032xda309251.mo9321xda309251(taskProgressArg.f16019xc454c22d, c4090xe7a30da3);
        }

        public TaskProgressCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, boolean z17) {
            super(c4079x793f83, z17);
            this.f16032xda309251 = onTaskProgress;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$TemplateBuildCompleteCallback */
    /* loaded from: classes5.dex */
    public static class TemplateBuildCompleteCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.TemplateBuildCompleteArg> {

        /* renamed from: onComplete */
        private final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTemplateBuildComplete f16033x815f5438;

        public TemplateBuildCompleteCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTemplateBuildComplete onTemplateBuildComplete) {
            super(c4079x793f83);
            this.f16033x815f5438 = onTemplateBuildComplete;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg.TemplateBuildCompleteArg templateBuildCompleteArg) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTemplateBuildComplete onTemplateBuildComplete = this.f16033x815f5438;
            if (onTemplateBuildComplete == null || templateBuildCompleteArg == null) {
                return;
            }
            onTemplateBuildComplete.mo9364x50d7face(templateBuildCompleteArg.f16023xc84dc81d, templateBuildCompleteArg.f16022x5c4d208);
        }

        public TemplateBuildCompleteCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTemplateBuildComplete onTemplateBuildComplete, boolean z17) {
            super(c4079x793f83, z17);
            this.f16033x815f5438 = onTemplateBuildComplete;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$BaseCallback */
    /* loaded from: classes5.dex */
    public static abstract class BaseCallback<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

        /* renamed from: mjMovieSessionRef */
        private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83> f15994x653eaa10;

        public BaseCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83) {
            this.f15994x653eaa10 = new java.lang.ref.WeakReference<>(c4079x793f83);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
        /* renamed from: invoke */
        public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
            mo33488x48671b37(this.f15994x653eaa10.get(), callbackArgs);
        }

        /* renamed from: onInvoke */
        public abstract void mo33488x48671b37(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, T t17);

        public BaseCallback(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83, boolean z17) {
            super(z17);
            this.f15994x653eaa10 = new java.lang.ref.WeakReference<>(c4079x793f83);
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg */
    /* loaded from: classes5.dex */
    public static class MJMoveSessionCallbackArg extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs {

        /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg$CompleteArg */
        /* loaded from: classes5.dex */
        public static class CompleteArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg {

            /* renamed from: error */
            public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f15999x5c4d208;

            public CompleteArg(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
                this.f15999x5c4d208 = c4093x6b88526b;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg$ExportClipBundleArg */
        /* loaded from: classes5.dex */
        public static class ExportClipBundleArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg {

            /* renamed from: error */
            public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f16000x5c4d208;

            /* renamed from: path */
            public final java.lang.String f16001x346425;

            public ExportClipBundleArg(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
                this.f16001x346425 = str;
                this.f16000x5c4d208 = c4093x6b88526b;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg$ExportClipBundleArgV2 */
        /* loaded from: classes5.dex */
        public static class ExportClipBundleArgV2 extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg {

            /* renamed from: error */
            public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f16002x5c4d208;

            /* renamed from: info */
            public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.ClipBundleInfo f16003x3164ae;

            public ExportClipBundleArgV2(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.ClipBundleInfo clipBundleInfo, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
                this.f16003x3164ae = clipBundleInfo;
                this.f16002x5c4d208 = c4093x6b88526b;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg$ExportCompleteArg */
        /* loaded from: classes5.dex */
        public static class ExportCompleteArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg {

            /* renamed from: coverImageFilePath */
            public final java.lang.String f16004x54d80fc5;

            /* renamed from: error */
            public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f16005x5c4d208;

            public ExportCompleteArg(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
                this.f16005x5c4d208 = c4093x6b88526b;
                this.f16004x54d80fc5 = str;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg$MediaTimeChangeArg */
        /* loaded from: classes5.dex */
        public static class MediaTimeChangeArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg {

            /* renamed from: lastFrameTime */
            public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f16006xb58a07e4;

            /* renamed from: mediaTimeRange */
            public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f16007x6107feec;
            public long tag;

            public MediaTimeChangeArg(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, long j17) {
                this.f16006xb58a07e4 = c4128x879fba0a;
                this.f16007x6107feec = c4129xdee64553;
                this.tag = j17;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg$OnHandleBoxCompleteArg */
        /* loaded from: classes5.dex */
        public static class OnHandleBoxCompleteArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg {

            /* renamed from: segmentID */
            public final java.lang.String f16009x9ef9a78e;

            public OnHandleBoxCompleteArg(java.lang.String str) {
                this.f16009x9ef9a78e = str;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg$OnHandleBoxSettingsDidChangeArg */
        /* loaded from: classes5.dex */
        public static class OnHandleBoxSettingsDidChangeArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg {

            /* renamed from: handleBoxSettings */
            public final com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4052x7dfcf7a9 f16010xe4cdf3c6;

            public OnHandleBoxSettingsDidChangeArg(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4052x7dfcf7a9 c4052x7dfcf7a9) {
                this.f16010xe4cdf3c6 = c4052x7dfcf7a9;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg$OnWillShowHandleBoxArg */
        /* loaded from: classes5.dex */
        public static class OnWillShowHandleBoxArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg {
            public final java.lang.String ID;

            /* renamed from: position */
            public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e f16011x2c929929;

            /* renamed from: rotation */
            public float f16012xfd990f7e;

            /* renamed from: scale */
            public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e f16013x683094a;

            public OnWillShowHandleBoxArg(java.lang.String str, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e2, float f17) {
                this.ID = str;
                this.f16011x2c929929 = c3974x289f3e;
                this.f16013x683094a = c3974x289f3e2;
                this.f16012xfd990f7e = f17;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg$ProgressArg */
        /* loaded from: classes5.dex */
        public static class ProgressArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg {

            /* renamed from: progress */
            public final float f16014xc454c22d;

            public ProgressArg(float f17) {
                this.f16014xc454c22d = f17;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg$RecommendCompleteArg */
        /* loaded from: classes5.dex */
        public static class RecommendCompleteArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg {

            /* renamed from: error */
            public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f16015x5c4d208;

            /* renamed from: result */
            public final com.p314xaae8f345.p457x3304c6.p477x633fb29.C4123xc221bdc2 f16016xc84dc81d;

            public RecommendCompleteArg(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4123xc221bdc2 c4123xc221bdc2, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
                this.f16015x5c4d208 = c4093x6b88526b;
                this.f16016xc84dc81d = c4123xc221bdc2;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg$RecommendMusicCompleteArg */
        /* loaded from: classes5.dex */
        public static class RecommendMusicCompleteArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg {

            /* renamed from: error */
            public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f16017x5c4d208;

            /* renamed from: result */
            public final com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356[] f16018xc84dc81d;

            public RecommendMusicCompleteArg(java.lang.Object[] objArr, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
                this.f16017x5c4d208 = c4093x6b88526b;
                this.f16018xc84dc81d = objArr != null ? (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356[]) java.util.Arrays.copyOf(objArr, objArr.length, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356[].class) : null;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg$TaskProgressArg */
        /* loaded from: classes5.dex */
        public static class TaskProgressArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg {

            /* renamed from: progress */
            public final float f16019xc454c22d;

            /* renamed from: taskTracePBData */
            public final java.nio.ByteBuffer f16020x116e8b7c;

            /* renamed from: timestamp */
            public final double f16021x3492916;

            public TaskProgressArg(float f17, double d17, java.nio.ByteBuffer byteBuffer) {
                this.f16019xc454c22d = f17;
                this.f16021x3492916 = d17;
                this.f16020x116e8b7c = byteBuffer;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg$TemplateBuildCompleteArg */
        /* loaded from: classes5.dex */
        public static class TemplateBuildCompleteArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg {

            /* renamed from: error */
            public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f16022x5c4d208;

            /* renamed from: result */
            public final com.p314xaae8f345.p457x3304c6.p477x633fb29.C4119x51ad3274 f16023xc84dc81d;

            public TemplateBuildCompleteArg(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4119x51ad3274 c4119x51ad3274, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
                this.f16022x5c4d208 = c4093x6b88526b;
                this.f16023xc84dc81d = c4119x51ad3274;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMovieSessionCallback$MJMoveSessionCallbackArg$OnDidTapSegmentArg */
        /* loaded from: classes5.dex */
        public static class OnDidTapSegmentArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MJMoveSessionCallbackArg {
            public java.lang.String ID;

            /* renamed from: hints */
            public long f16008x5eaf2cc;

            public OnDidTapSegmentArg() {
                this.ID = null;
                this.f16008x5eaf2cc = 0L;
            }

            public OnDidTapSegmentArg(java.lang.String str, long j17) {
                this.ID = str;
                this.f16008x5eaf2cc = j17;
            }
        }
    }
}

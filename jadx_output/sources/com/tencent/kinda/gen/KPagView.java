package com.tencent.kinda.gen;

/* loaded from: classes13.dex */
public interface KPagView extends com.tencent.kinda.gen.KView {
    java.lang.String getPlayingPagPath();

    boolean isPlaying();

    void setAnimationEndCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback);

    void setPagPath(java.lang.String str);

    void setPagUrl(java.lang.String str);

    void setProgress(int i17);

    void setRepeatCount(int i17);

    void setScaleMode(com.tencent.kinda.gen.PagScaleMode pagScaleMode);

    void startPlay();

    void stopPlay();
}

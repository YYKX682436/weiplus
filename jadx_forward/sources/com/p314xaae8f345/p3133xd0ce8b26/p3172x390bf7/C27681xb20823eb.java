package com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7;

/* renamed from: com.tencent.wechat.zidl.MagicSclRequestCaller */
/* loaded from: classes7.dex */
public class C27681xb20823eb {

    /* renamed from: com.tencent.wechat.zidl.MagicSclRequestCaller$PreInitFrameSetCallback */
    /* loaded from: classes7.dex */
    public interface PreInitFrameSetCallback {
        /* renamed from: complete */
        void m119395xdc453139(long j17, double d17);
    }

    /* renamed from: jniAttachFrameSet */
    private native void m119363xd7d9681f(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: jniChangeFrameSetData */
    private native void m119364x4e270154(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: jniClickFrameSet */
    private native void m119365x767e11b8(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: jniCreateFrameSet */
    private native java.lang.String m119366xc73973d6(java.lang.String str, java.lang.String str2, int i17);

    /* renamed from: jniCreateFrameSetRoot */
    private native java.lang.String m119367xe3368dd8(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: jniDeatchFrameSet */
    private native void m119368xfe8f61b3(java.lang.String str, java.lang.String str2);

    /* renamed from: jniDestroyFrameSet */
    private native void m119369x1e32af6a(java.lang.String str, java.lang.String str2);

    /* renamed from: jniDestroyFrameSetRoot */
    private native void m119370x5d3fdf6c(java.lang.String str);

    /* renamed from: jniGetFrameSetCoverPath */
    private native java.lang.String m119371xd327fed6(java.lang.String str, java.lang.String str2);

    /* renamed from: jniPauseFrameSetRoot */
    private native void m119372x25c49628(java.lang.String str);

    /* renamed from: jniPreInitFrameSetAsync */
    private native void m119373x3fc7eb79(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Object obj);

    /* renamed from: jniRedrawFrameSet */
    private native void m119374xd6b91d1(java.lang.String str, java.lang.String str2);

    /* renamed from: jniRedrawFrameSetRoot */
    private native void m119375x66e33653(java.lang.String str);

    /* renamed from: jniResizeFrameSet */
    private native void m119376xb326378e(java.lang.String str, java.lang.String str2, double d17, double d18);

    /* renamed from: jniResumeFrameSetRoot */
    private native void m119377x7d307389(java.lang.String str);

    /* renamed from: jniScrollFrameSet */
    private native void m119378xdf8358a7(java.lang.String str, java.lang.String str2, double d17, double d18);

    /* renamed from: attachFrameSet */
    public void m119379xe590c51a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        m119363xd7d9681f(str, str2, str3);
    }

    /* renamed from: changeFrameSetData */
    public void m119380xc6a168cf(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        m119364x4e270154(str, str2, str3);
    }

    /* renamed from: clickFrameSet */
    public void m119381xa039a95d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        m119365x767e11b8(str, str2, str3);
    }

    /* renamed from: createFrameSet */
    public java.lang.String m119382xd4f0d0d1(java.lang.String str, java.lang.String str2, int i17) {
        return m119366xc73973d6(str, str2, i17);
    }

    /* renamed from: createFrameSetRoot */
    public java.lang.String m119383x5bb0f553(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return m119367xe3368dd8(str, str2, str3);
    }

    /* renamed from: deatchFrameSet */
    public void m119384xc46beae(java.lang.String str, java.lang.String str2) {
        m119368xfe8f61b3(str, str2);
    }

    /* renamed from: destroyFrameSet */
    public void m119385xc766f1cf(java.lang.String str, java.lang.String str2) {
        m119369x1e32af6a(str, str2);
    }

    /* renamed from: destroyFrameSetRoot */
    public void m119386xf4126751(java.lang.String str) {
        m119370x5d3fdf6c(str);
    }

    /* renamed from: getFrameSetCoverPath */
    public java.lang.String m119387x16a67391(java.lang.String str, java.lang.String str2) {
        return m119371xd327fed6(str, str2);
    }

    /* renamed from: pauseFrameSetRoot */
    public void m119388x52f1d34d(java.lang.String str) {
        m119372x25c49628(str);
    }

    /* renamed from: preInitFrameSetAsync */
    public void m119389x83466034(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27681xb20823eb.PreInitFrameSetCallback preInitFrameSetCallback) {
        m119373x3fc7eb79(j17, str, str2, str3, str4, preInitFrameSetCallback);
    }

    /* renamed from: redrawFrameSet */
    public void m119390x1b22eecc(java.lang.String str, java.lang.String str2) {
        m119374xd6b91d1(str, str2);
    }

    /* renamed from: redrawFrameSetRoot */
    public void m119391xdf5d9dce(java.lang.String str) {
        m119375x66e33653(str);
    }

    /* renamed from: resizeFrameSet */
    public void m119392xc0dd9489(java.lang.String str, java.lang.String str2, double d17, double d18) {
        m119376xb326378e(str, str2, d17, d18);
    }

    /* renamed from: resumeFrameSetRoot */
    public void m119393xf5aadb04(java.lang.String str) {
        m119377x7d307389(str);
    }

    /* renamed from: scrollFrameSet */
    public void m119394xed3ab5a2(java.lang.String str, java.lang.String str2, double d17, double d18) {
        m119378xdf8358a7(str, str2, d17, d18);
    }
}

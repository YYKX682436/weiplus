package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* renamed from: com.tencent.maas.moviecomposing.ComposingSession */
/* loaded from: classes5.dex */
public class C4138x497e15e7 {

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f16115x39e86013;

    /* renamed from: project */
    private com.p314xaae8f345.p457x3304c6.p479x4179489f.C4155x50c8e2f9 f16116xed904b19;

    /* renamed from: timeline */
    private final com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 f16117x8438d441;

    private C4138x497e15e7(com.p166x1da19ac6.jni.C1545xd48843e6 c1545xd48843e6, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4155x50c8e2f9 c4155x50c8e2f9, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861) {
        this.f16115x39e86013 = c1545xd48843e6;
        this.f16116xed904b19 = c4155x50c8e2f9;
        this.f16117x8438d441 = c4167x88133861;
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m34038xfce9a72c(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4155x50c8e2f9 c4155x50c8e2f9, boolean z17);

    /* renamed from: nativeCanRedo */
    private native boolean m34039xe7bb35d7();

    /* renamed from: nativeCanUndo */
    private native boolean m34040xe7bcb4bd();

    /* renamed from: nativeCreateTimeline */
    private native com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 m34041x8929c554(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2);

    /* renamed from: nativeGetCurrentComposingStepIndex */
    private native int m34042x8a63ceb1();

    /* renamed from: nativeGetMaxComposingStepIndex */
    private native int m34043xb57c5a5c();

    /* renamed from: nativeIsClipSegmentMutated */
    private native boolean m34044xec674c1c(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, java.lang.String str, java.lang.String str2);

    /* renamed from: nativeRedo */
    private native com.p314xaae8f345.p457x3304c6.p479x4179489f.C4169xe31f3fd3 m34045xb9053ab5();

    /* renamed from: nativeTakeSnapshot */
    private native void m34046xed893122(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4169xe31f3fd3 c4169xe31f3fd3);

    /* renamed from: nativeUndo */
    private native com.p314xaae8f345.p457x3304c6.p479x4179489f.C4169xe31f3fd3 m34047xb906b99b();

    /* renamed from: nativeUpdateProject */
    private native void m34048x37f1e339();

    public boolean a() {
        return m34039xe7bb35d7();
    }

    public boolean b() {
        return m34040xe7bcb4bd();
    }

    public int c() {
        return m34042x8a63ceb1();
    }

    public int d() {
        return m34043xb57c5a5c();
    }

    public com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 e() {
        return this.f16117x8438d441;
    }

    public boolean f(java.lang.String str, java.lang.String str2) {
        return m34044xec674c1c(this.f16117x8438d441, str, str2);
    }

    public com.p314xaae8f345.p457x3304c6.p479x4179489f.C4169xe31f3fd3 g() {
        return m34045xb9053ab5();
    }

    public void h(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4169xe31f3fd3 c4169xe31f3fd3) {
        m34046xed893122(c4169xe31f3fd3);
    }

    public com.p314xaae8f345.p457x3304c6.p479x4179489f.C4169xe31f3fd3 i() {
        return m34047xb906b99b();
    }

    public C4138x497e15e7(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4155x50c8e2f9 c4155x50c8e2f9, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2, boolean z17) {
        this.f16115x39e86013 = m34038xfce9a72c(c4155x50c8e2f9, z17);
        this.f16116xed904b19 = c4155x50c8e2f9;
        this.f16117x8438d441 = m34041x8929c554(c4128x879fba0a, c4128x879fba0a2);
    }
}

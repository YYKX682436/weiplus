package com.p314xaae8f345.p3178x498cab9f.p3190x7001668e.jni;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0086 J\u0019\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0086 J\u0006\u0010\u0011\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tencent/wemagic/playable/jni/WePlayableJNI;", "", "<init>", "()V", "TAG", "", "initApi", "", "context", "Landroid/content/Context;", "cachePath", "playableCoverPackagePath", "playableBasicPackagePath", "kvReportForApp", "logId", "", "params", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "playable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.tencent.wemagic.playable.jni.WePlayableJNI */
/* loaded from: classes.dex */
public final class C27744xae05a269 {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.p3178x498cab9f.p3190x7001668e.jni.C27744xae05a269 f60649x4fbc8495 = new com.p314xaae8f345.p3178x498cab9f.p3190x7001668e.jni.C27744xae05a269();
    private static final java.lang.String TAG = "WePlayableJNI";

    static {
        uw5.a.f513297a.a("weplayable");
    }

    private C27744xae05a269() {
    }

    /* renamed from: init */
    public final void m119873x316510() {
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        boolean z17 = copyOf.length == 0;
        java.lang.String str = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82;
        if (!z17) {
            str = java.lang.String.format(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
    }

    /* renamed from: initApi */
    public final native void m119874x7420c2ea(android.content.Context context, java.lang.String cachePath, java.lang.String playableCoverPackagePath, java.lang.String playableBasicPackagePath);

    /* renamed from: kvReportForApp */
    public final native void m119875x6f6477f7(int logId, java.lang.String params);
}

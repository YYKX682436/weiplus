package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.WaveAudioHAid */
/* loaded from: classes5.dex */
public class C17488x7dde8191 {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("voipCodec");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/WaveAudioHAid", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/setting/ui/setting/WaveAudioHAid", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: CreateInst */
    public static native long m68988xc8697982();

    /* renamed from: DestroyInst */
    public static native void m68989xed3b9540(long j17);

    /* renamed from: EstAmbSoundLevel */
    public static native int m68990xb92b7245(long j17, byte[] bArr, int i17, int i18, int i19);

    /* renamed from: Init */
    public static native int m68991x22d930(long j17, int i17, int i18, int i19, int i27, int i28);

    /* renamed from: IsAmbSoundTooNoisy */
    public static native boolean m68992xaa35ffbd(long j17, float f17);

    /* renamed from: Process */
    public static native int m68993x50c5b64f(long j17, byte[] bArr, byte[] bArr2, int i17);
}

package com.tencent.mm.live.core.core.trtc.sdkadapter.feature;

/* loaded from: classes.dex */
public class Vcodec2Decoder {
    static {
        lg0.q.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("voipCodec");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/live/core/core/trtc/sdkadapter/feature/Vcodec2Decoder", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/live/core/core/trtc/sdkadapter/feature/Vcodec2Decoder", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static long a() {
        return getVideoDecodeFactoryInterfacePointer();
    }

    private static final native long getVideoDecodeFactoryInterfacePointer();
}

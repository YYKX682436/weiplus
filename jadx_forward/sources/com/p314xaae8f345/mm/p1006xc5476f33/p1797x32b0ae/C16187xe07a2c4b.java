package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001JH\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/lite/LiteAppLibPack;", "", "", "vmpbuffer", "", "vmpsize", "bufferinput", "bufferoutput", "buffersize", "iv", "Ljz5/x;", "deviceid", "Ljz5/f0;", "randomBuffer", "([BI[B[BI[BJ)V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.lite.LiteAppLibPack */
/* loaded from: classes.dex */
public final class C16187xe07a2c4b {
    static {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("KJVM");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/LiteAppLibPack", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/plugin/lite/LiteAppLibPack", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("libpack", e17, "loadLibrary failed:%s", e17.getMessage());
        }
    }

    /* renamed from: randomBuffer */
    public final native void m65639xc1f786e3(byte[] vmpbuffer, int vmpsize, byte[] bufferinput, byte[] bufferoutput, int buffersize, byte[] iv6, long deviceid);
}

package com.tencent.mm.opensdk.channel.a;

/* loaded from: classes7.dex */
public final class b {
    public static byte[] a(java.lang.String str, int i17, java.lang.String str2) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i17);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        return com.tencent.mm.opensdk.utils.b.c(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    }
}

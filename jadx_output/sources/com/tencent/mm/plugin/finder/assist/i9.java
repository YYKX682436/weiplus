package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public abstract class i9 {
    public static final r45.m70 a(r45.zc5 zc5Var) {
        kotlin.jvm.internal.o.g(zc5Var, "<this>");
        if (zc5Var.getInteger(10) == 1) {
            try {
                r45.m70 m70Var = new r45.m70();
                com.tencent.mm.protobuf.g byteString = zc5Var.getByteString(11);
                m70Var.parseFrom(byteString != null ? byteString.g() : null);
                return m70Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("ProductFuncObject", "getFirstCouponInfoInJumpInfo " + e17);
            }
        }
        return null;
    }
}

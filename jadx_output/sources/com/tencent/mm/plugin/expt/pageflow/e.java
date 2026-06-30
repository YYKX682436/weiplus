package com.tencent.mm.plugin.expt.pageflow;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.expt.pageflow.e f99807b;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f99808a = null;

    public static com.tencent.mm.plugin.expt.pageflow.e a() {
        if (f99807b == null) {
            f99807b = new com.tencent.mm.plugin.expt.pageflow.e();
        }
        return f99807b;
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        int i17 = gm0.m.i();
        if (i17 == 0) {
            return null;
        }
        java.lang.String str = i17 + "_WxPageFlow";
        if (!com.tencent.mm.sdk.platformtools.t8.D0(this.f99808a, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPageFlowMMKV", "get mmkv change uin old[%s] new[%s]", this.f99808a, str);
            this.f99808a = str;
        }
        return com.tencent.mm.sdk.platformtools.o4.M(this.f99808a);
    }
}

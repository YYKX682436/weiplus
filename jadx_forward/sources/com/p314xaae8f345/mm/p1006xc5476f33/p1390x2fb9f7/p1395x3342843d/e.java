package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.e f181340b;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f181341a = null;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.e a() {
        if (f181340b == null) {
            f181340b = new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.e();
        }
        return f181340b;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        int i17 = gm0.m.i();
        if (i17 == 0) {
            return null;
        }
        java.lang.String str = i17 + "_WxPageFlow";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f181341a, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPageFlowMMKV", "get mmkv change uin old[%s] new[%s]", this.f181341a, str);
            this.f181341a = str;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(this.f181341a);
    }
}

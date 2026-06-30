package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes8.dex */
public class r3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f276801a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f276802b;

    public r3(int i17, java.lang.String str) {
        this.f276801a = i17;
        this.f276802b = str;
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.r3 a(java.lang.Object obj) {
        int i17;
        if (obj != null && obj != com.p314xaae8f345.mm.p2621x8fb0427b.n3.f276675p) {
            if (obj instanceof java.lang.Integer) {
                i17 = 1;
            } else if (obj instanceof java.lang.Long) {
                i17 = 2;
            } else if (obj instanceof java.lang.String) {
                i17 = 3;
            } else if (obj instanceof java.lang.Boolean) {
                i17 = 4;
            } else if (obj instanceof java.lang.Float) {
                i17 = 5;
            } else if (obj instanceof java.lang.Double) {
                i17 = 6;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfigStorage", "unresolve failed, unknown type=" + obj.getClass());
            }
            return new com.p314xaae8f345.mm.p2621x8fb0427b.r3(i17, obj.toString());
        }
        return null;
    }

    /* renamed from: equals */
    public boolean m78103xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.r3)) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.r3 r3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.r3) obj;
        if (this.f276801a != r3Var.f276801a) {
            return false;
        }
        java.lang.String str = r3Var.f276802b;
        java.lang.String str2 = this.f276802b;
        return str2 == null ? str == null : str2.equals(str);
    }
}

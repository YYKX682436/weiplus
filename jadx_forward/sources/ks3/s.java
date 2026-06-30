package ks3;

/* loaded from: classes7.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f393279a;

    /* renamed from: b, reason: collision with root package name */
    public final int f393280b;

    public s(java.lang.String str, int i17) {
        this.f393279a = null;
        this.f393280b = 100;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Msg.Plugin.HttpRequestCache", "HttpRequestCache constructor, path = " + str + ", maxCount = " + i17);
        this.f393279a = str;
        com.p314xaae8f345.mm.vfs.w6.u(str);
        this.f393280b = i17 <= 0 ? 100 : i17;
    }

    public void a() {
        java.lang.String str = this.f393279a;
        java.lang.String[] D = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)).D();
        int i17 = 0;
        if ((D != null ? D.length : 0) < this.f393280b) {
            return;
        }
        java.lang.String[] D2 = new com.p314xaae8f345.mm.vfs.r6(str).D();
        int length = D2.length;
        com.p314xaae8f345.mm.vfs.r6 r6Var = null;
        long j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        while (i17 < length) {
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(D2[i17]);
            long B = r6Var2.B();
            if (B < j17) {
                j17 = B;
            }
            i17++;
            r6Var = r6Var2;
        }
        if (r6Var.m()) {
            r6Var.l();
        }
    }

    public final java.lang.String b(java.lang.String str, java.util.Map map) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(str);
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                java.lang.String str3 = (java.lang.String) entry.getValue();
                stringBuffer.append(str2);
                stringBuffer.append(str3);
            }
        }
        return kk.k.g(stringBuffer.toString().getBytes());
    }
}

package hn1;

/* loaded from: classes.dex */
public class c implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        if (strArr.length <= 1) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCommand", "processCommand: %s", android.text.TextUtils.join(" ", strArr));
        if (strArr[1].equals("pull")) {
            if (strArr.length <= 2) {
                return false;
            }
            java.lang.String str2 = strArr[2];
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(str2).d1();
            java.lang.String str3 = lp0.b.D() + "/tencent/MicroMsg/avatar/";
            com.p314xaae8f345.mm.vfs.w6.u(str3);
            java.lang.String i17 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(d17, false, false);
            com.p314xaae8f345.mm.vfs.w6.c(i17, str3 + str2 + "-s." + com.p314xaae8f345.mm.vfs.w6.n(i17));
            java.lang.String i18 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(d17, true, false);
            com.p314xaae8f345.mm.vfs.w6.c(i18, str3 + str2 + "-b." + com.p314xaae8f345.mm.vfs.w6.n(i18));
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pull to ");
            sb6.append(str3);
            dp.a.m125854x26a183b(context2, sb6.toString(), 0).show();
            return true;
        }
        if (strArr[1].equals("dump")) {
            if (strArr.length <= 2) {
                return false;
            }
            com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(strArr[2]).d1());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCommand", "dump: %s, %s, %s, %s", n07.c(), n07.d(), java.lang.Integer.valueOf(n07.f152064c), java.lang.Integer.valueOf(n07.f152063b));
            return true;
        }
        if (strArr[1].equals("clean")) {
            if (strArr.length <= 2) {
                return false;
            }
            java.lang.String d18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(strArr[2]).d1();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(d18, false);
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(d18, true);
            return true;
        }
        if (strArr[1].equals("cleanAll")) {
            com.p314xaae8f345.mm.vfs.w6.f("wcf://avatar/");
            return true;
        }
        if (!strArr[1].equals("decrypt") || strArr.length <= 2) {
            return false;
        }
        java.lang.String str4 = strArr[2];
        byte[] m46293xb5d01926 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46293xb5d01926(com.p314xaae8f345.mm.vfs.w6.N(str4, 0, -1));
        if (m46293xb5d01926 == null) {
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "error", 0).show();
        } else {
            com.p314xaae8f345.mm.vfs.w6.S(str4 + ".d", m46293xb5d01926, 0, m46293xb5d01926.length);
        }
        return true;
    }
}

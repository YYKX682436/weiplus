package s01;

/* loaded from: classes11.dex */
public class h extends dm.y0 {
    public static final l75.e0 S = dm.y0.m125699x3593deb(s01.h.class);
    public final java.util.Map Q = new java.util.HashMap();
    public java.util.List R;

    @Override // dm.y0, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return S;
    }

    public boolean t0(int i17) {
        return (i17 & this.f69167x6e664fd4) != 0;
    }

    public s01.a0 u0(java.lang.String str) {
        java.util.HashMap hashMap = (java.util.HashMap) this.Q;
        if (!hashMap.containsKey(str) || hashMap.get(str) == null) {
            java.lang.System.currentTimeMillis();
            ((c01.d0) ((qk.m6) i95.n0.c(qk.m6.class))).getClass();
            s01.a0 y07 = r01.q3.Vi().y0(str);
            if (y07 != null) {
                hashMap.put(y07.f65840x13fe5d2b, y07);
            }
            java.lang.System.currentTimeMillis();
        }
        if (hashMap.containsKey(str)) {
            return (s01.a0) hashMap.get(str);
        }
        return null;
    }

    public java.lang.String v0(java.lang.String str) {
        s01.a0 u07 = u0(str);
        if (u07 == null) {
            return "";
        }
        java.lang.String str2 = u07.f65841xdde069b;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str2 == null ? "" : str2;
    }

    public java.util.List w0() {
        java.util.List list = this.R;
        if (list != null) {
            return list;
        }
        java.lang.String str = this.f69180xddd3cae;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return new java.util.LinkedList();
        }
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(";"));
        this.R = P1;
        return P1;
    }

    public boolean y0() {
        java.lang.String str = this.f69169xf75e5c37;
        if (str == null) {
            return false;
        }
        return str.endsWith("@qy_g");
    }

    public boolean z0() {
        if (this.f69177x18bd0ff) {
            return true;
        }
        if (y0() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f69180xddd3cae)) {
            return true;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f69172x4ca3dfb1) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f69171x736d1fa8);
    }
}

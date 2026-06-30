package k81;

@j95.b
/* loaded from: classes7.dex */
public final class a extends i95.w implements j81.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f386396d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f386397e = new java.util.HashSet();

    public a() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = lp0.b.D() + "appbrand/appBrandXnetModelCache/";
        }
        com.p314xaae8f345.mm.vfs.r6 j17 = com.p314xaae8f345.mm.vfs.r6.j(new java.io.File(str));
        if (j17 == null) {
            this.f386396d = "";
            return;
        }
        java.lang.String o17 = j17.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        this.f386396d = o17;
        if (r26.i0.o(o17, "/", false, 2, null)) {
            return;
        }
        this.f386396d = o17 + '/';
    }

    public java.lang.String Ai(java.lang.String appid) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        int Z3 = ((v81.e) i95.n0.c(v81.e.class)).Z3(appid);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f386396d);
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(new kk.v(Z3) + '#' + appid));
        java.lang.String sb7 = sb6.toString();
        java.util.HashSet hashSet = this.f386397e;
        if (!hashSet.contains(appid)) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(sb7);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, null);
            if ((!m18.a() || (m17 = m18.f294799a.m(m18.f294800b)) == null || m17.f294769f) ? false : true) {
                com.p314xaae8f345.mm.vfs.w6.h(sb7);
            }
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(sb7);
            java.lang.String str2 = a18.f294812f;
            if (str2 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l18)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m19 = b3Var.m(a18, null);
            if (!(m19.a() ? m19.f294799a.F(m19.f294800b) : false)) {
                com.p314xaae8f345.mm.vfs.w6.u(sb7);
            }
            hashSet.add(sb7);
        }
        return sb7;
    }

    public long Bi(java.lang.String appid) {
        java.lang.Long l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(Ai(appid), true);
        if (s17 != null) {
            java.util.Iterator it = s17.iterator();
            long j17 = 0;
            while (it.hasNext()) {
                j17 += ((com.p314xaae8f345.mm.vfs.x1) it.next()).f294767d;
            }
            l17 = java.lang.Long.valueOf(j17);
        } else {
            l17 = null;
        }
        if (l17 != null) {
            return l17.longValue();
        }
        return 0L;
    }

    public void wi(java.lang.String appid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        this.f386397e.remove(appid);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandXNetModelCache", "[clear] result" + com.p314xaae8f345.mm.vfs.w6.g(Ai(appid), true) + " appid:" + appid);
    }
}

package rq0;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f480253b = kz5.b1.e(new jz5.l("MagicEcsKFDynamicCard", rq0.a.f480249f));

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f480254a = new java.util.HashMap();

    public b() {
        kz5.h hVar = (kz5.h) rq0.a.f480251h;
        hVar.getClass();
        kz5.e eVar = new kz5.e(hVar);
        while (eVar.hasNext()) {
            rq0.a aVar = (rq0.a) eVar.next();
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("magicSclCover" + aVar.f480252d), true);
            if (i17 != null) {
                java.lang.String concat = i17.concat("/startup/cover");
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(concat);
                java.lang.String str = a17.f294812f;
                if (str != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
                    com.p314xaae8f345.mm.vfs.w6.u(concat);
                }
                this.f480254a.put(aVar, concat);
            }
        }
    }

    public final java.lang.String a(java.lang.String bizName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        java.lang.String c17 = vq0.b.c(bizName);
        rq0.a aVar = rq0.a.f480248e;
        rq0.a aVar2 = (rq0.a) f480253b.getOrDefault(c17, aVar);
        java.util.HashMap hashMap = this.f480254a;
        java.lang.String str = (java.lang.String) hashMap.get(aVar2);
        if (str == null) {
            str = (java.lang.String) hashMap.get(aVar);
        }
        return str == null ? "" : str;
    }
}

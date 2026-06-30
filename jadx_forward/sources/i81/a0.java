package i81;

/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final i81.z f371049c = new i81.z(null);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f371050d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f371051e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final i81.e f371052a = new i81.e();

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6314x36a0adf7 f371053b;

    public a0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final i81.e a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        i81.z zVar = f371049c;
        if (c11510xdd90c2f2 == null) {
            return null;
        }
        return zVar.a(c11510xdd90c2f2).f371052a;
    }

    public static final i81.e b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2;
        i81.z zVar = f371049c;
        if ((str == null || str.length() == 0) || (c11510xdd90c2f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) f371051e.get(str)) == null) {
            return null;
        }
        return zVar.a(c11510xdd90c2f2).f371052a;
    }

    public static final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6314x36a0adf7 c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        i81.a0 a0Var = (i81.a0) f371050d.get(runtime);
        if (a0Var != null) {
            return a0Var.f371053b;
        }
        return null;
    }
}

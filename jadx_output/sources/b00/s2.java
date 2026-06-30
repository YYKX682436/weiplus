package b00;

/* loaded from: classes9.dex */
public final class s2 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public static final b00.s2 f16770a = new b00.s2();

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMEcsUserInfoService", "hy: got " + str + " contact " + z17);
        i95.m c17 = i95.n0.c(c00.b4.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c00.b4.lg((c00.b4) c17, "EcsUserInfoErrReport", 1, null, 4, null);
    }
}

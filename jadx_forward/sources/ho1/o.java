package ho1;

/* loaded from: classes15.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364304f;

    public o(java.lang.String str, ho1.v vVar, long j17) {
        this.f364302d = str;
        this.f364303e = vVar;
        this.f364304f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17 = this.f364304f;
        ho1.v vVar = this.f364303e;
        java.lang.String str = this.f364302d;
        if (str == null) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
            if (t0Var != null) {
                t0Var.h0(j17, -1, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0.f297307m);
                return;
            }
            return;
        }
        ro1.g gVar = vVar.f364364c;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mUDiskChannel");
            throw null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0 d17 = gVar.d(str);
        if (d17 == null) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var2 = vVar.f364369h;
            if (t0Var2 != null) {
                t0Var2.h0(j17, -2, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0.f297307m);
                return;
            }
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var3 = vVar.f364369h;
        if (t0Var3 != null) {
            t0Var3.h0(j17, 0, d17);
        }
    }
}

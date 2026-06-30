package br1;

/* loaded from: classes8.dex */
public final class r implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f23638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f23639b;

    public r(kotlin.jvm.internal.h0 h0Var, c01.o8 o8Var) {
        this.f23638a = h0Var;
        this.f23639b = o8Var;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("BizFans.BizFansContactInterceptor", "[getContact] callback! succ=" + z17 + ", username=" + str + " talker=" + ((java.lang.String) this.f23638a.f310123d));
        c01.o8 o8Var = this.f23639b;
        if (o8Var != null) {
            o8Var.a(str, z17);
        }
    }
}

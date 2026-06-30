package br1;

/* loaded from: classes8.dex */
public final class r implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f105171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f105172b;

    public r(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, c01.o8 o8Var) {
        this.f105171a = h0Var;
        this.f105172b = o8Var;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansContactInterceptor", "[getContact] callback! succ=" + z17 + ", username=" + str + " talker=" + ((java.lang.String) this.f105171a.f391656d));
        c01.o8 o8Var = this.f105172b;
        if (o8Var != null) {
            o8Var.a(str, z17);
        }
    }
}

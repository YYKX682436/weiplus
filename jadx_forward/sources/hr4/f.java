package hr4;

/* loaded from: classes8.dex */
public final class f implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f365786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f365787b;

    public f(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, c01.o8 o8Var) {
        this.f365786a = h0Var;
        this.f365787b = o8Var;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.GetContactInterceptor", "[getContact] callback! succ=" + z17 + ", username=" + str + " talker=" + ((java.lang.String) this.f365786a.f391656d));
        c01.o8 o8Var = this.f365787b;
        if (o8Var != null) {
            o8Var.a(str, z17);
        }
    }
}

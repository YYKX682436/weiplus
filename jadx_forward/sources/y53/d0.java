package y53;

/* loaded from: classes8.dex */
public final class d0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f541013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f541014b;

    public d0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, c01.o8 o8Var) {
        this.f541013a = h0Var;
        this.f541014b = o8Var;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.GetContactInterceptor", "[getContact] callback! succ=" + z17 + ", username=" + str + " talker=" + ((java.lang.String) this.f541013a.f391656d));
        c01.o8 o8Var = this.f541014b;
        if (o8Var != null) {
            o8Var.a(str, z17);
        }
    }
}

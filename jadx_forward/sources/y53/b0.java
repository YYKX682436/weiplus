package y53;

/* loaded from: classes8.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f541004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f541006f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f541007g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.util.Map map, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, c01.o8 o8Var) {
        super(0);
        this.f541004d = map;
        this.f541005e = str;
        this.f541006f = h0Var;
        this.f541007g = o8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        u53.u uVar = (u53.u) kz5.n0.Y(this.f541004d.values());
        boolean z17 = uVar != null ? ((y53.m) uVar).B : false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getContact] callback! succ=");
        sb6.append(z17);
        sb6.append(", username=");
        java.lang.String str = this.f541005e;
        sb6.append(str);
        sb6.append(" talker=");
        sb6.append((java.lang.String) this.f541006f.f391656d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.GetContactInterceptor", sb6.toString());
        c01.o8 o8Var = this.f541007g;
        if (o8Var != null) {
            o8Var.a(str, z17);
        }
        return jz5.f0.f384359a;
    }
}

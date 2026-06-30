package ud;

/* loaded from: classes7.dex */
public abstract class b extends ud.g {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f508097f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t jsRuntime, boolean z17) {
        super(context, jsRuntime);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsRuntime, "jsRuntime");
        this.f508097f = z17;
    }

    @Override // ud.g
    public void d(com.p314xaae8f345.p485x5dc4f1ad.a builder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        super.d(builder);
        f06.v[] vVarArr = com.p314xaae8f345.p485x5dc4f1ad.c0.I;
        builder.f130145n.b(builder, vVarArr[7], java.lang.Boolean.FALSE);
        builder.f130143l.b(builder, vVarArr[5], java.lang.Boolean.valueOf(this.f508097f));
    }
}

package s72;

/* loaded from: classes12.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f485702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tp0 f485703e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.lang.String str, r45.tp0 tp0Var) {
        super(0);
        this.f485702d = str;
        this.f485703e = tp0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("source:");
        sb6.append(this.f485702d);
        sb6.append(";favId:");
        r45.tp0 tp0Var = this.f485703e;
        sb6.append(tp0Var.f468171d);
        sb6.append(";seq:");
        sb6.append(tp0Var.f468176i);
        sb6.append(";updateTime:");
        sb6.append(tp0Var.f468175h);
        sb6.append(";xml:");
        java.lang.String str = tp0Var.f468173f;
        sb6.append(str != null ? r26.i0.t(str, ",", ";", false) : null);
        return sb6.toString();
    }
}

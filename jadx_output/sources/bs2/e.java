package bs2;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f23827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23828e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlin.jvm.internal.c0 c0Var, java.lang.String str) {
        super(1);
        this.f23827d = c0Var;
        this.f23828e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da view = (cw2.da) obj;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.c0 c0Var = this.f23827d;
        c0Var.f310112d = c0Var.f310112d || kotlin.jvm.internal.o.b(view.getVideoMediaId(), this.f23828e);
        return java.lang.Boolean.FALSE;
    }
}

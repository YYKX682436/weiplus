package bu2;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f24571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f24572e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(yz5.l lVar, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f24571d = lVar;
        this.f24572e = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.p21 item = (r45.p21) obj;
        kotlin.jvm.internal.o.g(item, "item");
        boolean booleanValue = ((java.lang.Boolean) this.f24571d.invoke(item)).booleanValue();
        if (booleanValue) {
            this.f24572e.f310112d = true;
        }
        return java.lang.Boolean.valueOf(booleanValue);
    }
}

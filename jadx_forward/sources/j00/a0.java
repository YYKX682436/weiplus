package j00;

/* loaded from: classes9.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.d0 f378232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(j00.d0 d0Var, yz5.l lVar) {
        super(2);
        this.f378232d = d0Var;
        this.f378233e = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bw5.j8 type = (bw5.j8) obj;
        bw5.i8 info = (bw5.i8) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (type == bw5.j8.EcsOpenEventType_wxaNavBackToNative) {
            j00.d0 d0Var = this.f378232d;
            java.lang.String b17 = info.b();
            if (b17 == null) {
                b17 = "";
            }
            d0Var.a(0L, "", b17, this.f378233e);
        }
        return jz5.f0.f384359a;
    }
}

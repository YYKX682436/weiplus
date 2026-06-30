package e00;

/* loaded from: classes9.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.b0 f327270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(e00.b0 b0Var) {
        super(0);
        this.f327270d = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reqType:");
        e00.b0 b0Var = this.f327270d;
        sb6.append(b0Var.f327273a);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(sb6.toString());
        for (bw5.ne0 requestInfo : b0Var.f327274b) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestInfo, "requestInfo");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(requestInfo.f112185d);
            sb8.append('_');
            sb8.append(requestInfo.f112192n[5] ? requestInfo.f112189h : "");
            sb7.append(sb8.toString() + '/');
        }
        return sb7.toString();
    }
}

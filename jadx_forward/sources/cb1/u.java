package cb1;

/* loaded from: classes7.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km5.b f121846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(km5.b bVar) {
        super(4);
        this.f121846d = bVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        java.util.List list = (java.util.List) obj3;
        cb1.i iVar = (cb1.i) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        km5.b bVar = this.f121846d;
        if (booleanValue) {
            bVar.c(nm5.j.c(vi1.o0.f518949a.c(list, null), iVar));
        } else {
            if (errMsg.length() == 0) {
                errMsg = "network request fail";
            }
            bVar.a(errMsg);
        }
        return jz5.f0.f384359a;
    }
}

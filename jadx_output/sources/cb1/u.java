package cb1;

/* loaded from: classes7.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km5.b f40313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(km5.b bVar) {
        super(4);
        this.f40313d = bVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        java.util.List list = (java.util.List) obj3;
        cb1.i iVar = (cb1.i) obj4;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        km5.b bVar = this.f40313d;
        if (booleanValue) {
            bVar.c(nm5.j.c(vi1.o0.f437416a.c(list, null), iVar));
        } else {
            if (errMsg.length() == 0) {
                errMsg = "network request fail";
            }
            bVar.a(errMsg);
        }
        return jz5.f0.f302826a;
    }
}

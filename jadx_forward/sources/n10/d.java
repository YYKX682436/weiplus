package n10;

/* loaded from: classes.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n10.e f415570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n10.e eVar) {
        super(3);
        this.f415570d = eVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        java.util.Map map = (java.util.HashMap) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        rk0.c.c("MBJsApiGetBizPreloadData", "getBizPreloadData: " + intValue + ", " + errMsg + ", " + map, new java.lang.Object[0]);
        n10.e eVar = this.f415570d;
        if (intValue == 0) {
            yz5.l s17 = eVar.s();
            if (map == null) {
                map = kz5.q0.f395534d;
            }
            lc3.a0 a0Var = new lc3.a0(map);
            eVar.m(a0Var);
            s17.mo146xb9724478(a0Var);
        } else {
            eVar.s().mo146xb9724478(eVar.h(intValue, errMsg));
        }
        return jz5.f0.f384359a;
    }
}

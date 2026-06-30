package androidx.paging.compose;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.s f11726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f11727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yz5.s sVar, androidx.paging.compose.e eVar) {
        super(4);
        this.f11726d = sVar;
        this.f11727e = eVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        e0.g items = (e0.g) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.o.g(items, "$this$items");
        if ((intValue2 & 14) == 0) {
            i17 = (((n0.y0) oVar).e(items) ? 4 : 2) | intValue2;
        } else {
            i17 = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            i17 |= ((n0.y0) oVar).c(intValue) ? 32 : 16;
        }
        if (((i17 & 731) ^ 146) == 0) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        this.f11726d.v(items, java.lang.Integer.valueOf(intValue), this.f11727e.b(intValue), oVar, java.lang.Integer.valueOf((i17 & 14) | (i17 & 112)));
        return jz5.f0.f302826a;
    }
}

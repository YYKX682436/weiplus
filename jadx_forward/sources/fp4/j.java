package fp4;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp4.s f346897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fp4.s sVar) {
        super(1);
        this.f346897d = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bv3.d dVar;
        bv3.d dVar2;
        bv3.d dVar3;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        fp4.s sVar = this.f346897d;
        if (booleanValue) {
            zu3.a aVar = sVar.f346918t;
            if (aVar != null && (dVar = aVar.f557293c) != null) {
                dVar.d(0L, 2147483647L);
            }
        } else {
            zu3.a aVar2 = sVar.f346918t;
            if (aVar2 != null) {
                aVar2.f557292b = null;
            }
            if (aVar2 != null && (dVar3 = aVar2.f557293c) != null) {
                dVar3.d(sVar.f346916r, sVar.f346917s);
            }
            zu3.a aVar3 = sVar.f346918t;
            long c17 = (aVar3 == null || (dVar2 = aVar3.f557293c) == null) ? sVar.f346914p : dVar2.c();
            sVar.f346918t = null;
            ju3.c0 c0Var = ju3.c0.f383447x2;
            ju3.d0 d0Var = sVar.f546865d;
            ju3.d0.k(d0Var, c0Var, null, 2, null);
            ju3.c0 c0Var2 = ju3.c0.f383419l2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("PARAM_1_LONG", c17);
            d0Var.w(c0Var2, bundle);
        }
        return jz5.f0.f384359a;
    }
}

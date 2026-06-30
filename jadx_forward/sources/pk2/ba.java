package pk2;

/* loaded from: classes3.dex */
public final class ba extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(pk2.o9 o9Var) {
        super(1);
        this.f437121d = o9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        pk2.o9 o9Var = this.f437121d;
        if (booleanValue) {
            pk2.d9 d9Var = o9Var.f437615f;
            if (d9Var != null && (e3Var2 = d9Var.f437196f) != null) {
                e3Var2.i();
            }
        } else {
            pk2.d9 d9Var2 = o9Var.f437615f;
            if (d9Var2 != null && (e3Var = d9Var2.f437196f) != null) {
                e3Var.f213498o = true;
                e3Var.h();
            }
        }
        return jz5.f0.f384359a;
    }
}

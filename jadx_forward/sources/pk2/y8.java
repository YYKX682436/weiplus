package pk2;

/* loaded from: classes3.dex */
public final class y8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f437935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(pk2.d9 d9Var) {
        super(1);
        this.f437935d = d9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        pk2.d9 d9Var = this.f437935d;
        java.lang.Integer num = d9Var.f437208r;
        if (num != null && intValue == num.intValue()) {
            d9Var.f437208r = null;
        }
        return jz5.f0.f384359a;
    }
}

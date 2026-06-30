package pk2;

/* loaded from: classes3.dex */
public final class i9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.j9 f437376d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(pk2.j9 j9Var) {
        super(1);
        this.f437376d = j9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        pk2.j9 j9Var = this.f437376d;
        java.lang.Integer num = j9Var.f437422e;
        if (num != null && intValue == num.intValue()) {
            j9Var.f437422e = null;
        }
        return jz5.f0.f384359a;
    }
}

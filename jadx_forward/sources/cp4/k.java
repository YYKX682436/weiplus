package cp4;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f302573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(cp4.r rVar) {
        super(2);
        this.f302573d = rVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        cp4.r rVar = this.f302573d;
        ((zu3.d) rVar.f302603u.get(intValue)).f557325g.clear();
        rVar.f302596n.setVisibility(booleanValue ? 0 : 4);
        rVar.f302604v = booleanValue;
        ju3.c0 c0Var = ju3.c0.f383441v2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_1_INT", intValue);
        rVar.f546865d.w(c0Var, bundle);
        return jz5.f0.f384359a;
    }
}

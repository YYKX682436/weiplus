package tt2;

/* loaded from: classes3.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f503551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f503552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f503553g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(tt2.e1 e1Var, r45.y23 y23Var, int i17, java.lang.Object obj) {
        super(2);
        this.f503550d = e1Var;
        this.f503551e = y23Var;
        this.f503552f = i17;
        this.f503553g = obj;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        tt2.e1 e1Var = this.f503550d;
        e1Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyProductItem ");
        r45.y23 y23Var = this.f503551e;
        sb6.append(y23Var.m75945x2fec8307(1));
        sb6.append(", source:");
        sb6.append(this.f503552f);
        sb6.append(", sellingPrice:");
        sb6.append(y23Var.m75939xb282bd08(5));
        sb6.append(" dataPos:");
        sb6.append(intValue);
        sb6.append("(realPos:");
        sb6.append(intValue);
        sb6.append("),size:");
        sb6.append(e1Var.mo1894x7e414b06());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListAdapter", sb6.toString());
        if (intValue >= 0 && intValue < e1Var.mo1894x7e414b06()) {
            pm0.v.X(new tt2.x(this.f503550d, intValue, this.f503551e, intValue, this.f503553g));
        }
        return jz5.f0.f384359a;
    }
}

package pk2;

/* loaded from: classes3.dex */
public final class j5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.l5 f437408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f437409f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(pk2.o9 o9Var, pk2.l5 l5Var, v65.n nVar) {
        super(2);
        this.f437407d = o9Var;
        this.f437408e = l5Var;
        this.f437409f = nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.jc jcVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = this.f437407d.f437605a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modifyAnchorStatusFlag: succ=");
        sb6.append(booleanValue);
        sb6.append(", isAnchorLiving=");
        pk2.l5 l5Var = this.f437408e;
        sb6.append(l5Var.n());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (booleanValue && (jcVar = (df2.jc) l5Var.f445960a.e(df2.jc.class)) != null) {
            jcVar.b7();
        }
        this.f437409f.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}

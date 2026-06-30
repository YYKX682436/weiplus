package pk2;

/* loaded from: classes3.dex */
public final class x5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f437894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f437896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(boolean z17, pk2.o9 o9Var, v65.n nVar) {
        super(2);
        this.f437894d = z17;
        this.f437895e = o9Var;
        this.f437896f = nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (!booleanValue) {
            boolean z17 = this.f437894d;
            pk2.o9 o9Var = this.f437895e;
            java.lang.String string = z17 ? o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwl) : o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            db5.t7.b(o9Var.f437611d, string + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cud));
        }
        this.f437896f.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}

package pk2;

/* loaded from: classes3.dex */
public final class w4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f437859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f437860f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(pk2.o9 o9Var, boolean z17, v65.n nVar) {
        super(2);
        this.f437858d = o9Var;
        this.f437859e = z17;
        this.f437860f = nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f437858d.f437605a, "check: " + this.f437859e + ", succ: " + booleanValue);
        this.f437860f.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}

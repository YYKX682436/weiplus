package nl4;

/* loaded from: classes11.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl4.r f419739d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(nl4.r rVar) {
        super(0);
        this.f419739d = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nl4.r rVar = this.f419739d;
        java.lang.String str = rVar.f419775l;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekend, callback:");
        sb6.append(rVar.f419764a);
        sb6.append(", null?");
        sb6.append(rVar.f419764a == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        ll4.a aVar = rVar.f419764a;
        if (aVar != null) {
            ll4.a.a(aVar, 10, null, 2, null);
        }
        return jz5.f0.f384359a;
    }
}

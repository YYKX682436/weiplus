package sr2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.c f493048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(sr2.c cVar) {
        super(2);
        this.f493048d = cVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("success:");
        sb6.append(booleanValue);
        sb6.append(" , filePath:");
        sb6.append(str);
        sb6.append(", fileExist:");
        sr2.c cVar = this.f493048d;
        sb6.append(o35.a.b(cVar.f493055d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicCheckUIC", sb6.toString());
        pm0.v.X(new sr2.a(cVar, str, booleanValue));
        return jz5.f0.f384359a;
    }
}

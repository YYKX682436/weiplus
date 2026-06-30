package vn2;

/* loaded from: classes.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.a f519873e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context, java.lang.String str, xg2.a aVar) {
        super(0);
        this.f519872d = str;
        this.f519873e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteSeeLater fail,");
        xg2.a aVar = this.f519873e;
        sb6.append(aVar != null ? aVar.f535912a : null);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f519872d, sb6.toString());
        return jz5.f0.f384359a;
    }
}

package v22;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.m f514363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f514364e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v22.m mVar, long j17) {
        super(1);
        this.f514363d = mVar;
        this.f514364e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        v22.m mVar = this.f514363d;
        java.lang.String str = mVar.f514366g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(mVar.d());
        sb6.append(" mix end: ");
        v22.g gVar = mVar.f514365f;
        sb6.append(gVar.f514349d);
        sb6.append(' ');
        sb6.append(booleanValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        java.util.Iterator it = ((java.util.ArrayList) gVar.f514350e.f514326a).iterator();
        while (it.hasNext()) {
            ((av3.a) it.next()).b();
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        mVar.f514368i = java.lang.System.currentTimeMillis() - this.f514364e;
        if (booleanValue) {
            v22.m.e(mVar, true);
            mVar.b(fp0.u.f346823f);
        } else {
            v22.m.e(mVar, false);
            mVar.b(fp0.u.f346824g);
        }
        return jz5.f0.f384359a;
    }
}

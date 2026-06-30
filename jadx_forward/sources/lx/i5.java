package lx;

/* loaded from: classes11.dex */
public final class i5 implements ft.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.m5 f403341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403343c;

    public i5(lx.m5 m5Var, java.lang.String str, yz5.l lVar) {
        this.f403341a = m5Var;
        this.f403342b = str;
        this.f403343c = lVar;
    }

    @Override // ft.p4
    public void a(java.lang.String str, java.lang.String str2) {
        lx.m5.a(this.f403341a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "launchMapMiniProgramWithCallback onDataCallback: appId=" + str + ", value=" + str2);
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Bi(this.f403342b, this);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        if (str2 == null) {
            str2 = "";
        }
        this.f403343c.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str2)));
    }
}

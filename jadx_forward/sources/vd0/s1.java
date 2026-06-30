package vd0;

/* loaded from: classes8.dex */
public final class s1 implements re4.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd0.h2 f517038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vd0.v1 f517039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f517040c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f517041d;

    public s1(wd0.h2 h2Var, vd0.v1 v1Var, android.content.Context context, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        this.f517038a = h2Var;
        this.f517039b = v1Var;
        this.f517040c = context;
        this.f517041d = y0Var;
    }

    @Override // re4.z
    public final void h(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", "[fingerprint login] initSoter onResult errCode: " + i17 + ", errMsg: " + str);
        wd0.h2 h2Var = this.f517038a;
        if (i17 != 0 && i17 != 1028) {
            wd0.d1[] d1VarArr = wd0.d1.f526235d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t6) h2Var).a(1, str);
            return;
        }
        android.content.Context context = this.f517040c;
        vd0.v1 v1Var = this.f517039b;
        if (v1Var.Ui(context, true)) {
            p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f517041d;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new vd0.r1(v1Var, y0Var, h2Var, null), 3, null);
        } else {
            wd0.d1[] d1VarArr2 = wd0.d1.f526235d;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t6) h2Var).a(2, "");
        }
    }
}

package pc0;

/* loaded from: classes10.dex */
public final class b2 implements p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c f434766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f434768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc0.e2 f434769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f434770e;

    public b2(p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, pc0.e2 e2Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f434766a = activityC0053x3d3f670c;
        this.f434767b = str;
        this.f434768c = h0Var;
        this.f434769d = e2Var;
        this.f434770e = qVar;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b
    public void a(java.lang.Object obj) {
        qc0.m1 m1Var = (qc0.m1) obj;
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h mo2507xfe541f5f = this.f434766a.mo2507xfe541f5f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo2507xfe541f5f, "getActivityResultRegistry(...)");
        java.lang.String key = this.f434767b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) mo2507xfe541f5f.f90597c).get(key);
        int intValue = num != null ? num.intValue() : -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaOptService", "ActivityResultCallback key:" + key + " requestCode:" + intValue);
        m1Var.f442943a = intValue;
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c cVar = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c) this.f434768c.f391656d;
        if (cVar != null) {
            cVar.b();
        }
        this.f434769d.f434782d.remove(key);
        ((p3325xe03a0797.p3326xc267989b.r) this.f434770e).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(m1Var));
    }
}

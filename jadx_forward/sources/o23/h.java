package o23;

/* loaded from: classes10.dex */
public final class h implements p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c f423951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f423952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f423953c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f423954d;

    public h(p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f423951a = activityC0053x3d3f670c;
        this.f423952b = str;
        this.f423953c = h0Var;
        this.f423954d = qVar;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b
    public void a(java.lang.Object obj) {
        qc0.m1 m1Var = (qc0.m1) obj;
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h mo2507xfe541f5f = this.f423951a.mo2507xfe541f5f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo2507xfe541f5f, "getActivityResultRegistry(...)");
        java.lang.String key = this.f423952b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) mo2507xfe541f5f.f90597c).get(key);
        int intValue = num != null ? num.intValue() : -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryFeatureService", "ActivityResultCallback key:" + key + " requestCode:" + intValue);
        m1Var.f442943a = intValue;
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c cVar = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c) this.f423953c.f391656d;
        if (cVar != null) {
            cVar.b();
        }
        ((p3325xe03a0797.p3326xc267989b.r) this.f423954d).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(m1Var));
    }
}

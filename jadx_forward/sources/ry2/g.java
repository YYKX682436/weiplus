package ry2;

/* loaded from: classes10.dex */
public final class g implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f482923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f482924e;

    public g(java.util.List list, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f482923d = list;
        this.f482924e = activityC0065xcd7aa112;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var == null || !g4Var.z()) {
            return;
        }
        for (ry2.f fVar : this.f482923d) {
            int i17 = fVar.f482918b;
            if (i17 <= 0) {
                i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832;
            }
            int i18 = fVar.f482917a;
            int i19 = fVar.f482919c;
            if (i19 <= 0) {
                java.lang.Integer num = (java.lang.Integer) ry2.j.f482932b.get(java.lang.Integer.valueOf(i18));
                i19 = num != null ? num.intValue() : 0;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f482924e;
            g4Var.d(i18, b3.l.m9702x7444d5ad(activityC0065xcd7aa112, i17), activityC0065xcd7aa112.getResources().getString(i19));
        }
    }
}

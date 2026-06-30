package hn2;

/* loaded from: classes10.dex */
public final class f implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn2.h f364055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f364056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f364057f;

    public f(hn2.h hVar, yz5.p pVar, yz5.l lVar) {
        this.f364055d = hVar;
        this.f364056e = pVar;
        this.f364057f = lVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Integer num;
        nm2.a aVar = (nm2.a) obj;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSongAuditionHelper", "auditionState changed, but state is null, ignore");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSongAuditionHelper", "auditionState changed: state=".concat(aVar.getClass().getSimpleName()));
            java.lang.String b17 = aVar.b();
            boolean d17 = aVar.d();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            hn2.h hVar = this.f364055d;
            nm2.a aVar2 = hVar.f364063b;
            yz5.p pVar = this.f364056e;
            if (aVar2 != null && (num = (java.lang.Integer) pVar.mo149xb9724478(aVar2.b(), java.lang.Boolean.valueOf(aVar2.d()))) != null) {
                linkedHashSet.add(new java.lang.Integer(num.intValue()));
            }
            java.lang.Integer num2 = (java.lang.Integer) pVar.mo149xb9724478(b17, java.lang.Boolean.valueOf(d17));
            if (num2 != null) {
                linkedHashSet.add(new java.lang.Integer(num2.intValue()));
            }
            hVar.f364063b = aVar;
            if (!linkedHashSet.isEmpty()) {
                this.f364057f.mo146xb9724478(linkedHashSet);
            }
        }
        return f0Var;
    }
}

package h93;

/* loaded from: classes11.dex */
public final class a implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h93.c f361225d;

    public a(h93.c cVar) {
        this.f361225d = cVar;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
        h93.c cVar = this.f361225d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.R6(), "unselected label: " + str);
        h93.k Q6 = cVar.Q6();
        if (str == null) {
            Q6.getClass();
            return;
        }
        Q6.f361241d.remove(str);
        no.a aVar = Q6.f361243f;
        aVar.getClass();
        java.lang.Integer num = (java.lang.Integer) aVar.f420231a.get(str);
        if (num != null) {
            Q6.f361242e.remove(java.lang.Integer.valueOf(num.intValue()));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LabelStateUIC", "labelId of " + str + " is null");
        }
        Q6.Q6();
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
        h93.c cVar = this.f361225d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.R6(), "selected label: " + str);
        h93.k Q6 = cVar.Q6();
        int P6 = cVar.P6();
        if (str == null) {
            Q6.getClass();
            return;
        }
        Q6.f361241d.put(str, java.lang.Integer.valueOf(P6));
        no.a aVar = Q6.f361243f;
        aVar.getClass();
        java.lang.Integer num = (java.lang.Integer) aVar.f420231a.get(str);
        if (num != null) {
            Q6.f361242e.add(java.lang.Integer.valueOf(num.intValue()));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LabelStateUIC", "labelId of " + str + " is null");
        }
        Q6.Q6();
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }
}

package sc2;

/* loaded from: classes2.dex */
public final class l8 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.ad.C15417x7e33cd1e f487589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f487590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sc2.p8 f487591c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487592d;

    public l8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.ad.C15417x7e33cd1e c15417x7e33cd1e, java.util.ArrayList arrayList, sc2.p8 p8Var, xc2.p0 p0Var) {
        this.f487589a = c15417x7e33cd1e;
        this.f487590b = arrayList;
        this.f487591c = p8Var;
        this.f487592d = p0Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            int o17 = this.f487589a.o() % this.f487590b.size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487591c.f487685w, "onViewExposed: currentShowIndex=" + o17);
            xc2.p0 p0Var = this.f487592d;
            int i17 = 0;
            for (java.lang.Object obj : p0Var.U) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.util.HashMap hashMap = p0Var.V;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                if (hashMap.get(valueOf) == null) {
                    hashMap.put(valueOf, 0);
                }
                if (i17 == o17) {
                    java.util.HashMap hashMap2 = p0Var.V;
                    java.lang.Integer num = (java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(i17));
                    if (num != null && num.intValue() == 0) {
                        hashMap2.put(java.lang.Integer.valueOf(i17), 1);
                    }
                }
                java.util.HashMap hashMap3 = p0Var.W;
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
                if (hashMap3.get(valueOf2) == null) {
                    hashMap3.put(valueOf2, 0);
                }
                java.util.HashMap hashMap4 = p0Var.X;
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
                if (hashMap4.get(valueOf3) == null) {
                    hashMap4.put(valueOf3, 0);
                }
                java.util.HashMap hashMap5 = p0Var.Y;
                java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i17);
                if (hashMap5.get(valueOf4) == null) {
                    hashMap5.put(valueOf4, 0);
                }
                i17 = i18;
            }
        }
    }
}

package dp1;

/* loaded from: classes14.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f323654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dp1.k f323655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dp1.l f323656f;

    public c(dp1.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, dp1.k kVar) {
        this.f323656f = lVar;
        this.f323654d = c12886x91aa2b6d;
        this.f323655e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dp1.q qVar = dp1.p.f323703a;
        android.content.Context context = view.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f323654d;
        if (qVar.b(context, c12886x91aa2b6d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallMenuAdapter", "onFloatBallListCloseBtn delegate intercept");
            yj0.a.h(this, "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        dp1.l lVar = this.f323656f;
        boolean z17 = lVar.f323701m;
        dp1.k kVar = this.f323655e;
        if (z17) {
            int i17 = kVar.f323670e;
            java.util.List list = lVar.f323698g;
            if (list != null) {
                boolean z18 = false;
                if (list.size() > 1) {
                    int i18 = kVar.f323670e;
                    if (i18 >= 0 && i18 < lVar.f323698g.size()) {
                        z18 = true;
                    }
                    if (z18) {
                        lVar.f323698g.remove(kVar.f323670e);
                        lVar.m8155x27702c4(kVar.f323670e);
                    }
                } else if (lVar.f323698g.size() == 1) {
                    int i19 = kVar.f323670e;
                    if (i19 >= 0 && i19 < lVar.f323698g.size()) {
                        z18 = true;
                    }
                    if (z18) {
                        lVar.f323698g.remove(kVar.f323670e);
                        rp1.i2 i2Var = lVar.f323702n;
                        if (i2Var != null) {
                            ((rp1.v1) i2Var).a(kVar, new dp1.d(lVar, kVar));
                        }
                    }
                }
            }
        } else {
            mp1.e eVar = lVar.f323699h;
            if (eVar != null) {
                eVar.b(c12886x91aa2b6d, kVar.m8183xf806b362());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

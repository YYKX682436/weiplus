package pk2;

/* loaded from: classes3.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f437418a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 f437419b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gj f437420c;

    /* renamed from: d, reason: collision with root package name */
    public pk2.p7 f437421d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f437422e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f437423f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f437424g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f437425h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437426i;

    public j9(pk2.o9 o9Var, pk2.f9 postDep, p3325xe03a0797.p3326xc267989b.y0 mainScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postDep, "postDep");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainScope, "mainScope");
        this.f437426i = o9Var;
        this.f437418a = mainScope;
        new java.util.ArrayList();
        new java.util.ArrayList();
        this.f437424g = new java.util.ArrayList();
        this.f437425h = jz5.h.b(new pk2.h9(o9Var));
    }

    public final void a(java.lang.Integer num, boolean z17) {
        this.f437422e = num;
        this.f437423f = z17;
        if (this.f437421d == null) {
            pk2.o9 o9Var = this.f437426i;
            pk2.p7 p7Var = new pk2.p7(o9Var.f437611d, o9Var.h());
            this.f437421d = p7Var;
            p7Var.c().f213501r = new pk2.g9(o9Var, this);
        }
        c(num);
    }

    public final ya2.b2 b() {
        return ((mm2.c1) this.f437426i.f437607b.a(mm2.c1.class)).J4;
    }

    public final void c(java.lang.Integer num) {
        pk2.p7 p7Var = this.f437421d;
        if (p7Var != null) {
            int color = this.f437426i.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c);
            android.widget.TextView textView = p7Var.c().f213504u;
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
        pk2.p7 p7Var2 = this.f437421d;
        java.util.List menuConfigs = this.f437424g;
        pk2.i9 i9Var = new pk2.i9(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuConfigs, "menuConfigs");
        java.util.ArrayList arrayList = (java.util.ArrayList) menuConfigs;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            pk2.e9 e9Var = (pk2.e9) arrayList.get(i17);
            java.lang.String levelId = "level_" + i17;
            if (p7Var2 != null) {
                p7Var2.a(levelId, e9Var.f437246b, new pk2.p9(e9Var));
            }
            if (num != null) {
                int intValue = num.intValue();
                if (p7Var2 != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(levelId, "levelId");
                    pk2.g7 g7Var = (pk2.g7) ((java.util.LinkedHashMap) p7Var2.f437700h).get(levelId);
                    if (g7Var != null) {
                        g7Var.f437319h = valueOf;
                    }
                    pk2.l7 l7Var = (pk2.l7) ((java.util.LinkedHashMap) p7Var2.f437698f).get(levelId);
                    if (l7Var != null) {
                        l7Var.m8146xced61ae5();
                    }
                }
            }
            if (p7Var2 != null) {
                p7Var2.d(levelId, new pk2.q9(e9Var, i9Var, p7Var2));
            }
            if (p7Var2 != null) {
                p7Var2.e(levelId, !e9Var.f437245a.isEmpty());
            }
            android.view.View view = e9Var.f437247c;
            if (view != null && p7Var2 != null) {
                p7Var2.b(levelId, view);
            }
        }
        pk2.p7 p7Var3 = this.f437421d;
        if (p7Var3 != null) {
            p7Var3.f();
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public final class s3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x3 f268368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f268369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f268370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f268371g;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x3 x3Var, int i17, java.util.List list, java.util.List list2) {
        this.f268368d = x3Var;
        this.f268369e = i17;
        this.f268370f = list;
        this.f268371g = list2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x3 x3Var = this.f268368d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f17 = x3Var.f();
        if (!(f17 != null && f17.d()) && (i17 = this.f268369e) >= 0) {
            java.util.List list = this.f268370f;
            if (i17 >= list.size()) {
                return;
            }
            if (i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(480L, 0L, 1L, false);
            }
            g4Var.clear();
            java.util.List<rv.a> list2 = ((rv.b) list.get(i17)).f481359b;
            if (true ^ list2.isEmpty()) {
                for (rv.a aVar : list2) {
                    int i18 = aVar.f481345b;
                    if (i18 != 0) {
                        boolean z17 = aVar.f481353j;
                        java.lang.String str = aVar.f481346c;
                        boolean z18 = aVar.f481350g;
                        int i19 = aVar.f481347d;
                        java.lang.Integer num = aVar.f481349f;
                        if (!z17 || i19 == 0 || num == null) {
                            android.graphics.drawable.Drawable drawable = aVar.f481348e;
                            if (drawable != null) {
                                g4Var.r(i18, str, "", drawable, num != null ? num.intValue() : 0, z18);
                            } else if (i19 != 0) {
                                if (num != null) {
                                    g4Var.j(i18, str, i19, num.intValue(), z18);
                                } else {
                                    g4Var.l(i18, str, i19, z18);
                                }
                            }
                        } else {
                            g4Var.k(i18, str, i19, num.intValue(), z17, false);
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f18 = x3Var.f();
            if (f18 != null) {
                f18.u(x3Var.f269175b, g4Var);
            }
            x3Var.getClass();
            int size = g4Var.size();
            for (int i27 = 0; i27 < size; i27++) {
                android.view.MenuItem item = g4Var.getItem(i27);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(item, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
                ((db5.h4) item).f309895J = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.v3(this.f268371g, x3Var);
            }
        }
    }
}

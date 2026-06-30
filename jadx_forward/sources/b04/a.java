package b04;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f98405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b04.f f98406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ll5.a f98407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 f98408g;

    public a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, b04.f fVar, ll5.a aVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185) {
        this.f98405d = abstractActivityC21394xb3d2c0cf;
        this.f98406e = fVar;
        this.f98407f = aVar;
        this.f98408g = c22675xc8629185;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/qrcode/AddFriendCodeUIC$createItemView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wd0.v1 v1Var = (wd0.v1) i95.n0.c(wd0.v1.class);
        b04.f fVar = this.f98406e;
        int T6 = fVar.T6();
        long longValue = ((java.lang.Number) ((jz5.n) fVar.f98422d).mo141623x754a37bb()).longValue();
        vd0.w2 w2Var = (vd0.w2) v1Var;
        w2Var.getClass();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f98405d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        vd0.v2 v2Var = new vd0.v2(w2Var, context);
        v24.e eVar = new v24.e(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l.f242793g, longValue);
        eVar.f514447e = T6;
        r14.y yVar = new r14.y(context, v2Var, eVar);
        yVar.b();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = yVar.f450170e;
        if (k0Var != null) {
            k0Var.v();
        }
        ll5.a aVar = this.f98407f;
        if (!aVar.f400803h) {
            aVar.f400803h = true;
            this.f98408g.m48330xfcfee142(aVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/qrcode/AddFriendCodeUIC$createItemView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

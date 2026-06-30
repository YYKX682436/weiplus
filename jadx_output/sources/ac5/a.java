package ac5;

/* loaded from: classes8.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f3082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.g2 f3083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bc5.e f3084f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.app.Activity activity, com.tencent.mm.pluginsdk.model.g2 g2Var, bc5.e eVar) {
        super(0);
        this.f3082d = activity;
        this.f3083e = g2Var;
        this.f3084f = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent;
        java.util.List<com.tencent.mm.pluginsdk.model.b> list;
        java.lang.CharSequence loadLabel;
        jt.x xVar = (jt.x) i95.n0.c(jt.x.class);
        android.app.Activity context = this.f3082d;
        kotlin.jvm.internal.o.f(context, "$context");
        java.util.List e17 = bc5.e.e(this.f3084f, false, false, 0, false, false, 28, null);
        jb0.g gVar = (jb0.g) xVar;
        gVar.getClass();
        com.tencent.mm.pluginsdk.model.g2 g2Var = this.f3083e;
        if (g2Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            lb0.d dVar = lb0.d.f317669a;
            int i17 = g2Var.f189315h;
            wj.t0 t0Var = i17 != 3 ? i17 != 4 ? i17 != 6 ? i17 != 7 ? wj.t0.f446512u : wj.t0.f446511t : wj.t0.f446514w : wj.t0.f446515x : wj.t0.f446515x;
            com.tencent.mm.pluginsdk.ui.otherway.h0 h0Var = com.tencent.mm.pluginsdk.ui.otherway.h0.f190945a;
            java.util.ArrayList d17 = kz5.c0.d(new com.tencent.mm.pluginsdk.ui.otherway.y(t0Var, com.tencent.mm.pluginsdk.model.a.f188775d));
            int i18 = g2Var.f189315h;
            com.tencent.mm.pluginsdk.model.f2 f2Var = g2Var.f189318k;
            if (f2Var == null || (intent = f2Var.f189300d) == null) {
                intent = new android.content.Intent();
            }
            arrayList.addAll(h0Var.b(context, d17, i18, intent, g2Var.f189311d, g2Var.f189310c));
            com.tencent.mm.pluginsdk.ui.otherway.w wVar = new com.tencent.mm.pluginsdk.ui.otherway.w();
            com.tencent.mm.pluginsdk.model.o0 o0Var = new com.tencent.mm.pluginsdk.model.o0("copy");
            o0Var.f189392d = java.lang.Integer.valueOf(com.tencent.mm.R.raw.copy_regular);
            o0Var.f189390b = context.getString(com.tencent.mm.R.string.nhi);
            o0Var.f189394f = new jb0.e(g2Var);
            wVar.f191017g = o0Var;
            wVar.f191020m = 2;
            arrayList.add(wVar);
            com.tencent.mm.pluginsdk.ui.otherway.w wVar2 = new com.tencent.mm.pluginsdk.ui.otherway.w();
            com.tencent.mm.pluginsdk.model.o0 o0Var2 = new com.tencent.mm.pluginsdk.model.o0("common_local_app");
            o0Var2.f189392d = java.lang.Integer.valueOf(com.tencent.mm.R.raw.rectangle_4_regular);
            o0Var2.f189390b = context.getString(com.tencent.mm.R.string.obc);
            o0Var2.f189394f = new jb0.f(g2Var, gVar);
            wVar2.f191020m = 1;
            wVar2.f191017g = o0Var2;
            arrayList.add(wVar2);
            com.tencent.mm.pluginsdk.model.f2 f2Var2 = g2Var.f189318k;
            if (f2Var2 != null && (list = f2Var2.f189297a) != null) {
                for (com.tencent.mm.pluginsdk.model.b bVar : list) {
                    com.tencent.mm.pluginsdk.ui.otherway.w wVar3 = new com.tencent.mm.pluginsdk.ui.otherway.w();
                    android.content.pm.ResolveInfo resolveInfo = bVar.f189195a;
                    android.content.pm.ApplicationInfo applicationInfo = resolveInfo.activityInfo.applicationInfo;
                    if (applicationInfo != null) {
                        loadLabel = context.getPackageManager().getApplicationLabel(applicationInfo);
                        kotlin.jvm.internal.o.d(loadLabel);
                        if (!(!r26.n0.N(loadLabel))) {
                            loadLabel = null;
                        }
                        if (loadLabel != null) {
                            com.tencent.mm.pluginsdk.ui.otherway.x xVar2 = new com.tencent.mm.pluginsdk.ui.otherway.x(resolveInfo, loadLabel, false, true, false);
                            xVar2.f191036o = bVar.f189196b;
                            wVar3.f191014d = xVar2;
                            arrayList.add(wVar3);
                        }
                    }
                    loadLabel = bVar.f189195a.loadLabel(context.getPackageManager());
                    com.tencent.mm.pluginsdk.ui.otherway.x xVar22 = new com.tencent.mm.pluginsdk.ui.otherway.x(resolveInfo, loadLabel, false, true, false);
                    xVar22.f191036o = bVar.f189196b;
                    wVar3.f191014d = xVar22;
                    arrayList.add(wVar3);
                }
            }
            com.tencent.mm.pluginsdk.ui.otherway.v vVar = new com.tencent.mm.pluginsdk.ui.otherway.v(context, g2Var);
            vVar.a(arrayList);
            android.content.Intent intent2 = new android.content.Intent();
            pf5.j0.a(intent2, com.tencent.mm.pluginsdk.ui.otherway.halfscreen.l.class);
            pf5.j0.a(intent2, com.tencent.mm.pluginsdk.ui.otherway.halfscreen.i.class);
            pf5.j0.a(intent2, com.tencent.mm.pluginsdk.ui.otherway.halfscreen.c.class);
            ok5.d.b(intent2, "KEY_ENHANCER", vVar, new ok5.f());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(e17, 10));
            java.util.Iterator it = ((java.util.ArrayList) e17).iterator();
            while (it.hasNext()) {
                arrayList2.add(((u15.a) it.next()).toXml());
            }
            intent2.putStringArrayListExtra("KEY_SIMPLE_MSG_ITEM", new java.util.ArrayList<>(arrayList2));
            bh5.c cVar = new bh5.c();
            cVar.d(intent2);
            cVar.f20922a.f20924a = context;
            cVar.c(true);
            cVar.a(com.tencent.mm.ui.container.MMCommonActivity.class.getName());
            cVar.g();
        }
        return jz5.f0.f302826a;
    }
}

package ac5;

/* loaded from: classes8.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f84615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 f84616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bc5.e f84617f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.app.Activity activity, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var, bc5.e eVar) {
        super(0);
        this.f84615d = activity;
        this.f84616e = g2Var;
        this.f84617f = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent;
        java.util.List<com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b> list;
        java.lang.CharSequence loadLabel;
        jt.x xVar = (jt.x) i95.n0.c(jt.x.class);
        android.app.Activity context = this.f84615d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        java.util.List e17 = bc5.e.e(this.f84617f, false, false, 0, false, false, 28, null);
        jb0.g gVar = (jb0.g) xVar;
        gVar.getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var = this.f84616e;
        if (g2Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            lb0.d dVar = lb0.d.f399202a;
            int i17 = g2Var.f270848h;
            wj.t0 t0Var = i17 != 3 ? i17 != 4 ? i17 != 6 ? i17 != 7 ? wj.t0.f528045u : wj.t0.f528044t : wj.t0.f528047w : wj.t0.f528048x : wj.t0.f528048x;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.h0 h0Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.h0.f272478a;
            java.util.ArrayList d17 = kz5.c0.d(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.y(t0Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a.f270308d));
            int i18 = g2Var.f270848h;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f2 f2Var = g2Var.f270851k;
            if (f2Var == null || (intent = f2Var.f270833d) == null) {
                intent = new android.content.Intent();
            }
            arrayList.addAll(h0Var.b(context, d17, i18, intent, g2Var.f270844d, g2Var.f270843c));
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o0 o0Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o0("copy");
            o0Var.f270925d = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78905x4aa830d2);
            o0Var.f270923b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nhi);
            o0Var.f270927f = new jb0.e(g2Var);
            wVar.f272550g = o0Var;
            wVar.f272553m = 2;
            arrayList.add(wVar);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar2 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o0 o0Var2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o0("common_local_app");
            o0Var2.f270925d = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80956x2b043bc1);
            o0Var2.f270923b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obc);
            o0Var2.f270927f = new jb0.f(g2Var, gVar);
            wVar2.f272553m = 1;
            wVar2.f272550g = o0Var2;
            arrayList.add(wVar2);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f2 f2Var2 = g2Var.f270851k;
            if (f2Var2 != null && (list = f2Var2.f270830a) != null) {
                for (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b bVar : list) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar3 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w();
                    android.content.pm.ResolveInfo resolveInfo = bVar.f270728a;
                    android.content.pm.ApplicationInfo applicationInfo = resolveInfo.activityInfo.applicationInfo;
                    if (applicationInfo != null) {
                        loadLabel = context.getPackageManager().getApplicationLabel(applicationInfo);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(loadLabel);
                        if (!(!r26.n0.N(loadLabel))) {
                            loadLabel = null;
                        }
                        if (loadLabel != null) {
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar2 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x(resolveInfo, loadLabel, false, true, false);
                            xVar2.f272569o = bVar.f270729b;
                            wVar3.f272547d = xVar2;
                            arrayList.add(wVar3);
                        }
                    }
                    loadLabel = bVar.f270728a.loadLabel(context.getPackageManager());
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar22 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x(resolveInfo, loadLabel, false, true, false);
                    xVar22.f272569o = bVar.f270729b;
                    wVar3.f272547d = xVar22;
                    arrayList.add(wVar3);
                }
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v vVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v(context, g2Var);
            vVar.a(arrayList);
            android.content.Intent intent2 = new android.content.Intent();
            pf5.j0.a(intent2, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.l.class);
            pf5.j0.a(intent2, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.i.class);
            pf5.j0.a(intent2, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.c.class);
            ok5.d.b(intent2, "KEY_ENHANCER", vVar, new ok5.f());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(e17, 10));
            java.util.Iterator it = ((java.util.ArrayList) e17).iterator();
            while (it.hasNext()) {
                arrayList2.add(((u15.a) it.next()).m126747x696739c());
            }
            intent2.putStringArrayListExtra("KEY_SIMPLE_MSG_ITEM", new java.util.ArrayList<>(arrayList2));
            bh5.c cVar = new bh5.c();
            cVar.d(intent2);
            cVar.f102455a.f102457a = context;
            cVar.c(true);
            cVar.a(com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class.getName());
            cVar.g();
        }
        return jz5.f0.f384359a;
    }
}

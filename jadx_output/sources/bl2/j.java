package bl2;

/* loaded from: classes.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bl2.k f21716d;

    public j(bl2.k kVar) {
        this.f21716d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveMusicInfoPanel$fillMusicPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bl2.k kVar = this.f21716d;
        r45.d22 d22Var = kVar.f21717h;
        boolean z17 = false;
        if (d22Var != null) {
            int integer = d22Var.getInteger(0);
            dk2.xf W0 = kVar.f21718i.W0();
            if (W0 != null) {
                dk2.r4 r4Var = (dk2.r4) W0;
                android.content.Context context = kVar.f118381d;
                kotlin.jvm.internal.o.g(context, "context");
                boolean wi6 = ((pc0.k) ((ci0.s) i95.n0.c(ci0.s.class))).wi(context, "com.tencent.qqmusic", "CBD27CD7C861227D013A25B2D10F0799");
                java.lang.String str = r4Var.f234009d;
                com.tencent.mars.xlog.Log.i(str, "goQQMusic isInstalled:" + wi6 + " songId:" + integer + " songmid:0");
                if (wi6) {
                    db5.e1.A(context, context.getResources().getString(com.tencent.mm.R.string.f3a, context.getResources().getString(com.tencent.mm.R.string.f0p)), "", context.getResources().getString(com.tencent.mm.R.string.f490507x1), context.getResources().getString(com.tencent.mm.R.string.f490347sg), new dk2.r2(integer, 0, r4Var, context), new dk2.s2(r4Var));
                } else {
                    com.tencent.mars.xlog.Log.i(str, "goQQMusic download");
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", "https://y.qq.com/m/download.html");
                    intent.putExtra("showShare", false);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                }
            }
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.j3[] j3VarArr = ml2.j3.f327611d;
        r0Var.Kk(2);
        r45.d22 d22Var2 = kVar.f21717h;
        if (d22Var2 != null && dk2.q.b(d22Var2)) {
            z17 = true;
        }
        r45.d22 d22Var3 = kVar.f21717h;
        java.lang.String string = d22Var3 != null ? d22Var3.getString(9) : null;
        if (string == null) {
            string = "";
        }
        bl2.k.y(kVar, 4, z17, string);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveMusicInfoPanel$fillMusicPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

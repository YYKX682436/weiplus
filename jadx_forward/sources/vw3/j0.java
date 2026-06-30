package vw3;

/* loaded from: classes.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f522528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI f522529f;

    public j0(java.lang.String str, long j17, com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI repairerFavDebugUI) {
        this.f522527d = str;
        this.f522528e = j17;
        this.f522529f = repairerFavDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerFavDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f522527d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            android.widget.Toast.makeText(this.f522529f.mo55332x76847179(), "该收藏为空？？？", 1).show();
        } else {
            java.lang.String b17 = r26.b0.b(str);
            java.lang.String format = java.lang.String.format("fav_info_%s.txt", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(this.f522528e)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
            byte[] bytes = b17.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            ((zc0.h) i1Var).aj(format, bytes, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerFavDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

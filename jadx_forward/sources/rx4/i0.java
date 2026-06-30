package rx4;

/* loaded from: classes8.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.k0 f482727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx4.m f482728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f482729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx4.l f482730g;

    public i0(rx4.k0 k0Var, rx4.m mVar, int i17, rx4.l lVar) {
        this.f482727d = k0Var;
        this.f482728e = mVar;
        this.f482729f = i17;
        this.f482730g = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHotspotBoxUIC$renderHotspotContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.k0 k0Var = this.f482727d;
        k0Var.m174141x36654fab();
        rx4.m mVar = this.f482728e;
        boolean z17 = mVar.f482764d.length() > 0;
        int i17 = this.f482729f;
        if (z17) {
            rx4.k0.T6(k0Var, vu4.a.f521776m, mVar, i17);
            int i18 = mVar.f482765e;
            rx4.l lVar = this.f482730g;
            if (i18 == 0) {
                android.app.Activity context = k0Var.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.h2.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                ((rx4.h2) a17).t7(lVar.f482754c, mVar.f482762b, mVar.f482764d, kz5.q0.f395534d);
            } else {
                android.app.Activity context2 = k0Var.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((rx4.h2) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(rx4.h2.class)).m7(lVar.f482754c, mVar.f482762b, mVar.f482764d);
            }
        } else {
            rx4.k0.T6(k0Var, vu4.a.f521777n, mVar, i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHotspotBoxUIC$renderHotspotContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

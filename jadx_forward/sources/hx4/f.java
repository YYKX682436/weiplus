package hx4;

/* loaded from: classes8.dex */
public final class f implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hx4.p f367200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hx4.g f367201e;

    public f(hx4.p pVar, hx4.g gVar) {
        this.f367200d = pVar;
        this.f367201e = gVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        android.content.Intent intent = new android.content.Intent();
        hx4.g gVar = this.f367201e;
        hx4.x xVar = gVar.f367202a;
        boolean z17 = false;
        if (xVar != null && xVar.f367233a == 2) {
            intent.putExtra("browser_setting_result", 2);
        } else {
            if (xVar != null && xVar.f367233a == 1) {
                z17 = true;
            }
            if (z17) {
                intent.putExtra("browser_setting_result", 1);
                hx4.x xVar2 = gVar.f367202a;
                intent.putExtra("show_browser_resolve_info", xVar2 != null ? xVar2.f367234b : null);
                intent.putExtra("show_browser_with_animation", true);
            }
        }
        this.f367200d.b(-1, intent);
    }
}

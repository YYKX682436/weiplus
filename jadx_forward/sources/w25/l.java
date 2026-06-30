package w25;

/* loaded from: classes.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5.C19585x652c01a f524185d;

    public l(com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5.C19585x652c01a c19585x652c01a) {
        this.f524185d = c19585x652c01a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/location/LocationView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean f17 = u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null));
        com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5.C19585x652c01a c19585x652c01a = this.f524185d;
        if (!f17) {
            boolean a17 = j35.u.a((android.app.Activity) c19585x652c01a.getContext(), "android.permission.ACCESS_FINE_LOCATION", 64, "", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationView", "summerper checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(a17));
            if (!a17) {
                yj0.a.h(this, "com/tencent/mm/pluginsdk/location/LocationView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else if (!j35.u.d(c19585x652c01a.getContext(), "android.permission.ACCESS_FINE_LOCATION", true)) {
            if (((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
                j35.u.i((android.app.Activity) c19585x652c01a.getContext(), "android.permission.ACCESS_FINE_LOCATION", 64);
            } else {
                int i17 = com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5.C19585x652c01a.f270288y;
                c19585x652c01a.getClass();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", c19585x652c01a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573932gh2));
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("neverGetA8Key", false);
                intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
                intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
                j45.l.j(c19585x652c01a.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            }
            yj0.a.h(this, "com/tencent/mm/pluginsdk/location/LocationView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        w25.g gVar = c19585x652c01a.f270304v;
        if (gVar != null) {
            gVar.a();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/location/LocationView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

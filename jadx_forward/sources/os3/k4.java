package os3;

/* loaded from: classes8.dex */
public class k4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 f429671d;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1) {
        this.f429671d = viewOnCreateContextMenuListenerC16941x4db497e1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/ReadMailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = this.f429671d;
        int i17 = viewOnCreateContextMenuListenerC16941x4db497e1.I;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1.T6(viewOnCreateContextMenuListenerC16941x4db497e1, 11288, 2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f429671d.C) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f429671d.D)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e12 = this.f429671d;
                viewOnCreateContextMenuListenerC16941x4db497e12.getClass();
                ((ku5.t0) ku5.t0.f394148d).h(new os3.b4(viewOnCreateContextMenuListenerC16941x4db497e12), "initQQMailDownloadUrlAndMD5");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1.U6(this.f429671d);
            }
        } else if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1.T6(viewOnCreateContextMenuListenerC16941x4db497e1, 11288, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReadMailUI", "cancel_download_task:fail_apilevel_too_low downloadId = %d", java.lang.Long.valueOf(this.f429671d.E));
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1.T6(viewOnCreateContextMenuListenerC16941x4db497e1, 11288, 3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e13 = this.f429671d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReadMailUI", "try to install %s", viewOnCreateContextMenuListenerC16941x4db497e13.G);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnCreateContextMenuListenerC16941x4db497e13.G)) {
                zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
                java.lang.String str = viewOnCreateContextMenuListenerC16941x4db497e13.G;
                ((yb0.c) yVar).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.d(viewOnCreateContextMenuListenerC16941x4db497e13, str, null, false);
            }
        } else if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1.T6(viewOnCreateContextMenuListenerC16941x4db497e1, 11288, 4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e14 = this.f429671d;
            viewOnCreateContextMenuListenerC16941x4db497e14.getClass();
            android.content.Intent intent = new android.content.Intent();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnCreateContextMenuListenerC16941x4db497e14.K)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReadMailUI", "mQQMailSchemeForUnread is null");
                android.content.Intent launchIntentForPackage = viewOnCreateContextMenuListenerC16941x4db497e14.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(launchIntentForPackage);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(viewOnCreateContextMenuListenerC16941x4db497e14, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI", "openQQMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                viewOnCreateContextMenuListenerC16941x4db497e14.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(viewOnCreateContextMenuListenerC16941x4db497e14, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI", "openQQMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                intent.setData(android.net.Uri.parse(viewOnCreateContextMenuListenerC16941x4db497e14.K));
                intent.addFlags(268435456);
                intent.addFlags(32768);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(viewOnCreateContextMenuListenerC16941x4db497e14, intent, false, false)) {
                    p95.a.a(new os3.f4(viewOnCreateContextMenuListenerC16941x4db497e14, intent));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReadMailUI", "schema failed");
                    p95.a.a(new os3.i4(viewOnCreateContextMenuListenerC16941x4db497e14));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

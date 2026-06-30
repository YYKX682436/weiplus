package p14;

/* loaded from: classes5.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17369x698c24ae f432771d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17369x698c24ae activityC17369x698c24ae) {
        this.f432771d = activityC17369x698c24ae;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17369x698c24ae activityC17369x698c24ae = this.f432771d;
        int i17 = activityC17369x698c24ae.f241655f;
        if (i17 == 3) {
            byte[] c17 = gm0.j1.n().c(1);
            java.lang.String r17 = c01.z1.r();
            int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(66561, null));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(c17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("https://");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt));
            sb6.append("/cgi-bin/rweibourl?sid=");
            sb6.append(kk.k.g(c17));
            sb6.append("&u=");
            sb6.append(r17);
            sb6.append("&qr=");
            sb6.append(q17);
            sb6.append("&device=");
            int i18 = o45.wf.f424556a;
            sb6.append(wo.q.f529313a);
            sb6.append("&version=");
            sb6.append(o45.wf.f424562g);
            java.lang.String sb7 = sb6.toString();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", sb7);
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, activityC17369x698c24ae.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ihh));
            j45.l.j(activityC17369x698c24ae, "webview", ".ui.tools.WebViewUI", intent, null);
            activityC17369x698c24ae.finish();
        } else if (i17 == 4) {
            if (c01.z1.u()) {
                android.content.Intent intent2 = new android.content.Intent(activityC17369x698c24ae, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17368x689ea64e.class);
                intent2.putExtra("show_to", 4);
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17369x698c24ae activityC17369x698c24ae2 = this.f432771d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activityC17369x698c24ae2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC17369x698c24ae2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activityC17369x698c24ae2, "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                activityC17369x698c24ae.m78603xa4df9991(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11448x932bffb8.class);
            }
            activityC17369x698c24ae.finish();
        } else if (i17 == 2) {
            android.content.Intent intent3 = new android.content.Intent(activityC17369x698c24ae, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17368x689ea64e.class);
            intent3.putExtra("show_to", 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17369x698c24ae activityC17369x698c24ae3 = this.f432771d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent3);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(activityC17369x698c24ae3, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC17369x698c24ae3.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(activityC17369x698c24ae3, "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC17369x698c24ae.finish();
        } else {
            android.content.Intent intent4 = new android.content.Intent(activityC17369x698c24ae, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17368x689ea64e.class);
            intent4.putExtra("show_to", 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17369x698c24ae activityC17369x698c24ae4 = this.f432771d;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent4);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(activityC17369x698c24ae4, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC17369x698c24ae4.startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(activityC17369x698c24ae4, "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC17369x698c24ae.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

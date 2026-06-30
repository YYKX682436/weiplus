package xo1;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f537287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d f537288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f537289f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d activityC12862xdeb2e81d, po1.d dVar) {
        super(0);
        this.f537287d = z17;
        this.f537288e = activityC12862xdeb2e81d;
        this.f537289f = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f537287d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d activityC12862xdeb2e81d = this.f537288e;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC12862xdeb2e81d.f174301d, "Auto bind success.");
            android.content.Intent intent = new android.content.Intent(activityC12862xdeb2e81d.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e.class);
            intent.putExtra("deviceInfo", this.f537289f.c());
            activityC12862xdeb2e81d.finish();
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d activityC12862xdeb2e81d2 = this.f537288e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC12862xdeb2e81d2, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$tryBindDevice$1$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC12862xdeb2e81d2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC12862xdeb2e81d2, "com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$tryBindDevice$1$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(activityC12862xdeb2e81d.f174301d, "Auto bind failed.");
            activityC12862xdeb2e81d.f174303f = false;
            activityC12862xdeb2e81d.U6(activityC12862xdeb2e81d.f174304g);
            java.lang.String string = activityC12862xdeb2e81d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mxh);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.widget.Toast.makeText(activityC12862xdeb2e81d.mo55332x76847179(), string, 1).show();
        }
        return jz5.f0.f384359a;
    }
}

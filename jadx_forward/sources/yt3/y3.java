package yt3;

/* loaded from: classes10.dex */
public final class y3 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f547260d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f547261e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f547262f;

    /* renamed from: g, reason: collision with root package name */
    public float f547263g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f547264h;

    public y3(android.widget.ImageView view, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547260d = view;
        this.f547261e = status;
        this.f547262f = true;
        view.setOnClickListener(this);
        view.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(view.getContext(), com.p314xaae8f345.mm.R.raw.f79659x62521576, -1));
    }

    public final void a(boolean z17) {
        android.widget.ImageView imageView = this.f547260d;
        if (z17) {
            imageView.setContentDescription(imageView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hud));
        } else {
            imageView.setContentDescription(imageView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hue));
        }
        this.f547264h = z17;
    }

    public final void b(float f17) {
        if (this.f547262f) {
            if ((this.f547263g == f17) || !com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordSwitchCameraPlugin", "updateOrientation " + f17 + "  " + this.f547260d.getRotation());
            this.f547263g = f17;
            this.f547260d.animate().cancel();
            this.f547260d.animate().rotation(f17).setDuration(100L).start();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/RecordSwitchCameraPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordSwitchCameraPlugin", "RecordSwitchCameraPlugin switch " + this.f547264h);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", this.f547264h);
        this.f547261e.w(ju3.c0.f383408f, bundle);
        nu3.i iVar = nu3.i.f421751a;
        iVar.d(1);
        iVar.b(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSwitchCameraByButtonCount >> ");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a30521 = nu3.f.f421744b;
        sb6.append(c6355x3a30521 != null ? java.lang.Long.valueOf(c6355x3a30521.f137048k) : null);
        sb6.append(", ");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305212 = nu3.f.f421744b;
        sb6.append(c6355x3a305212 != null ? c6355x3a305212.f137052o : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305213 = nu3.f.f421744b;
        if (c6355x3a305213 != null) {
            c6355x3a305213.f137048k++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordSwitchCameraPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordSwitchCameraPlugin", "onPause");
        this.f547262f = false;
    }

    @Override // yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordSwitchCameraPlugin", "onResume");
        this.f547262f = true;
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordSwitchCameraPlugin", "release");
        this.f547262f = false;
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f547260d.setVisibility(i17);
    }
}

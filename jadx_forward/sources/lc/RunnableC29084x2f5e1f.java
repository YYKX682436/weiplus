package lc;

/* renamed from: lc.g$$f */
/* loaded from: classes14.dex */
public final /* synthetic */ class RunnableC29084x2f5e1f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.g f399368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399370f;

    public /* synthetic */ RunnableC29084x2f5e1f(lc.g gVar, int i17, java.lang.String str) {
        this.f399368d = gVar;
        this.f399369e = i17;
        this.f399370f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lc.g gVar = this.f399368d;
        if (gVar.f399356x) {
            mc.p.f407064a.e("AuthingFragment", "error dialog had showing!");
            return;
        }
        android.app.Activity activity = gVar.getActivity();
        int i17 = this.f399369e;
        java.lang.String str = this.f399370f;
        if (activity == null || activity.isFinishing()) {
            mc.p.f407064a.e("AuthingFragment", "activity is null or is finishing by create ErrorInfoDialog");
            pc.f.c(i17, str);
            return;
        }
        if (gVar.f399355w == null) {
            gVar.f399355w = new qc.b(activity);
        }
        gVar.f399356x = true;
        int i18 = ic.d.f371814k;
        ic.d dVar = ic.c.f371813a;
        dVar.f371818d = true;
        android.view.WindowManager windowManager = activity.getWindowManager();
        if (windowManager == null) {
            pc.f.c(i17, str);
            return;
        }
        qc.b bVar = gVar.f399355w;
        bVar.getClass();
        windowManager.getDefaultDisplay().getSize(new android.graphics.Point());
        android.view.Window window = bVar.getWindow();
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = dVar.f371823i;
        if (c2920x9dce3f52 == null || !c2920x9dce3f52.m21848x704df978()) {
            attributes.width = (int) (r8.x * 0.8f);
            attributes.height = (int) (r8.y * 0.4f);
        } else {
            attributes.height = (int) (r8.x * 0.32f);
            attributes.width = (int) (r8.y * 0.7f);
        }
        window.setAttributes(attributes);
        qc.b bVar2 = gVar.f399355w;
        bVar2.f442876e = i17;
        bVar2.f442877f = str;
        android.widget.TextView textView = bVar2.f442875d;
        if (textView != null) {
            textView.setText(str);
        }
        if (dVar.f371817c) {
            mc.p.f407064a.e("ErrorInfoDialog", "activity has exit, do not need show!");
        } else {
            bVar2.show();
        }
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39 c2936x4a02ed39 = gVar.f399347o;
        if (c2936x4a02ed39 != null) {
            c2936x4a02ed39.c(true);
        }
        mc.p.f407064a.e("AuthingFragment", "showErrorDialog error code:" + str + " msg: " + str);
    }
}

package sj3;

/* loaded from: classes14.dex */
public final class m0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f490161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f490162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f490163f;

    public m0(sj3.a1 a1Var, android.widget.ImageView imageView, android.widget.TextView textView) {
        this.f490161d = a1Var;
        this.f490162e = imageView;
        this.f490163f = textView;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        boolean Di = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Di(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Di().f554707o.a());
        sj3.a1 a1Var = this.f490161d;
        a1Var.G = Di;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "speakeron btn state: " + num + ", " + a1Var.G);
        a1Var.H.a();
        boolean z17 = a1Var.G;
        android.widget.TextView textView = this.f490163f;
        android.widget.ImageView imageView = this.f490162e;
        if (z17) {
            imageView.setActivated(true);
            imageView.setSelected(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Di().f554707o.getClass();
            java.lang.String str = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi().f304050b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "speakeron btn state: " + str);
            textView.setText(str);
            imageView.setContentDescription(str);
            return;
        }
        imageView.setActivated(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = a1Var.f489926d;
        if (num != null && num.intValue() == 1) {
            imageView.setSelected(true);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574126h30);
            imageView.setContentDescription(serviceConnectionC16581x3d1d6bd2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574126h30));
        } else {
            imageView.setSelected(false);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h2z);
            imageView.setContentDescription(serviceConnectionC16581x3d1d6bd2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h2z));
        }
    }
}

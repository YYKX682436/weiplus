package os3;

/* loaded from: classes8.dex */
public class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f429720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.s3 f429721e;

    public r3(os3.s3 s3Var, android.os.Bundle bundle) {
        this.f429721e = s3Var;
        this.f429720d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f429720d;
        int i17 = bundle.getInt("err_type");
        int i18 = bundle.getInt("err_type");
        java.lang.String string = bundle.getString("err_msg");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string);
        os3.s3 s3Var = this.f429721e;
        if (K0) {
            string = s3Var.f429730d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hkf);
        }
        if (i17 != 0 || i18 != 0) {
            dp.a.m125854x26a183b(s3Var.f429730d, string, 1).show();
            return;
        }
        s3Var.f429730d.f236471t.setEnabled(false);
        s3Var.f429730d.f236471t.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574294hs2);
        s3Var.f429730d.f236471t.setTextColor(-7829368);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = s3Var.f429730d;
        viewOnCreateContextMenuListenerC16941x4db497e1.f236471t.setCompoundDrawablesWithIntrinsicBounds(i65.a.i(viewOnCreateContextMenuListenerC16941x4db497e1, com.p314xaae8f345.mm.R.C30861xcebc809e.bms), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        s3Var.f429730d.V6();
    }
}

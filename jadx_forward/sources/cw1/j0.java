package cw1;

/* loaded from: classes3.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 f304547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f304548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f304549g;

    public j0(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8, int i17, int i18) {
        this.f304546d = textView;
        this.f304547e = activityC13107x4291ddb8;
        this.f304548f = i17;
        this.f304549g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f304546d.setText(this.f304547e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_y, java.lang.Integer.valueOf((this.f304548f * 100) / this.f304549g)));
    }
}

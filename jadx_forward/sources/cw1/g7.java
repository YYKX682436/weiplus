package cw1;

/* loaded from: classes3.dex */
public final class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f304489d = 5;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da f304490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304491f;

    public g7(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da activityC13123x212a66da, android.widget.TextView textView) {
        this.f304490e = activityC13123x212a66da;
        this.f304491f = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f304489d - 1;
        this.f304489d = i17;
        if (i17 <= 0) {
            this.f304490e.finish();
            return;
        }
        this.f304491f.setText(this.f304490e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7s, java.lang.Integer.valueOf(i17)));
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
        t0Var.getClass();
        t0Var.z(this, 1000L, false);
    }
}

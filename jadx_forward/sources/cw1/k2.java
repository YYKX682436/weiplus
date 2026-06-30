package cw1;

/* loaded from: classes.dex */
public final class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f304612d = 5;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f304613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304614f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304615g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d f304616h;

    public k2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var, android.widget.TextView textView, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d) {
        this.f304613e = j0Var;
        this.f304614f = textView;
        this.f304615g = str;
        this.f304616h = activityC13111x890e232d;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f304612d - 1;
        this.f304612d = i17;
        if (i17 <= 0) {
            this.f304613e.dismiss();
            return;
        }
        this.f304614f.setText(this.f304615g + '\n' + this.f304616h.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7s, java.lang.Integer.valueOf(this.f304612d)));
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
        t0Var.getClass();
        t0Var.z(this, 1000L, false);
    }
}

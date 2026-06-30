package e04;

/* loaded from: classes15.dex */
public class e0 implements bi4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f327423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e04.p f327424b;

    public e0(e04.p pVar, android.app.Activity activity) {
        this.f327424b = pVar;
        this.f327423a = activity;
    }

    @Override // bi4.l1
    /* renamed from: onFinishAction */
    public void mo10624xfbbb8828(int i17, java.lang.String str, pj4.r0 r0Var) {
        e04.p pVar = this.f327424b;
        if (i17 != 1) {
            pVar.e();
            pVar.t(true, null);
            return;
        }
        android.app.Activity activity = this.f327423a;
        if (activity != null && !activity.isFinishing()) {
            db5.e1.t(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2u), "", new e04.d0(this));
        }
        pVar.e();
    }
}

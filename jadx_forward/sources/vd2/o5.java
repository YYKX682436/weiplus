package vd2;

/* loaded from: classes3.dex */
public final class o5 implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd2.v5 f517377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f517378b;

    public o5(vd2.v5 v5Var, boolean z17) {
        this.f517377a = v5Var;
        this.f517378b = z17;
    }

    @Override // i50.n
    public void a(boolean z17) {
        vd2.v5 v5Var = this.f517377a;
        r45.q65 q65Var = (r45.q65) v5Var.f517492e.m75936x14adae67(10);
        boolean z18 = false;
        if (q65Var != null && q65Var.m75933x41a8a7f2(0)) {
            z18 = true;
        }
        if (this.f517378b) {
            android.app.Activity activity = v5Var.f517490c;
            db5.t7.m(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0o));
        } else {
            java.lang.String string = z18 ? v5Var.f517490c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0k) : v5Var.f517490c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0j);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            db5.t7.m(v5Var.f517490c, string);
        }
    }
}

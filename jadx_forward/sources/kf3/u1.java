package kf3;

/* loaded from: classes5.dex */
public class u1 implements t21.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 f388984a;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679) {
        this.f388984a = activityC16488xbf7e6679;
    }

    @Override // t21.k0
    public void a(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18) {
        if (i17 >= 0 || i17 == -50002) {
            s75.d.b(new kf3.t1(this, str, str3, i18), "MassSend_Remux");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388984a;
        dp.a.m125854x26a183b(activityC16488xbf7e6679, activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574978k75), 0).show();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16488xbf7e6679.f230082p;
        if (u3Var != null) {
            u3Var.dismiss();
            activityC16488xbf7e6679.f230082p = null;
        }
    }
}

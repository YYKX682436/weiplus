package hr3;

/* loaded from: classes11.dex */
public class w5 implements kv.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.m0 f365667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365669c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16851xecb309af f365670d;

    public w5(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16851xecb309af activityC16851xecb309af, com.p314xaae8f345.mm.p943x351df9c2.m0 m0Var, java.lang.String str, java.lang.String str2) {
        this.f365670d = activityC16851xecb309af;
        this.f365667a = m0Var;
        this.f365668b = str;
        this.f365669c = str2;
    }

    @Override // kv.g0
    public int a(int i17, int i18) {
        this.f365667a.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSocialInfoUI", "onSceneEnd: errType=%d, errCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16851xecb309af activityC16851xecb309af = this.f365670d;
        if (i17 == 0 && i18 == 0) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            android.graphics.Bitmap m17 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().m(this.f365668b);
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16851xecb309af.f235246s;
            if (activityC16851xecb309af.X6(this.f365669c, m17)) {
                dp.a.m125854x26a183b(activityC16851xecb309af.mo55332x76847179(), activityC16851xecb309af.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgt), 0).show();
                return 0;
            }
        }
        dp.a.m125854x26a183b(activityC16851xecb309af.mo55332x76847179(), activityC16851xecb309af.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgr), 0).show();
        return 0;
    }
}

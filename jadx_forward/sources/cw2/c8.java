package cw2;

/* loaded from: classes2.dex */
public final class c8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.f8 f305153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f305154e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(cw2.f8 f8Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(2);
        this.f305153d = f8Var;
        this.f305154e = activityC0065xcd7aa112;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("$");
        cw2.f8 f8Var = this.f305153d;
        sb6.append(f8Var.F0());
        sb6.append(" onFeedSelect ");
        sb6.append(f8Var.f305248z);
        sb6.append(" -> ");
        sb6.append(intValue);
        sb6.append(", ");
        sb6.append(booleanValue);
        sb6.append('.');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoCore", sb6.toString());
        if (f8Var.f305248z != intValue) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f305154e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type android.app.Activity");
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) pf5.z.f435481a.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class)).f216047p) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.f216037z = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "resumeFromClickFloatBallAndBack:false");
            }
        }
        if (!booleanValue) {
            f8Var.Z();
        }
        f8Var.f305248z = intValue;
        return jz5.f0.f384359a;
    }
}

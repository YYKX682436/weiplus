package vn2;

/* loaded from: classes.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f519918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f519919e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        super(1);
        this.f519918d = activity;
        this.f519919e = abstractC14490x69736cb5;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            android.app.Activity activity = this.f519918d;
            activity.finish();
            mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("feed_id", pm0.v.u(this.f519919e.mo2128x1ed62e84()));
            ((lf0.h0) g0Var).Vi(activity, 123, bundle);
        }
        return jz5.f0.f384359a;
    }
}

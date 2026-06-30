package id2;

/* loaded from: classes.dex */
public final class p4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f372274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f372275e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(android.app.Activity activity, yz5.l lVar) {
        super(1);
        this.f372274d = activity;
        this.f372275e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f372275e;
        if (booleanValue) {
            android.app.Activity activity = this.f372274d;
            db5.t7.h(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mao));
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        } else {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}

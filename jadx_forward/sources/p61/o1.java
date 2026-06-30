package p61;

/* loaded from: classes5.dex */
public class o1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504 f433865a;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504 activityC11362x5f9e5504) {
        this.f433865a = activityC11362x5f9e5504;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean a() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504 activityC11362x5f9e5504 = this.f433865a;
        sb6.append((java.lang.Object) activityC11362x5f9e5504.f154518e.getText());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb6.toString().trim())) {
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            activityC11362x5f9e5504.f154518e.setText("");
            return true;
        }
        activityC11362x5f9e5504.f154518e.setText((java.lang.CharSequence) null);
        android.widget.EditText editText = activityC11362x5f9e5504.f154518e;
        throw null;
    }

    /* renamed from: toString */
    public java.lang.String m157901x9616526c() {
        return super.toString() + "|initView";
    }
}

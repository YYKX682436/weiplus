package zw1;

/* loaded from: classes15.dex */
public class c6 extends ww1.z2 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558131f;

    public c6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3) {
        this.f558131f = activityC13149x63b02cb3;
    }

    @Override // ww1.z2
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558131f;
        this.f531910e = (android.widget.ImageView) activityC13149x63b02cb3.findViewById(com.p314xaae8f345.mm.R.id.c4h);
        activityC13149x63b02cb3.f177978q.setOnClickListener(new zw1.b6(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    /* renamed from: getPath */
    public java.lang.String mo54844xfb83cc9b() {
        return "facingreceiveremerchantapplydot";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        return this.f558131f.f177978q;
    }
}

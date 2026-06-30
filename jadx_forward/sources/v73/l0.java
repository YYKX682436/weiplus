package v73;

/* loaded from: classes8.dex */
public class l0 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.b f515241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa f515242b;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa, r73.b bVar) {
        this.f515242b = activityC16102xafeab7fa;
        this.f515241a = bVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r73.b bVar = this.f515241a;
        r45.a10 a10Var = bVar.f474697r;
        long j17 = a10Var.f451156g;
        long j18 = a10Var.f451155f;
        java.lang.String str2 = a10Var.f451157h;
        java.lang.String str3 = a10Var.f451158i;
        java.lang.String str4 = bVar.f474698s;
        java.lang.String str5 = a10Var.f451162p;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa.f223867u;
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa = this.f515242b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16102xafeab7fa.f223793d, "go to give card");
        android.content.Intent intent = new android.content.Intent(activityC16102xafeab7fa, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82.class);
        intent.putExtra("key_max_credit_line", j17);
        intent.putExtra("key_min_credit_line", j18);
        intent.putExtra("key_min_credit_line", j18);
        intent.putExtra("key_true_name", str2);
        intent.putExtra("key_take_message", str3);
        intent.putExtra("key_username", str4);
        intent.putExtra("key_over_max_limit_warning", str5);
        activityC16102xafeab7fa.startActivityForResult(intent, 2);
    }
}

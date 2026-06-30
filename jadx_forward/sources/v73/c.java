package v73;

/* loaded from: classes2.dex */
public class c implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.k f515209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16096xb79cc058 f515210b;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16096xb79cc058 activityC16096xb79cc058, r73.k kVar) {
        this.f515210b = activityC16096xb79cc058;
        this.f515209a = kVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.pg5 pg5Var = this.f515209a.f474709r;
        r45.an6 an6Var = pg5Var.f464566m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16096xb79cc058 activityC16096xb79cc058 = this.f515210b;
        activityC16096xb79cc058.f223801o = an6Var;
        activityC16096xb79cc058.f223795f.setImageDrawable(m95.a.e(activityC16096xb79cc058.getResources(), com.p314xaae8f345.mm.R.raw.f79480x9a77b0f3, 0.0f));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pg5Var.f464569p)) {
            activityC16096xb79cc058.f223795f.b(pg5Var.f464569p, 0, 0, com.p314xaae8f345.mm.R.raw.f79480x9a77b0f3);
        }
        activityC16096xb79cc058.f223798i.setText(pg5Var.f464567n);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.t0(activityC16096xb79cc058.f223799m, pg5Var.f464562f, 10);
        activityC16096xb79cc058.f223796g.setText(u73.h.a(pg5Var.f464563g));
        activityC16096xb79cc058.f223797h.setText(activityC16096xb79cc058.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fxa, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b() + u73.h.a(pg5Var.f464564h)));
        u73.h.h(activityC16096xb79cc058, pg5Var.f464565i, activityC16096xb79cc058.f223800n, 1, activityC16096xb79cc058.f223801o);
        android.view.View findViewById = activityC16096xb79cc058.findViewById(com.p314xaae8f345.mm.R.id.f566788h21);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardBackUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayCardDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardBackUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayCardDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

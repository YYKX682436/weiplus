package ai0;

/* loaded from: classes14.dex */
public final class d implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ai0.g f5050d;

    public d(ai0.g gVar) {
        this.f5050d = gVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportExpose ");
        ai0.g gVar = this.f5050d;
        java.lang.String str = gVar.f5059c;
        sb6.append(str);
        sb6.append(", ");
        int i17 = gVar.f5060d;
        sb6.append(i17);
        sb6.append(", ");
        java.lang.String str2 = gVar.f5061e;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.PrivacyAgreementDialog", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_name", str);
        hashMap.put("enter_type", java.lang.Integer.valueOf(i17));
        hashMap.put("enter_sessionid", str2);
        hashMap.put("view_id", "yuanbao_private_pop");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 34004);
    }
}

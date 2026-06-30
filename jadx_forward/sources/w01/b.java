package w01;

/* loaded from: classes9.dex */
public abstract class b {
    public static void a(android.app.Activity activity, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req, android.os.Bundle bundle, java.lang.String str) {
        int i17 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.B2;
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.class);
        int i18 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.B;
        intent.putExtra("Select_Conv_NextStep", new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.class).putExtras(bundle).putExtra("SendAppMessageWrapper_Scene", req.f33050x683188c));
        intent.putExtra("Select_App_Id", str);
        intent.putExtra("Select_Open_Id", req.f32865xc3c3c505);
        intent.putExtra("Select_Conv_Type", 3);
        if (req.f33049x38eb0007.m48467xfb85f7b0() == 36 || req.f33049x38eb0007.m48467xfb85f7b0() == 46) {
            intent.putExtra("mutil_select_is_ret", !((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb) req.f33049x38eb0007.f33122xe4128443).f33179x4d2e325);
        } else {
            intent.putExtra("mutil_select_is_ret", true);
        }
        if (req.f33049x38eb0007.m48467xfb85f7b0() == 45) {
            intent.putExtra("Select_Send_Card", true);
        }
        intent.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/modelbiz/ww/OpenSdkBridge", "dealSendMsgToWx", "(Landroid/app/Activity;Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;Landroid/os/Bundle;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/modelbiz/ww/OpenSdkBridge", "dealSendMsgToWx", "(Landroid/app/Activity;Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;Landroid/os/Bundle;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void b(android.app.Activity activity, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req) {
        android.os.Bundle bundle = new android.os.Bundle();
        req.mo48427x792022dd(bundle);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        intent.putExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8, "com.tencent.wework");
        intent.putExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a);
        intent.putExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32807x6382c059, "weixin://sendreq?appid=wx4706a9fcbbca10f2");
        intent.putExtra("SendAppMessageWrapper_BlockInvalidToken", false);
        intent.putExtra("SendAppMessageWrapper_NoNeedStayInWeixin", true);
        try {
            a(activity, req, intent.getExtras(), "com.tencent.wework");
            activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
        } catch (java.lang.Throwable unused) {
        }
    }
}

package o83;

/* loaded from: classes11.dex */
public class o extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public o() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6117x256d93f3 c6117x256d93f3 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6117x256d93f3) abstractC20979x809547d1;
        if (c6117x256d93f3 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6117x256d93f3) {
            android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16134x74658289.class);
            intent.setFlags(268435456);
            intent.putExtra("IPCallTalkUI_contactId", c6117x256d93f3.f136392g.f89200a);
            am.px pxVar = c6117x256d93f3.f136392g;
            intent.putExtra("IPCallTalkUI_countryCode", pxVar.f89201b);
            intent.putExtra("IPCallTalkUI_nickname", pxVar.f89203d);
            intent.putExtra("IPCallTalkUI_phoneNumber", pxVar.f89202c);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/model/listener/StartIPCallListener", "callback", "(Lcom/tencent/mm/autogen/events/StartIPCallEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/ipcall/model/listener/StartIPCallListener", "callback", "(Lcom/tencent/mm/autogen/events/StartIPCallEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return false;
    }
}

package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class a3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        super(false);
        this.f72567d = launchAAUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int i17 = com.tencent.mm.plugin.aa.ui.LaunchAAUI.S1;
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72567d;
        launchAAUI.getClass();
        android.content.Intent intent = new android.content.Intent(launchAAUI, (java.lang.Class<?>) com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI.class);
        intent.putExtra("chatroom", launchAAUI.f72507m);
        intent.putExtra("maxPerAmount", launchAAUI.W.b());
        intent.putExtra("enter_scene", launchAAUI.f72524y0);
        java.util.Map map = launchAAUI.R;
        if (map != null) {
            java.util.HashMap hashMap = (java.util.HashMap) map;
            if (hashMap.size() > 0) {
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                for (java.lang.String str : hashMap.keySet()) {
                    arrayList.add(str + "," + ((java.lang.Double) hashMap.get(str)).doubleValue());
                }
                intent.putStringArrayListExtra("oldAmountData", arrayList);
            }
        }
        if (launchAAUI.k7() && launchAAUI.f72525y1.f72417f != null) {
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            java.util.Iterator it = launchAAUI.f72525y1.f72417f.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AALaunchItemParcel) it.next()).f72406d);
            }
            intent.putStringArrayListExtra("third_party_usernamelist", arrayList2);
        }
        intent.putExtra("group_solitatire_flag", launchAAUI.D1);
        if (launchAAUI.t7()) {
            intent.putStringArrayListExtra("group_solitatire_username_list", launchAAUI.F1);
            intent.putStringArrayListExtra("group_solitatire_desc_list", launchAAUI.G1);
        }
        intent.putExtra("maxUserNumber", launchAAUI.W.a());
        launchAAUI.startActivityForResult(intent, com.tencent.mm.plugin.appbrand.jsapi.j6.CTRL_INDEX);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 3, 2);
    }
}

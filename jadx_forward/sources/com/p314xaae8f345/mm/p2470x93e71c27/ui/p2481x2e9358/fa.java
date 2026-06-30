package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes15.dex */
public class fa extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra f271854a;

    public fa(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar) {
        this.f271854a = raVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17;
        int i18;
        int i19 = message.what;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar = this.f271854a;
        switch (i19) {
            case 20001:
                raVar.d();
                return;
            case 20002:
                mo50303x856b99f0(20001);
                return;
            case 20003:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SuggestEmoticonBubble", "show: %s", java.lang.Boolean.valueOf(raVar.f272152j));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = raVar.f272168z;
                n3Var.mo50303x856b99f0(20001);
                if (raVar.f272152j) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.oa oaVar = raVar.f272155m;
                    java.util.ArrayList arrayList = raVar.f272154l;
                    java.util.LinkedList linkedList = oaVar.f272079d;
                    linkedList.clear();
                    linkedList.addAll(arrayList);
                    oaVar.m8146xced61ae5();
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = raVar.f272153k;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble", "show", "()V", "Undefined", "scrollToPosition", "(I)V");
                    c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(c1163xf1deaba4, "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble", "show", "()V", "Undefined", "scrollToPosition", "(I)V");
                    int size = arrayList.size() + raVar.f272162t;
                    if (size > 2) {
                        i17 = (int) (raVar.f272145c * 2.5f);
                        i18 = raVar.f272146d;
                    } else if (size == 2) {
                        i17 = raVar.f272145c * 2;
                        i18 = raVar.f272146d;
                    } else {
                        i17 = raVar.f272145c;
                        i18 = raVar.f272146d;
                    }
                    int i27 = i17 + (i18 * 2);
                    if (raVar.f272147e.isShowing()) {
                        raVar.f272147e.update(i27, -2);
                    } else {
                        raVar.f272147e.setWidth(i27);
                        android.view.View view = raVar.f272148f;
                        if (view != null) {
                            int[] iArr = new int[2];
                            view.getLocationInWindow(iArr);
                            raVar.f272147e.showAtLocation(raVar.f272148f, 0, iArr[0] - ((raVar.f272147e.getWidth() - raVar.f272148f.getWidth()) / 2), iArr[1] - raVar.f272147e.getHeight());
                        }
                    }
                    if (size >= 3) {
                        n3Var.mo50307xb9e94560(20001, 5000L);
                    } else {
                        n3Var.mo50307xb9e94560(20001, 3000L);
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    long j17 = 0;
                    for (int i28 = 0; i28 < arrayList.size(); i28++) {
                        jr.p pVar = (jr.p) arrayList.get(i28);
                        jr.o oVar = pVar.f382850b;
                        if (oVar.f382845a == 1) {
                            j17 = oVar.f382847c;
                        }
                        java.util.HashMap hashMap = new java.util.HashMap();
                        raVar.b(hashMap, pVar, i28);
                        sb6.append(new org.json.JSONObject(hashMap));
                        if (i28 != arrayList.size() - 1) {
                            sb6.append("#");
                        }
                    }
                    raVar.f272165w = sb6.toString().replace(",", ";");
                    raVar.f272163u.put("requestid", java.lang.Long.valueOf(j17));
                    java.util.HashMap c17 = raVar.c();
                    c17.put("issue_emo_num", java.lang.Integer.valueOf(arrayList.size()));
                    c17.put("issue_emo_info", raVar.f272165w);
                    raVar.e("chat_emo_bubble", "view_exp", c17);
                    raVar.f(arrayList, raVar.f272158p);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6948x597c7cb1 c6948x597c7cb1 = raVar.f272157o;
                    c6948x597c7cb1.f142531d = 0L;
                    c6948x597c7cb1.k();
                    raVar.f272158p = arrayList.size();
                    return;
                }
                return;
            default:
                return;
        }
    }
}

package hb5;

/* loaded from: classes11.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21588xa00d55fe f361753d;

    public l0(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21588xa00d55fe activityC21588xa00d55fe) {
        this.f361753d = activityC21588xa00d55fe;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/bizchat/BizChatSelectConversationUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21588xa00d55fe.H;
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21588xa00d55fe activityC21588xa00d55fe = this.f361753d;
        activityC21588xa00d55fe.getClass();
        s01.a0 y07 = r01.q3.Vi().y0(r01.q3.Vi().z0(activityC21588xa00d55fe.C));
        activityC21588xa00d55fe.F = y07;
        if (y07 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f65834x53f3fff9)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            s01.a0 a0Var = activityC21588xa00d55fe.F;
            objArr[0] = a0Var != null ? a0Var.f65834x53f3fff9 : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatSelectConversationUI", "field_addMemberUrl:%s", objArr);
            dp.a.m125854x26a183b(activityC21588xa00d55fe, activityC21588xa00d55fe.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572290ao1), 0).show();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", activityC21588xa00d55fe.F.f65834x53f3fff9);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatSelectConversationUI", "KRawUrl :%s", activityC21588xa00d55fe.F.f65834x53f3fff9);
            intent.putExtra("useJs", true);
            j45.l.n(activityC21588xa00d55fe.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, 1);
        }
        yj0.a.h(this, "com/tencent/mm/ui/bizchat/BizChatSelectConversationUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

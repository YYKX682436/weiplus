package f20;

/* loaded from: classes9.dex */
public final class b extends f20.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String name) {
        super(name);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
    }

    @Override // f20.a
    public void a(pq.a context, org.json.JSONObject actionData, bw5.x7 jumpInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionData, "actionData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        if (actionData.isNull(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.WxaRouter.NextAction.ShowToast", "text is null");
            return;
        }
        java.lang.String string = actionData.getString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
        if (string == null || string.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.WxaRouter.NextAction.ShowToast", "text is isEmpty");
            return;
        }
        android.content.Context c17 = context.c();
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.WxaRouter.NextAction.ShowToast", "context.context is null");
            return;
        }
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(c17);
        e4Var.f293309c = string;
        e4Var.c();
    }
}

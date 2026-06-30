package com.tencent.mm.app.plugin;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/app/plugin/PocketMoneyUriSpanHandler;", "Lcom/tencent/mm/app/plugin/URISpanHandlerSet$BaseUriSpanHandler;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PocketMoneyUriSpanHandler extends com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler {
    @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
    public int[] b() {
        return new int[]{73};
    }

    @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
    public r35.m3 c(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.String obj = r26.n0.u0(url).toString();
        if (!r26.i0.A(obj, "native://wcpay/pocketmoney", false, 2, null)) {
            obj = null;
        }
        if (obj != null) {
            return new r35.m3(obj, 73, null);
        }
        return null;
    }

    @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
    public boolean d(android.view.View view, r35.m3 hrefInfo, com.tencent.mm.pluginsdk.ui.span.z zVar) {
        kotlin.jvm.internal.o.g(hrefInfo, "hrefInfo");
        if ((hrefInfo.f369195d == 73 ? hrefInfo : null) == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("PocketMoneyUriSpanHandler", "handle TYPE_POCKET_MONEY_MANAGER");
        java.lang.String queryParameter = android.net.Uri.parse(hrefInfo.e()).getQueryParameter("paymsgid");
        if (queryParameter != null) {
            if (!(queryParameter.length() == 0)) {
                ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
                dq3.a aVar = new dq3.a();
                aVar.field_payMsgId = queryParameter;
                i95.m c17 = i95.n0.c(bq3.l.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((bq3.l) c17).f23581d.get(aVar, new java.lang.String[0]);
                long j17 = aVar.field_msgId;
                com.tencent.mars.xlog.Log.i("PocketMoneyUriSpanHandler", "%s,find msg: %s", hrefInfo.e(), java.lang.Long.valueOf(j17));
                if (j17 > 0) {
                    pt0.e0 e0Var = pt0.f0.f358209b1;
                    com.tencent.mm.storage.f9 f9Var = hrefInfo.f369206o;
                    com.tencent.mm.storage.f9 n17 = e0Var.n(f9Var != null ? f9Var.Q0() : null, j17);
                    if (n17.getMsgId() <= 0) {
                        com.tencent.mars.xlog.Log.i("PocketMoneyUriSpanHandler", "cannot find msg in msg storage!");
                        g().q(false);
                    } else {
                        com.tencent.mm.autogen.events.ScrollChattingUIConversationListEvent scrollChattingUIConversationListEvent = new com.tencent.mm.autogen.events.ScrollChattingUIConversationListEvent();
                        am.gt gtVar = scrollChattingUIConversationListEvent.f54743g;
                        gtVar.f6789b = j17;
                        gtVar.f6788a = n17.Q0();
                        scrollChattingUIConversationListEvent.e();
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("PocketMoneyUriSpanHandler", "handle MSpanConstants.Type.TYPE_POCKET_MONEY_MANAGER, cannot find local msg");
                    g().q(false);
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler
    public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
        return false;
    }

    public final com.tencent.mm.ui.widget.dialog.u1 g() {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.i0_));
        u1Var.k(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479308vo));
        u1Var.m(com.tencent.mm.R.string.f492294fz1);
        u1Var.l(com.tencent.mm.app.plugin.l.f53667a);
        return u1Var;
    }
}

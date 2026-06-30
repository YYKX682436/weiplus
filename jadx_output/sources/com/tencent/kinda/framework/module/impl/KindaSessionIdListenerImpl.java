package com.tencent.kinda.framework.module.impl;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/tencent/kinda/framework/module/impl/KindaSessionIdListenerImpl;", "Lcom/tencent/kinda/gen/KindaSessionIdListener;", "", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "Ljz5/f0;", "onSessionId", "Lh45/n;", "callback", "Lh45/n;", "getCallback", "()Lh45/n;", "setCallback", "(Lh45/n;)V", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class KindaSessionIdListenerImpl implements com.tencent.kinda.gen.KindaSessionIdListener {
    private h45.n callback;

    public final h45.n getCallback() {
        return this.callback;
    }

    @Override // com.tencent.kinda.gen.KindaSessionIdListener
    public void onSessionId(java.lang.String str) {
        h45.n nVar = this.callback;
        if (nVar != null) {
            if (str == null) {
                str = "";
            }
            nVar.onSessionId(str);
        }
    }

    public final void setCallback(h45.n nVar) {
        this.callback = nVar;
    }
}

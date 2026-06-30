package com.tencent.mm.plugin.base.model;

/* loaded from: classes.dex */
public class ShortcutBroadCastReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShortcutBroadCastReceiver", "shortcut receiver intent is null");
        } else {
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490006i8));
        }
    }
}

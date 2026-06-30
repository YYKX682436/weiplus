package com.tencent.mm.modelvoice;

/* loaded from: classes.dex */
public class RemoteController$RemoteControlReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || "android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
            return;
        }
        intent.getAction();
    }
}

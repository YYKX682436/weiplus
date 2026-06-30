package com.tencent.mm.emoji.sync;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/emoji/sync/EmojiSyncManager$ConnectivityReceiver", "Landroid/content/BroadcastReceiver;", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class EmojiSyncManager$ConnectivityReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
            throw null;
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
            throw null;
        }
        throw null;
    }
}

package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
public abstract class DataHolderNotifier<L> implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<L> {
    private final com.google.android.gms.common.data.DataHolder zaa;

    public DataHolderNotifier(com.google.android.gms.common.data.DataHolder dataHolder) {
        this.zaa = dataHolder;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void notifyListener(L l17) {
        notifyListener(l17, this.zaa);
    }

    public abstract void notifyListener(L l17, com.google.android.gms.common.data.DataHolder dataHolder);

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public void onNotifyListenerFailed() {
        com.google.android.gms.common.data.DataHolder dataHolder = this.zaa;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* loaded from: classes14.dex */
public class p implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176 f159960d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176 abstractC11885x29239176) {
        this.f159960d = abstractC11885x29239176;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176 abstractC11885x29239176 = this.f159960d;
        if (i17 != (abstractC11885x29239176.hashCode() & 65535) || intent == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176 abstractC11885x292391762 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176) intent.getParcelableExtra("task_object");
        java.lang.String stringExtra = intent.getStringExtra("task_id");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176.f159895g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176 abstractC11885x292391763 = (concurrentHashMap.containsKey(stringExtra) && ((java.lang.ref.WeakReference) concurrentHashMap.get(stringExtra)).get() != null) ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176) ((java.lang.ref.WeakReference) concurrentHashMap.get(stringExtra)).get() : null;
        if (abstractC11885x292391763 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProxyTransparentUIProcessTask", "task is null");
            return;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        abstractC11885x292391762.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        abstractC11885x292391763.b(obtain);
        obtain.recycle();
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176.f159896h).remove(abstractC11885x292391763);
        abstractC11885x292391763.c();
        abstractC11885x29239176.f159897d = null;
    }
}

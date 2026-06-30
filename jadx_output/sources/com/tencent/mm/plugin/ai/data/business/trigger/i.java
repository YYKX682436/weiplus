package com.tencent.mm.plugin.ai.data.business.trigger;

@j95.b
/* loaded from: classes8.dex */
public class i extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f74670d = new java.util.HashSet();

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TriggerManager", "TriggerManager onAccountInitialized");
        java.util.Iterator it = this.f74670d.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.ai.data.business.trigger.h) it.next()).a();
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TriggerManager", "TriggerManager onAccountReleased");
        java.util.Iterator it = this.f74670d.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.ai.data.business.trigger.h) it.next()).b();
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TriggerManager", "TriggerManager oncreate");
        java.util.HashSet hashSet = this.f74670d;
        hashSet.add(new com.tencent.mm.plugin.ai.data.business.trigger.g());
        hashSet.add(new com.tencent.mm.plugin.ai.data.business.trigger.e());
    }
}

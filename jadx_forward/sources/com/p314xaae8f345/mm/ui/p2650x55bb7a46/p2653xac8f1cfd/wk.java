package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.y1.class)
/* loaded from: classes9.dex */
public final class wk extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.y1 {

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f281714e = new android.util.SparseArray();

    @Override // yn.d
    public void Z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceNotifyExposeReportComponent", "onFinish");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        android.util.SparseArray sparseArray = this.f281714e;
        int i17 = 0;
        while (true) {
            if (!(i17 < sparseArray.size())) {
                return;
            }
            int i18 = i17 + 1;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vk vkVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vk) sparseArray.valueAt(i17);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(vkVar.f281666a);
            java.util.Set set = vkVar.f281667b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceNotifyExposeReportComponent", "clear reportId %d, exposedMsgs: %d", valueOf, java.lang.Integer.valueOf(set.size()));
            set.clear();
            i17 = i18;
        }
    }

    public boolean m0(long j17, int i17) {
        android.util.SparseArray sparseArray = this.f281714e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vk vkVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vk) sparseArray.get(i17);
        if (vkVar == null) {
            vkVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vk(i17);
            sparseArray.put(i17, vkVar);
        }
        return vkVar.f281667b.contains(java.lang.Long.valueOf(j17));
    }

    public void n0(long j17, int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vk vkVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vk) this.f281714e.get(i17);
        if (vkVar != null) {
            vkVar.f281667b.add(java.lang.Long.valueOf(j17));
        }
    }
}

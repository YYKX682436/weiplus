package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class x0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.z0 f99100d;

    public x0(com.tencent.mm.plugin.exdevice.model.z0 z0Var) {
        this.f99100d = z0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.exdevice.model.z0 z0Var = this.f99100d;
        int size = ((java.util.LinkedList) z0Var.f99134w).size();
        for (int i17 = 0; i17 < size; i17++) {
            if (((v32.b) ((java.util.LinkedList) z0Var.f99134w).get(i17)).H.contains("internet_to_device") && ((v32.b) ((java.util.LinkedList) z0Var.f99134w).get(i17)).H.contains("wechat_to_device")) {
                if (!((java.util.ArrayList) z0Var.f99135x).contains(((java.util.LinkedList) z0Var.f99134w).get(i17))) {
                    ((java.util.ArrayList) z0Var.f99135x).add((v32.b) ((java.util.LinkedList) z0Var.f99134w).get(i17));
                    com.tencent.mm.plugin.exdevice.model.z0.a(z0Var, z0Var.f99135x);
                }
            }
        }
        return true;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class x0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 f180633d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 z0Var) {
        this.f180633d = z0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 z0Var = this.f180633d;
        int size = ((java.util.LinkedList) z0Var.f180667w).size();
        for (int i17 = 0; i17 < size; i17++) {
            if (((v32.b) ((java.util.LinkedList) z0Var.f180667w).get(i17)).H.contains("internet_to_device") && ((v32.b) ((java.util.LinkedList) z0Var.f180667w).get(i17)).H.contains("wechat_to_device")) {
                if (!((java.util.ArrayList) z0Var.f180668x).contains(((java.util.LinkedList) z0Var.f180667w).get(i17))) {
                    ((java.util.ArrayList) z0Var.f180668x).add((v32.b) ((java.util.LinkedList) z0Var.f180667w).get(i17));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0.a(z0Var, z0Var.f180668x);
                }
            }
        }
        return true;
    }
}

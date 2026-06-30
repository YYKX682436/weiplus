package j93;

/* loaded from: classes11.dex */
public final class b implements vg3.o4 {
    @Override // vg3.o4
    public void M(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
    }

    @Override // vg3.o4
    public void b0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
    }

    @Override // vg3.o4
    public void m1(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, r45.xb0 xb0Var) {
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "del contact, talker: " + d17);
        if (d17 != null) {
            java.util.Set stringSet = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_Name_ShowOuterRecommendLabels").getStringSet("MMKV_Key_ShowOuterRecommendLabels", new java.util.HashSet());
            if (stringSet == null) {
                stringSet = new java.util.HashSet();
            }
            if (stringSet.contains(d17)) {
                stringSet.remove(d17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_Name_ShowOuterRecommendLabels").putStringSet("MMKV_Key_ShowOuterRecommendLabels", stringSet);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "remove from black list ".concat(d17));
            }
        }
    }
}

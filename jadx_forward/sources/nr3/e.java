package nr3;

/* loaded from: classes10.dex */
public final class e implements vg3.s4 {
    @Override // vg3.o3
    public void f(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
    }

    @Override // vg3.o3
    public void i(java.lang.String str, java.lang.String str2) {
        if (str == null && str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessImageDescriptionExtension", "both username and encryptUsername is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2 n2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.f235073a;
        java.util.ArrayList arrayList = new java.util.ArrayList(n2Var.e(str));
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new java.util.ArrayList(n2Var.e(str2));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessImageDescriptionExtension", "assemble() user: %s, encryptUser: %s, remarkImagePathList: %s", str, str2, com.p314xaae8f345.mm.p670x38b72420.b.b(arrayList));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5613x3e5f0e04 c5613x3e5f0e04 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5613x3e5f0e04();
        am.gg ggVar = c5613x3e5f0e04.f135938g;
        ggVar.f88293a = str;
        ggVar.f88294b = com.p314xaae8f345.mm.p670x38b72420.b.b(arrayList);
        c5613x3e5f0e04.e();
    }

    @Override // vg3.o3
    public void q(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
    }

    @Override // vg3.o3
    public void t(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
    }
}

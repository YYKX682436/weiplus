package e04;

/* loaded from: classes7.dex */
public final class x2 extends ea5.l {
    public final java.lang.String b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        com.p314xaae8f345.mm.udr.e0 e0Var = (com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = e0Var != null ? ((com.p314xaae8f345.mm.udr.a1) e0Var).Ui("ilinkres_0753d60a", str) : null;
        if (Ui == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanUdrResourceFeatureService", "udr resouce for " + str + " null");
        } else {
            if (com.p314xaae8f345.mm.vfs.w6.j(Ui.m117639xfb83cc9b())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanUdrResourceFeatureService", "udr resouce for " + str + ", path exsit: " + Ui.m117639xfb83cc9b());
                return Ui.m117639xfb83cc9b();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanUdrResourceFeatureService", "udr resouce for " + str + ", path not exsit: " + Ui.m117639xfb83cc9b());
        }
        return null;
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getParameter */
    public java.util.ArrayList mo14972x73ec24f3() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v vVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v();
        vVar.d("OverseaUser");
        vVar.e(4);
        arrayList.add(vVar);
        boolean a07 = c01.e2.a0();
        boolean[] zArr = vVar.f299117m;
        if (a07) {
            vVar.f299116i = "1";
            zArr[6] = true;
        } else {
            vVar.f299116i = "0";
            zArr[6] = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanUdrResourceFeatureService", "udr paramater OverseaUser: " + vVar + ".paramString");
        return arrayList;
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_0753d60a";
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class dd implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd f191475a;

    public dd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar) {
        this.f191475a = kdVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("KEY_PARAMS_CHOOSE_WHITE_LIST") : null;
        java.util.List<byte[]> list = serializableExtra instanceof java.util.List ? (java.util.List) serializableExtra : null;
        if (list != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (byte[] bArr : list) {
                r45.il1 il1Var = new r45.il1();
                il1Var.mo11468x92b714fd(bArr);
                linkedList.add(il1Var);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisibilityModeConfigPanel", "select file list result: " + kz5.n0.g0(linkedList, "|", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.cd.f191284d, 30, null) + " resultCode: " + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar = this.f191475a;
            java.util.LinkedList m75941xfb821914 = kdVar.L1.m75941xfb821914(3);
            if (m75941xfb821914 != null) {
                m75941xfb821914.clear();
            }
            java.util.LinkedList m75941xfb8219142 = kdVar.L1.m75941xfb821914(3);
            if (m75941xfb8219142 != null) {
                m75941xfb8219142.addAll(linkedList);
            }
            kdVar.g0();
        }
    }
}

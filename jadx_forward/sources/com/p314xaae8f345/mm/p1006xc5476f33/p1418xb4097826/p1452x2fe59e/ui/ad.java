package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class ad implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd f191205a;

    public ad(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar) {
        this.f191205a = kdVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        if (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("label_id")) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisibilityModeConfigPanel", "select labels result: " + kz5.n0.g0(stringArrayListExtra, "|", null, null, 0, null, null, 62, null) + " resultCode: " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar = this.f191205a;
        java.util.LinkedList m75941xfb821914 = kdVar.L1.m75941xfb821914(4);
        if (m75941xfb821914 != null) {
            m75941xfb821914.clear();
        }
        java.util.LinkedList m75941xfb8219142 = kdVar.L1.m75941xfb821914(4);
        if (m75941xfb8219142 != null) {
            m75941xfb8219142.addAll(stringArrayListExtra);
        }
        kdVar.g0();
    }
}

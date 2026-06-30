package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class dd implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.kd f109942a;

    public dd(com.tencent.mm.plugin.finder.feed.ui.kd kdVar) {
        this.f109942a = kdVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("KEY_PARAMS_CHOOSE_WHITE_LIST") : null;
        java.util.List<byte[]> list = serializableExtra instanceof java.util.List ? (java.util.List) serializableExtra : null;
        if (list != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (byte[] bArr : list) {
                r45.il1 il1Var = new r45.il1();
                il1Var.parseFrom(bArr);
                linkedList.add(il1Var);
            }
            com.tencent.mars.xlog.Log.i("FinderLiveVisibilityModeConfigPanel", "select file list result: " + kz5.n0.g0(linkedList, "|", null, null, 0, null, com.tencent.mm.plugin.finder.feed.ui.cd.f109751d, 30, null) + " resultCode: " + i17);
            com.tencent.mm.plugin.finder.feed.ui.kd kdVar = this.f109942a;
            java.util.LinkedList list2 = kdVar.L1.getList(3);
            if (list2 != null) {
                list2.clear();
            }
            java.util.LinkedList list3 = kdVar.L1.getList(3);
            if (list3 != null) {
                list3.addAll(linkedList);
            }
            kdVar.g0();
        }
    }
}

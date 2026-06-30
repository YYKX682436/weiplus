package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class yc implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.kd f110765a;

    public yc(com.tencent.mm.plugin.finder.feed.ui.kd kdVar) {
        this.f110765a = kdVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        byte[] byteArrayExtra;
        if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_WHITE_LIST")) == null) {
            return;
        }
        r45.re2 re2Var = new r45.re2();
        re2Var.parseFrom(byteArrayExtra);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select room result: ");
        java.util.LinkedList list = re2Var.getList(2);
        kotlin.jvm.internal.o.f(list, "getContact_list(...)");
        sb6.append(kz5.n0.g0(list, "|", null, null, 0, null, null, 62, null));
        sb6.append(" resultCode: ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("FinderLiveVisibilityModeConfigPanel", sb6.toString());
        com.tencent.mm.plugin.finder.feed.ui.kd kdVar = this.f110765a;
        java.util.LinkedList list2 = kdVar.L1.getList(2);
        if (list2 != null) {
            list2.clear();
        }
        r45.re2 re2Var2 = kdVar.L1;
        java.util.LinkedList list3 = re2Var2.getList(2);
        if (list3 != null) {
            list3.addAll(re2Var.getList(2));
        }
        java.util.LinkedList list4 = re2Var2.getList(1);
        if (list4 != null) {
            list4.clear();
        }
        java.util.LinkedList list5 = re2Var2.getList(1);
        if (list5 != null) {
            list5.addAll(re2Var.getList(1));
        }
        java.util.LinkedList list6 = re2Var2.getList(0);
        if (list6 != null) {
            list6.clear();
        }
        java.util.LinkedList list7 = re2Var2.getList(0);
        if (list7 != null) {
            list7.addAll(re2Var.getList(0));
        }
        kdVar.g0();
    }
}

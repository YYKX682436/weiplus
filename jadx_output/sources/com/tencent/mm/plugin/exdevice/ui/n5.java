package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f99589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI f99590e;

    public n5(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI exdeviceRankDataSourceUI, java.util.List list) {
        this.f99590e = exdeviceRankDataSourceUI;
        this.f99589d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI exdeviceRankDataSourceUI = this.f99590e;
        java.util.LinkedList linkedList = (java.util.LinkedList) exdeviceRankDataSourceUI.f99331e.f99631d;
        linkedList.clear();
        java.util.List<r45.rw6> list = this.f99589d;
        if (list != null && list.size() != 0) {
            for (r45.rw6 rw6Var : list) {
                if (rw6Var != null) {
                    int i17 = com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI.f99329f;
                    com.tencent.mm.plugin.exdevice.ui.o5 o5Var = new com.tencent.mm.plugin.exdevice.ui.o5(null);
                    o5Var.f99608b = null;
                    o5Var.f99607a = rw6Var;
                    linkedList.add(o5Var);
                }
            }
        }
        exdeviceRankDataSourceUI.f99331e.notifyDataSetChanged();
    }
}

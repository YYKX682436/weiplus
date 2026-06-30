package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes12.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public int f97599a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f97600b;

    /* renamed from: c, reason: collision with root package name */
    public r45.hj0 f97601c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f97602d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f97603e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f97604f;

    public void a() {
        java.util.List list = this.f97604f;
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f97604f);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            this.f97600b.add(0, new j12.i((r45.kj0) arrayList.get(size)));
            this.f97599a++;
            ((java.util.LinkedList) this.f97604f).remove(arrayList.get(size));
        }
    }

    public void b(java.util.List list, int i17) {
        j12.i iVar;
        r45.zj0 zj0Var;
        if (i17 == 1 || i17 == -1) {
            this.f97600b = list;
            return;
        }
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmotionListModel", "unknow status.");
            return;
        }
        java.util.List list2 = this.f97600b;
        if (list2 == null) {
            this.f97600b = new java.util.ArrayList();
        } else {
            int size = list2.size() - 1;
            if (size >= 0 && size < this.f97600b.size() && (iVar = (j12.i) this.f97600b.get(size)) != null && (zj0Var = iVar.f297167b) != null && !com.tencent.mm.sdk.platformtools.t8.K0(zj0Var.f392128d) && iVar.f297167b.f392128d.equals("17")) {
                this.f97600b.remove(iVar);
            }
        }
        this.f97600b.addAll(list);
    }
}

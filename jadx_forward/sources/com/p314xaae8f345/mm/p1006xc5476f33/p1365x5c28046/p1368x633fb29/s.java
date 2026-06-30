package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* loaded from: classes12.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public int f179132a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f179133b;

    /* renamed from: c, reason: collision with root package name */
    public r45.hj0 f179134c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f179135d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f179136e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f179137f;

    public void a() {
        java.util.List list = this.f179137f;
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f179137f);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            this.f179133b.add(0, new j12.i((r45.kj0) arrayList.get(size)));
            this.f179132a++;
            ((java.util.LinkedList) this.f179137f).remove(arrayList.get(size));
        }
    }

    public void b(java.util.List list, int i17) {
        j12.i iVar;
        r45.zj0 zj0Var;
        if (i17 == 1 || i17 == -1) {
            this.f179133b = list;
            return;
        }
        if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmotionListModel", "unknow status.");
            return;
        }
        java.util.List list2 = this.f179133b;
        if (list2 == null) {
            this.f179133b = new java.util.ArrayList();
        } else {
            int size = list2.size() - 1;
            if (size >= 0 && size < this.f179133b.size() && (iVar = (j12.i) this.f179133b.get(size)) != null && (zj0Var = iVar.f378700b) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zj0Var.f473661d) && iVar.f378700b.f473661d.equals("17")) {
                this.f179133b.remove(iVar);
            }
        }
        this.f179133b.addAll(list);
    }
}

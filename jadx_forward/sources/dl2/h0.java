package dl2;

/* loaded from: classes3.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14279xd5b5745d f316757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f316758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dl2.i0 f316759f;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14279xd5b5745d c14279xd5b5745d, int i17, dl2.i0 i0Var) {
        this.f316757d = c14279xd5b5745d;
        this.f316758e = i17;
        this.f316759f = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftTagView$adapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14279xd5b5745d c14279xd5b5745d = this.f316757d;
        int i17 = this.f316758e;
        c14279xd5b5745d.m57100xca767a(i17);
        this.f316759f.m8146xced61ae5();
        if (i17 == 0) {
            yz5.l lVar = c14279xd5b5745d.f196293n;
            if (lVar != null) {
                lVar.mo146xb9724478(0);
            }
        } else if (i17 > 0) {
            java.util.List list = c14279xd5b5745d.f196290h;
            int intValue = list != null ? ((java.lang.Number) list.get(i17 - 1)).intValue() : 0;
            yz5.l lVar2 = c14279xd5b5745d.f196293n;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Integer.valueOf(intValue));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftTagView$adapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

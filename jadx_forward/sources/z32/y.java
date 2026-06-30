package z32;

/* loaded from: classes12.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f551487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z32.a0 f551488e;

    public y(r45.ed6 ed6Var, z32.a0 a0Var) {
        this.f551487d = ed6Var;
        this.f551488e = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportRankUIC$handleRankRecordView$1$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6 f6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class);
        r45.ed6 ed6Var = this.f551487d;
        ((k91.g4) f6Var).Ni(ed6Var.f454860d, new z32.x(this.f551488e, ed6Var));
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportRankUIC$handleRankRecordView$1$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

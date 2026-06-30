package eg4;

/* loaded from: classes11.dex */
public class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.s1 f334276d;

    public j1(eg4.t1 t1Var, eg4.s1 s1Var) {
        this.f334276d = s1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        eg4.s1 s1Var = this.f334276d;
        s1Var.f334333i.setSingleLine(false);
        s1Var.f334334j.setVisibility(8);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6788xdc40e792 c6788xdc40e792 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6788xdc40e792();
        c6788xdc40e792.f141207d = s1Var.f334336l.getVisibility() == 0 ? 1L : 2L;
        int[] iArr = s1Var.f334339o;
        c6788xdc40e792.f141208e = iArr[0];
        c6788xdc40e792.f141209f = iArr[1];
        c6788xdc40e792.f141210g = iArr[2];
        c6788xdc40e792.f141211h = 5L;
        c6788xdc40e792.f141212i = c6788xdc40e792.b(dm.i4.f66875xa013b0d5, s1Var.f334340p, true);
        c6788xdc40e792.k();
        c6788xdc40e792.o();
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package uf5;

/* loaded from: classes4.dex */
public class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d f508837d;

    public u0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d abstractActivityC22347xd7e8b37d) {
        this.f508837d = abstractActivityC22347xd7e8b37d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d.E;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d abstractActivityC22347xd7e8b37d = this.f508837d;
        abstractActivityC22347xd7e8b37d.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) abstractActivityC22347xd7e8b37d, 1, true);
        k0Var.f293405n = new uf5.i0(abstractActivityC22347xd7e8b37d);
        k0Var.r(abstractActivityC22347xd7e8b37d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hlc), 17, i65.a.b(abstractActivityC22347xd7e8b37d, 14), null);
        k0Var.f293414s = new uf5.j0(abstractActivityC22347xd7e8b37d);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

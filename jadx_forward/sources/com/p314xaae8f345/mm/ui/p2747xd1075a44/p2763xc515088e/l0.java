package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes9.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f293821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f293822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n0 f293823f;

    public l0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n0 n0Var, int i17, db5.h4 h4Var) {
        this.f293823f = n0Var;
        this.f293821d = i17;
        this.f293822e = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/picker/MultiPicker$ListViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n0 n0Var = this.f293823f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.p0 p0Var = n0Var.f293832g;
        db5.t4 t4Var = p0Var.f293852k;
        int i17 = this.f293821d;
        if (t4Var != null) {
            t4Var.mo888x34063ac(p0Var.f293853l.getItem(i17), i17);
        }
        if (this.f293822e.f309908s) {
            yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MultiPicker$ListViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (((java.lang.Boolean) n0Var.f293830e.get(java.lang.Integer.valueOf(i17))).booleanValue()) {
            n0Var.f293830e.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.FALSE);
        } else {
            n0Var.f293830e.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
        }
        n0Var.f293830e = n0Var.f293830e;
        n0Var.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MultiPicker$ListViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

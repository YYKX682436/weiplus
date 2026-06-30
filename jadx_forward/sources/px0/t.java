package px0;

/* loaded from: classes5.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc f440342d;

    public t(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc) {
        this.f440342d = c10988x551cb0cc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/fragment/MaterialImportPreviewFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc = this.f440342d;
        if (c10988x551cb0cc.f151188s.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaterialImportPreviewFragment", "onRemindClick return for " + c10988x551cb0cc.f151188s);
            yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/fragment/MaterialImportPreviewFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(c10988x551cb0cc.m7550xf0c4608a(), 1, true);
        k0Var.q(i65.a.r(c10988x551cb0cc.m7550xf0c4608a(), com.p314xaae8f345.mm.R.C30867xcad56011.f574665oi2), 17);
        k0Var.f293405n = px0.f.f440307d;
        k0Var.f293414s = new px0.g(k0Var, c10988x551cb0cc);
        k0Var.f293393g = new px0.h(c10988x551cb0cc);
        c10988x551cb0cc.f151191v = k0Var;
        k0Var.v();
        c10988x551cb0cc.m0("aigc_reminder_complete_half_screen", false, "", 0);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/fragment/MaterialImportPreviewFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

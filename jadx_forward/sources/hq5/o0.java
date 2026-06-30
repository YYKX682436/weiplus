package hq5;

/* loaded from: classes5.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.t0 f364787d;

    public o0(hq5.t0 t0Var) {
        this.f364787d = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/uic/ui/WeDropSelectFileUIC$onStateChange$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hq5.t0 t0Var = this.f364787d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t0Var.f364804d, "click selectFile");
        t0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(t0Var.m80379x76847179(), "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI");
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
        intent.putExtra("file_max_size", t0Var.f364808h);
        if (t0Var.m80379x76847179() instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            intent.putExtra("is_use_vas", true);
            lk5.s.e(intent, true);
            android.app.Activity m80379x76847179 = t0Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            ((com.p314xaae8f345.mm.ui.bd) ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) m80379x76847179).m78751x5dc77fb5(intent)).f279410a = new hq5.p0(t0Var);
        } else {
            android.app.Activity m80379x768471792 = t0Var.m80379x76847179();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(t0Var.f364806f));
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.k(m80379x768471792, arrayList2.toArray(), "com/tencent/mm/wedrop/ui/uic/ui/WeDropSelectFileUIC", "selectFile", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropSelectFileUIC$onStateChange$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

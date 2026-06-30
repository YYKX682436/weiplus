package cw1;

/* loaded from: classes.dex */
public final class h3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13114x1e1a279a f304495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f304496e;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13114x1e1a279a activityC13114x1e1a279a, boolean z17) {
        this.f304495d = activityC13114x1e1a279a;
        this.f304496e = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13114x1e1a279a activityC13114x1e1a279a = this.f304495d;
        android.content.Intent putExtra = new android.content.Intent(activityC13114x1e1a279a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.class).putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1).putExtra("clean_ui_scene", activityC13114x1e1a279a.f177255d).putExtra("withOrigin", this.f304496e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
        lk5.s.e(putExtra, true);
        activityC13114x1e1a279a.startActivityForResult(putExtra, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

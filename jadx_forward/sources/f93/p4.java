package f93;

/* loaded from: classes11.dex */
public final class p4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.s4 f341958d;

    public p4(f93.s4 s4Var) {
        this.f341958d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/HeaderAddDataItem$HeaderAddViewItem$setHolderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        f93.r4 r4Var = this.f341958d.C;
        if (r4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("onAddItemClickListener");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea = ((f93.w) r4Var).f342025a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16165x57283aea.f224724d, "cpan[dealAddContact]");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288314b, 1024));
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", activityC16165x57283aea.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8s));
        intent.putExtra("show_too_many_member", false);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 6);
        intent.putExtra("without_openim", true);
        intent.putExtra("always_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC16165x57283aea.f224734q, ","));
        j45.l.v(activityC16165x57283aea, ".ui.contact.SelectContactUI", intent, com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14480xb9cc8658);
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/HeaderAddDataItem$HeaderAddViewItem$setHolderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

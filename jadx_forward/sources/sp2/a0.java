package sp2;

/* loaded from: classes2.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.b0 f492497d;

    public a0(sp2.b0 b0Var) {
        this.f492497d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$showSearchEntrance$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sp2.b0 b0Var = this.f492497d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = b0Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p;
        if (str == null) {
            str = "";
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_context_id", str);
        intent.putExtra("key_click_tab_context_id", ip2.a.f375147c);
        new jp2.a(b0Var.m158354x19263085()).a(intent);
        b0Var.S6("main_page_search", false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$showSearchEntrance$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

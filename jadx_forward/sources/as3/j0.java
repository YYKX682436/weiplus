package as3;

/* loaded from: classes10.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16921x4fe35715 f95051d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16921x4fe35715 c16921x4fe35715) {
        this.f95051d = c16921x4fe35715;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16921x4fe35715 c16921x4fe35715 = this.f95051d;
        yz5.l onClickCollapseBtn = c16921x4fe35715.getOnClickCollapseBtn();
        if (onClickCollapseBtn != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
            onClickCollapseBtn.mo146xb9724478((android.widget.TextView) view);
        }
        c16921x4fe35715.b(c16921x4fe35715.f236200d, c16921x4fe35715.f236202f, c16921x4fe35715.f236204h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16921x4fe35715.a(c16921x4fe35715, c16921x4fe35715.f236204h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16921x4fe35715.a(c16921x4fe35715, c16921x4fe35715.f236205i);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

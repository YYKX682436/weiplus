package os3;

/* loaded from: classes4.dex */
public class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a f429574d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a activityC16934xe33e503a) {
        this.f429574d = activityC16934xe33e503a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.ListView listView = this.f429574d.f236405f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(listView);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$6", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m.a((android.widget.ListView) arrayList2.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$6", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

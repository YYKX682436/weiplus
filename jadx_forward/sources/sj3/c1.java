package sj3;

/* loaded from: classes11.dex */
public class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.f1 f489980d;

    public c1(sj3.f1 f1Var) {
        this.f489980d = f1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MeetingLinkFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MeetingLinkFooter", "meeting footer has been click and run it");
        zj3.c.j(this.f489980d.f490037a, "list");
        zj3.d.c(zj3.c.i(), 1, 0, 0, 0, 0, 0, 0, 0, "", 0);
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MeetingLinkFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

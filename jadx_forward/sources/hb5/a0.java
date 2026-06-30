package hb5;

/* loaded from: classes9.dex */
public class a0 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f361680d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21587xf1094a47 f361681e;

    public a0(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21587xf1094a47 activityC21587xf1094a47) {
        this.f361681e = activityC21587xf1094a47;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/bizchat/BizChatSearchUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        if (i17 + i18 == i19) {
            this.f361680d = true;
        } else {
            this.f361680d = false;
        }
        yj0.a.h(this, "com/tencent/mm/ui/bizchat/BizChatSearchUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/bizchat/BizChatSearchUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && this.f361680d) {
            hb5.e0 e0Var = this.f361681e.f279467o;
            if (e0Var.D && e0Var.f() && !e0Var.F) {
                e0Var.F = true;
                c01.d9.e().g(new s01.e0(e0Var.f361697d, e0Var.f361699f, e0Var.M, null));
                e0Var.g();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/bizchat/BizChatSearchUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}

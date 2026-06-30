package ja4;

/* loaded from: classes4.dex */
public class e implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f380155d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f380156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2164x6289ae8.ui.ActivityC17868x8ab600f5 f380157f;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2164x6289ae8.ui.ActivityC17868x8ab600f5 activityC17868x8ab600f5) {
        this.f380157f = activityC17868x8ab600f5;
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
        yj0.a.b("com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        if (i19 == 0 || !this.f380155d) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            return;
        }
        boolean z17 = true;
        if (i17 <= 0) {
            android.view.View childAt = absListView.getChildAt(i17);
            if ((childAt != null ? 0 - childAt.getTop() : 0) <= 100) {
                z17 = false;
            }
        }
        if (this.f380156e != z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2164x6289ae8.ui.ActivityC17868x8ab600f5 activityC17868x8ab600f5 = this.f380157f;
            if (z17) {
                activityC17868x8ab600f5.getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f561051a65);
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2164x6289ae8.ui.ActivityC17868x8ab600f5.f245558m;
                activityC17868x8ab600f5.getClass();
            } else {
                int i28 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2164x6289ae8.ui.ActivityC17868x8ab600f5.f245558m;
                activityC17868x8ab600f5.getClass();
            }
            this.f380156e = z17;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (absListView.getCount() == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            return;
        }
        if (i17 == 0) {
            this.f380155d = false;
        } else if (i17 == 1) {
            this.f380155d = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}

package zb3;

/* loaded from: classes9.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f552816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f552817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f552818f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b f552819g;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b, boolean z17, int i17, android.widget.EditText editText) {
        this.f552819g = activityC16343x55c0d8b;
        this.f552816d = z17;
        this.f552817e = i17;
        this.f552818f = editText;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b = this.f552819g;
        boolean isShown = activityC16343x55c0d8b.f227296q.isShown();
        boolean z17 = this.f552816d;
        if (!isShown && !z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b.V6(activityC16343x55c0d8b);
            activityC16343x55c0d8b.f227295p.m121476x53eb72f9(this.f552817e);
        } else if (z17) {
            activityC16343x55c0d8b.m66122xd46dd964();
            ((android.view.inputmethod.InputMethodManager) activityC16343x55c0d8b.mo55332x76847179().getSystemService("input_method")).showSoftInput(this.f552818f, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package zb3;

/* loaded from: classes9.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f552830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f552831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b f552832f;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b, android.widget.EditText editText, android.widget.EditText editText2) {
        this.f552832f = activityC16343x55c0d8b;
        this.f552830d = editText;
        this.f552831e = editText2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f552830d.setOnClickListener(null);
        this.f552831e.setOnClickListener(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b = this.f552832f;
        activityC16343x55c0d8b.m66123x8f91b80(activityC16343x55c0d8b.f227290h, 2, false);
        activityC16343x55c0d8b.m66123x8f91b80(activityC16343x55c0d8b.f227289g, 0, false);
        activityC16343x55c0d8b.f227295p.m121476x53eb72f9(2);
        activityC16343x55c0d8b.f227295p.m121469xce4186ff((android.widget.EditText) view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b.V6(activityC16343x55c0d8b);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

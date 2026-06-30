package db5;

/* loaded from: classes5.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 f309876d;

    public g2(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 c21493x36e72905) {
        this.f309876d = c21493x36e72905;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMFormVerifyCodeInputView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f309876d.f278906e;
        c21486x59d05a04.setText("");
        c21486x59d05a04.d();
        yj0.a.h(this, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

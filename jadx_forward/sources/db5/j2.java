package db5;

/* loaded from: classes5.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 f309940d;

    public j2(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 c21493x36e72905) {
        this.f309940d = c21493x36e72905;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMFormVerifyCodeInputView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View.OnClickListener onClickListener = this.f309940d.f278917s;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package db5;

/* loaded from: classes5.dex */
public class i2 implements db5.u1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 f309927a;

    public i2(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 c21493x36e72905) {
        this.f309927a = c21493x36e72905;
    }

    public void a(boolean z17) {
        android.view.View view = this.f309927a.f278909h;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMFormVerifyCodeInputView$3", "showClearBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView$3", "showClearBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

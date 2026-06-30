package aa3;

/* loaded from: classes5.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7.C16218x92f34101 f84124d;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7.C16218x92f34101 c16218x92f34101) {
        this.f84124d = c16218x92f34101;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/keyboard/LiteAppPayKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7.C16218x92f34101 c16218x92f34101 = this.f84124d;
        if (c16218x92f34101.f225402y == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppPayKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i17 = view.getId() == com.p314xaae8f345.mm.R.id.f78261xb63921d8 ? 7 : view.getId() == com.p314xaae8f345.mm.R.id.f78262xb63921d9 ? 8 : view.getId() == com.p314xaae8f345.mm.R.id.f78263xb63921da ? 9 : view.getId() == com.p314xaae8f345.mm.R.id.f78264xb63921db ? 10 : view.getId() == com.p314xaae8f345.mm.R.id.f78265xb63921dc ? 11 : view.getId() == com.p314xaae8f345.mm.R.id.f78266xb63921dd ? 12 : view.getId() == com.p314xaae8f345.mm.R.id.f78267xb63921de ? 13 : view.getId() == com.p314xaae8f345.mm.R.id.f78268xb63921df ? 14 : view.getId() == com.p314xaae8f345.mm.R.id.f78269xb63921e0 ? 15 : view.getId() == com.p314xaae8f345.mm.R.id.f78270xb63921e1 ? 16 : view.getId() == com.p314xaae8f345.mm.R.id.f78279xc78dbb3 ? 67 : view.getId() == com.p314xaae8f345.mm.R.id.f78288xc78dcf1 ? c16218x92f34101.f225401x == 1 ? 52 : 56 : view.getId() == com.p314xaae8f345.mm.R.id.f78271x5f31258e ? 66 : 0;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (!(i17 == 0)) {
            view.performHapticFeedback(0, 2);
        }
        if (c16218x92f34101.f225401x == 1 && i17 == 52) {
            str = "(Landroid/view/View;)V";
            c16218x92f34101.f225402y.sendKeyEvent(new android.view.KeyEvent(0L, 0L, 0, 52, 0, 64));
            c16218x92f34101.f225402y.sendKeyEvent(new android.view.KeyEvent(0L, 0L, 1, 52, 0, 64));
        } else {
            str = "(Landroid/view/View;)V";
            c16218x92f34101.f225402y.sendKeyEvent(new android.view.KeyEvent(0, i17));
            c16218x92f34101.f225402y.sendKeyEvent(new android.view.KeyEvent(1, i17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppPayKeyboardView$2", "android/view/View$OnClickListener", "onClick", str);
    }
}

package mp5;

/* loaded from: classes9.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f412021d;

    public k(com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223) {
        this.f412021d = c22894x55bf3223;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/keyboard/WcPayKeyboard$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = view.getId() == com.p314xaae8f345.mm.R.id.f78261xb63921d8 ? 7 : view.getId() == com.p314xaae8f345.mm.R.id.f78262xb63921d9 ? 8 : view.getId() == com.p314xaae8f345.mm.R.id.f78263xb63921da ? 9 : view.getId() == com.p314xaae8f345.mm.R.id.f78264xb63921db ? 10 : view.getId() == com.p314xaae8f345.mm.R.id.f78265xb63921dc ? 11 : view.getId() == com.p314xaae8f345.mm.R.id.f78266xb63921dd ? 12 : view.getId() == com.p314xaae8f345.mm.R.id.f78267xb63921de ? 13 : view.getId() == com.p314xaae8f345.mm.R.id.f78268xb63921df ? 14 : view.getId() == com.p314xaae8f345.mm.R.id.f78269xb63921e0 ? 15 : view.getId() == com.p314xaae8f345.mm.R.id.f78270xb63921e1 ? 16 : view.getId() == com.p314xaae8f345.mm.R.id.f78279xc78dbb3 ? 67 : view.getId() == com.p314xaae8f345.mm.R.id.f78288xc78dcf1 ? 56 : (view.getId() == com.p314xaae8f345.mm.R.id.f78271x5f31258e || view.getId() == com.p314xaae8f345.mm.R.id.f78272xd9657ca9) ? 66 : 0;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (!(i17 == 0)) {
            view.performHapticFeedback(0, 2);
        }
        if (view.getId() != com.p314xaae8f345.mm.R.id.f78271x5f31258e) {
            view.getId();
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f412021d;
        c22894x55bf3223.K = i17;
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223.a(c22894x55bf3223, i17);
        android.widget.EditText editText = c22894x55bf3223.f295354y;
        if (editText != null) {
            editText.dispatchKeyEvent(new android.view.KeyEvent(0, i17));
            c22894x55bf3223.f295354y.dispatchKeyEvent(new android.view.KeyEvent(1, i17));
        }
        yj0.a.h(this, "com/tencent/mm/wallet_core/keyboard/WcPayKeyboard$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

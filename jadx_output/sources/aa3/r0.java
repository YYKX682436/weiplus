package aa3;

/* loaded from: classes5.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.keyboard.LiteAppPayKeyboardView f2591d;

    public r0(com.tencent.mm.plugin.lite.keyboard.LiteAppPayKeyboardView liteAppPayKeyboardView) {
        this.f2591d = liteAppPayKeyboardView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/keyboard/LiteAppPayKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.lite.keyboard.LiteAppPayKeyboardView liteAppPayKeyboardView = this.f2591d;
        if (liteAppPayKeyboardView.f143869y == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppPayKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i17 = view.getId() == com.tencent.mm.R.id.keyboard_0 ? 7 : view.getId() == com.tencent.mm.R.id.keyboard_1 ? 8 : view.getId() == com.tencent.mm.R.id.keyboard_2 ? 9 : view.getId() == com.tencent.mm.R.id.keyboard_3 ? 10 : view.getId() == com.tencent.mm.R.id.keyboard_4 ? 11 : view.getId() == com.tencent.mm.R.id.keyboard_5 ? 12 : view.getId() == com.tencent.mm.R.id.keyboard_6 ? 13 : view.getId() == com.tencent.mm.R.id.keyboard_7 ? 14 : view.getId() == com.tencent.mm.R.id.keyboard_8 ? 15 : view.getId() == com.tencent.mm.R.id.keyboard_9 ? 16 : view.getId() == com.tencent.mm.R.id.keyboard_del ? 67 : view.getId() == com.tencent.mm.R.id.keyboard_dot ? liteAppPayKeyboardView.f143868x == 1 ? 52 : 56 : view.getId() == com.tencent.mm.R.id.keyboard_action ? 66 : 0;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (!(i17 == 0)) {
            view.performHapticFeedback(0, 2);
        }
        if (liteAppPayKeyboardView.f143868x == 1 && i17 == 52) {
            str = "(Landroid/view/View;)V";
            liteAppPayKeyboardView.f143869y.sendKeyEvent(new android.view.KeyEvent(0L, 0L, 0, 52, 0, 64));
            liteAppPayKeyboardView.f143869y.sendKeyEvent(new android.view.KeyEvent(0L, 0L, 1, 52, 0, 64));
        } else {
            str = "(Landroid/view/View;)V";
            liteAppPayKeyboardView.f143869y.sendKeyEvent(new android.view.KeyEvent(0, i17));
            liteAppPayKeyboardView.f143869y.sendKeyEvent(new android.view.KeyEvent(1, i17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppPayKeyboardView$2", "android/view/View$OnClickListener", "onClick", str);
    }
}

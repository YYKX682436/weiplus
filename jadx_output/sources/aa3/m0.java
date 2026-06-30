package aa3;

/* loaded from: classes5.dex */
public class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.keyboard.LiteAppNumberKeyboardView f2564d;

    public m0(com.tencent.mm.plugin.lite.keyboard.LiteAppNumberKeyboardView liteAppNumberKeyboardView) {
        this.f2564d = liteAppNumberKeyboardView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.lite.keyboard.LiteAppNumberKeyboardView liteAppNumberKeyboardView = this.f2564d;
        if (liteAppNumberKeyboardView.f143849y == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i17 = view.getId() == com.tencent.mm.R.id.tenpay_keyboard_0 ? 7 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_1 ? 8 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_2 ? 9 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_3 ? 10 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_4 ? 11 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_5 ? 12 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_6 ? 13 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_7 ? 14 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_8 ? 15 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_9 ? 16 : (view.getId() == com.tencent.mm.R.id.tenpay_keyboard_x && liteAppNumberKeyboardView.f143847w == 2) ? 56 : 0;
        if (i17 != 0) {
            liteAppNumberKeyboardView.f143849y.sendKeyEvent(new android.view.KeyEvent(0, i17));
            liteAppNumberKeyboardView.f143849y.sendKeyEvent(new android.view.KeyEvent(1, i17));
        } else if (view.getId() == com.tencent.mm.R.id.tenpay_keyboard_x && liteAppNumberKeyboardView.f143847w == 1) {
            liteAppNumberKeyboardView.f143849y.sendKeyEvent(new android.view.KeyEvent(0L, 0L, 0, 52, 0, 64));
            liteAppNumberKeyboardView.f143849y.sendKeyEvent(new android.view.KeyEvent(0L, 0L, 1, 52, 0, 64));
            str = "(Landroid/view/View;)V";
            yj0.a.h(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", str);
        }
        str = "(Landroid/view/View;)V";
        yj0.a.h(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", str);
    }
}

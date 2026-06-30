package aa3;

/* loaded from: classes5.dex */
public class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7.C16217x6cae88e8 f84097d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7.C16217x6cae88e8 c16217x6cae88e8) {
        this.f84097d = c16217x6cae88e8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7.C16217x6cae88e8 c16217x6cae88e8 = this.f84097d;
        if (c16217x6cae88e8.f225382y == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i17 = view.getId() == com.p314xaae8f345.mm.R.id.f78311xf289172c ? 7 : view.getId() == com.p314xaae8f345.mm.R.id.f78312xf289172d ? 8 : view.getId() == com.p314xaae8f345.mm.R.id.f78313xf289172e ? 9 : view.getId() == com.p314xaae8f345.mm.R.id.f78314xf289172f ? 10 : view.getId() == com.p314xaae8f345.mm.R.id.f78315xf2891730 ? 11 : view.getId() == com.p314xaae8f345.mm.R.id.f78316xf2891731 ? 12 : view.getId() == com.p314xaae8f345.mm.R.id.f78317xf2891732 ? 13 : view.getId() == com.p314xaae8f345.mm.R.id.f78318xf2891733 ? 14 : view.getId() == com.p314xaae8f345.mm.R.id.f78319xf2891734 ? 15 : view.getId() == com.p314xaae8f345.mm.R.id.f78320xf2891735 ? 16 : (view.getId() == com.p314xaae8f345.mm.R.id.f78323xf2891774 && c16217x6cae88e8.f225380w == 2) ? 56 : 0;
        if (i17 != 0) {
            c16217x6cae88e8.f225382y.sendKeyEvent(new android.view.KeyEvent(0, i17));
            c16217x6cae88e8.f225382y.sendKeyEvent(new android.view.KeyEvent(1, i17));
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.f78323xf2891774 && c16217x6cae88e8.f225380w == 1) {
            c16217x6cae88e8.f225382y.sendKeyEvent(new android.view.KeyEvent(0L, 0L, 0, 52, 0, 64));
            c16217x6cae88e8.f225382y.sendKeyEvent(new android.view.KeyEvent(0L, 0L, 1, 52, 0, 64));
            str = "(Landroid/view/View;)V";
            yj0.a.h(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", str);
        }
        str = "(Landroid/view/View;)V";
        yj0.a.h(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", str);
    }
}

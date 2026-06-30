package hr3;

/* loaded from: classes11.dex */
public class w extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f365655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f f365656e;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f activityC16833xebe5488f, java.lang.String str) {
        this.f365656e = activityC16833xebe5488f;
        this.f365655d = str;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f activityC16833xebe5488f = this.f365656e;
        java.lang.CharSequence m79028xfb85ada3 = activityC16833xebe5488f.f235162e.m79028xfb85ada3();
        int e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(m79028xfb85ada3.toString(), com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2);
        hw3.a.a(activityC16833xebe5488f.mo55332x76847179(), this.f365655d, e17, 400, new hr3.v(this, m79028xfb85ada3));
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f365656e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560257ff));
        textPaint.setUnderlineText(false);
    }
}

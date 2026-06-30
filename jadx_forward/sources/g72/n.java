package g72;

/* loaded from: classes3.dex */
public class n extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 f350772d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4) {
        this.f350772d = activityC13520x8c9585b4;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f350772d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
    }
}

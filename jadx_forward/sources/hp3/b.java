package hp3;

/* loaded from: classes9.dex */
public class b extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public hp3.a f364470d = null;

    /* renamed from: e, reason: collision with root package name */
    public final int f364471e;

    /* renamed from: f, reason: collision with root package name */
    public final int f364472f;

    public b(android.content.Context context) {
        this.f364471e = -1;
        this.f364472f = -1;
        this.f364471e = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560909xs);
        this.f364472f = -1;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/util/MallClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        hp3.a aVar = this.f364470d;
        if (aVar != null) {
            aVar.mo68436xaf6b9ae9(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/order/util/MallClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
        textPaint.setColor(this.f364471e);
        textPaint.setUnderlineText(false);
        textPaint.bgColor = this.f364472f;
    }
}

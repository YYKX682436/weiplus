package l72;

/* loaded from: classes9.dex */
public class c0 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f398369d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f398370e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f398371f;

    /* renamed from: g, reason: collision with root package name */
    public final l72.b0 f398372g;

    public c0(java.lang.String str, int i17, int i18, boolean z17, l72.b0 b0Var) {
        super(i17, i18);
        this.f398369d = true;
        this.f398370e = true;
        this.f398371f = "";
        this.f398370e = z17;
        this.f398371f = str;
        this.f398372g = b0Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        l72.b0 b0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetectaction/ui/FaceTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f398369d && (b0Var = this.f398372g) != null) {
            b0Var.a(this.f398371f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0
    /* renamed from: setColor */
    public void mo63036x52d2f021(int i17, int i18) {
        super.mo63036x52d2f021(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f398370e) {
            com.p314xaae8f345.mm.ui.bk.r0(textPaint, 0.8f);
        }
    }
}

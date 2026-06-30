package wu3;

/* loaded from: classes10.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 f531360d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282) {
        this.f531360d = c17042xf8121282;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282 = this.f531360d;
        if (c17042xf8121282.getMode() == 0 || c17042xf8121282.getMode() == 2) {
            android.text.Editable text = c17042xf8121282.f237533o.getText();
            wu3.a1 textCallback = c17042xf8121282.getTextCallback();
            if (textCallback != null) {
                textCallback.a(text, c17042xf8121282.f237544z, c17042xf8121282.A, c17042xf8121282.C);
            }
            c17042xf8121282.f237533o.clearFocus();
        } else if (c17042xf8121282.getMode() == 1) {
            android.text.Editable text2 = c17042xf8121282.f237541w.getText();
            wu3.b1 tipCallback = c17042xf8121282.getTipCallback();
            if (tipCallback != null) {
                ((yt3.o) tipCallback).a(text2, -1, 0, c17042xf8121282.C);
            }
            c17042xf8121282.f237541w.clearFocus();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

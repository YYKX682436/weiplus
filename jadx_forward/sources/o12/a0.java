package o12;

/* loaded from: classes10.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o12.d0 f423662d;

    public a0(o12.d0 d0Var) {
        this.f423662d = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.graphics.Rect rect;
        android.graphics.Rect rect2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        o12.d0 d0Var = this.f423662d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 c13257xd7c65e84 = d0Var.f423670a;
        if (c13257xd7c65e84 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editableText");
            throw null;
        }
        int i17 = 0;
        if (!(java.lang.String.valueOf(c13257xd7c65e84.getText()).length() > 0)) {
            yz5.l lVar = d0Var.f423677h;
            if (lVar != null) {
                lVar.mo146xb9724478(null);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        o12.u uVar = d0Var.f423676g;
        int i18 = (uVar == null || (rect2 = uVar.f423719d) == null) ? 0 : rect2.left;
        if (uVar != null && (rect = uVar.f423719d) != null) {
            i17 = rect.top;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 c13257xd7c65e842 = d0Var.f423670a;
        if (c13257xd7c65e842 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editableText");
            throw null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(c13257xd7c65e842.getText());
        o12.y yVar = d0Var.f423675f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 c13257xd7c65e843 = d0Var.f423670a;
        if (c13257xd7c65e843 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editableText");
            throw null;
        }
        int width = c13257xd7c65e843.getWidth() + i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 c13257xd7c65e844 = d0Var.f423670a;
        if (c13257xd7c65e844 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editableText");
            throw null;
        }
        o12.u uVar2 = new o12.u(valueOf, yVar, d0Var.f423673d, new android.graphics.Rect(i18, i17, width, c13257xd7c65e844.getHeight() + i17), -1.0f, new android.graphics.Rect(), 1.0f, 0.0f, false);
        o12.u uVar3 = d0Var.f423676g;
        if (uVar3 != null) {
            uVar2.f423723h = uVar3.f423723h;
            uVar2.f423722g = uVar3.f423722g;
            uVar2.f423724i = uVar3.f423724i;
        }
        yz5.l lVar2 = d0Var.f423677h;
        if (lVar2 != null) {
            lVar2.mo146xb9724478(uVar2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

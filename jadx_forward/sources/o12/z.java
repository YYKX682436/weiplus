package o12;

/* loaded from: classes10.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o12.d0 f423728d;

    public z(o12.d0 d0Var) {
        this.f423728d = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        o12.d0 d0Var = this.f423728d;
        java.util.List list = d0Var.f423674e;
        d0Var.f423675f = (o12.y) list.get((list.indexOf(d0Var.f423675f) + 1) % d0Var.f423674e.size());
        android.widget.ImageView imageView = d0Var.f423672c;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switcherButton");
            throw null;
        }
        imageView.setImageResource(d0Var.f423675f.b());
        o12.y yVar = d0Var.f423675f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 c13257xd7c65e84 = d0Var.f423670a;
        if (c13257xd7c65e84 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editableText");
            throw null;
        }
        yVar.a(c13257xd7c65e84, d0Var.f423673d);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

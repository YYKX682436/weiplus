package o12;

/* loaded from: classes10.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o12.d0 f423666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f423667e;

    public c0(o12.d0 d0Var, int i17) {
        this.f423666d = d0Var;
        this.f423667e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        o12.d0 d0Var = this.f423666d;
        int i17 = this.f423667e;
        d0Var.f423673d = i17;
        o12.y yVar = d0Var.f423675f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 c13257xd7c65e84 = d0Var.f423670a;
        if (c13257xd7c65e84 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editableText");
            throw null;
        }
        yVar.a(c13257xd7c65e84, i17);
        d0Var.b();
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextInputViewController$setup$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

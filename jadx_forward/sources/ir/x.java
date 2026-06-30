package ir;

/* loaded from: classes13.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir.y f375445d;

    public x(ir.y yVar) {
        this.f375445d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/model/panel/EmojiPanelSetIntroViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ir.y yVar = this.f375445d;
        lr.k0 k0Var = yVar.f402113d;
        if (k0Var != null) {
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            k0Var.b(view, context, yVar.m8183xf806b362(), (ir.w) yVar.f402114e);
        }
        yj0.a.h(this, "com/tencent/mm/emoji/model/panel/EmojiPanelSetIntroViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

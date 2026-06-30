package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class b4 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.x3 f64051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.c4 f64052e;

    public b4(com.tencent.mm.chatroom.ui.c4 c4Var, com.tencent.mm.chatroom.ui.x3 x3Var) {
        this.f64052e = c4Var;
        this.f64051d = x3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        androidx.recyclerview.widget.g1 g1Var = ((com.tencent.mm.chatroom.ui.n3) this.f64052e.f64072h).f64387a.f63777m;
        com.tencent.mm.chatroom.ui.x3 x3Var = this.f64051d;
        g1Var.o(x3Var);
        x3Var.f64645m.performHapticFeedback(0, 2);
        yj0.a.i(true, this, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}

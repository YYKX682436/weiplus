package com.tencent.mm.plugin.component.editor;

/* loaded from: classes3.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f96625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96626e;

    public q0(com.tencent.mm.plugin.component.editor.EditorUI editorUI, int i17) {
        this.f96626e = editorUI;
        this.f96625d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f96626e.f96497d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f96625d));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/EditorUI$12", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/component/editor/EditorUI$12", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}

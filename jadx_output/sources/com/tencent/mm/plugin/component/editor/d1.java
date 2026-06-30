package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class d1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96550d;

    public d1(com.tencent.mm.plugin.component.editor.EditorUI editorUI) {
        this.f96550d = editorUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/EditorUI$22", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = this.f96550d;
        if (action == 0) {
            editorUI.B = motionEvent.getX();
            editorUI.C = motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 && editorUI.f96497d.k0(motionEvent.getX(), motionEvent.getY()) == null) {
            float abs = java.lang.Math.abs(editorUI.B - motionEvent.getX());
            float abs2 = java.lang.Math.abs(editorUI.C - motionEvent.getY());
            if (abs < 30.0f && abs2 < 30.0f) {
                if (editorUI.f96501h.getVisibility() != 8) {
                    nx1.j jVar = editorUI.f96502i;
                    if (jVar != null) {
                        jVar.f341292a.dismiss();
                    }
                    editorUI.f96501h.setVisibility(8);
                } else {
                    int B = nx1.d.q().B() - 1;
                    ix1.a l17 = nx1.d.q().l(B);
                    if (l17 != null) {
                        boolean z17 = l17.f295312b;
                        nx1.d.q().i();
                        l17.f295312b = true;
                        l17.f295317g = false;
                        l17.f295313c = -1;
                        editorUI.f96498e.notifyItemChanged(B);
                        editorUI.k7(true, 50L);
                        editorUI.j7(1, 0L);
                        if (editorUI.f96504n && z17) {
                            editorUI.f96507q.postDelayed(new com.tencent.mm.plugin.component.editor.c1(this), 100L);
                        }
                    }
                }
            }
        } else if (motionEvent.getAction() == 2) {
            float abs3 = java.lang.Math.abs(editorUI.B - motionEvent.getX());
            float abs4 = java.lang.Math.abs(editorUI.C - motionEvent.getY());
            if (abs3 > 120.0f || abs4 > 120.0f) {
                if (editorUI.f96504n) {
                    if (ox1.s.h().m() == 1) {
                        editorUI.b5();
                        ox1.s.h().c();
                    }
                } else if (!editorUI.f96508r) {
                    editorUI.b5();
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/EditorUI$22", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

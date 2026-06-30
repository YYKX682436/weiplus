package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f96620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96621e;

    public p0(com.tencent.mm.plugin.component.editor.EditorUI editorUI, android.content.Context context) {
        this.f96621e = editorUI;
        this.f96620d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        int B = nx1.d.q().B();
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = this.f96621e;
        int childCount = editorUI.f96497d.getChildCount();
        if (B == childCount) {
            float f17 = 0.0f;
            for (int i17 = childCount - 1; i17 >= 0; i17--) {
                android.view.View childAt = editorUI.f96497d.getChildAt(i17);
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                float translationY = childAt.getTranslationY();
                if (f17 <= childAt.getBottom() + translationY) {
                    f17 = childAt.getBottom() + translationY;
                }
            }
            if (f17 < com.tencent.mm.sdk.platformtools.d2.f(this.f96620d)[1] && f17 > 0.0f) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) editorUI.f96501h.getLayoutParams();
                layoutParams.height = (int) f17;
                editorUI.f96501h.setLayoutParams(layoutParams);
            }
        }
        editorUI.f96501h.setVisibility(0);
        nx1.j jVar = editorUI.f96502i;
        if (jVar != null) {
            int[] iArr = {0, 0};
            android.view.View view = jVar.f341293b;
            view.getLocationOnScreen(iArr);
            jVar.f341292a.showAtLocation(view, 49, 0, iArr[1] + 50);
        }
    }
}

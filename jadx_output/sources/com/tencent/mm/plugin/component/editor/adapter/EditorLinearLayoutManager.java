package com.tencent.mm.plugin.component.editor.adapter;

/* loaded from: classes12.dex */
public class EditorLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final int f96522v;

    /* renamed from: w, reason: collision with root package name */
    public int f96523w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f96524x;

    public EditorLinearLayoutManager(android.content.Context context) {
        super(context);
        this.f96522v = com.tencent.mm.sdk.platformtools.d2.b(com.tencent.mm.sdk.platformtools.x2.f193071a, true);
        this.f96523w = -1;
        this.f96524x = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int G(androidx.recyclerview.widget.h3 h3Var) {
        int i17 = this.f96523w;
        if (i17 > 0) {
            return i17;
        }
        return 900;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        try {
            super.onLayoutChildren(z2Var, h3Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CollectEditorLinearLayoutManager", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (!this.f96524x) {
            return super.scrollVerticallyBy(i17, z2Var, h3Var);
        }
        boolean z17 = i17 < 0 && android.util.TypedValue.applyDimension(1, 49.0f, nx1.z.f341330g) <= ((float) java.lang.Math.abs(i17));
        if (i17 > 0) {
            z17 = ((float) this.f96522v) + android.util.TypedValue.applyDimension(1, 49.0f, nx1.z.f341330g) < ((float) i17);
        }
        if (z17 && this.f96524x) {
            return 0;
        }
        try {
            return super.scrollVerticallyBy(i17, z2Var, h3Var);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public EditorLinearLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f96522v = com.tencent.mm.sdk.platformtools.d2.b(com.tencent.mm.sdk.platformtools.x2.f193071a, true);
        this.f96523w = -1;
        this.f96524x = false;
    }
}

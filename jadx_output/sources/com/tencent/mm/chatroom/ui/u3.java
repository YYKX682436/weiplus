package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class u3 extends androidx.recyclerview.widget.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f64564a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.chatroom.ui.v3 f64565b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f64566c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f64567d = false;

    public u3(java.util.List list, com.tencent.mm.chatroom.ui.v3 v3Var) {
        this.f64564a = list;
        this.f64565b = v3Var;
    }

    @Override // androidx.recyclerview.widget.a1
    public void clearView(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var) {
        super.clearView(recyclerView, k3Var);
        this.f64567d = true;
    }

    @Override // androidx.recyclerview.widget.a1
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var) {
        return androidx.recyclerview.widget.a1.makeMovementFlags(3, 0);
    }

    @Override // androidx.recyclerview.widget.a1
    public void onChildDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var, float f17, float f18, int i17, boolean z17) {
        if (this.f64566c) {
            android.view.ViewPropertyAnimator animate = k3Var.itemView.animate();
            k3Var.itemView.setTranslationZ(20.0f);
            animate.start();
            this.f64566c = false;
        }
        if (this.f64567d) {
            android.view.ViewPropertyAnimator animate2 = k3Var.itemView.animate();
            k3Var.itemView.setTranslationZ(0.0f);
            animate2.start();
            this.f64567d = false;
            this.f64566c = true;
        }
        super.onChildDraw(canvas, recyclerView, k3Var, f17, f18, i17, z17);
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2) {
        int adapterPosition = k3Var.getAdapterPosition();
        int adapterPosition2 = k3Var2.getAdapterPosition();
        java.util.List list = this.f64564a;
        if (adapterPosition < adapterPosition2) {
            int i17 = adapterPosition;
            while (i17 < adapterPosition2) {
                int i18 = i17 + 1;
                java.util.Collections.swap(list, i17, i18);
                i17 = i18;
            }
        } else {
            for (int i19 = adapterPosition; i19 > adapterPosition2; i19--) {
                java.util.Collections.swap(list, i19, i19 - 1);
            }
        }
        recyclerView.getAdapter().notifyItemMoved(adapterPosition, adapterPosition2);
        com.tencent.mm.chatroom.ui.v3 v3Var = this.f64565b;
        if (v3Var != null) {
            com.tencent.mm.chatroom.ui.GroupToolsManagereUI groupToolsManagereUI = ((com.tencent.mm.chatroom.ui.p3) v3Var).f64422a;
            groupToolsManagereUI.f63783s = true;
            groupToolsManagereUI.U6();
        }
        k3Var.itemView.performHapticFeedback(0, 2);
        return true;
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSelectedChanged(androidx.recyclerview.widget.k3 k3Var, int i17) {
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSwiped(androidx.recyclerview.widget.k3 k3Var, int i17) {
    }
}

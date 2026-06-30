package com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb;

/* renamed from: com.tencent.mm.chatroom.ui.preference.RoomManagerPreference */
/* loaded from: classes.dex */
public class C10382xb14a34ad extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final java.util.List L;

    public C10382xb14a34ad(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = new java.util.LinkedList();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc)).setText(this.f279307h);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h5o);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h5p);
        android.widget.ImageView imageView3 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h5q);
        imageView.setVisibility(4);
        imageView2.setVisibility(4);
        imageView3.setVisibility(4);
        int i17 = 0;
        while (true) {
            java.util.List list = this.L;
            if (i17 >= ((java.util.LinkedList) list).size()) {
                return;
            }
            if (i17 == 0) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, ((com.p314xaae8f345.mm.p2621x8fb0427b.z3) ((java.util.LinkedList) list).get(0)).d1(), 0.15f);
                imageView.setVisibility(0);
            } else if (1 == i17) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView2, ((com.p314xaae8f345.mm.p2621x8fb0427b.z3) ((java.util.LinkedList) list).get(1)).d1(), 0.15f);
                imageView2.setVisibility(0);
            } else if (2 == i17) {
                imageView3.setVisibility(0);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView3, ((com.p314xaae8f345.mm.p2621x8fb0427b.z3) ((java.util.LinkedList) list).get(2)).d1(), 0.15f);
            }
            i17++;
        }
    }

    public C10382xb14a34ad(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = new java.util.LinkedList();
    }
}

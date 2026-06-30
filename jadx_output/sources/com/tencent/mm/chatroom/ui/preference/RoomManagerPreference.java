package com.tencent.mm.chatroom.ui.preference;

/* loaded from: classes.dex */
public class RoomManagerPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final java.util.List L;

    public RoomManagerPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = new java.util.LinkedList();
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc)).setText(this.f197774h);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h5o);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h5p);
        android.widget.ImageView imageView3 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h5q);
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
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, ((com.tencent.mm.storage.z3) ((java.util.LinkedList) list).get(0)).d1(), 0.15f);
                imageView.setVisibility(0);
            } else if (1 == i17) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView2, ((com.tencent.mm.storage.z3) ((java.util.LinkedList) list).get(1)).d1(), 0.15f);
                imageView2.setVisibility(0);
            } else if (2 == i17) {
                imageView3.setVisibility(0);
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView3, ((com.tencent.mm.storage.z3) ((java.util.LinkedList) list).get(2)).d1(), 0.15f);
            }
            i17++;
        }
    }

    public RoomManagerPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = new java.util.LinkedList();
    }
}

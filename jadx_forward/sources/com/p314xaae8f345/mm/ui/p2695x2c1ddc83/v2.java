package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class v2 implements com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w2 f289714a;

    public v2(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w2 w2Var) {
        this.f289714a = w2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2
    public void a(int i17) {
        ((yf5.w0) this.f289714a.f289744d).f543521t.b(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2
    public void b(android.view.View view, int i17, java.lang.String str) {
        yf5.w0 w0Var = (yf5.w0) this.f289714a.f289744d;
        if (view == null) {
            w0Var.getClass();
            return;
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3 b3Var = w0Var.f543521t;
        boolean z17 = b3Var.f288993b != null;
        java.lang.String str2 = w0Var.f543511g;
        if (z17 && !com.p314xaae8f345.mm.ui.bk.y()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "[onClickItem] has click! position:%s username:%s", java.lang.Integer.valueOf(i17), str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[onClickItem] position:%s username:%s", java.lang.Integer.valueOf(i17), str);
        boolean X3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(str);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = w0Var.f543509e;
        if (X3) {
            o5Var.v();
            return;
        }
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.conversation.adapter.ConvViewHolder");
        yf5.n nVar = (yf5.n) tag;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        b3Var.a(str, view, nVar);
        if (com.p314xaae8f345.mm.ui.bk.y()) {
            w0Var.notifyDataSetChanged();
        }
        java.lang.Object tag2 = view.getTag(com.p314xaae8f345.mm.R.id.cip);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.storage.Conversation");
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) tag2;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.B3(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5 i5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5.class);
            java.lang.String valueOf = java.lang.String.valueOf(gm0.j1.b().h());
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (valueOf == null) {
                valueOf = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d0) i5Var;
            d0Var.wi(valueOf);
            d0Var.f156581e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h5(l4Var.d1(), i17 + 1);
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().H(l4Var)) {
            o5Var.d(l4Var);
        }
        bg5.k.f102290a.a(str, o5Var.n(), o5Var.f289473w, i17, 0, 0L);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = nVar.f543457k;
        if (c22699x3dcdb352 != null && c22699x3dcdb352.getVisibility() == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = nVar.f543457k;
            c22699x3dcdb3522.m82040x7541828(i65.a.d(c22699x3dcdb3522.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        }
        android.widget.TextView textView = nVar.f543453g;
        if (textView != null) {
            textView.setVisibility(4);
        }
        android.view.View view2 = nVar.f543458l;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/conversation/adapter/MvvmConversationAdapter", "hideRedDotTemporary", "(Lcom/tencent/mm/ui/conversation/adapter/ConvViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/conversation/adapter/MvvmConversationAdapter", "hideRedDotTemporary", "(Lcom/tencent/mm/ui/conversation/adapter/ConvViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2
    public void c(java.lang.String str, android.os.Bundle bundle) {
        android.app.Activity activity = this.f289714a.f289746f;
        if (activity instanceof com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) {
            ((com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) activity).m78447x5d4f20c8(str, bundle, true);
        }
    }
}

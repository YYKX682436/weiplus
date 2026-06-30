package xc5;

/* loaded from: classes12.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.y0 f535073d;

    public n0(xc5.y0 y0Var) {
        this.f535073d = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryLiveBottomBarLayer$attach$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc5.y0 y0Var = this.f535073d;
        y0Var.a0();
        y0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - y0Var.A < 500) {
            y0Var.Q("handleLivePlayClick return", new java.lang.Object[0]);
        } else {
            y0Var.A = currentTimeMillis;
            y0Var.Q("handleLivePlayClick", new java.lang.Object[0]);
            em.b2 b2Var = y0Var.f535126v;
            if (b2Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            b2Var.c().c();
            em.b2 b2Var2 = y0Var.f535126v;
            if (b2Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            b2Var2.c().d();
            y0Var.l0();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryLiveBottomBarLayer$attach$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

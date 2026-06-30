package vc5;

/* loaded from: classes10.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21820xe15c1941 f516886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad5.l0 f516887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f516888f;

    public y(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21820xe15c1941 c21820xe15c1941, ad5.l0 l0Var, yz5.l lVar) {
        this.f516886d = c21820xe15c1941;
        this.f516887e = l0Var;
        this.f516888f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object m143895xf1229813;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryToolBarView$setOperations$2$buttonView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21820xe15c1941 c21820xe15c1941 = this.f516886d;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            android.content.Context context = c21820xe15c1941.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ad5.l0 l0Var = this.f516887e;
            yz5.l lVar = this.f516888f;
            l0Var.d(context, lVar != null ? (ad5.t0) lVar.mo146xb9724478(l0Var) : null);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgHistoryGalleryToolBarView", m143898xd4a2fc34, "showActionBottomSheet operate failed", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryToolBarView$setOperations$2$buttonView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

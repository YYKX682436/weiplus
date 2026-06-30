package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes5.dex */
public final class o extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17) {
        super(context, str, str2, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.m
    public android.view.View l(java.lang.String str, android.content.Context context, android.view.ViewGroup viewGroup) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("2", str)) {
            android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570124y1, viewGroup);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return inflate;
        }
        android.view.View inflate2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570125y2, viewGroup);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return inflate2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.m
    public void m() {
        xj5.j jVar;
        java.lang.ref.WeakReference weakReference = vb5.l.f516388q;
        vb5.l lVar = weakReference != null ? (vb5.l) weakReference.get() : null;
        if (lVar != null) {
            java.util.Iterator it = lVar.f516396o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    jVar = null;
                    break;
                }
                xj5.a aVar = (xj5.a) it.next();
                if (aVar instanceof xj5.j) {
                    jVar = (xj5.j) aVar;
                    break;
                }
            }
            if (jVar != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("group_msg_set_top_detach", null, kz5.c1.m(kz5.b1.e(new jz5.l("group_bar_close_scene", 3)), jVar.b()), 26356);
            }
        }
    }
}

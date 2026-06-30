package ju0;

/* loaded from: classes5.dex */
public abstract class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final ju0.e f383216a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f383217b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f383218c;

    /* renamed from: d, reason: collision with root package name */
    public int f383219d;

    /* renamed from: e, reason: collision with root package name */
    public int f383220e;

    public f(ju0.e callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f383216a = callback;
        this.f383218c = new android.graphics.Rect();
        this.f383219d = -1;
        this.f383220e = -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: clearView */
    public void mo8113xb4407692(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        int i17;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e[] m33150x5a8a256c;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e[] m33150x5a8a256c2;
        java.lang.String d76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        super.mo8113xb4407692(recyclerView, viewHolder);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View itemView = viewHolder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        itemView.getGlobalVisibleRect(rect);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ItemTouchDragCallback", "[clearView] itemRect:" + rect + " lastItemRect:" + this.f383218c);
        ju0.e eVar = this.f383216a;
        int m8183xf806b362 = viewHolder.m8183xf806b362();
        android.graphics.Rect lastItemRect = this.f383218c;
        nu0.g2 g2Var = (nu0.g2) eVar;
        g2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastItemRect, "lastItemRect");
        android.view.View l76 = g2Var.f421476a.l7();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(l76, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initImageRecyclerView$callback$1", "onEndDrag", "(ILandroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l76.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(l76, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initImageRecyclerView$callback$1", "onEndDrag", "(ILandroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g2Var.f421476a.i7().setVisibility(0);
        nu0.b4 b4Var = g2Var.f421476a;
        b4Var.getClass();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        b4Var.l7().getGlobalVisibleRect(rect2);
        if (lastItemRect.intersect(rect2)) {
            nu0.b4 b4Var2 = g2Var.f421476a;
            ju0.b bVar = b4Var2.K;
            int i18 = bVar.f383213g;
            if (m8183xf806b362 == i18) {
                java.util.List list = bVar.f332454d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getItems(...)");
                i18 = m8183xf806b362 == (((ku0.a) kz5.n0.i0(list)).f393593a.f557194a.m33754xb600079() == qg.a.Unknown ? bVar.mo1894x7e414b06() + (-2) : bVar.mo1894x7e414b06() - 1) ? m8183xf806b362 - 1 : m8183xf806b362 + 1;
            }
            nu0.q0 U6 = b4Var2.U6();
            nu0.j3 j3Var = new nu0.j3(b4Var2, m8183xf806b362);
            U6.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[removeScene] index:");
            sb6.append(m8183xf806b362);
            sb6.append(" nextIndex:");
            sb6.append(i18);
            sb6.append(' ');
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e Z6 = U6.Z6();
            sb6.append(Z6 != null ? Z6.m33110xafec6a71() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageControlUIC", sb6.toString());
            java.lang.String d77 = U6.d7(m8183xf806b362);
            if (d77 != null && (d76 = U6.d7(i18)) != null) {
                com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8 = U6.f421608r;
                if (c4063x855a1ef8 != null) {
                    c4063x855a1ef8.l(d77, d76);
                }
                U6.X6(false, new nu0.e0(j3Var, U6, m8183xf806b362));
            }
            nu0.i q76 = g2Var.f421476a.q7();
            q76.V6("edit_delete_photo", "view_clk", q76.U6());
        }
        this.f383217b = false;
        int i19 = this.f383219d;
        if (i19 == -1 || (i17 = this.f383220e) == -1) {
            return;
        }
        nu0.b4 b4Var3 = ((nu0.g2) this.f383216a).f421476a;
        b4Var3.getClass();
        int i27 = i19 < i17 ? i17 + 1 : i17;
        nu0.q0 U62 = b4Var3.U6();
        nu0.q2 q2Var = new nu0.q2(i19, b4Var3, i17);
        U62.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageControlUIC", "[moveScene] from:" + i19 + " to:" + i27);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[moveScene] ");
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef82 = U62.f421608r;
        if (c4063x855a1ef82 == null || (m33150x5a8a256c2 = c4063x855a1ef82.m33150x5a8a256c()) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(m33150x5a8a256c2.length);
            for (com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e c4060x7aac656e : m33150x5a8a256c2) {
                arrayList.add(c4060x7aac656e.m33110xafec6a71() + ' ');
            }
        }
        sb7.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageControlUIC", sb7.toString());
        java.lang.String d78 = U62.d7(i19);
        if (d78 != null) {
            java.lang.String d79 = U62.d7(i27);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageControlUIC", "[moveScene] fromSceneID:" + d78 + " toSceneID:" + d79);
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef83 = U62.f421608r;
            if (c4063x855a1ef83 != null) {
                c4063x855a1ef83.i(d78, d79);
            }
            U62.X6(false, new nu0.a0(U62, i19, i27, q2Var));
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[moveScene] ");
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef84 = U62.f421608r;
            if (c4063x855a1ef84 == null || (m33150x5a8a256c = c4063x855a1ef84.m33150x5a8a256c()) == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new java.util.ArrayList(m33150x5a8a256c.length);
                for (com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e c4060x7aac656e2 : m33150x5a8a256c) {
                    arrayList2.add(c4060x7aac656e2.m33110xafec6a71() + ' ');
                }
            }
            sb8.append(arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageControlUIC", sb8.toString());
        }
        this.f383219d = -1;
        this.f383220e = -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: getMoveThreshold */
    public float mo8118xbee83fe4(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        return (super.mo8118xbee83fe4(viewHolder) / 1.3f) / 1.3f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: isItemViewSwipeEnabled */
    public boolean mo8126x5b4a2f69() {
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: isLongPressDragEnabled */
    public boolean mo8127x3b3ada10() {
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onChildDraw */
    public void mo8128xf876e561(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, float f17, float f18, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        super.mo8128xf876e561(c17, recyclerView, viewHolder, f17 / 1.3f, f18 / 1.3f, i17, z17);
        if (this.f383217b && z17) {
            android.graphics.Rect rect = new android.graphics.Rect();
            android.view.View itemView = viewHolder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            itemView.getGlobalVisibleRect(rect);
            this.f383218c = rect;
            nu0.g2 g2Var = (nu0.g2) this.f383216a;
            g2Var.getClass();
            nu0.b4 b4Var = g2Var.f421476a;
            b4Var.getClass();
            android.graphics.Rect rect2 = new android.graphics.Rect();
            b4Var.l7().getGlobalVisibleRect(rect2);
            boolean intersect = rect.intersect(rect2);
            b4Var.l7().setBackgroundColor(b3.l.m9702x7444d5ad(b4Var.l7().getContext(), intersect ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560962ad5));
            int i18 = intersect ? com.p314xaae8f345.mm.R.raw.f81254xd098199 : com.p314xaae8f345.mm.R.raw.f81256x86b25b7b;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = b4Var.G;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deleteIcon");
                throw null;
            }
            c22699x3dcdb352.setImageResource(i18);
            int i19 = intersect ? com.p314xaae8f345.mm.R.C30867xcad56011.btx : com.p314xaae8f345.mm.R.C30867xcad56011.btw;
            android.widget.TextView textView = b4Var.H;
            if (textView != null) {
                textView.setText(b4Var.m158362x2fec8307(i19));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deleteTip");
                throw null;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSelectedChanged */
    public void mo8134xb54743ba(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        if (k3Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ItemTouchDragCallback", "[onSelectedChanged] actionState:" + i17);
        if (i17 == 2) {
            this.f383217b = true;
            k3Var.m8183xf806b362();
            nu0.b4 b4Var = ((nu0.g2) this.f383216a).f421476a;
            android.view.View l76 = b4Var.l7();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(l76, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initImageRecyclerView$callback$1", "onStartDrag", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(l76, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initImageRecyclerView$callback$1", "onStartDrag", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b4Var.i7().setVisibility(4);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSwiped */
    public void mo8135x59f07f29(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
    }
}

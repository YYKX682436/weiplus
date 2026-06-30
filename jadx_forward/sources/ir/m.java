package ir;

/* loaded from: classes15.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir.o f375408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir.q f375409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ir.o oVar, ir.q qVar) {
        super(0);
        this.f375408d = oVar;
        this.f375409e = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ir.o oVar = this.f375408d;
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.i iVar = (com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.i) oVar.f375414b;
        final com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = iVar.f295195d;
        ir.q qVar = this.f375409e;
        dVar.f295177t = qVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "onUpdateData: group size %s", java.lang.Integer.valueOf(qVar.f375423a.size()));
        if (((ir.q) dVar.f295177t).f375423a.size() > 0) {
            ir.t0 t0Var = (ir.t0) ((ir.q) dVar.f295177t).f375423a.get(0);
            if (t0Var instanceof ir.c1) {
                ir.c1 c1Var = (ir.c1) t0Var;
                dVar.f295183z = c1Var;
                dVar.O.f420571e = c1Var.f375356e.f375350d;
            } else {
                dVar.f295183z = null;
            }
            if (((ir.q) dVar.f295177t).f375425c.size() != 1 || dVar.f295183z == null) {
                dVar.f295172o.setVisibility(0);
            } else {
                dVar.f295172o.setVisibility(8);
            }
        }
        java.util.ArrayList data = ((ir.q) dVar.f295177t).f375425c;
        lr.f1 f1Var = dVar.f295174q;
        f1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.ArrayList arrayList = f1Var.f402050e;
        arrayList.clear();
        arrayList.addAll(data);
        if (f1Var.f402053h != null) {
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ir.y0) it.next()).f375452a.c(), f1Var.f402053h)) {
                    break;
                }
                i17++;
            }
            if (i17 < 0) {
                i17 = 0;
            }
            f1Var.y(i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "update %s, %s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(data.size()));
        java.util.ArrayList models = ((ir.q) dVar.f295177t).f375423a;
        lr.x xVar = dVar.f295164g;
        xVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(models, "models");
        java.util.ArrayList arrayList2 = xVar.f402139m;
        arrayList2.clear();
        arrayList2.addAll(models);
        dVar.Q.f420595j = dVar.f295175r.f375386l ? 1 : 0;
        int i18 = dVar.f295161d;
        int i19 = 0;
        while (true) {
            if (i19 < ((ir.q) dVar.f295177t).f375424b.size()) {
                if (((ir.r) ((ir.q) dVar.f295177t).f375424b.get(i19)).a(dVar.f295160c)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.K)) {
                        i18 = i19;
                        break;
                    }
                    i18 = i19;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.K) && ((ir.r) ((ir.q) dVar.f295177t).f375424b.get(i19)).a(dVar.K)) {
                    break;
                }
                i19++;
            } else {
                break;
            }
        }
        i19 = -1;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.K) && i19 != -1) {
            dVar.f295160c = dVar.K;
            i18 = i19;
        }
        if (iVar.f295194c) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = dVar.f295163f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(c1163xf1deaba4, arrayList3.toArray(), "com/tencent/mm/view/manager/SmileyPanelManager$2", "onUpdateData", "(Lcom/tencent/mm/emoji/model/panel/IEmojiPanelData;)V", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba4.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/view/manager/SmileyPanelManager$2", "onUpdateData", "(Lcom/tencent/mm/emoji/model/panel/IEmojiPanelData;)V", "Undefined", "scrollToPosition", "(I)V");
            dVar.k(i18, false);
            if (i18 < ((ir.q) dVar.f295177t).f375423a.size()) {
                ((ir.t0) ((ir.q) dVar.f295177t).f375423a.get(i18)).e();
                iVar.f295194c = false;
            }
        } else if (!dVar.f295166i.f412355j && dVar.f295177t != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = dVar.f295163f;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(c1163xf1deaba42, arrayList4.toArray(), "com/tencent/mm/view/manager/SmileyPanelManager", "checkTabSelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba42.a1(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(c1163xf1deaba42, "com/tencent/mm/view/manager/SmileyPanelManager", "checkTabSelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            if (i18 >= 0 && i18 < ((ir.q) dVar.f295177t).f375424b.size()) {
                final int i27 = ((ir.q) dVar.f295177t).f375426d + i18;
                if (dVar.f295172o != null) {
                    f1Var.y(i27);
                    dVar.f295172o.post(new java.lang.Runnable() { // from class: com.tencent.mm.view.manager.d$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d.this.f295172o;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                            arrayList5.add(java.lang.Integer.valueOf(i27));
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(c1163xf1deaba43, arrayList5.toArray(), "com/tencent/mm/view/manager/SmileyPanelManager", "lambda$checkTabSelected$1", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            c1163xf1deaba43.c1(((java.lang.Integer) arrayList5.get(0)).intValue());
                            yj0.a.f(c1163xf1deaba43, "com/tencent/mm/view/manager/SmileyPanelManager", "lambda$checkTabSelected$1", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        }
                    });
                }
                dVar.m(i18);
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 c0Var = oVar.f375417e;
        if (c0Var != null) {
            c0Var.a(new ir.k(oVar));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 c0Var2 = oVar.f375418f;
        if (c0Var2 != null) {
            c0Var2.a(new ir.l(oVar));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelData", "updateData: end");
        oVar.f375419g = false;
        if (oVar.f375420h) {
            oVar.f375420h = false;
            oVar.b();
        }
        return jz5.f0.f384359a;
    }
}

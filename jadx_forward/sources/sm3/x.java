package sm3;

/* loaded from: classes10.dex */
public final class x extends p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 {

    /* renamed from: a, reason: collision with root package name */
    public int f491448a;

    /* renamed from: b, reason: collision with root package name */
    public int f491449b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 f491450c;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0) {
        this.f491450c = c16708x2eab1ea0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: getMovementFlags */
    public int mo8119x457acf62(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        if (!(this.f491450c.getSelectedIndex() != -1) && recyclerView.mo7958x54496c8e() == 0 && (viewHolder instanceof sm3.n)) {
            return p012xc85e97e9.p103xe821e364.p104xd1075a44.a1.m8110x3388cfca(15, 0);
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onChildDraw */
    public void mo8128xf876e561(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, float f17, float f18, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        if (i17 != 2) {
            super.mo8128xf876e561(c17, recyclerView, viewHolder, f17, f18, i17, z17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0 = this.f491450c;
        sm3.u callback = c16708x2eab1ea0.getCallback();
        if (callback != null) {
            ((mm3.h) callback).a(c16708x2eab1ea0.f233555r + f18, sm3.v.f491444d, c16708x2eab1ea0.getDraggingIndex());
        }
        super.mo8128xf876e561(c17, recyclerView, viewHolder, f17 - this.f491448a, f18, i17, z17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onMove */
    public boolean mo8132xc39cb650(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        if (!(viewHolder instanceof sm3.n) || !(target instanceof sm3.n)) {
            return false;
        }
        sm3.n nVar = (sm3.n) viewHolder;
        int i17 = nVar.i();
        sm3.n nVar2 = (sm3.n) target;
        int i18 = nVar2.i();
        this.f491449b = nVar2.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvTracksEditView", "move " + i17 + " => " + i18);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
        if (mo7946xf939df19 == null) {
            return true;
        }
        mo7946xf939df19.m8150x87567217(nVar.m8183xf806b362(), nVar2.m8183xf806b362());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016b  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSelectedChanged */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8134xb54743ba(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r19, int r20) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sm3.x.mo8134xb54743ba(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSwiped */
    public void mo8135x59f07f29(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
    }
}

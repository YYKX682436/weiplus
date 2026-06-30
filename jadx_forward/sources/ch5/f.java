package ch5;

/* loaded from: classes14.dex */
public final class f extends p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 f123096a;

    public f(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184) {
        this.f123096a = c22418xd23ce184;
    }

    public static void l(ch5.f fVar, int i17, int i18, yz5.l lVar, yz5.a aVar, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            lVar = null;
        }
        if ((i19 & 8) != 0) {
            aVar = null;
        }
        fVar.getClass();
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
        ofInt.setDuration(200L);
        ch5.d dVar = new ch5.d(fVar.f123096a, lVar);
        ch5.c cVar = new ch5.c(aVar, ofInt, dVar);
        ofInt.addUpdateListener(dVar);
        ofInt.addListener(cVar);
        ofInt.start();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int a(android.view.View child, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(android.view.View r1, int r2, int r3) {
        /*
            r0 = this;
            java.lang.String r3 = "child"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r3)
            r1 = 0
            if (r2 < 0) goto L12
            com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout r3 = r0.f123096a
            int r3 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184.a(r3)
            if (r2 > r3) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = r1
        L13:
            if (r3 == 0) goto L16
            goto L17
        L16:
            r2 = r1
        L17:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ch5.f.b(android.view.View, int, int):int");
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int d(android.view.View child) {
        int m80694x58bb39e6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        m80694x58bb39e6 = this.f123096a.m80694x58bb39e6();
        return m80694x58bb39e6;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void h(int i17) {
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184;
        yz5.p dragStatusBlock;
        if (i17 != 1 || (dragStatusBlock = (c22418xd23ce184 = this.f123096a).getDragStatusBlock()) == null) {
            return;
        }
        dragStatusBlock.mo149xb9724478("STATE_WILL_CHANGE_HEIGHT", java.lang.String.valueOf(c22418xd23ce184.getCurVisiblePercent()));
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void i(android.view.View changedView, int i17, int i18, int i19, int i27) {
        int m80694x58bb39e6;
        int m80694x58bb39e62;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changedView, "changedView");
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184 = this.f123096a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(changedView, c22418xd23ce184.f290362f)) {
            c22418xd23ce184.f290366m = i18;
            yz5.l dragTranslationListener = c22418xd23ce184.getDragTranslationListener();
            if (dragTranslationListener != null) {
                m80694x58bb39e6 = c22418xd23ce184.m80694x58bb39e6();
                m80694x58bb39e62 = c22418xd23ce184.m80694x58bb39e6();
                dragTranslationListener.mo146xb9724478(java.lang.Float.valueOf((m80694x58bb39e6 - i18) / m80694x58bb39e62));
            }
        }
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        int m80694x58bb39e6;
        int m80694x58bb39e62;
        int m80694x58bb39e63;
        int m80694x58bb39e64;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(releasedChild, "releasedChild");
        int top = releasedChild.getTop();
        double d17 = top;
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184 = this.f123096a;
        m80694x58bb39e6 = c22418xd23ce184.m80694x58bb39e6();
        if (d17 <= m80694x58bb39e6 * 0.2d) {
            l(this, top, 0, null, new ch5.a(c22418xd23ce184), 4, null);
        } else {
            m80694x58bb39e62 = c22418xd23ce184.m80694x58bb39e6();
            if (d17 < m80694x58bb39e62 * 0.8d) {
                m80694x58bb39e63 = c22418xd23ce184.m80694x58bb39e6();
                l(this, top, (int) (m80694x58bb39e63 * 0.35d), null, new ch5.b(c22418xd23ce184), 4, null);
            } else if (!c22418xd23ce184.f290365i) {
                c22418xd23ce184.f290365i = true;
                ch5.e eVar = new ch5.e(c22418xd23ce184);
                android.view.View view = c22418xd23ce184.f290362f;
                if (view != null) {
                    int top2 = view.getTop();
                    m80694x58bb39e64 = c22418xd23ce184.m80694x58bb39e6();
                    l(this, top2, m80694x58bb39e64, null, eVar, 4, null);
                }
            }
        }
        c22418xd23ce184.invalidate();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public boolean k(android.view.View child, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        int i18 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184.f290359q;
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184 = this.f123096a;
        c22418xd23ce184.getClass();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(child, c22418xd23ce184.f290362f);
    }
}

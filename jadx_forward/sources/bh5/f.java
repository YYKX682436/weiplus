package bh5;

/* loaded from: classes14.dex */
public final class f extends p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22412x5e02431c f102463a;

    public f(com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22412x5e02431c c22412x5e02431c) {
        this.f102463a = c22412x5e02431c;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int a(android.view.View child, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        return 0;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int b(android.view.View child, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        if (i17 >= 0) {
            return i17;
        }
        return 0;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int d(android.view.View child) {
        int m80683x58bb39e6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        m80683x58bb39e6 = this.f102463a.m80683x58bb39e6();
        return m80683x58bb39e6;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.view.View r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            java.lang.String r3 = "changedView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r3)
            com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout r3 = r1.f102463a
            boolean r5 = r3.isRecordDragPosition
            if (r5 == 0) goto L12
            bh5.g r5 = new bh5.g
            r5.<init>(r2)
            r3.f290330n = r5
        L12:
            bh5.e r5 = r3.getPullDownCallback()
            if (r5 == 0) goto L2c
            bh5.q0 r5 = (bh5.q0) r5
            com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment r5 = r5.f102489a
            int r6 = r5.f290351v
            int r6 = r6 - r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r5.D = r0
            int r0 = r5.f290351v
            bh5.a0 r5 = r5.f290352w
            r5.b(r6, r0)
        L2c:
            android.view.View r5 = r3.f290325f
            if (r2 != r5) goto L38
            int r2 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22412x5e02431c.a(r3)
            if (r4 < r2) goto L38
            r2 = 1
            goto L39
        L38:
            r2 = 0
        L39:
            if (r2 == 0) goto L3e
            r1.l()
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bh5.f.i(android.view.View, int, int, int, int):void");
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        float m80684xc0319601;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(releasedChild, "releasedChild");
        float top = releasedChild.getTop();
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22412x5e02431c c22412x5e02431c = this.f102463a;
        m80684xc0319601 = c22412x5e02431c.m80684xc0319601();
        boolean z17 = top <= m80684xc0319601;
        bh5.e pullDownCallback = c22412x5e02431c.getPullDownCallback();
        if (pullDownCallback != null) {
            bh5.q0 q0Var = (bh5.q0) pullDownCallback;
            if (!z17) {
                com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7 = q0Var.f102489a;
                c22415x6ef905d7.getClass();
                ((jz5.n) c22415x6ef905d7.B).mo141623x754a37bb();
            }
        }
        if (z17) {
            p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = c22412x5e02431c.f290327h;
            if (lVar != null) {
                lVar.s(0, 0);
            }
        } else {
            l();
        }
        c22412x5e02431c.invalidate();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public boolean k(android.view.View child, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        int i18 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22412x5e02431c.f290322p;
        this.f102463a.getClass();
        return true;
    }

    public final void l() {
        android.app.Activity activity;
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22412x5e02431c c22412x5e02431c = this.f102463a;
        if (c22412x5e02431c.f290328i) {
            return;
        }
        c22412x5e02431c.f290328i = true;
        yz5.a dragFinishInterceptor = c22412x5e02431c.getDragFinishInterceptor();
        if ((dragFinishInterceptor != null && ((java.lang.Boolean) dragFinishInterceptor.mo152xb9724478()).booleanValue()) || (activity = c22412x5e02431c.f290326g) == null) {
            return;
        }
        activity.finish();
    }
}

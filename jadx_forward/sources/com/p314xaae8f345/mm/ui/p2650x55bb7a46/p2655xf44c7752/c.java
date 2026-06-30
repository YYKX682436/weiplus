package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes14.dex */
public final class c extends p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21742xc037988c f282358a;

    public c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21742xc037988c c21742xc037988c) {
        this.f282358a = c21742xc037988c;
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
        int m79568x58bb39e6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        m79568x58bb39e6 = this.f282358a.m79568x58bb39e6();
        return m79568x58bb39e6;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void g(android.view.View child, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21742xc037988c c21742xc037988c = this.f282358a;
        db5.f.c(c21742xc037988c.f282065g, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.b(atomicInteger, c21742xc037988c));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.view.View r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            java.lang.String r2 = "changedView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r2)
            com.tencent.mm.ui.chatting.gallery.ActivityPullDownCloseLayout r2 = r0.f282358a
            android.view.View r4 = r2.f282064f
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r4)
            if (r4 == 0) goto L11
            r2.f282072q = r3
        L11:
            android.view.View r4 = r2.f282064f
            if (r1 != r4) goto L1d
            int r4 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21742xc037988c.a(r2)
            if (r3 < r4) goto L1d
            r4 = 1
            goto L1e
        L1d:
            r4 = 0
        L1e:
            if (r3 <= 0) goto L2a
            yz5.l r2 = r2.getDragTranslationListener()
            if (r2 == 0) goto L33
            r2.mo146xb9724478(r1)
            goto L33
        L2a:
            yz5.l r2 = r2.getDragFullScreenListener()
            if (r2 == 0) goto L33
            r2.mo146xb9724478(r1)
        L33:
            if (r4 == 0) goto L38
            r0.l()
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c.i(android.view.View, int, int, int, int):void");
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        int m79568x58bb39e6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(releasedChild, "releasedChild");
        float top = releasedChild.getTop();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21742xc037988c c21742xc037988c = this.f282358a;
        m79568x58bb39e6 = c21742xc037988c.m79568x58bb39e6();
        if (top <= ((float) m79568x58bb39e6) * c21742xc037988c.f282067i) {
            p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = c21742xc037988c.f282066h;
            if (lVar != null) {
                lVar.s(0, 0);
            }
        } else {
            l();
        }
        c21742xc037988c.invalidate();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public boolean k(android.view.View child, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        android.view.ViewGroup viewGroup = this.f282358a.f282063e;
        if (viewGroup == null) {
            return true;
        }
        viewGroup.setBackgroundColor(0);
        return true;
    }

    public final void l() {
        android.app.Activity activity;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21742xc037988c c21742xc037988c = this.f282358a;
        if (c21742xc037988c.f282070o) {
            return;
        }
        c21742xc037988c.f282070o = true;
        yz5.a dragFinishInterceptor = c21742xc037988c.getDragFinishInterceptor();
        if ((dragFinishInterceptor != null && ((java.lang.Boolean) dragFinishInterceptor.mo152xb9724478()).booleanValue()) || (activity = c21742xc037988c.f282065g) == null) {
            return;
        }
        activity.finish();
    }
}

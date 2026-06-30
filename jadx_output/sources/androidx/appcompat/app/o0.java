package androidx.appcompat.app;

/* loaded from: classes15.dex */
public final class o0 implements o.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.q0 f9200d;

    public o0(androidx.appcompat.app.q0 q0Var) {
        this.f9200d = q0Var;
    }

    @Override // o.p
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r1 != null && r1.m()) != false) goto L15;
     */
    @Override // o.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(o.r r6) {
        /*
            r5 = this;
            androidx.appcompat.app.q0 r0 = r5.f9200d
            android.view.Window$Callback r1 = r0.f9206c
            if (r1 == 0) goto L3e
            androidx.appcompat.widget.x0 r1 = r0.f9204a
            androidx.appcompat.widget.z2 r1 = (androidx.appcompat.widget.z2) r1
            androidx.appcompat.widget.Toolbar r1 = r1.f9747a
            androidx.appcompat.widget.ActionMenuView r1 = r1.f9478d
            r2 = 0
            if (r1 == 0) goto L22
            androidx.appcompat.widget.q r1 = r1.f9340z
            r3 = 1
            if (r1 == 0) goto L1e
            boolean r1 = r1.m()
            if (r1 == 0) goto L1e
            r1 = r3
            goto L1f
        L1e:
            r1 = r2
        L1f:
            if (r1 == 0) goto L22
            goto L23
        L22:
            r3 = r2
        L23:
            android.view.Window$Callback r0 = r0.f9206c
            r1 = 108(0x6c, float:1.51E-43)
            if (r3 == 0) goto L2f
            n.m r0 = (n.m) r0
            r0.onPanelClosed(r1, r6)
            goto L3e
        L2f:
            r3 = 0
            r4 = r0
            androidx.appcompat.app.p0 r4 = (androidx.appcompat.app.p0) r4
            boolean r2 = r4.onPreparePanel(r2, r3, r6)
            if (r2 == 0) goto L3e
            n.m r0 = (n.m) r0
            r0.onMenuOpened(r1, r6)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.o0.d(o.r):void");
    }
}

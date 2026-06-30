package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.RadioBelowSummarytAndIconPreference */
/* loaded from: classes4.dex */
public class C19037xa7790f87 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public android.widget.LinearLayout M;
    public android.widget.ImageView N;
    public android.view.View P;
    public int Q;
    public android.view.View.OnClickListener R;

    public C19037xa7790f87(android.content.Context context) {
        super(context);
        this.Q = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(android.view.View r5) {
        /*
            r4 = this;
            super.t(r5)
            r0 = 8
            r4.E(r0)
            android.widget.ImageView r1 = r4.N
            if (r1 == 0) goto L33
            android.view.View$OnClickListener r2 = r4.R
            if (r2 == 0) goto L33
            int r2 = r4.Q
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r2 != 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 != 0) goto L33
            r1.setImageResource(r2)
            android.widget.ImageView r1 = r4.N
            com.tencent.mm.plugin.wallet.pwd.ui.a r2 = new com.tencent.mm.plugin.wallet.pwd.ui.a
            r2.<init>(r4, r5)
            r1.post(r2)
            android.view.View r5 = r4.P
            com.tencent.mm.plugin.wallet.pwd.ui.b r1 = new com.tencent.mm.plugin.wallet.pwd.ui.b
            r1.<init>(r4)
            r5.setOnClickListener(r1)
            goto L38
        L33:
            if (r1 == 0) goto L38
            r1.setVisibility(r0)
        L38:
            android.widget.LinearLayout r5 = r4.M
            if (r5 == 0) goto L50
            int r1 = r4.H
            if (r1 == 0) goto L4d
            r5.removeAllViews()
            int r5 = r4.H
            android.widget.LinearLayout r0 = r4.M
            android.content.Context r1 = r4.f279303d
            android.view.View.inflate(r1, r5, r0)
            goto L50
        L4d:
            r5.setVisibility(r0)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19037xa7790f87.t(android.view.View):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            this.M = (android.widget.LinearLayout) u17.findViewById(android.R.id.widget_frame);
            android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570832c15, viewGroup2);
            this.N = (android.widget.ImageView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.nsd);
            this.P = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.nsb);
            this.L = u17;
        }
        return this.L;
    }

    public C19037xa7790f87(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = 0;
    }

    public C19037xa7790f87(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.Q = 0;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.FriendPreference */
/* loaded from: classes.dex */
public class C16854x6baba39 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements kv.e0 {
    public android.widget.TextView L;

    public C16854x6baba39(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // kv.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.Class<kv.c0> r0 = kv.c0.class
            i95.m r1 = i95.n0.c(r0)
            kv.c0 r1 = (kv.c0) r1
            com.tencent.mm.feature.avatar.w r1 = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) r1
            r1.getClass()
            boolean r1 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(r11)
            r2 = 0
            java.lang.String r3 = "@"
            r4 = -1
            if (r1 != 0) goto L19
            goto L24
        L19:
            java.lang.String[] r1 = r11.split(r3)
            r1 = r1[r2]     // Catch: java.lang.Exception -> L24
            long r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(r1, r4)     // Catch: java.lang.Exception -> L24
            goto L25
        L24:
            r6 = r4
        L25:
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 <= 0) goto L3d
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L3d
            i95.m r1 = i95.n0.c(r0)
            kv.c0 r1 = (kv.c0) r1
            com.tencent.mm.feature.avatar.w r1 = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) r1
            r1.getClass()
            com.p314xaae8f345.mm.p943x351df9c2.g.a(r11)
        L3d:
            com.tencent.mm.sdk.platformtools.r2 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2
            if (r11 == 0) goto L4b
            java.lang.String r1 = "@fb"
            boolean r1 = r11.endsWith(r1)
            if (r1 == 0) goto L4b
            r1 = 1
            goto L4c
        L4b:
            r1 = r2
        L4c:
            if (r1 != 0) goto L4f
            goto L59
        L4f:
            java.lang.String[] r1 = r11.split(r3)
            r1 = r1[r2]     // Catch: java.lang.Exception -> L59
            long r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(r1, r4)     // Catch: java.lang.Exception -> L59
        L59:
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 != 0) goto L6b
            i95.m r0 = i95.n0.c(r0)
            kv.c0 r0 = (kv.c0) r0
            com.tencent.mm.feature.avatar.w r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) r0
            r0.getClass()
            com.p314xaae8f345.mm.p943x351df9c2.g.a(r11)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16854x6baba39.U(java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public java.lang.CharSequence n() {
        return this.L.getText().toString();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        this.L = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ns9);
        super.t(view);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bzf, viewGroup2);
        return u17;
    }

    public C16854x6baba39(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
        this.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570827c10;
    }
}

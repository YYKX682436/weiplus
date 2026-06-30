package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class i5 extends xt2.m6 implements jf2.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f200169d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f200170e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f200171f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f200172g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f200173h;

    public i5(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f200169d = root;
        this.f200170e = "Finder.FinderLiveAnchorFlipCameraWidget";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.tzr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f200171f = findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.tzt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f200172g = imageView;
        this.f200173h = true;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h5(this));
        android.graphics.drawable.Drawable drawable = root.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79858xd45c1c24);
        com.p314xaae8f345.mm.ui.uk.f(drawable, root.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        imageView.setImageDrawable(drawable);
    }

    @Override // jf2.h
    public void b() {
        android.view.ViewGroup viewGroup = this.f200169d;
        if (viewGroup.getVisibility() != 0 || this.f200173h) {
            this.f200173h = false;
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80262xf98eb1e4), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.mir));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f200171f.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f200169d.findViewById(com.p314xaae8f345.mm.R.id.tzr);
    }

    @Override // jf2.h
    public void g() {
        this.f200169d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f200169d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if ((r2 != null && r2.f7()) == false) goto L31;
     */
    @Override // jf2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i() {
        /*
            r6 = this;
            dk2.ef r0 = dk2.ef.f314905a
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            androidx.lifecycle.c1 r2 = r0.i(r1)
            mm2.c1 r2 = (mm2.c1) r2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L14
            boolean r2 = r2.X2
            if (r2 != r3) goto L14
            r2 = r3
            goto L15
        L14:
            r2 = r4
        L15:
            r5 = 0
            if (r2 == 0) goto L4d
            androidx.lifecycle.c1 r2 = r0.i(r1)
            mm2.c1 r2 = (mm2.c1) r2
            if (r2 == 0) goto L23
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r2.W2
            goto L24
        L23:
            r2 = r5
        L24:
            if (r2 == 0) goto L4d
            androidx.lifecycle.c1 r2 = r0.i(r1)
            mm2.c1 r2 = (mm2.c1) r2
            if (r2 == 0) goto L34
            boolean r2 = r2.f410311a5
            if (r2 != r3) goto L34
            r2 = r3
            goto L35
        L34:
            r2 = r4
        L35:
            if (r2 == 0) goto L4d
            java.lang.Class<mm2.e1> r2 = mm2.e1.class
            androidx.lifecycle.c1 r2 = r0.i(r2)
            mm2.e1 r2 = (mm2.e1) r2
            if (r2 == 0) goto L49
            boolean r2 = r2.f7()
            if (r2 != r3) goto L49
            r2 = r3
            goto L4a
        L49:
            r2 = r4
        L4a:
            if (r2 != 0) goto L4d
            goto L4e
        L4d:
            r3 = r4
        L4e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "canshow3d: "
            r2.<init>(r4)
            androidx.lifecycle.c1 r4 = r0.i(r1)
            mm2.c1 r4 = (mm2.c1) r4
            if (r4 == 0) goto L64
            boolean r4 = r4.X2
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L65
        L64:
            r4 = r5
        L65:
            r2.append(r4)
            java.lang.String r4 = ", info: "
            r2.append(r4)
            androidx.lifecycle.c1 r0 = r0.i(r1)
            mm2.c1 r0 = (mm2.c1) r0
            if (r0 == 0) goto L77
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r5 = r0.W2
        L77:
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = r6.f200170e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i5.i():boolean");
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        return this.f200172g;
    }

    @Override // jf2.h
    /* renamed from: type */
    public int mo58036x368f3a() {
        return 25;
    }
}

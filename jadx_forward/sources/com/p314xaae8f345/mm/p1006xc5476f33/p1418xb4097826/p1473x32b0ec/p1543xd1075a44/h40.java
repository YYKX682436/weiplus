package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class h40 extends xt2.m6 implements jf2.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f200076d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f200077e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f200078f;

    public h40(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f200076d = root;
        this.f200077e = basePlugin;
        this.f200078f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g40(this));
        root.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f40(this));
        root.setVisibility(8);
    }

    @Override // jf2.h
    public void b() {
        this.f200076d.setVisibility(0);
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79544x1f7b105a), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f573211m02));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f200076d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f200076d.findViewById(com.p314xaae8f345.mm.R.id.qxt);
    }

    @Override // jf2.h
    public void g() {
        this.f200076d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f200076d;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // jf2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i() {
        /*
            r7 = this;
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r7.f200077e
            java.lang.Class<mm2.e1> r1 = mm2.e1.class
            androidx.lifecycle.c1 r0 = r0.P0(r1)
            mm2.e1 r0 = (mm2.e1) r0
            boolean r0 = r0.g7()
            r1 = 0
            if (r0 == 0) goto L6e
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r7.f200077e
            java.lang.Class<mm2.e1> r2 = mm2.e1.class
            androidx.lifecycle.c1 r0 = r0.P0(r2)
            mm2.e1 r0 = (mm2.e1) r0
            java.util.LinkedList r0 = r0.G
            if (r0 != 0) goto L33
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r7.f200077e
            java.lang.Class<mm2.s1> r2 = mm2.s1.class
            androidx.lifecycle.c1 r0 = r0.P0(r2)
            mm2.s1 r0 = (mm2.s1) r0
            kotlinx.coroutines.flow.j2 r0 = r0.f410921h
            kotlinx.coroutines.flow.h3 r0 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r0
            java.lang.Object r0 = r0.mo144003x754a37bb()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
        L33:
            r2 = 1
            if (r0 == 0) goto L6a
            monitor-enter(r0)
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L67
        L3b:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L67
            if (r4 == 0) goto L55
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L67
            r5 = r4
            r45.p12 r5 = (r45.p12) r5     // Catch: java.lang.Throwable -> L67
            int r5 = r5.m75939xb282bd08(r1)     // Catch: java.lang.Throwable -> L67
            r6 = 2
            if (r5 != r6) goto L51
            r5 = r2
            goto L52
        L51:
            r5 = r1
        L52:
            if (r5 == 0) goto L3b
            goto L56
        L55:
            r4 = 0
        L56:
            monitor-exit(r0)
            r45.p12 r4 = (r45.p12) r4
            if (r4 == 0) goto L6a
            r0 = 3
            int r0 = r4.m75939xb282bd08(r0)
            r3 = 8
            boolean r0 = pm0.v.z(r0, r3)
            goto L6b
        L67:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L6a:
            r0 = r1
        L6b:
            if (r0 == 0) goto L6e
            r1 = r2
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h40.i():boolean");
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f200076d.findViewById(com.p314xaae8f345.mm.R.id.qs_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    @Override // jf2.h
    /* renamed from: type */
    public int mo58036x368f3a() {
        return 18;
    }
}

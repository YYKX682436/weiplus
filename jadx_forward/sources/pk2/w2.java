package pk2;

/* loaded from: classes3.dex */
public final class w2 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437853h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437854i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f437855j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437853h = helper.f437618g0;
        this.f437854i = "";
        this.f437855j = true;
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) this.f445960a.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class);
        if (r5Var != null) {
            if2.b.Y6(r5Var, qo0.b.f446977z2, null, 2, null);
        }
    }

    @Override // qk2.f
    public boolean h() {
        return this.f437855j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437854i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        if ((r4 != null) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.c1) r0.c(mm2.c1.class)).f410338f6.mo3195x754a37bb(), java.lang.Boolean.TRUE) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x008d, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    @Override // qk2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o() {
        /*
            r9 = this;
            pk2.o9 r0 = r9.f445960a
            boolean r1 = r0.h()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L8f
            gk2.e r1 = r0.f437607b
            java.lang.Class<mm2.e1> r4 = mm2.e1.class
            androidx.lifecycle.c1 r1 = r1.a(r4)
            mm2.e1 r1 = (mm2.e1) r1
            r45.q12 r1 = r1.f410522s
            zl2.r4 r4 = zl2.r4.f555483a
            boolean r1 = r4.T1(r1)
            java.lang.Class<mm2.c1> r4 = mm2.c1.class
            if (r1 == 0) goto L35
            androidx.lifecycle.c1 r1 = r0.c(r4)
            mm2.c1 r1 = (mm2.c1) r1
            androidx.lifecycle.j0 r1 = r1.f410338f6
            java.lang.Object r1 = r1.mo3195x754a37bb()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r4)
            if (r1 == 0) goto L8f
            goto L8d
        L35:
            gk2.e r1 = r0.f437607b
            java.lang.String r5 = "buContext"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r5)
            java.lang.Class<mm2.g1> r5 = mm2.g1.class
            androidx.lifecycle.c1 r5 = r1.a(r5)
            mm2.g1 r5 = (mm2.g1) r5
            kotlinx.coroutines.flow.j2 r5 = r5.f410605m
            kotlinx.coroutines.flow.h3 r5 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r5
            java.lang.Object r5 = r5.mo144003x754a37bb()
            r45.fd2 r5 = (r45.fd2) r5
            androidx.lifecycle.c1 r1 = r1.a(r4)
            mm2.c1 r1 = (mm2.c1) r1
            r45.zq1 r1 = r1.f410356i6
            r4 = 0
            if (r1 == 0) goto L5e
            java.util.LinkedList r1 = r1.m75941xfb821914(r3)
            goto L5f
        L5e:
            r1 = r4
        L5f:
            if (r1 == 0) goto L86
            java.util.Iterator r1 = r1.iterator()
        L65:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L84
            java.lang.Object r6 = r1.next()
            r7 = r6
            r45.fd2 r7 = (r45.fd2) r7
            if (r5 == 0) goto L80
            int r7 = r7.m75939xb282bd08(r3)
            int r8 = r5.m75939xb282bd08(r3)
            if (r7 != r8) goto L80
            r7 = r2
            goto L81
        L80:
            r7 = r3
        L81:
            if (r7 == 0) goto L65
            r4 = r6
        L84:
            r45.fd2 r4 = (r45.fd2) r4
        L86:
            if (r4 == 0) goto L8a
            r1 = r2
            goto L8b
        L8a:
            r1 = r3
        L8b:
            if (r1 == 0) goto L8f
        L8d:
            r1 = r2
            goto L90
        L8f:
            r1 = r3
        L90:
            java.lang.Class<com.tencent.mm.plugin.finder.live.viewmodel.r5> r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r0.e(r4)
            com.tencent.mm.plugin.finder.live.viewmodel.r5 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) r0
            if (r0 == 0) goto La0
            r4 = 2
            boolean r0 = r0.b7(r4)
            goto La1
        La0:
            r0 = r3
        La1:
            r0 = r0 ^ r2
            if (r0 == 0) goto La7
            if (r1 == 0) goto La7
            goto La8
        La7:
            r2 = r3
        La8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.w2.o():boolean");
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437853h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573288e50);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f79454x559dc51c, o9Var.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    @Override // qk2.h
    public int y() {
        return this.f437853h;
    }
}

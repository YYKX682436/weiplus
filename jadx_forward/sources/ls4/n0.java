package ls4;

/* loaded from: classes8.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.e f402620a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f402621b;

    public n0(pr4.e parameter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        this.f402620a = parameter;
    }

    public static final void c(ls4.n0 n0Var) {
        ot5.g.c("WeCoinSubscribeMemberLogic", "show error");
        ls4.h0 h0Var = ls4.h0.f402594d;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = n0Var.f402620a.f439520a;
        db5.e1.E(activityC1102x9ee2d9f, activityC1102x9ee2d9f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhn), "", n0Var.f402620a.f439520a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l9_), false, h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(pr4.h r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ls4.f0
            if (r0 == 0) goto L13
            r0 = r11
            ls4.f0 r0 = (ls4.f0) r0
            int r1 = r0.f402588i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f402588i = r1
            goto L18
        L13:
            ls4.f0 r0 = new ls4.f0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f402586g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f402588i
            r3 = 0
            r4 = 0
            java.lang.String r5 = "WeCoinSubscribeMemberLogic"
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L3f
            if (r2 == r7) goto L37
            if (r2 != r6) goto L2f
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Lbe
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            java.lang.Object r10 = r0.f402583d
            ls4.n0 r10 = (ls4.n0) r10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L6d
        L3f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.lang.String r11 = "continueSubscribe"
            ot5.g.c(r5, r11)
            java.lang.String r11 = "startLoading"
            ot5.g.c(r5, r11)
            pr4.e r11 = r9.f402620a
            androidx.fragment.app.FragmentActivity r11 = r11.f439520a
            r2 = 2131770608(0x7f103cf0, float:1.9172524E38)
            java.lang.String r2 = r11.getString(r2)
            r8 = 3
            com.tencent.mm.ui.widget.dialog.u3 r11 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(r11, r2, r3, r8, r4)
            r9.f402621b = r11
            yz5.l r10 = r10.f439537d
            r0.f402583d = r9
            r0.f402588i = r7
            java.lang.Object r11 = r10.mo146xb9724478(r0)
            if (r11 != r1) goto L6c
            return r1
        L6c:
            r10 = r9
        L6d:
            byte[] r11 = (byte[]) r11
            r10.getClass()
            java.lang.String r2 = "endLoading"
            ot5.g.c(r5, r2)
            com.tencent.mm.ui.widget.dialog.u3 r2 = r10.f402621b
            if (r2 == 0) goto L7e
            r2.dismiss()
        L7e:
            r10.f402621b = r4
            pr4.o r2 = new pr4.o
            pr4.i r4 = pr4.i.f439542d
            r2.<init>(r4)
            if (r11 == 0) goto Lbf
            int r4 = r11.length
            if (r4 != 0) goto L8d
            r3 = r7
        L8d:
            if (r3 == 0) goto L90
            goto Lbf
        L90:
            r0.f402583d = r10
            r0.f402584e = r11
            r0.f402585f = r2
            r0.f402588i = r6
            oz5.n r3 = new oz5.n
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r3.<init>(r0)
            pr4.m r0 = new pr4.m
            pr4.e r4 = r10.f402620a
            androidx.fragment.app.FragmentActivity r4 = r4.f439520a
            ls4.g0 r5 = new ls4.g0
            r5.<init>(r3, r2, r10)
            r0.<init>(r4, r11, r5)
            ls4.e0 r10 = new ls4.e0
            r10.<init>(r0)
            r10.d()
            java.lang.Object r11 = r3.a()
            if (r11 != r1) goto Lbe
            return r1
        Lbe:
            return r11
        Lbf:
            java.lang.String r11 = "getOrderBuff == null || isEmpty"
            ot5.g.a(r5, r11)
            r10.b()
            pr4.f r10 = new pr4.f
            pr4.g r11 = pr4.g.f439530d
            r10.<init>(r11, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ls4.n0.a(pr4.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = this.f402620a.f439520a;
        if (!(activityC1102x9ee2d9f instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            ot5.g.c("WeCoinSubscribeMemberLogic", "context is not MMActivity");
            c(this);
        } else if (((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC1102x9ee2d9f).m78540x95dccf6f()) {
            ot5.g.c("WeCoinSubscribeMemberLogic", "already show error");
        } else {
            c(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(pr4.h r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ls4.n0.d(pr4.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ls4.m0
            if (r0 == 0) goto L13
            r0 = r9
            ls4.m0 r0 = (ls4.m0) r0
            int r1 = r0.f402618g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f402618g = r1
            goto L18
        L13:
            ls4.m0 r0 = new ls4.m0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f402616e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f402618g
            java.lang.String r3 = "WeCoinSubscribeMemberLogic"
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L44
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto La8
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L9c
        L3c:
            java.lang.Object r2 = r0.f402615d
            ls4.n0 r2 = (ls4.n0) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L79
        L44:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.String r9 = "start"
            ot5.g.c(r3, r9)
            ns4.b4 r9 = new ns4.b4
            pr4.e r2 = r8.f402620a
            androidx.fragment.app.FragmentActivity r7 = r2.f439520a
            r9.<init>(r7, r2)
            r0.f402615d = r8
            r0.f402618g = r6
            java.lang.String r2 = "WeCoinSubscribePanel"
            java.lang.String r6 = "getPricerTier"
            ot5.g.c(r2, r6)
            oz5.n r2 = new oz5.n
            kotlin.coroutines.Continuation r6 = pz5.f.b(r0)
            r2.<init>(r6)
            r9.f420990q = r2
            com.tencent.mm.ui.widget.dialog.y1 r9 = r9.f420976c
            r9.s()
            java.lang.Object r9 = r2.a()
            if (r9 != r1) goto L78
            return r1
        L78:
            r2 = r8
        L79:
            pr4.h r9 = (pr4.h) r9
            r6 = 0
            if (r9 != 0) goto L8b
            java.lang.String r9 = "getPriceTier == null, user cancel"
            ot5.g.c(r3, r9)
            pr4.f r9 = new pr4.f
            pr4.g r0 = pr4.g.f439531e
            r9.<init>(r0, r6)
            return r9
        L8b:
            pr4.i r3 = pr4.i.f439543e
            pr4.i r7 = r9.f439536c
            if (r7 != r3) goto L9d
            r0.f402615d = r6
            r0.f402618g = r5
            java.lang.Object r9 = r2.d(r9, r0)
            if (r9 != r1) goto L9c
            return r1
        L9c:
            return r9
        L9d:
            r0.f402615d = r6
            r0.f402618g = r4
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto La8
            return r1
        La8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ls4.n0.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}

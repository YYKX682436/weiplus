package um2;

/* loaded from: classes3.dex */
public abstract class h6 {
    public static final void a(um2.x5 x5Var, java.lang.String source, android.view.ViewGroup root, android.view.ViewGroup shoppingListRoot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x5Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shoppingListRoot, "shoppingListRoot");
        fm2.c cVar = x5Var.f101139c;
        if (cVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x5Var.f510565f, source + " attachShoppingListPlugin shoppingListPlugin:" + x5Var.f510554J + '!');
            pm0.v.X(new um2.e6(x5Var, root, shoppingListRoot, cVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(um2.x5 r13, android.app.Activity r14, android.view.ViewGroup r15) {
        /*
            java.lang.String r0 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            java.lang.String r0 = "activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r0)
            fm2.c r0 = r13.f101139c
            if (r0 == 0) goto L65
            com.tencent.mm.plugin.finder.live.plugin.ga0 r0 = r13.f510554J
            if (r0 != 0) goto L65
            fh5.e r0 = r13.L
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            fh5.b r0 = r0.f344257c
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            boolean r0 = r0.f344252e
            if (r0 != r1) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L65
            fh5.e r0 = r13.L
            if (r0 == 0) goto L34
            java.util.concurrent.Future r0 = r0.f344258d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            xn5.d1 r0 = (xn5.d1) r0
            r0.cancel(r1)
        L34:
            if (r15 != 0) goto L4e
            xy2.b r3 = xy2.b.f539688b
            java.lang.String r4 = "liveInitContentViewError"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 124(0x7c, float:1.74E-43)
            r12 = 0
            pm0.z.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r14 = "syncInflateShoppingPlugin root is empty!"
            java.lang.String r13 = r13.f510565f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r13, r14)
            goto L65
        L4e:
            android.view.LayoutInflater r14 = r14.getLayoutInflater()
            r0 = 2131496169(0x7f0c0ce9, float:1.8615895E38)
            android.view.View r14 = r14.inflate(r0, r15, r2)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r14, r0)
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            java.lang.String r0 = "syncInflateShoppingPlugin"
            a(r13, r0, r15, r14)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: um2.h6.b(um2.x5, android.app.Activity, android.view.ViewGroup):void");
    }
}

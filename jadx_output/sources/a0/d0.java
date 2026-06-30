package a0;

/* loaded from: classes14.dex */
public abstract class d0 {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r2 == n0.n.f333620a) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(c0.o r3, n0.v2 r4, n0.o r5, int r6) {
        /*
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "pressedInteraction"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.Object r0 = n0.e1.f333492a
            n0.y0 r5 = (n0.y0) r5
            r0 = 1761107222(0x68f85d16, float:9.382912E24)
            r5.V(r0)
            r0 = r6 & 14
            if (r0 != 0) goto L23
            boolean r0 = r5.e(r3)
            if (r0 == 0) goto L20
            r0 = 4
            goto L21
        L20:
            r0 = 2
        L21:
            r0 = r0 | r6
            goto L24
        L23:
            r0 = r6
        L24:
            r1 = r6 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L34
            boolean r1 = r5.e(r4)
            if (r1 == 0) goto L31
            r1 = 32
            goto L33
        L31:
            r1 = 16
        L33:
            r0 = r0 | r1
        L34:
            r1 = r0 & 91
            r2 = 18
            if (r1 != r2) goto L45
            boolean r1 = r5.v()
            if (r1 != 0) goto L41
            goto L45
        L41:
            r5.O()
            goto L73
        L45:
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r5.U(r1)
            boolean r1 = r5.e(r4)
            boolean r2 = r5.e(r3)
            r1 = r1 | r2
            java.lang.Object r2 = r5.y()
            if (r1 != 0) goto L60
            int r1 = n0.o.f333629a
            java.lang.Object r1 = n0.n.f333620a
            if (r2 != r1) goto L68
        L60:
            a0.o r2 = new a0.o
            r2.<init>(r4, r3)
            r5.g0(r2)
        L68:
            r1 = 0
            r5.o(r1)
            yz5.l r2 = (yz5.l) r2
            r0 = r0 & 14
            n0.d2.c(r3, r2, r5, r0)
        L73:
            n0.f4 r5 = r5.q()
            if (r5 != 0) goto L7a
            goto L83
        L7a:
            a0.p r0 = new a0.p
            r0.<init>(r3, r4, r6)
            n0.l3 r5 = (n0.l3) r5
            r5.f333608d = r0
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.d0.a(c0.o, n0.v2, n0.o, int):void");
    }

    public static final z0.t b(z0.t clickable, c0.o interactionSource, a0.r1 r1Var, boolean z17, java.lang.String str, y1.i iVar, yz5.a onClick) {
        kotlin.jvm.internal.o.g(clickable, "$this$clickable");
        kotlin.jvm.internal.o.g(interactionSource, "interactionSource");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        boolean z18 = androidx.compose.ui.platform.f3.f10562a;
        return z0.m.a(clickable, androidx.compose.ui.platform.e3.f10553d, new a0.w(onClick, z17, interactionSource, r1Var, str, iVar));
    }

    public static /* synthetic */ z0.t c(z0.t tVar, c0.o oVar, a0.r1 r1Var, boolean z17, java.lang.String str, y1.i iVar, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        return b(tVar, oVar, r1Var, z17, (i17 & 8) != 0 ? null : str, (i17 & 16) != 0 ? null : iVar, aVar);
    }

    public static z0.t d(z0.t clickable, boolean z17, java.lang.String str, y1.i iVar, yz5.a onClick, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            iVar = null;
        }
        kotlin.jvm.internal.o.g(clickable, "$this$clickable");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        boolean z18 = androidx.compose.ui.platform.f3.f10562a;
        return z0.m.a(clickable, androidx.compose.ui.platform.e3.f10553d, new a0.q(z17, str, iVar, onClick));
    }
}

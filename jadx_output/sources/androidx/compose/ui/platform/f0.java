package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.y3 f10559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.x f10560e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.compose.ui.platform.y3 y3Var, androidx.compose.ui.platform.x xVar) {
        super(0);
        this.f10559d = y3Var;
        this.f10560e = xVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if ((r4 == 0.0f) == false) goto L20;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.ui.platform.y3 r1 = r0.f10559d
            y1.j r2 = r1.f10825h
            y1.j r3 = r1.f10826i
            java.lang.Float r4 = r1.f10823f
            java.lang.Float r5 = r1.f10824g
            r6 = 0
            if (r2 == 0) goto L23
            if (r4 == 0) goto L23
            yz5.a r7 = r2.f458745a
            java.lang.Object r7 = r7.invoke()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r4 = r4.floatValue()
            float r7 = r7 - r4
            goto L24
        L23:
            r7 = r6
        L24:
            if (r3 == 0) goto L3a
            if (r5 == 0) goto L3a
            yz5.a r4 = r3.f458745a
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r5 = r5.floatValue()
            float r4 = r4 - r5
            goto L3b
        L3a:
            r4 = r6
        L3b:
            int r5 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            r8 = 0
            r9 = 1
            if (r5 != 0) goto L43
            r5 = r9
            goto L44
        L43:
            r5 = r8
        L44:
            if (r5 == 0) goto L4d
            int r5 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r5 != 0) goto L4b
            r8 = r9
        L4b:
            if (r8 != 0) goto Lbe
        L4d:
            androidx.compose.ui.platform.x r5 = r0.f10560e
            int r6 = r1.f10821d
            int r6 = r5.p(r6)
            androidx.compose.ui.platform.x r10 = r0.f10560e
            r12 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r14 = 0
            r15 = 8
            r16 = 0
            r11 = r6
            androidx.compose.ui.platform.x.s(r10, r11, r12, r13, r14, r15, r16)
            r8 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r6 = r5.c(r6, r8)
            if (r2 == 0) goto L8e
            yz5.a r8 = r2.f458745a
            java.lang.Object r8 = r8.invoke()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            int r8 = (int) r8
            r6.setScrollX(r8)
            yz5.a r8 = r2.f458746b
            java.lang.Object r8 = r8.invoke()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            int r8 = (int) r8
            r6.setMaxScrollX(r8)
        L8e:
            if (r3 == 0) goto Lb0
            yz5.a r8 = r3.f458745a
            java.lang.Object r8 = r8.invoke()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            int r8 = (int) r8
            r6.setScrollY(r8)
            yz5.a r8 = r3.f458746b
            java.lang.Object r8 = r8.invoke()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            int r8 = (int) r8
            r6.setMaxScrollY(r8)
        Lb0:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r8 < r9) goto Lbb
            int r7 = (int) r7
            int r4 = (int) r4
            androidx.compose.ui.platform.a0.a(r6, r7, r4)
        Lbb:
            r5.q(r6)
        Lbe:
            if (r2 == 0) goto Lca
            yz5.a r2 = r2.f458745a
            java.lang.Object r2 = r2.invoke()
            java.lang.Float r2 = (java.lang.Float) r2
            r1.f10823f = r2
        Lca:
            if (r3 == 0) goto Ld6
            yz5.a r2 = r3.f458745a
            java.lang.Object r2 = r2.invoke()
            java.lang.Float r2 = (java.lang.Float) r2
            r1.f10824g = r2
        Ld6:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.f0.invoke():java.lang.Object");
    }
}

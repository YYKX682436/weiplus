package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public int f296219a;

    /* renamed from: b, reason: collision with root package name */
    public int f296220b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f296221c;

    /* renamed from: d, reason: collision with root package name */
    public int f296222d;

    public void a(int i17, int i18) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i18 < 0) {
            throw new java.lang.IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i19 = this.f296222d * 2;
        int[] iArr = this.f296221c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f296221c = iArr2;
            java.util.Arrays.fill(iArr2, -1);
        } else if (i19 >= iArr.length) {
            int[] iArr3 = new int[i19 * 2];
            this.f296221c = iArr3;
            java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f296221c;
        iArr4[i19] = i17;
        iArr4[i19 + 1] = i18;
        this.f296222d++;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 r10, boolean r11) {
        /*
            r9 = this;
            r0 = 0
            r9.f296222d = r0
            int[] r1 = r9.f296221c
            r2 = -1
            if (r1 == 0) goto Lb
            java.util.Arrays.fill(r1, r2)
        Lb:
            com.tencent.mm.xcompat.recyclerview.widget.g1 r1 = r10.f295946t
            com.tencent.mm.xcompat.recyclerview.widget.u0 r3 = r10.f295945s
            if (r3 == 0) goto Lbd
            if (r1 == 0) goto Lbd
            boolean r3 = r1.f296060g
            if (r3 == 0) goto Lbd
            r3 = 1
            if (r11 == 0) goto L5e
            com.tencent.mm.xcompat.recyclerview.widget.c r4 = r10.f295934h
            boolean r4 = r4.g()
            if (r4 != 0) goto Lae
            com.tencent.mm.xcompat.recyclerview.widget.u0 r4 = r10.f295945s
            int r4 = r4.a()
            r5 = r1
            com.tencent.mm.xcompat.recyclerview.widget.e0 r5 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0) r5
            com.tencent.mm.xcompat.recyclerview.widget.LinearLayoutManager$SavedState r6 = r5.f296034v
            if (r6 == 0) goto L3b
            int r7 = r6.f295918d
            if (r7 < 0) goto L35
            r8 = r3
            goto L36
        L35:
            r8 = r0
        L36:
            if (r8 == 0) goto L3b
            boolean r6 = r6.f295920f
            goto L4a
        L3b:
            r5.W()
            boolean r6 = r5.f296030r
            int r7 = r5.f296032t
            if (r7 != r2) goto L4a
            if (r6 == 0) goto L49
            int r7 = r4 + (-1)
            goto L4a
        L49:
            r7 = r0
        L4a:
            if (r6 == 0) goto L4d
            goto L4e
        L4d:
            r2 = r3
        L4e:
            r3 = r0
        L4f:
            int r6 = r5.f296037y
            if (r3 >= r6) goto Lae
            if (r7 < 0) goto Lae
            if (r7 >= r4) goto Lae
            r9.a(r7, r0)
            int r7 = r7 + r2
            int r3 = r3 + 1
            goto L4f
        L5e:
            boolean r4 = r10.A
            if (r4 == 0) goto L71
            boolean r4 = r10.I
            if (r4 != 0) goto L71
            com.tencent.mm.xcompat.recyclerview.widget.c r4 = r10.f295934h
            boolean r4 = r4.g()
            if (r4 == 0) goto L6f
            goto L71
        L6f:
            r4 = r0
            goto L72
        L71:
            r4 = r3
        L72:
            if (r4 != 0) goto Lae
            int r4 = r9.f296219a
            int r5 = r9.f296220b
            r6 = r1
            com.tencent.mm.xcompat.recyclerview.widget.e0 r6 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0) r6
            int r7 = r6.f296026n
            if (r7 != 0) goto L80
            goto L81
        L80:
            r4 = r5
        L81:
            int r5 = r6.h()
            if (r5 == 0) goto Lae
            if (r4 != 0) goto L8a
            goto Lae
        L8a:
            r6.J()
            if (r4 <= 0) goto L90
            r2 = r3
        L90:
            int r4 = java.lang.Math.abs(r4)
            com.tencent.mm.xcompat.recyclerview.widget.u1 r5 = r10.F1
            r6.Z(r2, r4, r3, r5)
            com.tencent.mm.xcompat.recyclerview.widget.c0 r2 = r6.f296027o
            int r3 = r2.f296010d
            if (r3 < 0) goto Lae
            int r4 = r5.b()
            if (r3 >= r4) goto Lae
            int r2 = r2.f296013g
            int r0 = java.lang.Math.max(r0, r2)
            r9.a(r3, r0)
        Lae:
            int r0 = r9.f296222d
            int r2 = r1.f296061h
            if (r0 <= r2) goto Lbd
            r1.f296061h = r0
            r1.f296062i = r11
            com.tencent.mm.xcompat.recyclerview.widget.n1 r10 = r10.f295932f
            r10.l()
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.x.b(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView, boolean):void");
    }
}

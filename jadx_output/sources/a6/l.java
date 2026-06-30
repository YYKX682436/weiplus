package a6;

/* loaded from: classes14.dex */
public final class l extends a6.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final e6.b f1664a;

    /* renamed from: b, reason: collision with root package name */
    public final s5.c f1665b;

    /* renamed from: c, reason: collision with root package name */
    public final r5.g f1666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e6.b target, s5.c referenceCounter, r5.g eventListener, h6.k kVar) {
        super(null);
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(referenceCounter, "referenceCounter");
        kotlin.jvm.internal.o.g(eventListener, "eventListener");
        this.f1664a = target;
        this.f1665b = referenceCounter;
        this.f1666c = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // a6.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(c6.f r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a6.j
            if (r0 == 0) goto L13
            r0 = r9
            a6.j r0 = (a6.j) r0
            int r1 = r0.f1658h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1658h = r1
            goto L18
        L13:
            a6.j r0 = new a6.j
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f1656f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f1658h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.f1655e
            r5.g r8 = (r5.g) r8
            java.lang.Object r0 = r0.f1654d
            c6.f r0 = (c6.f) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L70
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.ResultKt.throwOnFailure(r9)
            c6.j r9 = r8.f38798b
            g6.e r2 = r9.f38845q
            int r4 = g6.e.f269032a
            g6.d r4 = g6.d.f269031b
            e6.b r5 = r7.f1664a
            android.graphics.drawable.Drawable r6 = r8.f38797a
            if (r2 != r4) goto L4c
            r5.c(r6)
            goto L77
        L4c:
            boolean r4 = r5 instanceof g6.f
            if (r4 != 0) goto L58
            c6.d r8 = r9.G
            g6.e r8 = r8.f38789e
            r5.c(r6)
            goto L77
        L58:
            r5.g r4 = r7.f1666c
            r5.d r4 = (r5.d) r4
            r4.b(r9)
            g6.f r5 = (g6.f) r5
            r0.f1654d = r8
            r0.f1655e = r4
            r0.f1658h = r3
            java.lang.Object r9 = r2.a(r5, r8, r0)
            if (r9 != r1) goto L6e
            return r1
        L6e:
            r0 = r8
            r8 = r4
        L70:
            c6.j r9 = r0.f38798b
            r5.d r8 = (r5.d) r8
            r8.a(r9)
        L77:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.l.b(c6.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // a6.b0
    public e6.b c() {
        return this.f1664a;
    }

    @Override // a6.b0
    public void d(android.graphics.drawable.Drawable drawable, android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            this.f1665b.a(bitmap, false);
        }
        this.f1664a.b(drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // a6.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(c6.q r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a6.k
            if (r0 == 0) goto L13
            r0 = r9
            a6.k r0 = (a6.k) r0
            int r1 = r0.f1663h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1663h = r1
            goto L18
        L13:
            a6.k r0 = new a6.k
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f1661f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f1663h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.f1660e
            r5.g r8 = (r5.g) r8
            java.lang.Object r0 = r0.f1659d
            c6.q r0 = (c6.q) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L8c
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.ResultKt.throwOnFailure(r9)
            android.graphics.drawable.Drawable r9 = r8.a()
            boolean r2 = r9 instanceof android.graphics.drawable.BitmapDrawable
            r4 = 0
            if (r2 == 0) goto L46
            android.graphics.drawable.BitmapDrawable r9 = (android.graphics.drawable.BitmapDrawable) r9
            goto L47
        L46:
            r9 = r4
        L47:
            if (r9 != 0) goto L4a
            goto L4e
        L4a:
            android.graphics.Bitmap r4 = r9.getBitmap()
        L4e:
            if (r4 == 0) goto L56
            r9 = 0
            s5.c r2 = r7.f1665b
            r2.a(r4, r9)
        L56:
            c6.j r9 = r8.f38864b
            g6.e r2 = r9.f38845q
            int r4 = g6.e.f269032a
            g6.d r4 = g6.d.f269031b
            e6.b r5 = r7.f1664a
            android.graphics.drawable.Drawable r6 = r8.f38863a
            if (r2 != r4) goto L68
            r5.a(r6)
            goto L93
        L68:
            boolean r4 = r5 instanceof g6.f
            if (r4 != 0) goto L74
            c6.d r8 = r9.G
            g6.e r8 = r8.f38789e
            r5.a(r6)
            goto L93
        L74:
            r5.g r4 = r7.f1666c
            r5.d r4 = (r5.d) r4
            r4.b(r9)
            g6.f r5 = (g6.f) r5
            r0.f1659d = r8
            r0.f1660e = r4
            r0.f1663h = r3
            java.lang.Object r9 = r2.a(r5, r8, r0)
            if (r9 != r1) goto L8a
            return r1
        L8a:
            r0 = r8
            r8 = r4
        L8c:
            c6.j r9 = r0.f38864b
            r5.d r8 = (r5.d) r8
            r8.a(r9)
        L93:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.l.e(c6.q, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

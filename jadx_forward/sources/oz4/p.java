package oz4;

/* loaded from: classes12.dex */
public abstract class p<V, C extends oz4.h> extends oz4.v<V, C> {
    @Override // oz4.v
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a, java.lang.Object obj) {
        mz4.t m74968x80562c = c19515x154ec45a.m74968x80562c();
        if (c19515x154ec45a.K) {
            int i17 = c19515x154ec45a.m74973x9925e2d6().f414883d;
            int i18 = m74968x80562c.f414883d;
            if (i17 == i18 && i18 > 1) {
                java.util.ArrayList d17 = d(c19515x154ec45a.getText(), m74968x80562c, oz4.u.SPAN_FLAGS);
                if (!d17.isEmpty() && c19515x154ec45a.getLayout().getPrimaryHorizontal(c19515x154ec45a.m74973x9925e2d6().f414883d) == mz4.b.b()) {
                    java.util.Iterator it = d17.iterator();
                    while (it.hasNext()) {
                        c19515x154ec45a.getText().removeSpan(it.next());
                    }
                    c19515x154ec45a.getText().insert(m74968x80562c.f414883d - 1, "\n");
                }
            }
        }
        f(c19515x154ec45a, m74968x80562c, obj);
        oz4.w.b(c19515x154ec45a, this);
    }

    @Override // oz4.v
    public final mz4.t c(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a) {
        return c19515x154ec45a.m74968x80562c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r12 == r13) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e A[SYNTHETIC] */
    @Override // oz4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList d(android.text.Spannable r17, mz4.t r18, oz4.u r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Class r4 = r16.getClass()
            java.lang.reflect.Type r4 = r4.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            if (r4 != 0) goto L1d
            r1 = 0
            return r1
        L1d:
            int r5 = r4.length
            r6 = 1
            int r5 = r5 - r6
            r4 = r4[r5]
            java.lang.Class r4 = (java.lang.Class) r4
            int r5 = r2.f414883d
            int r7 = r2.f414884e
            java.lang.Object[] r4 = r1.getSpans(r5, r7, r4)
            int r5 = r4.length
            r7 = 0
            r8 = r7
        L2f:
            if (r8 >= r5) goto L91
            r9 = r4[r8]
            int r10 = r1.getSpanStart(r9)
            int r11 = r1.getSpanEnd(r9)
            int r12 = r2.f414883d
            int r13 = r2.f414884e
            int r14 = java.lang.Math.max(r10, r12)
            int r15 = java.lang.Math.min(r11, r13)
            if (r14 <= r15) goto L4c
            r15 = r19
            goto L68
        L4c:
            if (r14 >= r15) goto L51
        L4e:
            r15 = r19
            goto L66
        L51:
            if (r10 <= r12) goto L55
            if (r11 < r13) goto L4e
        L55:
            if (r12 <= r10) goto L5a
            if (r13 >= r11) goto L5a
            goto L4e
        L5a:
            oz4.u r14 = oz4.u.EXACT
            r15 = r19
            if (r15 != r14) goto L6a
            if (r10 != r12) goto L68
            if (r11 != r13) goto L68
            if (r12 != r13) goto L68
        L66:
            r10 = r6
            goto L89
        L68:
            r10 = r7
            goto L89
        L6a:
            int r10 = r1.getSpanFlags(r9)
            r10 = r10 & 51
            r13 = 18
            if (r11 != r12) goto L7f
            r11 = 34
            int[] r11 = new int[]{r11, r13}
            boolean r10 = r0.e(r10, r11)
            goto L89
        L7f:
            r11 = 17
            int[] r11 = new int[]{r11, r13}
            boolean r10 = r0.e(r10, r11)
        L89:
            if (r10 == 0) goto L8e
            r3.add(r9)
        L8e:
            int r8 = r8 + 1
            goto L2f
        L91:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: oz4.p.d(android.text.Spannable, mz4.t, oz4.u):java.util.ArrayList");
    }

    public abstract void f(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a, mz4.t tVar, java.lang.Object obj);

    public void g(android.text.Spannable spannable, oz4.o oVar, oz4.r rVar) {
        rVar.b(d(spannable, oVar, oz4.u.EXACT), oVar);
    }
}

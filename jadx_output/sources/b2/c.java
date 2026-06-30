package b2;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.text.Layout f17274a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f17275b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f17276c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f17277d;

    /* renamed from: e, reason: collision with root package name */
    public char[] f17278e;

    public c(android.text.Layout layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        this.f17274a = layout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        do {
            java.lang.CharSequence text = this.f17274a.getText();
            kotlin.jvm.internal.o.f(text, "layout.text");
            int K = r26.n0.K(text, '\n', i17, false, 4, null);
            i17 = K < 0 ? this.f17274a.getText().length() : K + 1;
            arrayList.add(java.lang.Integer.valueOf(i17));
        } while (i17 < this.f17274a.getText().length());
        this.f17275b = arrayList;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        for (int i18 = 0; i18 < size; i18++) {
            arrayList2.add(null);
        }
        this.f17276c = arrayList2;
        this.f17277d = new boolean[this.f17275b.size()];
        this.f17275b.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0228, code lost:
    
        if (r10 == r1.f17273c) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0199, code lost:
    
        if (r5.getRunCount() == 1) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4 A[LOOP:0: B:37:0x00bd->B:58:0x00f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6 A[EDGE_INSN: B:59:0x00f6->B:60:0x00f6 BREAK  A[LOOP:0: B:37:0x00bd->B:58:0x00f4], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.c.a(int, boolean, boolean):float");
    }
}

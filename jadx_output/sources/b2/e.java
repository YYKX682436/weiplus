package b2;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b2.g f17282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f17283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.TextPaint f17284f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b2.g gVar, java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        super(0);
        this.f17282d = gVar;
        this.f17283e = charSequence;
        this.f17284f = textPaint;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (b2.k.a(r3, d2.c.class) == false) goto L23;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r7 = this;
            b2.g r0 = r7.f17282d
            jz5.g r0 = r0.f17287a
            java.lang.Object r0 = r0.getValue()
            android.text.BoringLayout$Metrics r0 = (android.text.BoringLayout.Metrics) r0
            android.text.TextPaint r1 = r7.f17284f
            r2 = 0
            java.lang.CharSequence r3 = r7.f17283e
            if (r0 == 0) goto L15
            int r0 = r0.width
            float r0 = (float) r0
            goto L1d
        L15:
            int r0 = r3.length()
            float r0 = android.text.Layout.getDesiredWidth(r3, r2, r0, r1)
        L1d:
            r4 = 0
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L25
            r5 = r6
            goto L26
        L25:
            r5 = r2
        L26:
            if (r5 != 0) goto L4c
            boolean r5 = r3 instanceof android.text.Spanned
            if (r5 == 0) goto L4c
            float r1 = r1.getLetterSpacing()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L36
            r1 = r6
            goto L37
        L36:
            r1 = r2
        L37:
            if (r1 == 0) goto L4b
            android.text.Spanned r3 = (android.text.Spanned) r3
            java.lang.Class<d2.d> r1 = d2.d.class
            boolean r1 = b2.k.a(r3, r1)
            if (r1 != 0) goto L4b
            java.lang.Class<d2.c> r1 = d2.c.class
            boolean r1 = b2.k.a(r3, r1)
            if (r1 == 0) goto L4c
        L4b:
            r2 = r6
        L4c:
            if (r2 == 0) goto L51
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L51:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.e.invoke():java.lang.Object");
    }
}

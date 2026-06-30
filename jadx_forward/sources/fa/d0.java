package fa;

/* loaded from: classes13.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f342126a = {com.p314xaae8f345.mm.R.C30857x2dd9f1.f559710cq};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f342127b = {com.p314xaae8f345.mm.R.C30857x2dd9f1.f559712cs};

    public static void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f515667x, i17, i18);
        boolean z17 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z17) {
            c(context, f342127b, "Theme.MaterialComponents");
        }
        c(context, f342126a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = v9.a.f515667x
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            r1 = 1
            r3 = -1
            if (r10 == 0) goto L36
            int r4 = r10.length
            if (r4 != 0) goto L1a
            goto L36
        L1a:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L20:
            if (r7 >= r6) goto L31
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r3)
            if (r8 != r3) goto L2e
            r5.recycle()
            goto L3d
        L2e:
            int r7 = r7 + 1
            goto L20
        L31:
            r5.recycle()
        L34:
            r2 = r1
            goto L3d
        L36:
            int r5 = r0.getResourceId(r2, r3)
            if (r5 == r3) goto L3d
            goto L34
        L3d:
            r0.recycle()
            if (r2 == 0) goto L43
            return
        L43:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.d0.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void c(android.content.Context context, int[] iArr, java.lang.String str) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (hasValue) {
            return;
        }
        throw new java.lang.IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static android.content.res.TypedArray d(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i17, int i18, int... iArr2) {
        a(context, attributeSet, i17, i18);
        b(context, attributeSet, iArr, i17, i18, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i17, i18);
    }
}

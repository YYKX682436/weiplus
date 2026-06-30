package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.CursorJoiner */
/* loaded from: classes12.dex */
public final class C26874x9133426d implements java.util.Iterator<com.p314xaae8f345.p3121x37984a.C26874x9133426d.Result>, java.lang.Iterable<com.p314xaae8f345.p3121x37984a.C26874x9133426d.Result> {

    /* renamed from: mColumnsLeft */
    private int[] f57736x795386d7;

    /* renamed from: mColumnsRight */
    private int[] f57737xb173b54c;

    /* renamed from: mCompareResult */
    private com.p314xaae8f345.p3121x37984a.C26874x9133426d.Result f57738x13fdf9f5;

    /* renamed from: mCompareResultIsValid */
    private boolean f57739x3355ad3d;

    /* renamed from: mCursorLeft */
    private com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 f57740xe16684ca;

    /* renamed from: mCursorRight */
    private com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 f57741x4bc075b9;

    /* renamed from: mValues */
    private java.lang.String[] f57742x1e51c3ef;

    /* renamed from: com.tencent.wcdb.CursorJoiner$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$wcdb$CursorJoiner$Result */
        static final /* synthetic */ int[] f57743xefa8691c;

        static {
            int[] iArr = new int[com.p314xaae8f345.p3121x37984a.C26874x9133426d.Result.m106162xcee59d22().length];
            f57743xefa8691c = iArr;
            try {
                iArr[com.p314xaae8f345.p3121x37984a.C26874x9133426d.Result.BOTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f57743xefa8691c[com.p314xaae8f345.p3121x37984a.C26874x9133426d.Result.LEFT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f57743xefa8691c[com.p314xaae8f345.p3121x37984a.C26874x9133426d.Result.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.tencent.wcdb.CursorJoiner$Result */
    /* loaded from: classes12.dex */
    public enum Result {
        RIGHT,
        LEFT,
        BOTH
    }

    public C26874x9133426d(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.lang.String[] strArr, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff762, java.lang.String[] strArr2) {
        if (strArr.length != strArr2.length) {
            throw new java.lang.IllegalArgumentException("you must have the same number of columns on the left and right, " + strArr.length + " != " + strArr2.length);
        }
        this.f57740xe16684ca = interfaceC26872x78faff76;
        this.f57741x4bc075b9 = interfaceC26872x78faff762;
        interfaceC26872x78faff76.moveToFirst();
        this.f57741x4bc075b9.moveToFirst();
        this.f57739x3355ad3d = false;
        this.f57736x795386d7 = m106154x1d97d0f7(interfaceC26872x78faff76, strArr);
        this.f57737xb173b54c = m106154x1d97d0f7(interfaceC26872x78faff762, strArr2);
        this.f57742x1e51c3ef = new java.lang.String[this.f57736x795386d7.length * 2];
    }

    /* renamed from: buildColumnIndiciesArray */
    private int[] m106154x1d97d0f7(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.lang.String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i17 = 0; i17 < strArr.length; i17++) {
            iArr[i17] = interfaceC26872x78faff76.getColumnIndexOrThrow(strArr[i17]);
        }
        return iArr;
    }

    /* renamed from: compareStrings */
    private static int m106155xb379a1dd(java.lang.String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("you must specify an even number of values");
        }
        for (int i17 = 0; i17 < strArr.length; i17 += 2) {
            java.lang.String str = strArr[i17];
            if (str != null) {
                java.lang.String str2 = strArr[i17 + 1];
                if (str2 == null) {
                    return 1;
                }
                int compareTo = str.compareTo(str2);
                if (compareTo != 0) {
                    return compareTo < 0 ? -1 : 1;
                }
            } else if (strArr[i17 + 1] != null) {
                return -1;
            }
        }
        return 0;
    }

    /* renamed from: incrementCursors */
    private void m106156xed7e796e() {
        if (this.f57739x3355ad3d) {
            int i17 = com.p314xaae8f345.p3121x37984a.C26874x9133426d.AnonymousClass1.f57743xefa8691c[this.f57738x13fdf9f5.ordinal()];
            if (i17 == 1) {
                this.f57740xe16684ca.moveToNext();
                this.f57741x4bc075b9.moveToNext();
            } else if (i17 == 2) {
                this.f57740xe16684ca.moveToNext();
            } else if (i17 == 3) {
                this.f57741x4bc075b9.moveToNext();
            }
            this.f57739x3355ad3d = false;
        }
    }

    /* renamed from: populateValues */
    private static void m106157x6c281aac(java.lang.String[] strArr, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, int[] iArr, int i17) {
        for (int i18 = 0; i18 < iArr.length; i18++) {
            strArr[(i18 * 2) + i17] = interfaceC26872x78faff76.getString(iArr[i18]);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f57739x3355ad3d) {
            return (this.f57740xe16684ca.isAfterLast() && this.f57741x4bc075b9.isAfterLast()) ? false : true;
        }
        int i17 = com.p314xaae8f345.p3121x37984a.C26874x9133426d.AnonymousClass1.f57743xefa8691c[this.f57738x13fdf9f5.ordinal()];
        if (i17 == 1) {
            return (this.f57740xe16684ca.isLast() && this.f57741x4bc075b9.isLast()) ? false : true;
        }
        if (i17 == 2) {
            return (this.f57740xe16684ca.isLast() && this.f57741x4bc075b9.isAfterLast()) ? false : true;
        }
        if (i17 == 3) {
            return (this.f57740xe16684ca.isAfterLast() && this.f57741x4bc075b9.isLast()) ? false : true;
        }
        throw new java.lang.IllegalStateException("bad value for mCompareResult, " + this.f57738x13fdf9f5);
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.p314xaae8f345.p3121x37984a.C26874x9133426d.Result> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("not implemented");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public com.p314xaae8f345.p3121x37984a.C26874x9133426d.Result next() {
        if (hasNext()) {
            m106156xed7e796e();
            boolean z17 = !this.f57740xe16684ca.isAfterLast();
            boolean z18 = !this.f57741x4bc075b9.isAfterLast();
            if (z17 && z18) {
                m106157x6c281aac(this.f57742x1e51c3ef, this.f57740xe16684ca, this.f57736x795386d7, 0);
                m106157x6c281aac(this.f57742x1e51c3ef, this.f57741x4bc075b9, this.f57737xb173b54c, 1);
                int m106155xb379a1dd = m106155xb379a1dd(this.f57742x1e51c3ef);
                if (m106155xb379a1dd == -1) {
                    this.f57738x13fdf9f5 = com.p314xaae8f345.p3121x37984a.C26874x9133426d.Result.LEFT;
                } else if (m106155xb379a1dd == 0) {
                    this.f57738x13fdf9f5 = com.p314xaae8f345.p3121x37984a.C26874x9133426d.Result.BOTH;
                } else if (m106155xb379a1dd == 1) {
                    this.f57738x13fdf9f5 = com.p314xaae8f345.p3121x37984a.C26874x9133426d.Result.RIGHT;
                }
            } else if (z17) {
                this.f57738x13fdf9f5 = com.p314xaae8f345.p3121x37984a.C26874x9133426d.Result.LEFT;
            } else {
                this.f57738x13fdf9f5 = com.p314xaae8f345.p3121x37984a.C26874x9133426d.Result.RIGHT;
            }
            this.f57739x3355ad3d = true;
            return this.f57738x13fdf9f5;
        }
        throw new java.lang.IllegalStateException("you must only call next() when hasNext() is true");
    }
}

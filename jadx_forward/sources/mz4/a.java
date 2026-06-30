package mz4;

/* loaded from: classes12.dex */
public class a extends android.text.SpannableString {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f414750d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f414751e;

    /* renamed from: f, reason: collision with root package name */
    public int f414752f;

    public a(java.lang.CharSequence charSequence) {
        super(charSequence.toString());
        int length = charSequence.length();
        this.f414750d = new java.lang.Object[20];
        this.f414751e = new int[60];
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            for (java.lang.Object obj : spanned.getSpans(0, length, java.lang.Object.class)) {
                if ((obj instanceof android.text.style.CharacterStyle) || (obj instanceof android.text.style.ParagraphStyle)) {
                    int spanStart = spanned.getSpanStart(obj);
                    int spanEnd = spanned.getSpanEnd(obj);
                    setSpan(obj, (spanStart < 0 ? 0 : spanStart) - 0, (spanEnd > length ? length : spanEnd) - 0, spanned.getSpanFlags(obj));
                }
            }
        }
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int getSpanEnd(java.lang.Object obj) {
        int i17 = this.f414752f;
        java.lang.Object[] objArr = this.f414750d;
        int[] iArr = this.f414751e;
        for (int i18 = i17 - 1; i18 >= 0; i18--) {
            if (objArr[i18] == obj) {
                return iArr[(i18 * 3) + 1];
            }
        }
        return -1;
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int getSpanFlags(java.lang.Object obj) {
        int i17 = this.f414752f;
        java.lang.Object[] objArr = this.f414750d;
        int[] iArr = this.f414751e;
        for (int i18 = i17 - 1; i18 >= 0; i18--) {
            if (objArr[i18] == obj) {
                return iArr[(i18 * 3) + 2];
            }
        }
        return 0;
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int getSpanStart(java.lang.Object obj) {
        int i17 = this.f414752f;
        java.lang.Object[] objArr = this.f414750d;
        int[] iArr = this.f414751e;
        for (int i18 = i17 - 1; i18 >= 0; i18--) {
            if (objArr[i18] == obj) {
                return iArr[(i18 * 3) + 0];
            }
        }
        return -1;
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public java.lang.Object[] getSpans(int i17, int i18, java.lang.Class cls) {
        int i19 = this.f414752f;
        java.lang.Object[] objArr = this.f414750d;
        int[] iArr = this.f414751e;
        java.lang.Object[] objArr2 = null;
        int i27 = 0;
        java.lang.Object obj = null;
        for (int i28 = 0; i28 < i19; i28++) {
            if (cls == null || cls.isInstance(objArr[i28])) {
                int i29 = i28 * 3;
                int i37 = iArr[i29 + 0];
                int i38 = iArr[i29 + 1];
                if (i37 <= i18 && i38 >= i17 && (i37 == i38 || i17 == i18 || (i37 != i18 && i38 != i17))) {
                    if (i27 == 0) {
                        obj = objArr[i28];
                    } else {
                        if (i27 == 1) {
                            objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, (i19 - i28) + 1);
                            objArr2[0] = obj;
                        }
                        int i39 = iArr[i29 + 2] & 16711680;
                        if (i39 != 0) {
                            int i47 = 0;
                            while (i47 < i27 && i39 <= (getSpanFlags(objArr2[i47]) & 16711680)) {
                                i47++;
                            }
                            java.lang.System.arraycopy(objArr2, i47, objArr2, i47 + 1, i27 - i47);
                            objArr2[i47] = objArr[i28];
                        } else {
                            objArr2[i27] = objArr[i28];
                            i27++;
                        }
                    }
                    i27++;
                }
            }
        }
        if (i27 == 0) {
            return (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 0);
        }
        if (i27 == 1) {
            java.lang.Object[] objArr3 = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1);
            objArr3[0] = obj;
            return objArr3;
        }
        if (i27 == objArr2.length) {
            return objArr2;
        }
        java.lang.Object[] objArr4 = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, i27);
        java.lang.System.arraycopy(objArr2, 0, objArr4, 0, i27);
        return objArr4;
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int nextSpanTransition(int i17, int i18, java.lang.Class cls) {
        int i19 = this.f414752f;
        java.lang.Object[] objArr = this.f414750d;
        int[] iArr = this.f414751e;
        if (cls == null) {
            cls = java.lang.Object.class;
        }
        for (int i27 = 0; i27 < i19; i27++) {
            int i28 = i27 * 3;
            int i29 = iArr[i28 + 0];
            int i37 = iArr[i28 + 1];
            if (i29 > i17 && i29 < i18 && cls.isInstance(objArr[i27])) {
                i18 = i29;
            }
            if (i37 > i17 && i37 < i18 && cls.isInstance(objArr[i27])) {
                i18 = i37;
            }
        }
        return i18;
    }

    @Override // android.text.SpannableString, android.text.Spannable
    public void removeSpan(java.lang.Object obj) {
        int i17 = this.f414752f;
        java.lang.Object[] objArr = this.f414750d;
        int[] iArr = this.f414751e;
        for (int i18 = i17 - 1; i18 >= 0; i18--) {
            if (objArr[i18] == obj) {
                int i19 = i18 + 1;
                int i27 = i17 - i19;
                java.lang.System.arraycopy(objArr, i19, objArr, i18, i27);
                java.lang.System.arraycopy(iArr, i19 * 3, iArr, i18 * 3, i27 * 3);
                this.f414752f--;
                return;
            }
        }
    }

    @Override // android.text.SpannableString, android.text.Spannable
    public void setSpan(java.lang.Object obj, int i17, int i18, int i19) {
        int i27 = this.f414752f;
        int i28 = i27 + 1;
        java.lang.Object[] objArr = this.f414750d;
        if (i28 >= objArr.length) {
            int i29 = i27 + 10;
            java.lang.Object[] objArr2 = new java.lang.Object[i29];
            int[] iArr = new int[i29 * 3];
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, i27);
            java.lang.System.arraycopy(this.f414751e, 0, iArr, 0, this.f414752f * 3);
            this.f414750d = objArr2;
            this.f414751e = iArr;
        }
        java.lang.Object[] objArr3 = this.f414750d;
        int i37 = this.f414752f;
        objArr3[i37] = obj;
        int[] iArr2 = this.f414751e;
        iArr2[(i37 * 3) + 0] = i17;
        iArr2[(i37 * 3) + 1] = i18;
        iArr2[(i37 * 3) + 2] = i19;
        this.f414752f = i37 + 1;
    }
}

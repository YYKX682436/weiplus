package p012xc85e97e9.p080xa1c8a596.p082xd1075a44;

/* loaded from: classes14.dex */
public abstract class h {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002a, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0036, code lost:
    
        if (r10.right <= r12.left) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x003d, code lost:
    
        if (r10.top >= r12.bottom) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0044, code lost:
    
        if (r10.left >= r12.right) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = b(r9, r10, r11)
            boolean r1 = b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L7e
            if (r0 != 0) goto Lf
            goto L7e
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L40
            if (r9 == r3) goto L39
            if (r9 == r4) goto L32
            if (r9 != r1) goto L2c
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L2a
        L28:
            r7 = r6
            goto L47
        L2a:
            r7 = r2
            goto L47
        L2c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L32:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L2a
            goto L28
        L39:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L2a
            goto L28
        L40:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L2a
            goto L28
        L47:
            if (r7 != 0) goto L4a
            return r6
        L4a:
            if (r9 == r5) goto L7d
            if (r9 != r4) goto L4f
            goto L7d
        L4f:
            int r11 = d(r9, r10, r11)
            if (r9 == r5) goto L70
            if (r9 == r3) goto L6b
            if (r9 == r4) goto L66
            if (r9 != r1) goto L60
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L74
        L60:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L66:
            int r9 = r12.right
            int r10 = r10.right
            goto L74
        L6b:
            int r9 = r10.top
            int r10 = r12.top
            goto L74
        L70:
            int r9 = r10.left
            int r10 = r12.left
        L74:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L7c
            r2 = r6
        L7c:
            return r2
        L7d:
            return r6
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p080xa1c8a596.p082xd1075a44.h.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean b(int i17, android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (i17 != 17) {
            if (i17 != 33) {
                if (i17 != 66) {
                    if (i17 != 130) {
                        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean c(android.graphics.Rect rect, android.graphics.Rect rect2, int i17) {
        if (i17 == 17) {
            int i18 = rect.right;
            int i19 = rect2.right;
            return (i18 > i19 || rect.left >= i19) && rect.left > rect2.left;
        }
        if (i17 == 33) {
            int i27 = rect.bottom;
            int i28 = rect2.bottom;
            return (i27 > i28 || rect.top >= i28) && rect.top > rect2.top;
        }
        if (i17 == 66) {
            int i29 = rect.left;
            int i37 = rect2.left;
            return (i29 < i37 || rect.right <= i37) && rect.right < rect2.right;
        }
        if (i17 != 130) {
            throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i38 = rect.top;
        int i39 = rect2.top;
        return (i38 < i39 || rect.bottom <= i39) && rect.bottom < rect2.bottom;
    }

    public static int d(int i17, android.graphics.Rect rect, android.graphics.Rect rect2) {
        int i18;
        int i19;
        if (i17 == 17) {
            i18 = rect.left;
            i19 = rect2.right;
        } else if (i17 == 33) {
            i18 = rect.top;
            i19 = rect2.bottom;
        } else if (i17 == 66) {
            i18 = rect2.left;
            i19 = rect.right;
        } else {
            if (i17 != 130) {
                throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i18 = rect2.top;
            i19 = rect.bottom;
        }
        return java.lang.Math.max(0, i18 - i19);
    }

    public static int e(int i17, android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (i17 != 17) {
            if (i17 != 33) {
                if (i17 != 66) {
                    if (i17 != 130) {
                        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return java.lang.Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return java.lang.Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}

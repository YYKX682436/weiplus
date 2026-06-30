package p05;

/* loaded from: classes10.dex */
public final class b0 extends os0.c {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(int r9, int r10, int r11, p3321xbce91901.jvm.p3324x21ffc6bd.i r12) {
        /*
            r8 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L6
            r9 = r0
        L6:
            r11 = r11 & 2
            if (r11 == 0) goto Lb
            r10 = r0
        Lb:
            r6 = 2
            r7 = 1
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            if (r9 == 0) goto L1c
            if (r10 == 0) goto L1c
            r8.w(r9, r10)
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p05.b0.<init>(int, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // os0.a
    public void s(int i17) {
        boolean z17 = i17 != this.f429538n;
        this.f429538n = i17;
        if (z17) {
            x();
        }
    }

    @Override // os0.a
    public void w(int i17, int i18) {
        boolean z17 = (i17 == this.f429525a && i18 == this.f429526b) ? false : true;
        super.w(i17, i18);
        if (z17) {
            x();
        }
    }

    public final void x() {
        int i17;
        int i18 = this.f429526b;
        int i19 = this.f429525a;
        int i27 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
        if (i18 > i19) {
            if (i18 <= 320) {
                i27 = i18;
            }
            i17 = (i19 * i27) / i18;
        } else {
            if (i19 <= 320) {
                i27 = i19;
            }
            int i28 = (i18 * i27) / i19;
            i17 = i27;
            i27 = i28;
        }
        if (this.f429538n % 180 != 0) {
            u(i27, i17);
        } else {
            u(i17, i27);
        }
    }
}

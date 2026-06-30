package r36;

/* loaded from: classes16.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final x36.m f450896b;

    /* renamed from: c, reason: collision with root package name */
    public final int f450897c;

    /* renamed from: d, reason: collision with root package name */
    public int f450898d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f450895a = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public r36.c[] f450899e = new r36.c[8];

    /* renamed from: f, reason: collision with root package name */
    public int f450900f = 7;

    /* renamed from: g, reason: collision with root package name */
    public int f450901g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f450902h = 0;

    public d(int i17, x36.h0 h0Var) {
        this.f450897c = i17;
        this.f450898d = i17;
        this.f450896b = x36.v.b(h0Var);
    }

    public final int a(int i17) {
        int i18;
        int i19 = 0;
        if (i17 > 0) {
            int length = this.f450899e.length;
            while (true) {
                length--;
                i18 = this.f450900f;
                if (length < i18 || i17 <= 0) {
                    break;
                }
                int i27 = this.f450899e[length].f450889c;
                i17 -= i27;
                this.f450902h -= i27;
                this.f450901g--;
                i19++;
            }
            r36.c[] cVarArr = this.f450899e;
            java.lang.System.arraycopy(cVarArr, i18 + 1, cVarArr, i18 + 1 + i19, this.f450901g);
            this.f450900f += i19;
        }
        return i19;
    }

    public final x36.o b(int i17) {
        if (i17 >= 0 && i17 <= r36.f.f450921a.length - 1) {
            return r36.f.f450921a[i17].f450887a;
        }
        int length = this.f450900f + 1 + (i17 - r36.f.f450921a.length);
        if (length >= 0) {
            r36.c[] cVarArr = this.f450899e;
            if (length < cVarArr.length) {
                return cVarArr[length].f450887a;
            }
        }
        throw new java.io.IOException("Header index too large " + (i17 + 1));
    }

    public final void c(int i17, r36.c cVar) {
        ((java.util.ArrayList) this.f450895a).add(cVar);
        int i18 = cVar.f450889c;
        if (i17 != -1) {
            i18 -= this.f450899e[(this.f450900f + 1) + i17].f450889c;
        }
        int i19 = this.f450898d;
        if (i18 > i19) {
            java.util.Arrays.fill(this.f450899e, (java.lang.Object) null);
            this.f450900f = this.f450899e.length - 1;
            this.f450901g = 0;
            this.f450902h = 0;
            return;
        }
        int a17 = a((this.f450902h + i18) - i19);
        if (i17 == -1) {
            int i27 = this.f450901g + 1;
            r36.c[] cVarArr = this.f450899e;
            if (i27 > cVarArr.length) {
                r36.c[] cVarArr2 = new r36.c[cVarArr.length * 2];
                java.lang.System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f450900f = this.f450899e.length - 1;
                this.f450899e = cVarArr2;
            }
            int i28 = this.f450900f;
            this.f450900f = i28 - 1;
            this.f450899e[i28] = cVar;
            this.f450901g++;
        } else {
            this.f450899e[i17 + this.f450900f + 1 + i17 + a17] = cVar;
        }
        this.f450902h += i18;
    }

    public x36.o d() {
        int i17;
        x36.m mVar = this.f450896b;
        int mo174955xcc4273be = ((x36.b0) mVar).mo174955xcc4273be() & 255;
        boolean z17 = (mo174955xcc4273be & 128) == 128;
        int e17 = e(mo174955xcc4273be, 127);
        if (!z17) {
            return ((x36.b0) mVar).H(e17);
        }
        r36.j0 j0Var = r36.j0.f450964d;
        long j17 = e17;
        x36.b0 b0Var = (x36.b0) mVar;
        b0Var.c1(j17);
        byte[] k17 = b0Var.f533187d.k(j17);
        j0Var.getClass();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        r36.i0 i0Var = j0Var.f450965a;
        r36.i0 i0Var2 = i0Var;
        int i18 = 0;
        int i19 = 0;
        for (byte b17 : k17) {
            i18 = (i18 << 8) | (b17 & 255);
            i19 += 8;
            while (i19 >= 8) {
                int i27 = i19 - 8;
                i0Var2 = i0Var2.f450956a[(i18 >>> i27) & 255];
                if (i0Var2.f450956a == null) {
                    byteArrayOutputStream.write(i0Var2.f450957b);
                    i19 -= i0Var2.f450958c;
                    i0Var2 = i0Var;
                } else {
                    i19 = i27;
                }
            }
        }
        while (i19 > 0) {
            r36.i0 i0Var3 = i0Var2.f450956a[(i18 << (8 - i19)) & 255];
            if (i0Var3.f450956a != null || (i17 = i0Var3.f450958c) > i19) {
                break;
            }
            byteArrayOutputStream.write(i0Var3.f450957b);
            i19 -= i17;
            i0Var2 = i0Var;
        }
        return x36.o.p(byteArrayOutputStream.toByteArray());
    }

    public int e(int i17, int i18) {
        int i19 = i17 & i18;
        if (i19 < i18) {
            return i19;
        }
        int i27 = 0;
        while (true) {
            int mo174955xcc4273be = ((x36.b0) this.f450896b).mo174955xcc4273be() & 255;
            if ((mo174955xcc4273be & 128) == 0) {
                return i18 + (mo174955xcc4273be << i27);
            }
            i18 += (mo174955xcc4273be & 127) << i27;
            i27 += 7;
        }
    }
}

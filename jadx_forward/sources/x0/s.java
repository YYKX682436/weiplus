package x0;

/* loaded from: classes14.dex */
public final class s implements java.lang.Iterable, zz5.a {

    /* renamed from: h, reason: collision with root package name */
    public static final x0.s f532472h = new x0.s(0, 0, 0, null);

    /* renamed from: d, reason: collision with root package name */
    public final long f532473d;

    /* renamed from: e, reason: collision with root package name */
    public final long f532474e;

    /* renamed from: f, reason: collision with root package name */
    public final int f532475f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f532476g;

    public s(long j17, long j18, int i17, int[] iArr) {
        this.f532473d = j17;
        this.f532474e = j18;
        this.f532475f = i17;
        this.f532476g = iArr;
    }

    public final x0.s d(x0.s bits) {
        int[] iArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bits, "bits");
        x0.s sVar = f532472h;
        if (bits == sVar) {
            return this;
        }
        if (this == sVar) {
            return sVar;
        }
        int i17 = this.f532475f;
        if (bits.f532475f == i17 && bits.f532476g == (iArr = this.f532476g)) {
            return new x0.s(this.f532473d & (~bits.f532473d), (~bits.f532474e) & this.f532474e, i17, iArr);
        }
        java.util.Iterator it = bits.iterator();
        x0.s sVar2 = this;
        while (it.hasNext()) {
            sVar2 = sVar2.e(((java.lang.Number) it.next()).intValue());
        }
        return sVar2;
    }

    public final x0.s e(int i17) {
        int[] iArr;
        int b17;
        int i18 = this.f532475f;
        int i19 = i17 - i18;
        if (i19 >= 0 && i19 < 64) {
            long j17 = 1 << i19;
            long j18 = this.f532474e;
            if ((j18 & j17) != 0) {
                return new x0.s(this.f532473d, j18 & (~j17), i18, this.f532476g);
            }
        } else if (i19 >= 64 && i19 < 128) {
            long j19 = 1 << (i19 - 64);
            long j27 = this.f532473d;
            if ((j27 & j19) != 0) {
                return new x0.s(j27 & (~j19), this.f532474e, i18, this.f532476g);
            }
        } else if (i19 < 0 && (iArr = this.f532476g) != null && (b17 = x0.t.b(iArr, i17)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new x0.s(this.f532473d, this.f532474e, this.f532475f, null);
            }
            int[] iArr2 = new int[length];
            if (b17 > 0) {
                kz5.v.j(iArr, iArr2, 0, 0, b17);
            }
            if (b17 < length) {
                kz5.v.j(iArr, iArr2, b17, b17 + 1, length + 1);
            }
            return new x0.s(this.f532473d, this.f532474e, this.f532475f, iArr2);
        }
        return this;
    }

    public final boolean g(int i17) {
        int[] iArr;
        int i18 = i17 - this.f532475f;
        if (i18 >= 0 && i18 < 64) {
            return ((1 << i18) & this.f532474e) != 0;
        }
        if (i18 >= 64 && i18 < 128) {
            return ((1 << (i18 - 64)) & this.f532473d) != 0;
        }
        if (i18 <= 0 && (iArr = this.f532476g) != null) {
            return x0.t.b(iArr, i17) >= 0;
        }
        return false;
    }

    public final x0.s h(x0.s bits) {
        int[] iArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bits, "bits");
        x0.s sVar = f532472h;
        if (bits == sVar) {
            return this;
        }
        if (this == sVar) {
            return bits;
        }
        int i17 = this.f532475f;
        if (bits.f532475f == i17 && bits.f532476g == (iArr = this.f532476g)) {
            return new x0.s(this.f532473d | bits.f532473d, this.f532474e | bits.f532474e, i17, iArr);
        }
        if (this.f532476g == null) {
            java.util.Iterator it = iterator();
            while (it.hasNext()) {
                bits = bits.j(((java.lang.Number) it.next()).intValue());
            }
            return bits;
        }
        java.util.Iterator it6 = bits.iterator();
        x0.s sVar2 = this;
        while (it6.hasNext()) {
            sVar2 = sVar2.j(((java.lang.Number) it6.next()).intValue());
        }
        return sVar2;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        x0.r rVar = new x0.r(this, null);
        q26.o oVar = new q26.o();
        oVar.f441414g = pz5.f.a(rVar, oVar, oVar);
        return oVar;
    }

    public final x0.s j(int i17) {
        long j17;
        int i18;
        int i19 = this.f532475f;
        int i27 = i17 - i19;
        long j18 = this.f532474e;
        if (i27 < 0 || i27 >= 64) {
            long j19 = this.f532473d;
            if (i27 < 64 || i27 >= 128) {
                int[] iArr = this.f532476g;
                if (i27 < 128) {
                    if (iArr == null) {
                        return new x0.s(this.f532473d, this.f532474e, i19, new int[]{i17});
                    }
                    int b17 = x0.t.b(iArr, i17);
                    if (b17 < 0) {
                        int i28 = -(b17 + 1);
                        int length = iArr.length + 1;
                        int[] iArr2 = new int[length];
                        kz5.v.j(iArr, iArr2, 0, 0, i28);
                        kz5.v.j(iArr, iArr2, i28 + 1, i28, length - 1);
                        iArr2[i28] = i17;
                        return new x0.s(this.f532473d, this.f532474e, this.f532475f, iArr2);
                    }
                } else if (!g(i17)) {
                    int i29 = ((i17 + 1) / 64) * 64;
                    int i37 = this.f532475f;
                    java.util.ArrayList arrayList = null;
                    long j27 = j19;
                    while (true) {
                        if (i37 >= i29) {
                            j17 = j18;
                            i18 = i37;
                            break;
                        }
                        if (j18 != 0) {
                            if (arrayList == null) {
                                arrayList = new java.util.ArrayList();
                                if (iArr != null) {
                                    for (int i38 : iArr) {
                                        arrayList.add(java.lang.Integer.valueOf(i38));
                                    }
                                }
                            }
                            for (int i39 = 0; i39 < 64; i39++) {
                                if (((1 << i39) & j18) != 0) {
                                    arrayList.add(java.lang.Integer.valueOf(i39 + i37));
                                }
                            }
                        }
                        if (j27 == 0) {
                            i18 = i29;
                            j17 = 0;
                            break;
                        }
                        i37 += 64;
                        j18 = j27;
                        j27 = 0;
                    }
                    if (arrayList != null) {
                        iArr = kz5.n0.R0(arrayList);
                    }
                    return new x0.s(j27, j17, i18, iArr).j(i17);
                }
            } else {
                long j28 = 1 << (i27 - 64);
                if ((j19 & j28) == 0) {
                    return new x0.s(j19 | j28, this.f532474e, i19, this.f532476g);
                }
            }
        } else {
            long j29 = 1 << i27;
            if ((j18 & j29) == 0) {
                return new x0.s(this.f532473d, j18 | j29, i19, this.f532476g);
            }
        }
        return this;
    }

    /* renamed from: toString */
    public java.lang.String m174769x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(super.toString());
        sb6.append(" [");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(this, 10));
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()));
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append((java.lang.CharSequence) "");
        int size = arrayList.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            java.lang.Object obj = arrayList.get(i18);
            i17++;
            if (i17 > 1) {
                sb7.append((java.lang.CharSequence) ", ");
            }
            if (obj != null ? obj instanceof java.lang.CharSequence : true) {
                sb7.append((java.lang.CharSequence) obj);
            } else if (obj instanceof java.lang.Character) {
                sb7.append(((java.lang.Character) obj).charValue());
            } else {
                sb7.append((java.lang.CharSequence) java.lang.String.valueOf(obj));
            }
        }
        sb7.append((java.lang.CharSequence) "");
        java.lang.String sb8 = sb7.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb6.append(sb8);
        sb6.append(']');
        return sb6.toString();
    }
}

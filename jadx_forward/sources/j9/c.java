package j9;

/* loaded from: classes15.dex */
public final class c extends j9.h {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f379805r = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f379806s = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f379807t = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f379808u = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f379809v = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j.f34051x366c91de, 234, 238, 244, 251};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f379810w = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, be1.r.f4230x366c91de, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cd.f33971x366c91de, 219, 171, 187};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f379811x = {195, 227, 205, 204, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j6.f34370x366c91de, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: g, reason: collision with root package name */
    public final int f379813g;

    /* renamed from: h, reason: collision with root package name */
    public final int f379814h;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f379817k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f379818l;

    /* renamed from: m, reason: collision with root package name */
    public int f379819m;

    /* renamed from: n, reason: collision with root package name */
    public int f379820n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f379821o;

    /* renamed from: p, reason: collision with root package name */
    public byte f379822p;

    /* renamed from: q, reason: collision with root package name */
    public byte f379823q;

    /* renamed from: f, reason: collision with root package name */
    public final t9.p f379812f = new t9.p();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f379815i = new java.util.LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public j9.b f379816j = new j9.b(0, 4);

    public c(java.lang.String str, int i17) {
        this.f379813g = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54231xd925ae21.equals(str) ? 2 : 3;
        if (i17 == 3 || i17 == 4) {
            this.f379814h = 2;
        } else {
            this.f379814h = 1;
        }
        i(0);
        h();
    }

    @Override // j9.h
    public i9.d d() {
        java.util.List list = this.f379817k;
        this.f379818l = list;
        return new j9.j(list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // j9.h
    public void e(i9.i iVar) {
        int i17;
        byte[] array = iVar.f425143f.array();
        int limit = iVar.f425143f.limit();
        t9.p pVar = this.f379812f;
        pVar.u(array, limit);
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        while (true) {
            int i18 = pVar.f498075c - pVar.f498074b;
            int i19 = this.f379813g;
            if (i18 < i19) {
                if (z18) {
                    if (!z19) {
                        this.f379821o = false;
                    }
                    int i27 = this.f379819m;
                    if (i27 == 1 || i27 == 3) {
                        this.f379817k = g();
                        return;
                    }
                    return;
                }
                return;
            }
            byte m17 = i19 == 2 ? (byte) -4 : (byte) pVar.m();
            byte m18 = (byte) (pVar.m() & 127);
            byte m19 = (byte) (pVar.m() & 127);
            if ((m17 & 6) == 4 && ((i17 = this.f379814h) != 1 || (m17 & 1) == 0)) {
                if (i17 != 2 || (m17 & 1) == 1) {
                    if (m18 != 0 || m19 != 0) {
                        int i28 = m18 & 247;
                        if (i28 == 17 && (m19 & 240) == 48) {
                            this.f379816j.f379798d.append((char) f379809v[m19 & 15]);
                        } else if ((m18 & 246) == 18 && (m19 & 224) == 32) {
                            android.text.SpannableStringBuilder spannableStringBuilder = this.f379816j.f379798d;
                            int length = spannableStringBuilder.length();
                            if (length > 0) {
                                spannableStringBuilder.delete(length - 1, length);
                            }
                            if ((m18 & 1) == 0) {
                                this.f379816j.f379798d.append((char) f379810w[m19 & 31]);
                            } else {
                                this.f379816j.f379798d.append((char) f379811x[m19 & 31]);
                            }
                        } else if ((m18 & 224) == 0) {
                            int i29 = m18 & 240;
                            boolean z27 = i29 == 16 ? true : z17;
                            if (z27) {
                                if (this.f379821o && this.f379822p == m18 && this.f379823q == m19) {
                                    this.f379821o = z17;
                                    z19 = true;
                                } else {
                                    this.f379821o = true;
                                    this.f379822p = m18;
                                    this.f379823q = m19;
                                }
                            }
                            boolean z28 = (i28 == 17 && (m19 & 240) == 32) ? true : z17;
                            int[] iArr = f379807t;
                            if (z28) {
                                boolean z29 = (m19 & 1) == 1;
                                j9.b bVar = this.f379816j;
                                android.text.SpannableStringBuilder spannableStringBuilder2 = bVar.f379798d;
                                if (z29) {
                                    bVar.f379804j = spannableStringBuilder2.length();
                                } else if (bVar.f379804j != -1) {
                                    spannableStringBuilder2.setSpan(new android.text.style.UnderlineSpan(), bVar.f379804j, spannableStringBuilder2.length(), 33);
                                    bVar.f379804j = -1;
                                }
                                int i37 = (m19 >> 1) & 15;
                                if (i37 == 7) {
                                    this.f379816j.d(new android.text.style.StyleSpan(2), 2);
                                    this.f379816j.d(new android.text.style.ForegroundColorSpan(-1), 1);
                                } else {
                                    this.f379816j.d(new android.text.style.ForegroundColorSpan(iArr[i37]), 1);
                                }
                            } else {
                                if (i29 == 16 && (m19 & 192) == 64) {
                                    int i38 = f379805r[m18 & 7];
                                    if ((m19 & 32) != 0) {
                                        i38++;
                                    }
                                    j9.b bVar2 = this.f379816j;
                                    if (i38 != bVar2.f379799e) {
                                        if (this.f379819m != 1 && !bVar2.b()) {
                                            j9.b bVar3 = new j9.b(this.f379819m, this.f379820n);
                                            this.f379816j = bVar3;
                                            this.f379815i.add(bVar3);
                                        }
                                        this.f379816j.f379799e = i38;
                                    }
                                    if ((m19 & 1) == 1) {
                                        ((java.util.ArrayList) this.f379816j.f379795a).add(new android.text.style.UnderlineSpan());
                                    }
                                    int i39 = (m19 >> 1) & 15;
                                    if (i39 > 7) {
                                        this.f379816j.f379800f = f379806s[i39 & 7];
                                    } else if (i39 == 7) {
                                        ((java.util.ArrayList) this.f379816j.f379795a).add(new android.text.style.StyleSpan(2));
                                        ((java.util.ArrayList) this.f379816j.f379795a).add(new android.text.style.ForegroundColorSpan(-1));
                                    } else {
                                        ((java.util.ArrayList) this.f379816j.f379795a).add(new android.text.style.ForegroundColorSpan(iArr[i39]));
                                    }
                                } else {
                                    if (i28 == 23 && m19 >= 33 && m19 <= 35) {
                                        this.f379816j.f379801g = m19 - 32;
                                    } else {
                                        if (i28 == 20 && (m19 & 240) == 32) {
                                            if (m19 == 32) {
                                                i(2);
                                            } else if (m19 != 41) {
                                                switch (m19) {
                                                    case 37:
                                                        this.f379820n = 2;
                                                        i(1);
                                                        break;
                                                    case 38:
                                                        this.f379820n = 3;
                                                        i(1);
                                                        break;
                                                    case 39:
                                                        this.f379820n = 4;
                                                        i(1);
                                                        break;
                                                    default:
                                                        int i47 = this.f379819m;
                                                        if (i47 != 0) {
                                                            if (m19 == 33) {
                                                                android.text.SpannableStringBuilder spannableStringBuilder3 = this.f379816j.f379798d;
                                                                int length2 = spannableStringBuilder3.length();
                                                                if (length2 > 0) {
                                                                    spannableStringBuilder3.delete(length2 - 1, length2);
                                                                    break;
                                                                }
                                                            } else {
                                                                switch (m19) {
                                                                    case 44:
                                                                        this.f379817k = null;
                                                                        if (i47 == 1 || i47 == 3) {
                                                                            h();
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 45:
                                                                        if (i47 == 1 && !this.f379816j.b()) {
                                                                            j9.b bVar4 = this.f379816j;
                                                                            java.util.LinkedList linkedList = (java.util.LinkedList) bVar4.f379797c;
                                                                            linkedList.add(bVar4.a());
                                                                            bVar4.f379798d.clear();
                                                                            ((java.util.ArrayList) bVar4.f379795a).clear();
                                                                            ((java.util.ArrayList) bVar4.f379796b).clear();
                                                                            bVar4.f379804j = -1;
                                                                            int min = java.lang.Math.min(bVar4.f379803i, bVar4.f379799e);
                                                                            while (linkedList.size() >= min) {
                                                                                linkedList.remove(0);
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 46:
                                                                        h();
                                                                        break;
                                                                    case 47:
                                                                        this.f379817k = g();
                                                                        h();
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                }
                                            } else {
                                                i(3);
                                            }
                                        }
                                    }
                                }
                            }
                            z19 = z27;
                        } else {
                            j9.b bVar5 = this.f379816j;
                            int[] iArr2 = f379808u;
                            bVar5.f379798d.append((char) iArr2[(m18 & Byte.MAX_VALUE) - 32]);
                            if ((m19 & 224) != 0) {
                                this.f379816j.f379798d.append((char) iArr2[(m19 & Byte.MAX_VALUE) - 32]);
                            }
                        }
                        z18 = true;
                        z17 = false;
                    }
                }
            }
        }
    }

    @Override // j9.h
    public boolean f() {
        return this.f379817k != this.f379818l;
    }

    @Override // j9.h, o8.e
    /* renamed from: flush */
    public void mo140474x5d03b04() {
        super.mo140474x5d03b04();
        this.f379817k = null;
        this.f379818l = null;
        i(0);
        h();
        this.f379820n = 4;
        this.f379821o = false;
        this.f379822p = (byte) 0;
        this.f379823q = (byte) 0;
    }

    public final java.util.List g() {
        int i17;
        float f17;
        int i18;
        int i19;
        i9.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i27 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.f379815i;
            if (i27 >= linkedList.size()) {
                return arrayList;
            }
            j9.b bVar = (j9.b) linkedList.get(i27);
            bVar.getClass();
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            int i28 = 0;
            while (true) {
                java.util.LinkedList linkedList2 = (java.util.LinkedList) bVar.f379797c;
                if (i28 >= linkedList2.size()) {
                    break;
                }
                spannableStringBuilder.append((java.lang.CharSequence) linkedList2.get(i28));
                spannableStringBuilder.append('\n');
                i28++;
            }
            spannableStringBuilder.append((java.lang.CharSequence) bVar.a());
            if (spannableStringBuilder.length() == 0) {
                aVar = null;
            } else {
                int i29 = bVar.f379800f + bVar.f379801g;
                int length = i29 - ((32 - i29) - spannableStringBuilder.length());
                if (bVar.f379802h == 2 && java.lang.Math.abs(length) < 3) {
                    f17 = 0.5f;
                    i17 = 1;
                } else if (bVar.f379802h != 2 || length <= 0) {
                    i17 = 0;
                    f17 = ((i29 / 32.0f) * 0.8f) + 0.1f;
                } else {
                    f17 = (((32 - r6) / 32.0f) * 0.8f) + 0.1f;
                    i17 = 2;
                }
                if (bVar.f379802h == 1 || (i18 = bVar.f379799e) > 7) {
                    i18 = (bVar.f379799e - 15) - 2;
                    i19 = 2;
                } else {
                    i19 = 0;
                }
                aVar = new i9.a(spannableStringBuilder, android.text.Layout.Alignment.ALIGN_NORMAL, i18, 1, i19, f17, i17, Float.MIN_VALUE);
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
            i27++;
        }
    }

    public final void h() {
        this.f379816j.c(this.f379819m, this.f379820n);
        java.util.LinkedList linkedList = this.f379815i;
        linkedList.clear();
        linkedList.add(this.f379816j);
    }

    public final void i(int i17) {
        int i18 = this.f379819m;
        if (i18 == i17) {
            return;
        }
        this.f379819m = i17;
        h();
        if (i18 == 3 || i17 == 1 || i17 == 0) {
            this.f379817k = null;
        }
    }

    @Override // j9.h, o8.e
    /* renamed from: release */
    public void mo140475x41012807() {
    }
}

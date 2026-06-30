package p13;

/* loaded from: classes12.dex */
public class z extends p13.y {
    public void a() {
        java.lang.String str;
        int i17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f432724i)) {
            return;
        }
        switch (this.f432717b) {
            case 131072:
            case 131076:
            case 131081:
            case 262144:
            case 327680:
                int i18 = this.f432718c;
                if (i18 != 2 && i18 != 3 && i18 != 6 && i18 != 7) {
                    if (i18 == 11 || i18 == 51) {
                        this.f432725j = Integer.MAX_VALUE;
                        this.f432726k = "";
                        return;
                    }
                    try {
                        this.f432725j = new java.lang.String(this.f432723h.getBytes(), 0, java.lang.Integer.valueOf(o13.c.f423742b.split(this.f432724i)[1]).intValue()).length();
                        this.f432726k = this.f432723h;
                        return;
                    } catch (java.lang.Exception unused) {
                        this.f432725j = Integer.MAX_VALUE;
                        this.f432726k = "";
                        return;
                    }
                }
                try {
                    java.lang.String[] split = o13.c.f423742b.split(this.f432724i);
                    f(o13.c.f423745e);
                    int binarySearch = java.util.Arrays.binarySearch(this.f432728m, new java.lang.String(this.f432723h.getBytes(), 0, java.lang.Integer.valueOf(split[1]).intValue()).length());
                    this.f432725j = binarySearch;
                    if (binarySearch < 0) {
                        this.f432725j = (-binarySearch) - 2;
                    }
                    this.f432726k = this.f432727l[this.f432725j];
                    return;
                } catch (java.lang.Exception unused2) {
                    this.f432725j = Integer.MAX_VALUE;
                    this.f432726k = "";
                    return;
                }
            case 131075:
            case 2097172:
                int i19 = this.f432718c;
                if (i19 == 38 || i19 == 69) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    f(o13.c.f423743c);
                    java.lang.String[] split2 = o13.c.f423742b.split(this.f432724i);
                    byte[] bytes = this.f432723h.getBytes();
                    for (int i27 = 0; i27 < split2.length - 1; i27 += 2) {
                        int intValue = java.lang.Integer.valueOf(split2[i27]).intValue();
                        int length = new java.lang.String(bytes, 0, java.lang.Integer.valueOf(split2[i27 + 1]).intValue()).length();
                        int binarySearch2 = java.util.Arrays.binarySearch(this.f432728m, length);
                        if (binarySearch2 < 0) {
                            binarySearch2 = (-binarySearch2) - 2;
                        }
                        int i28 = binarySearch2;
                        java.lang.String[] split3 = o13.c.f423744d.split(this.f432727l[i28]);
                        int i29 = length - this.f432728m[i28];
                        int i37 = 0;
                        while (true) {
                            if (i37 < split3.length) {
                                i29 = (i29 - split3[i37].length()) - 1;
                                if (i29 < 0) {
                                    java.lang.String str2 = split3[i37];
                                    i17 = o13.d.f423764q[i37];
                                    str = str2;
                                } else {
                                    i37++;
                                }
                            } else {
                                str = null;
                                i17 = -1;
                            }
                        }
                        if (i17 > 0) {
                            arrayList.add(new p13.l(i28, intValue, i17, str, split3[split3.length - 1]));
                        }
                    }
                    this.f432729n = arrayList;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void b(p13.r rVar) {
        java.lang.String str;
        java.lang.String str2;
        if (rVar.f432664c.length > 1) {
            this.f432733r = 1;
        } else {
            this.f432733r = 0;
        }
        int i17 = this.f432717b;
        if (i17 != 131075) {
            if (i17 == 131072) {
                if (java.lang.System.currentTimeMillis() - this.f432721f < 1105032704) {
                    this.f432731p += 50;
                }
                int i18 = this.f432718c;
                if ((i18 == 5 || i18 == 1) && this.f432723h.contains(rVar.f432662a)) {
                    if (rVar.f432664c.length > 1) {
                        this.f432733r = 2;
                    }
                    this.f432731p += 10;
                    return;
                }
                return;
            }
            return;
        }
        if (this.f432718c == 38) {
            this.f432740y = (int) this.f432719d;
            java.lang.String r17 = c01.z1.r();
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.List<p13.l> list = this.f432729n;
            if (list != null) {
                for (p13.l lVar : list) {
                    if (!r17.equals(lVar.f432646d)) {
                        hashSet.add(java.lang.Integer.valueOf(lVar.f432643a));
                    }
                }
            }
            long size = hashSet.size();
            long j17 = this.f432719d;
            if (size >= j17 - 1) {
                this.f432734s = true;
                if (j17 >= 3) {
                    this.f432741z = true;
                }
            }
            if (rVar.f432664c.length > 1 && (str2 = this.f432723h) != null && str2.contains(rVar.f432662a)) {
                this.f432733r = 2;
            }
        }
        int i19 = this.f432718c;
        if ((i19 == 5 || i19 == 1) && (str = this.f432723h) != null && str.contains(rVar.f432662a) && rVar.f432664c.length > 1) {
            this.f432733r = 2;
        }
    }

    public p13.z c(android.database.Cursor cursor) {
        this.f432716a = cursor.getLong(0);
        this.f432717b = cursor.getInt(1);
        this.f432718c = cursor.getInt(2);
        this.f432719d = cursor.getLong(3);
        this.f432720e = cursor.getString(4);
        this.f432721f = cursor.getLong(5);
        if (cursor.getColumnCount() >= 7) {
            this.f432723h = cursor.getString(6);
        }
        if (cursor.getColumnCount() >= 8) {
            this.f432724i = cursor.getString(7);
        }
        return this;
    }

    public p13.z d(android.database.Cursor cursor) {
        this.f432716a = cursor.getLong(0);
        this.f432717b = cursor.getInt(1);
        this.f432718c = cursor.getInt(2);
        this.f432719d = cursor.getLong(3);
        this.f432720e = cursor.getString(4);
        this.f432721f = cursor.getLong(5);
        this.f432722g = cursor.getString(6);
        return this;
    }

    public p13.z e(android.database.Cursor cursor) {
        this.f432716a = cursor.getLong(0);
        this.f432717b = cursor.getInt(1);
        this.f432718c = cursor.getInt(2);
        this.f432719d = cursor.getLong(3);
        this.f432720e = cursor.getString(4);
        this.f432721f = cursor.getLong(5);
        this.f432723h = cursor.getString(6);
        this.f432724i = cursor.getString(7);
        this.f432732q = cursor.getLong(8);
        return this;
    }

    public final void f(java.util.regex.Pattern pattern) {
        java.lang.String[] split = pattern.split(this.f432723h);
        this.f432727l = split;
        this.f432728m = new int[split.length];
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = this.f432728m;
            if (i17 >= iArr.length) {
                return;
            }
            iArr[i17] = i18;
            i18 += this.f432727l[i17].length() + 1;
            i17++;
        }
    }
}

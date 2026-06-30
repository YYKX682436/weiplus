package com.p314xaae8f345.mm.p2496xc50a8ce6;

/* renamed from: com.tencent.mm.protocal.JsapiPermissionWrapper */
/* loaded from: classes8.dex */
public class C19775x58fd37b3 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f273713d;

    /* renamed from: e, reason: collision with root package name */
    public int f273714e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Set f273715f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Set f273716g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 f273711h = new com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3(1);

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 f273712i = new com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3(2);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3> f38883x681a0c0c = new o45.lg();

    public C19775x58fd37b3() {
        this.f273714e = 0;
        this.f273713d = null;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 m75975x5a5dd5d() {
        android.os.Parcel parcel;
        try {
            parcel = android.os.Parcel.obtain();
            try {
                parcel.writeParcelable(this, 0);
                parcel.setDataPosition(0);
                com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3) parcel.readParcelable(com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.class.getClassLoader());
                parcel.recycle();
                return c19775x58fd37b3;
            } catch (java.lang.Throwable th6) {
                th = th6;
                parcel.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            parcel = null;
        }
    }

    public void b(android.os.Bundle bundle) {
        this.f273713d = bundle.getByteArray("jsapi_perm_wrapper_bytes");
        this.f273714e = bundle.getInt("jsapi_perm_wrapper_hardcodePermission");
        g(bundle.getIntArray("jsapi_perm_wrapper_blacklist"));
        i(bundle.getIntArray("jsapi_perm_wrapper_whitelist"));
    }

    public int[] c() {
        java.util.Set set = this.f273715f;
        if (set == null) {
            return new int[0];
        }
        int[] iArr = new int[((java.util.HashSet) set).size()];
        java.util.Iterator it = ((java.util.HashSet) this.f273715f).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            int i18 = i17 + 1;
            iArr[i17] = num == null ? 0 : num.intValue();
            i17 = i18;
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(int r10) {
        /*
            r9 = this;
            java.util.Set r0 = r9.f273716g
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L14
            r0 = r2
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L18
            return r2
        L18:
            java.util.Set r0 = r9.f273715f
            if (r0 == 0) goto L2a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L2a
            r0 = r2
            goto L2b
        L2a:
            r0 = r1
        L2b:
            if (r0 == 0) goto L2e
            return r1
        L2e:
            int r0 = r9.f273714e
            java.lang.String r3 = "on reserved bytes control : %d"
            r4 = 75
            java.lang.String r5 = "MicroMsg.JsapiPermissionWrapper"
            r6 = 34
            if (r0 != r2) goto L4c
            if (r10 == r6) goto L40
            if (r10 != r4) goto L3f
            goto L40
        L3f:
            return r2
        L40:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r3, r10)
            return r1
        L4c:
            r7 = 2
            r8 = -3
            if (r0 != r7) goto L54
            if (r10 != r8) goto L53
            return r2
        L53:
            return r1
        L54:
            r7 = 3
            if (r0 != r7) goto L6d
            if (r10 == r6) goto L61
            if (r10 == r4) goto L61
            r0 = 23
            if (r10 != r0) goto L60
            goto L61
        L60:
            return r2
        L61:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r3, r10)
            return r1
        L6d:
            r3 = 4
            if (r0 != r3) goto L84
            if (r10 == r6) goto L76
            if (r10 != r4) goto L75
            goto L76
        L75:
            return r2
        L76:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r0 = "hy: on reserved bytes control : %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r0, r10)
            return r1
        L84:
            r0 = -2
            if (r10 == r0) goto L98
            if (r10 != r8) goto L8a
            goto L98
        L8a:
            byte[] r0 = r9.f273713d
            if (r0 == 0) goto L97
            if (r10 < 0) goto L97
            int r2 = r0.length
            if (r10 < r2) goto L94
            goto L97
        L94:
            r10 = r0[r10]
            return r10
        L97:
            return r1
        L98:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.d(int):int");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int[] e() {
        java.util.Set set = this.f273716g;
        if (set == null) {
            return new int[0];
        }
        int[] iArr = new int[((java.util.HashSet) set).size()];
        java.util.Iterator it = ((java.util.HashSet) this.f273716g).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            int i18 = i17 + 1;
            iArr[i17] = num == null ? 0 : num.intValue();
            i17 = i18;
        }
        return iArr;
    }

    /* renamed from: equals */
    public boolean m75976xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3)) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3) obj;
        byte[] bArr = this.f273713d;
        byte[] bArr2 = c19775x58fd37b3.f273713d;
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i17 = 0;
        while (true) {
            byte[] bArr3 = this.f273713d;
            if (i17 >= bArr3.length) {
                return true;
            }
            if (bArr3[i17] != c19775x58fd37b3.f273713d[i17]) {
                return false;
            }
            i17++;
        }
    }

    public boolean f(int i17) {
        return d(i17) == 1;
    }

    public void g(int[] iArr) {
        java.util.Set set = this.f273715f;
        if (set == null) {
            this.f273715f = new java.util.HashSet();
        } else {
            set.clear();
        }
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        for (int i17 : iArr) {
            this.f273715f.add(java.lang.Integer.valueOf(i17));
        }
    }

    public synchronized void h(int i17, byte b17) {
        byte[] bArr = this.f273713d;
        if (bArr != null && i17 >= 0) {
            if (i17 >= bArr.length) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsapiPermissionWrapper", "setPermission append pos out of range, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f273713d.length));
                byte[] bArr2 = new byte[i17 + 1];
                java.util.Arrays.fill(bArr2, (byte) 2);
                byte[] bArr3 = this.f273713d;
                java.lang.System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                this.f273713d = bArr2;
            }
            this.f273713d[i17] = b17;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsapiPermissionWrapper", "setPermission pos out of range, %s", java.lang.Integer.valueOf(i17));
    }

    public void i(int[] iArr) {
        java.util.Set set = this.f273716g;
        if (set == null) {
            this.f273716g = new java.util.HashSet();
        } else {
            set.clear();
        }
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        for (int i17 : iArr) {
            this.f273716g.add(java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: toString */
    public java.lang.String m75977x9616526c() {
        if (this.f273713d == null) {
            return "null";
        }
        java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(180);
        for (byte b17 : this.f273713d) {
            sb6.append((int) b17);
        }
        java.lang.String sb7 = sb6.toString();
        java.lang.System.currentTimeMillis();
        return sb7;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByteArray(this.f273713d);
        parcel.writeInt(this.f273714e);
        parcel.writeIntArray(c());
        parcel.writeIntArray(e());
    }

    public C19775x58fd37b3(byte[] bArr) {
        this.f273713d = null;
        this.f273714e = 0;
        if (bArr == null) {
            this.f273713d = null;
        } else {
            this.f273713d = bArr;
        }
    }

    public C19775x58fd37b3(int i17) {
        this.f273714e = i17;
        this.f273713d = new byte[0];
    }

    public C19775x58fd37b3(android.os.Parcel parcel, o45.lg lgVar) {
        this.f273713d = null;
        this.f273714e = 0;
        this.f273713d = parcel.createByteArray();
        this.f273714e = parcel.readInt();
        g(parcel.createIntArray());
        i(parcel.createIntArray());
    }
}

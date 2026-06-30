package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.StatisticsFileSystem */
/* loaded from: classes12.dex */
public class C22767x2079386e extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22767x2079386e> f39827x681a0c0c = new com.p314xaae8f345.mm.vfs.y5();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294286e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1[] f294287f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1[] f294288g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f294289h;

    public C22767x2079386e(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, boolean z17) {
        this.f294286e = interfaceC22750xe27c22eb;
        this.f294287f = null;
        this.f294288g = null;
        this.f294289h = z17;
    }

    public static int c(java.lang.String str) {
        int i17 = 1;
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str.isEmpty()) {
            return 0;
        }
        int length = str.length();
        for (int i18 = 0; i18 < length; i18++) {
            if (str.charAt(i18) == '/') {
                i17++;
            }
        }
        return i17;
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        java.util.Collection collection;
        java.util.TreeSet treeSet;
        com.p314xaae8f345.mm.vfs.q2 q2Var = (com.p314xaae8f345.mm.vfs.q2) this.f294286e.b(map);
        if (q2Var == com.p314xaae8f345.mm.vfs.C22759xc55eb7d2.f()) {
            return q2Var;
        }
        com.p314xaae8f345.mm.vfs.f1[] f1VarArr = this.f294287f;
        if (f1VarArr == null) {
            collection = java.util.Collections.singletonList("");
        } else {
            java.util.TreeSet treeSet2 = new java.util.TreeSet();
            for (com.p314xaae8f345.mm.vfs.f1 f1Var : f1VarArr) {
                java.lang.String[] b17 = f1Var.b(map);
                if (b17 != null) {
                    for (java.lang.String str : b17) {
                        boolean z17 = !str.endsWith("\u0000");
                        if (!z17) {
                            str = str.substring(0, str.length() - 1);
                        }
                        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, true, true);
                        if (!z17) {
                            l17 = l17 + (char) 0;
                        }
                        treeSet2.add(l17);
                    }
                }
            }
            collection = treeSet2;
        }
        com.p314xaae8f345.mm.vfs.f1[] f1VarArr2 = this.f294288g;
        if (f1VarArr2 == null) {
            treeSet = null;
        } else {
            treeSet = new java.util.TreeSet();
            for (com.p314xaae8f345.mm.vfs.f1 f1Var2 : f1VarArr2) {
                java.lang.String[] b18 = f1Var2.b(map);
                if (b18 != null) {
                    for (java.lang.String str2 : b18) {
                        treeSet.add(com.p314xaae8f345.mm.vfs.e8.l(str2, true, true));
                    }
                }
            }
            java.util.Iterator it = treeSet.iterator();
            java.lang.String str3 = null;
            while (it.hasNext()) {
                java.lang.String str4 = (java.lang.String) it.next();
                if (str3 != null && str4.startsWith(str3) && str4.charAt(str3.length()) == '/') {
                    it.remove();
                } else {
                    str3 = str4;
                }
            }
        }
        return new com.p314xaae8f345.mm.vfs.a6(this, q2Var, (java.lang.String[]) collection.toArray(new java.lang.String[0]), treeSet != null ? (java.lang.String[]) treeSet.toArray(new java.lang.String[0]) : null, map);
    }

    /* renamed from: equals */
    public boolean m82348xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.C22767x2079386e)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.C22767x2079386e c22767x2079386e = (com.p314xaae8f345.mm.vfs.C22767x2079386e) obj;
        return this.f294286e.equals(c22767x2079386e.f294286e) && this.f294289h == c22767x2079386e.f294289h && java.util.Arrays.equals(this.f294287f, c22767x2079386e.f294287f) && java.util.Arrays.equals(this.f294288g, c22767x2079386e.f294288g);
    }

    /* renamed from: hashCode */
    public int m82349x8cdac1b() {
        int hashCode = com.p314xaae8f345.mm.vfs.C22767x2079386e.class.hashCode();
        java.lang.Object[] objArr = {this.f294286e, this.f294287f, this.f294288g, java.lang.Boolean.valueOf(this.f294289h)};
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    /* renamed from: toString */
    public java.lang.String m82350x9616526c() {
        return "stat <- " + this.f294286e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22767x2079386e.class, 2);
        parcel.writeParcelable(this.f294286e, i17);
        com.p314xaae8f345.mm.vfs.f1[] f1VarArr = this.f294287f;
        if (f1VarArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(f1VarArr.length);
            for (com.p314xaae8f345.mm.vfs.f1 f1Var : f1VarArr) {
                parcel.writeString(f1Var.f294454a);
            }
        }
        com.p314xaae8f345.mm.vfs.f1[] f1VarArr2 = this.f294288g;
        if (f1VarArr2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(f1VarArr2.length);
            for (com.p314xaae8f345.mm.vfs.f1 f1Var2 : f1VarArr2) {
                parcel.writeString(f1Var2.f294454a);
            }
        }
        parcel.writeByte(this.f294289h ? (byte) 1 : (byte) 0);
    }

    public C22767x2079386e(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, boolean z17, java.util.Collection collection, java.util.Collection collection2) {
        this.f294286e = interfaceC22750xe27c22eb;
        this.f294289h = z17;
        int i17 = 0;
        if (collection != null && !collection.isEmpty()) {
            this.f294287f = new com.p314xaae8f345.mm.vfs.f1[collection.size()];
            java.util.Iterator it = collection.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                this.f294287f[i18] = new com.p314xaae8f345.mm.vfs.f1((java.lang.String) it.next());
                i18++;
            }
        } else {
            this.f294287f = null;
        }
        if (collection2 == null) {
            this.f294288g = null;
            return;
        }
        this.f294288g = new com.p314xaae8f345.mm.vfs.f1[collection2.size()];
        java.util.Iterator it6 = collection2.iterator();
        while (it6.hasNext()) {
            this.f294288g[i17] = new com.p314xaae8f345.mm.vfs.f1((java.lang.String) it6.next());
            i17++;
        }
    }

    public C22767x2079386e(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22767x2079386e.class, 2);
        com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(getClass().getClassLoader());
        this.f294286e = interfaceC22750xe27c22eb;
        if (interfaceC22750xe27c22eb != null) {
            int readInt = parcel.readInt();
            if (readInt == 0) {
                this.f294287f = null;
            } else {
                this.f294287f = new com.p314xaae8f345.mm.vfs.f1[readInt];
                for (int i17 = 0; i17 < readInt; i17++) {
                    this.f294287f[i17] = new com.p314xaae8f345.mm.vfs.f1(parcel.readString());
                }
            }
            int readInt2 = parcel.readInt();
            if (readInt2 == 0) {
                this.f294288g = null;
            } else {
                this.f294288g = new com.p314xaae8f345.mm.vfs.f1[readInt2];
                for (int i18 = 0; i18 < readInt2; i18++) {
                    this.f294288g[i18] = new com.p314xaae8f345.mm.vfs.f1(parcel.readString());
                }
            }
            this.f294289h = parcel.readByte() != 0;
            return;
        }
        throw new java.lang.IllegalArgumentException("Wrong wrapped filesystem.");
    }
}

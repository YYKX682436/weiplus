package com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002;

/* renamed from: com.tencent.mm.plugin.hp.util.TinkerSyncResponse */
/* loaded from: classes11.dex */
public class C16114x800e8cdb implements oq1.n, android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb> f37103x681a0c0c = new c83.b();
    public final java.lang.String A;
    public int B;
    public int C;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f223941d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f223942e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f223943f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f223944g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f223945h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f223946i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f223947m;

    /* renamed from: n, reason: collision with root package name */
    public final int f223948n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f223949o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f223950p;

    /* renamed from: q, reason: collision with root package name */
    public final int f223951q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f223952r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f223953s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f223954t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f223955u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f223956v;

    /* renamed from: w, reason: collision with root package name */
    public final long f223957w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f223958x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f223959y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f223960z;

    public C16114x800e8cdb(r45.j35 j35Var) {
        this.f223942e = new java.util.HashMap();
        this.f223956v = true;
        this.f223957w = 0L;
        this.f223958x = true;
        this.f223959y = true;
        this.f223960z = true;
        if (j35Var == null) {
            this.f223941d = 1;
            this.f223945h = "";
            this.f223946i = "";
            this.f223943f = -1;
            this.f223944g = -1;
            this.f223947m = "";
            this.f223948n = 0;
            this.f223949o = "";
            this.f223950p = "";
            this.f223951q = 0;
            this.f223952r = "";
            this.f223953s = "";
            this.f223954t = "";
            this.f223955u = "";
            return;
        }
        r45.bs5 bs5Var = j35Var.f459071i;
        if (bs5Var != null) {
            this.f223946i = bs5Var.f452558d;
            this.f223945h = bs5Var.f452560f;
            this.f223948n = bs5Var.f452565n;
        } else {
            this.f223946i = "";
            this.f223945h = "";
            this.f223948n = 0;
        }
        this.f223941d = java.lang.Integer.valueOf(j35Var.f459067e);
        this.f223944g = java.lang.Integer.valueOf(j35Var.f459070h);
        java.util.LinkedList linkedList = j35Var.f459068f;
        if (linkedList != null && !linkedList.isEmpty()) {
            int size = linkedList.size();
            for (int i17 = 0; i17 < size; i17++) {
                r45.i35 i35Var = (r45.i35) linkedList.get(i17);
                java.util.LinkedList linkedList2 = i35Var.f458235e;
                if (linkedList2 != null && !linkedList2.isEmpty()) {
                    this.f223942e.put(java.lang.Integer.valueOf(i35Var.f458234d), i35Var.f458235e);
                }
            }
        }
        this.f223943f = java.lang.Integer.valueOf(j35Var.f459069g);
        this.f223947m = j35Var.f459066d;
        java.util.LinkedList linkedList3 = j35Var.f459073n;
        if (linkedList3 != null && !linkedList3.isEmpty()) {
            java.util.Iterator it = linkedList3.iterator();
            while (it.hasNext()) {
                r45.h35 h35Var = (r45.h35) it.next();
                if (h35Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h35Var.f457339d)) {
                    if (h35Var.f457339d.equalsIgnoreCase("newApkMd5")) {
                        this.f223949o = h35Var.f457340e;
                    } else if (h35Var.f457339d.equalsIgnoreCase("oldApkMd5")) {
                        this.f223950p = h35Var.f457340e;
                    } else if (h35Var.f457339d.equalsIgnoreCase(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56321xa96d32a5)) {
                        this.f223951q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(h35Var.f457340e, 0);
                    } else if (h35Var.f457339d.equalsIgnoreCase("clientVersion")) {
                        this.f223952r = h35Var.f457340e;
                    } else if (h35Var.f457339d.equalsIgnoreCase("alphaTitle")) {
                        java.lang.String str = h35Var.f457340e;
                        this.f223953s = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? new java.lang.String(android.util.Base64.decode(str, 0)) : "";
                    } else if (h35Var.f457339d.equalsIgnoreCase("alphaContent")) {
                        java.lang.String str2 = h35Var.f457340e;
                        this.f223954t = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? new java.lang.String(android.util.Base64.decode(str2, 0)) : "";
                    } else if (h35Var.f457339d.equalsIgnoreCase("alphaUrl")) {
                        this.f223955u = h35Var.f457340e;
                    } else if (h35Var.f457339d.equalsIgnoreCase("isShowNotification")) {
                        this.f223958x = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(h35Var.f457340e, 1) == 1;
                    } else if (h35Var.f457339d.equalsIgnoreCase("isShowRedot")) {
                        this.f223959y = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(h35Var.f457340e, 1) == 1;
                    } else if (h35Var.f457339d.equalsIgnoreCase("isShowDialog")) {
                        this.f223960z = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(h35Var.f457340e, 0) == 1;
                    } else if (h35Var.f457339d.equalsIgnoreCase("showDialogMaxTimes")) {
                        this.C = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(h35Var.f457340e, 1);
                    } else if (h35Var.f457339d.equalsIgnoreCase("showDialogIntervalTime")) {
                        this.B = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(h35Var.f457340e, 6);
                    }
                }
            }
            return;
        }
        this.f223949o = "";
        this.f223950p = "";
        this.f223951q = 0;
        this.f223952r = "";
        this.f223953s = "";
        this.f223954t = "";
        this.f223955u = "";
        this.f223959y = true;
        this.f223960z = false;
        this.f223958x = true;
        this.C = 1;
        this.B = 6;
    }

    public boolean a() {
        java.lang.Integer num = this.f223941d;
        if (num.intValue() > 4 || num.intValue() < 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.TinkerSyncResponse", "responseState: %d must between %d and %d", num, 1, 4);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 24L, 1L, false);
            return false;
        }
        if (i()) {
            if (android.text.TextUtils.isEmpty(this.f223947m)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.TinkerSyncResponse", "sync response patchId should not be null");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 25L, 1L, false);
                return false;
            }
            if (android.text.TextUtils.isEmpty(this.f223945h)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.TinkerSyncResponse", "sync response cdnUrl should not be null");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 26L, 1L, false);
                return false;
            }
            if (android.text.TextUtils.isEmpty(this.f223946i)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.TinkerSyncResponse", "sync response fileMd5 should not be null");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 27L, 1L, false);
                return false;
            }
        }
        return true;
    }

    public java.lang.String b() {
        java.util.HashMap hashMap = this.f223942e;
        return hashMap != null && !hashMap.isEmpty() && hashMap.containsKey(4) ? d(hashMap, 4) : "";
    }

    public int c() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f223952r;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerSyncResponse", "clientVersion %s currentVersion %s", objArr);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f223952r)) {
            try {
                return java.lang.Integer.decode(this.f223952r).intValue();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.TinkerSyncResponse", e17, "getClientVersionCode", new java.lang.Object[0]);
            }
        }
        return 0;
    }

    public final java.lang.String d(java.util.HashMap hashMap, int i17) {
        java.util.LinkedList linkedList;
        java.lang.String str = "";
        if (hashMap != null && !hashMap.isEmpty() && (linkedList = (java.util.LinkedList) hashMap.get(java.lang.Integer.valueOf(i17))) != null && !linkedList.isEmpty()) {
            int size = linkedList.size();
            for (int i18 = 0; i18 < size; i18++) {
                r45.br4 br4Var = (r45.br4) linkedList.get(i18);
                if (br4Var.f452539d.equalsIgnoreCase("default")) {
                    str = new java.lang.String(android.util.Base64.decode(br4Var.f452540e, 0));
                } else if (br4Var.f452539d.equalsIgnoreCase(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d())) {
                    return new java.lang.String(android.util.Base64.decode(br4Var.f452540e, 0));
                }
            }
        }
        return str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f223943f.intValue();
    }

    public boolean f() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f223952r;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerSyncResponse", "clientVersion %s currentVersion %s", objArr);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f223952r)) {
            try {
                return (java.lang.Integer.decode(this.f223952r).intValue() & (-256)) < (java.lang.Integer.decode(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g).intValue() & (-256));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.TinkerSyncResponse", e17, "isLowerClientVersion", new java.lang.Object[0]);
            }
        }
        return false;
    }

    public boolean g() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context)) {
            return false;
        }
        java.lang.Integer num = this.f223944g;
        if (num.intValue() != 1 && num.intValue() == 3) {
            return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context);
        }
        return true;
    }

    public boolean h() {
        return this.f223941d.intValue() == 3;
    }

    public boolean i() {
        java.lang.Integer num = this.f223941d;
        return num.intValue() == 2 || num.intValue() == 4;
    }

    /* renamed from: toString */
    public java.lang.String m65149x9616526c() {
        return "\nutils packageType:" + this.f223943f + "\nisAuto:" + this.f223956v + "\nresponseState:" + this.f223941d + "\ncdnUrl:" + this.f223945h + "\nfileMd5:" + this.f223946i + "\nnetworkType:" + this.f223944g + "\npatchId:" + this.f223947m + "\nisShowNotification:" + this.f223958x + "\nisShowDialog:" + this.f223960z + "\nisShowRedot:" + this.f223959y + "\nnewApkMd5:" + this.f223949o + "\noldApkMd5:" + this.f223950p + "\nclientVersion:" + this.f223952r + "\ngetClientVersionCode:" + c();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeValue(this.f223941d);
        parcel.writeSerializable(this.f223942e);
        parcel.writeValue(this.f223943f);
        parcel.writeValue(this.f223944g);
        parcel.writeString(this.f223945h);
        parcel.writeString(this.f223946i);
        parcel.writeString(this.f223947m);
        parcel.writeInt(this.f223948n);
        parcel.writeString(this.f223949o);
        parcel.writeString(this.f223950p);
        parcel.writeInt(this.f223951q);
        parcel.writeString(this.f223952r);
        parcel.writeString(this.f223953s);
        parcel.writeString(this.f223954t);
        parcel.writeString(this.f223955u);
        parcel.writeByte(this.f223956v ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f223957w);
        parcel.writeByte(this.f223958x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f223959y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f223960z ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
    }

    public C16114x800e8cdb(android.os.Parcel parcel) {
        this.f223942e = new java.util.HashMap();
        this.f223956v = true;
        this.f223957w = 0L;
        this.f223958x = true;
        this.f223959y = true;
        this.f223960z = true;
        this.f223941d = (java.lang.Integer) parcel.readValue(java.lang.Integer.class.getClassLoader());
        this.f223942e = (java.util.HashMap) parcel.readSerializable();
        this.f223943f = (java.lang.Integer) parcel.readValue(java.lang.Integer.class.getClassLoader());
        this.f223944g = (java.lang.Integer) parcel.readValue(java.lang.Integer.class.getClassLoader());
        this.f223945h = parcel.readString();
        this.f223946i = parcel.readString();
        this.f223947m = parcel.readString();
        this.f223948n = parcel.readInt();
        this.f223949o = parcel.readString();
        this.f223950p = parcel.readString();
        this.f223951q = parcel.readInt();
        this.f223952r = parcel.readString();
        this.f223953s = parcel.readString();
        this.f223954t = parcel.readString();
        this.f223955u = parcel.readString();
        this.f223956v = parcel.readByte() != 0;
        this.f223957w = parcel.readLong();
        this.f223958x = parcel.readByte() != 0;
        this.f223959y = parcel.readByte() != 0;
        this.f223960z = parcel.readByte() != 0;
        this.A = parcel.readString();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
    }
}

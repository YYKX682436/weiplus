package com.p314xaae8f345.mm.ui.p2731xc84c5534;

/* renamed from: com.tencent.mm.ui.report.KV17560Reporter */
/* loaded from: classes9.dex */
public class C22471x941a9a3f implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f291145d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2731xc84c5534.j0 f291146e;

    /* renamed from: f, reason: collision with root package name */
    public int f291147f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f291148g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f291149h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2731xc84c5534.h0 f291150i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.WeakHashMap f291144m = new java.util.WeakHashMap(4);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f> f39688x681a0c0c = new com.p314xaae8f345.mm.ui.p2731xc84c5534.g0();

    public C22471x941a9a3f() {
        this.f291146e = com.p314xaae8f345.mm.ui.p2731xc84c5534.j0.Unknown;
        this.f291150i = com.p314xaae8f345.mm.ui.p2731xc84c5534.h0.Unknown;
    }

    public static synchronized com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f c(android.app.Activity activity) {
        synchronized (com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f.class) {
            if (activity == null) {
                return new com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f() { // from class: com.tencent.mm.ui.report.KV17560Reporter.2
                    @Override // com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f
                    public void b(com.p314xaae8f345.mm.ui.p2731xc84c5534.i0 i0Var) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KV17560Reporter", "[!] report with OpType %s was ignored since contextAnchor was null.", i0Var);
                    }
                };
            }
            com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f c22471x941a9a3f = (com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f) f291144m.get(activity);
            if (c22471x941a9a3f != null) {
                return c22471x941a9a3f;
            }
            android.content.Intent intent = activity.getIntent();
            com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f c22471x941a9a3f2 = null;
            if (intent != null) {
                try {
                    c22471x941a9a3f2 = (com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f) intent.getParcelableExtra("KV17560Reporter_Data");
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KV17560Reporter", th6, "[-] fail to deserialize.", new java.lang.Object[0]);
                }
            }
            if (c22471x941a9a3f2 == null) {
                c22471x941a9a3f2 = new com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f();
            }
            f291144m.put(activity, c22471x941a9a3f2);
            return c22471x941a9a3f2;
        }
    }

    public void a(android.content.Intent intent) {
        try {
            intent.putExtra("KV17560Reporter_Data", this);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KV17560Reporter", th6, "[-] fail to serialize.", new java.lang.Object[0]);
        }
    }

    public void b(com.p314xaae8f345.mm.ui.p2731xc84c5534.i0 i0Var) {
        if (i0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KV17560Reporter", "[!] opType is null, skip report.");
            return;
        }
        com.p314xaae8f345.mm.ui.p2731xc84c5534.h0 h0Var = this.f291150i;
        if (h0Var == null || h0Var == com.p314xaae8f345.mm.ui.p2731xc84c5534.h0.Unknown) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KV17560Reporter", "[!] mediaType is null or unknown, skip report.");
            return;
        }
        com.p314xaae8f345.mm.ui.p2731xc84c5534.j0 j0Var = this.f291146e;
        if (j0Var == null || j0Var == com.p314xaae8f345.mm.ui.p2731xc84c5534.j0.Unknown) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KV17560Reporter", "[!] scene is null or unknown, skip report.");
            return;
        }
        if (android.text.TextUtils.isEmpty(this.f291145d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KV17560Reporter", "[!] chatname is null or empty, skip report.");
            return;
        }
        if (android.text.TextUtils.isEmpty(this.f291148g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KV17560Reporter", "[!] enter session id is null or empty, skip report.");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(i0Var.f291205d);
        objArr[1] = java.lang.Integer.valueOf(this.f291150i.f291185d);
        objArr[2] = java.lang.Integer.valueOf(this.f291146e.f291216d);
        java.lang.String str = this.f291145d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        objArr[4] = this.f291149h;
        objArr[5] = java.lang.Integer.valueOf(this.f291147f);
        java.lang.String str2 = this.f291148g;
        objArr[6] = str2 != null ? str2 : "";
        g0Var.d(17560, objArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f291145d);
        com.p314xaae8f345.mm.ui.p2731xc84c5534.j0 j0Var = this.f291146e;
        parcel.writeInt(j0Var != null ? j0Var.f291216d : 0);
        parcel.writeInt(this.f291147f);
        parcel.writeString(this.f291148g);
        parcel.writeString(this.f291149h);
        com.p314xaae8f345.mm.ui.p2731xc84c5534.h0 h0Var = this.f291150i;
        parcel.writeInt(h0Var != null ? h0Var.f291185d : 0);
    }

    public C22471x941a9a3f(java.lang.String str, com.p314xaae8f345.mm.ui.p2731xc84c5534.j0 j0Var, int i17, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.ui.p2731xc84c5534.h0 h0Var, com.p314xaae8f345.mm.ui.p2731xc84c5534.g0 g0Var) {
        this.f291145d = str;
        this.f291146e = j0Var;
        this.f291147f = i17;
        this.f291148g = str2;
        this.f291149h = str3;
        this.f291150i = h0Var;
    }
}

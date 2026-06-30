package com.p314xaae8f345.mm.p874xaefb6cc9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0016"}, d2 = {"com/tencent/mm/minigame/WVAModulePkgPathHelper$GetWVAModulePkgPathTask", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "y", "Landroid/os/Parcel;", "parcel", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "", "flags", "writeToParcel", "", "mFromMainProcess", "Lcom/tencent/mm/plugin/appbrand/service/c0;", "mService", "", "mModuleName", "Lcom/tencent/mm/minigame/f1;", "mCallback", "<init>", "(ZLcom/tencent/mm/plugin/appbrand/service/c0;Ljava/lang/String;Lcom/tencent/mm/minigame/f1;)V", "(Landroid/os/Parcel;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.minigame.WVAModulePkgPathHelper$GetWVAModulePkgPathTask */
/* loaded from: classes7.dex */
public final class C10915x95dcf60b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p874xaefb6cc9.C10915x95dcf60b> f29742x681a0c0c = new com.p314xaae8f345.mm.p874xaefb6cc9.b1();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f150520f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f150521g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p874xaefb6cc9.f1 f150522h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f150523i;

    /* renamed from: m, reason: collision with root package name */
    public int f150524m;

    /* renamed from: n, reason: collision with root package name */
    public int f150525n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 f150526o;

    /* renamed from: p, reason: collision with root package name */
    public long f150527p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p874xaefb6cc9.e1 f150528q;

    public /* synthetic */ C10915x95dcf60b(android.os.Parcel parcel, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(parcel);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.f150521g = readString;
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        this.f150523i = readString2;
        this.f150524m = parcel.readInt();
        this.f150525n = parcel.readInt();
        android.os.Parcelable readParcelable = parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553.class.getClassLoader());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readParcelable);
        this.f150526o = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553) readParcelable;
        this.f150527p = parcel.readLong();
        boolean z17 = parcel.readInt() == 1;
        java.lang.String readString3 = parcel.readString();
        this.f150528q = new com.p314xaae8f345.mm.p874xaefb6cc9.e1(z17, readString3 == null ? "" : readString3, parcel.readInt(), parcel.readLong(), parcel.readInt() == 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f150521g);
        parcel.writeString(this.f150523i);
        parcel.writeInt(this.f150524m);
        parcel.writeInt(this.f150525n);
        parcel.writeParcelable(this.f150526o, 0);
        parcel.writeLong(this.f150527p);
        parcel.writeInt(this.f150528q.f150595a ? 1 : 0);
        parcel.writeString(this.f150528q.f150596b);
        parcel.writeInt(this.f150528q.f150597c);
        parcel.writeLong(this.f150528q.f150598d);
        parcel.writeInt(this.f150528q.f150599e ? 1 : 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", "runInClientProcess: result=" + this.f150528q);
        x();
        if (this.f150528q.f150595a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f150520f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = c0Var.t3();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t37, "getRuntime(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4 o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.o(t37, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la laVar = o17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la) o17 : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3 y3Var = laVar != null ? laVar.f157188a : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar = y3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac) y3Var : null;
            if (acVar != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e();
                c11656xaf63146e.f33454x337a8b = this.f150521g;
                c11656xaf63146e.f33455xe121c411 = this.f150528q.f150596b;
                c11656xaf63146e.f33456x1c82a56c = this.f150528q.f150597c;
                arrayList.add(c11656xaf63146e);
                acVar.o(arrayList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", "runInClientProcess: merged module " + this.f150521g + ", pkgPath=" + this.f150528q.f150596b + ", pkgVersion=" + this.f150528q.f150597c);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WVAModulePkgPathHelper", "runInClientProcess: mergeDirReader is null");
            }
        }
        com.p314xaae8f345.mm.p874xaefb6cc9.f1 f1Var = this.f150522h;
        if (f1Var != null) {
            f1Var.a(this.f150528q);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", "runInMainProcess: start checking module=" + this.f150521g);
        com.p314xaae8f345.mm.p874xaefb6cc9.e1 a17 = com.p314xaae8f345.mm.p874xaefb6cc9.g1.f150604a.a(this.f150523i, this.f150521g, this.f150524m, this.f150525n, null);
        if (a17.f150595a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", "runInMainProcess: module already downloaded, pkgPath=" + a17.f150596b);
            this.f150528q = a17;
            c();
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runInMainProcess: module not downloaded, pkgVersion=");
        int i17 = a17.f150597c;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", sb6.toString());
        if (this.f150527p > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", "runInMainProcess: using moduleSize from child process: " + this.f150527p);
            java.lang.String str2 = this.f150523i;
            java.lang.String a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(this.f150521g);
            java.lang.String str3 = null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str2);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18)) {
                    str = "";
                } else {
                    str = "$" + a18;
                }
                sb7.append(str);
                str3 = sb7.toString();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "toString(...)");
            int i18 = this.f150524m;
            boolean z17 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v3.b(str3, 0);
            if (b17 != null && b17.mo49191x1c82a56c() < i18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", "checkOldVersionExists: found available older version=" + b17.mo49191x1c82a56c() + " for queryKey=" + str3 + ", currentVersion=" + i18);
                z17 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", "runInMainProcess: hasOldVersion=" + z17 + " for queryKey=" + str3 + ", currentVersion=" + this.f150524m);
            if (z17) {
                java.lang.String str4 = this.f150523i;
                java.lang.String str5 = this.f150521g;
                int i19 = this.f150525n;
                long j17 = this.f150527p;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.qc qcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.qc.f166620a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553 = this.f150526o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11829x68027553);
                qcVar.a(str4, str5, c11829x68027553, i19, null, new r45.y50(), new com.p314xaae8f345.mm.p874xaefb6cc9.c1(j17, this, i17), new com.p314xaae8f345.mm.p874xaefb6cc9.d1(j17, this, i17));
                return;
            }
            this.f150528q = new com.p314xaae8f345.mm.p874xaefb6cc9.e1(false, null, a17.f150597c, this.f150527p, false, 2, null);
        } else {
            this.f150528q = new com.p314xaae8f345.mm.p874xaefb6cc9.e1(false, null, a17.f150597c, 0L, false, 26, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", "runInMainProcess: result exists=" + this.f150528q.f150595a + ", pkgPath=" + this.f150528q.f150596b + ", pkgVersion=" + this.f150528q.f150597c + ", pkgSize=" + this.f150528q.f150598d + ", hasOldVersion=" + this.f150528q.f150599e);
        c();
    }

    public C10915x95dcf60b(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, java.lang.String mModuleName, com.p314xaae8f345.mm.p874xaefb6cc9.f1 f1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mModuleName, "mModuleName");
        this.f150520f = c0Var;
        this.f150521g = mModuleName;
        this.f150522h = f1Var;
        this.f150523i = "";
        this.f150528q = new com.p314xaae8f345.mm.p874xaefb6cc9.e1(false, null, 0, 0L, false, 30, null);
        if (z17) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = c0Var.t3();
        java.lang.String str = t37.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppId(...)");
        this.f150523i = str;
        this.f150524m = t37.u0().L;
        this.f150526o = t37.u0().N;
        this.f150525n = t37.f156338p.f158814g;
        this.f150527p = com.p314xaae8f345.mm.p874xaefb6cc9.g1.f150604a.b(this.f150521g, t37.u0().N);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", "GetWVAModulePkgPathTask init: appId=" + this.f150523i + ", moduleName=" + this.f150521g + ", appVersion=" + this.f150524m + ", versionType=" + this.f150525n + ", moduleSize=" + this.f150527p);
    }

    private C10915x95dcf60b(android.os.Parcel parcel) {
        this(true, null, "", null);
        v(parcel);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", "GetWVAModulePkgPathTask from Parcel: mModuleName=" + this.f150521g + ", mAppId=" + this.f150523i);
    }
}

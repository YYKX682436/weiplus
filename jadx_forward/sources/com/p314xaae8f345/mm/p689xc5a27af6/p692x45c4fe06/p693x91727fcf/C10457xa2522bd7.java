package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess", "Lft/b;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess */
/* loaded from: classes7.dex */
public final /* data */ class C10457xa2522bd7 implements ft.b, android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7> f28807x681a0c0c = new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f146571d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f146572e;

    /* renamed from: f, reason: collision with root package name */
    public final ft.d f146573f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f146574g;

    /* renamed from: h, reason: collision with root package name */
    public final int f146575h;

    public C10457xa2522bd7(java.lang.String str, java.util.List appList, ft.d preferUsedAsType, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appList, "appList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preferUsedAsType, "preferUsedAsType");
        this.f146571d = str;
        this.f146572e = appList;
        this.f146573f = preferUsedAsType;
        this.f146574g = z17;
        this.f146575h = i17;
    }

    @Override // ft.b
    public boolean a() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.o(this.f146571d);
    }

    @Override // ft.b
    public void b() {
        java.lang.String str = this.f146571d;
        int i17 = this.f146575h;
        if (i17 == 0) {
            i17 = m45.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
        }
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessManagerServiceAnyProcess", "killProcess name:" + str + ", pid:" + i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }

    @Override // ft.b
    /* renamed from: d, reason: from getter */
    public ft.d getF146573f() {
        return this.f146573f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // ft.b
    public void e() {
        if (this.f146572e.isEmpty()) {
            if (this.f146574g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessManagerServiceAnyProcess", "releasePreloadedAndSparedEnvironment skip appbrand1 for mb2.0");
                return;
            } else {
                b();
                return;
            }
        }
        java.lang.String str = this.f146571d;
        if (str == null || str.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u1.class, null);
    }

    /* renamed from: equals */
    public boolean m43820xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7 c10457xa2522bd7 = (com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f146571d, c10457xa2522bd7.f146571d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f146572e, c10457xa2522bd7.f146572e) && this.f146573f == c10457xa2522bd7.f146573f && this.f146574g == c10457xa2522bd7.f146574g && this.f146575h == c10457xa2522bd7.f146575h;
    }

    @Override // ft.b
    /* renamed from: f, reason: from getter */
    public java.lang.String getF146571d() {
        return this.f146571d;
    }

    @Override // ft.b
    /* renamed from: g, reason: from getter */
    public java.util.List getF146572e() {
        return this.f146572e;
    }

    @Override // ft.b
    public boolean h() {
        throw new java.lang.UnsupportedOperationException("Not supported");
    }

    /* renamed from: hashCode */
    public int m43821x8cdac1b() {
        java.lang.String str = this.f146571d;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.f146572e.hashCode()) * 31) + this.f146573f.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f146574g)) * 31) + java.lang.Integer.hashCode(this.f146575h);
    }

    /* renamed from: toString */
    public java.lang.String m43822x9616526c() {
        return "ParcelizedAppProcess(processName=" + this.f146571d + ", appList=" + u46.a.c(this.f146572e.toArray(new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9[0]), "{}") + ", preferUsedAsType=" + this.f146573f + ", isMBRunning=" + this.f146574g + ", pid=" + this.f146575h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f146571d);
        java.util.List list = this.f146572e;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9) it.next()).writeToParcel(out, i17);
        }
        ft.d dVar = this.f146573f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        out.writeInt(dVar.ordinal());
        out.writeInt(this.f146574g ? 1 : 0);
        out.writeInt(this.f146575h);
    }

    public /* synthetic */ C10457xa2522bd7(java.lang.String str, java.util.List list, ft.d dVar, boolean z17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, list, dVar, z17, (i18 & 16) != 0 ? 0 : i17);
    }
}

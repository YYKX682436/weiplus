package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask */
/* loaded from: classes15.dex */
public class C11970x4f4ad5f2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11970x4f4ad5f2> f33712x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.c1();

    /* renamed from: i, reason: collision with root package name */
    public int f160412i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160413m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160414n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160415o;

    /* renamed from: p, reason: collision with root package name */
    public android.os.Bundle f160416p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f160417q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Runnable f160418r;

    public C11970x4f4ad5f2(android.app.Activity activity) {
        super(activity);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176
    public void b(android.os.Parcel parcel) {
        this.f160412i = parcel.readInt();
        this.f160413m = parcel.readString();
        this.f160414n = parcel.readString();
        this.f160415o = parcel.readString();
        this.f160416p = parcel.readBundle();
        this.f160417q = parcel.readByte() == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "runInClientProcess");
        if (this.f160418r != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "runInClientProcess asyncCallback != null");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.y0) this.f160418r).run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176
    public void d(final android.content.Context context, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.r rVar) {
        if (android.os.Looper.myLooper() == null) {
            e(context, rVar);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11970x4f4ad5f2> creator = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11970x4f4ad5f2.f33712x681a0c0c;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11970x4f4ad5f2.this.e(context, rVar);
            }
        });
    }

    public final void e(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.r rVar) {
        java.lang.String str;
        if (!android.text.TextUtils.isEmpty(this.f160413m)) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str2 = this.f160413m;
            ((kt.c) i0Var).getClass();
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str2, false, false) == null) {
                lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str3 = this.f160413m;
                ((kt.c) i0Var2).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.k(str3, true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.e1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.b1(this, rVar));
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699();
        c11272xd6622699.f33061xb2206a6f = this.f160415o;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11272xd6622699);
        c11286x34a5504.f33127xc9f07109 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a;
        c11286x34a5504.f33125x9b39409a = this.f160415o;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5670x1f7ac2b c5670x1f7ac2b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5670x1f7ac2b();
        am.ki kiVar = c5670x1f7ac2b.f135994g;
        kiVar.f88682a = c11286x34a5504;
        kiVar.f88683b = this.f160413m;
        kiVar.f88684c = this.f160412i;
        kiVar.f88685d = context;
        kiVar.f88687f = this.f160416p;
        kiVar.f88686e = e1Var;
        c5670x1f7ac2b.e();
        boolean z17 = c5670x1f7ac2b.f135995h.f88781a;
        if (!z17) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160413m) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160414n)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication nil appId or parameter.");
            } else {
                java.lang.String str4 = this.f160413m + "://" + this.f160414n;
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str4));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication by opensdk failed, try to launch by scheme(%s).", str4);
                intent.addFlags(268435456);
                java.util.List w17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w1(context, intent);
                if ((w17 != null && !w17.isEmpty()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    if (android.text.TextUtils.isEmpty(intent.getPackage()) && w17 != null && w17.size() == 1) {
                        lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
                        android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) w17.get(0);
                        ((kt.c) i0Var3).getClass();
                        str = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.o(resolveInfo);
                    } else {
                        str = intent.getPackage();
                    }
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!str5.equals(str)) {
                        e1Var.f160486c = false;
                        e1Var.f160485b = false;
                        e1Var.f160487d = false;
                        e1Var.f160484a = false;
                        lt.i0 i0Var4 = (lt.i0) i95.n0.c(lt.i0.class);
                        android.os.Bundle bundle = this.f160416p;
                        ((kt.c) i0Var4).getClass();
                        z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(context, intent, null, e1Var, bundle);
                    }
                }
            }
        }
        e1Var.b(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f160412i);
        parcel.writeString(this.f160413m);
        parcel.writeString(this.f160414n);
        parcel.writeString(this.f160415o);
        parcel.writeBundle(this.f160416p);
        parcel.writeByte(this.f160417q ? (byte) 1 : (byte) 0);
    }

    public C11970x4f4ad5f2(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.a1 a1Var) {
        b(parcel);
    }
}

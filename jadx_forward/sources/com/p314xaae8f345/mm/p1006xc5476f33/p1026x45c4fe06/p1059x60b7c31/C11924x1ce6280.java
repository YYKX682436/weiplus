package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask */
/* loaded from: classes15.dex */
public class C11924x1ce6280 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11924x1ce6280> f33657x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u7();

    /* renamed from: i, reason: collision with root package name */
    public int f160089i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160090m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160091n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160092o;

    /* renamed from: p, reason: collision with root package name */
    public android.os.Bundle f160093p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f160094q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Runnable f160095r;

    public C11924x1ce6280(android.app.Activity activity) {
        super(activity);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176
    public void b(android.os.Parcel parcel) {
        this.f160089i = parcel.readInt();
        this.f160090m = parcel.readString();
        this.f160091n = parcel.readString();
        this.f160092o = parcel.readString();
        this.f160093p = parcel.readBundle();
        this.f160094q = parcel.readByte() == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "runInClientProcess");
        if (this.f160095r != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "runInClientProcess asyncCallback != null");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m7) this.f160095r).run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176
    public void d(final android.content.Context context, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.r rVar) {
        if (android.os.Looper.myLooper() == null) {
            e(context, rVar);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11924x1ce6280> creator = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11924x1ce6280.f33657x681a0c0c;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11924x1ce6280.this.e(context, rVar);
            }
        });
    }

    public final void e(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.r rVar) {
        java.lang.String str;
        if (!android.text.TextUtils.isEmpty(this.f160090m)) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str2 = this.f160090m;
            ((kt.c) i0Var).getClass();
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str2, false, false) == null) {
                lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str3 = this.f160090m;
                ((kt.c) i0Var2).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.k(str3, true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t7 t7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t7(this, rVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w7 w7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w7(t7Var);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699();
        c11272xd6622699.f33061xb2206a6f = this.f160092o;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11272xd6622699);
        c11286x34a5504.f33127xc9f07109 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a;
        c11286x34a5504.f33125x9b39409a = this.f160092o;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5670x1f7ac2b c5670x1f7ac2b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5670x1f7ac2b();
        am.ki kiVar = c5670x1f7ac2b.f135994g;
        kiVar.f88682a = c11286x34a5504;
        kiVar.f88683b = this.f160090m;
        kiVar.f88684c = this.f160089i;
        kiVar.f88685d = context;
        kiVar.f88687f = this.f160093p;
        kiVar.f88686e = w7Var;
        c5670x1f7ac2b.e();
        boolean z17 = c5670x1f7ac2b.f135995h.f88781a;
        if (!z17) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160090m) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160091n)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication nil appId or parameter.");
            } else {
                java.lang.String str4 = this.f160090m + "://" + this.f160091n;
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str4));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication by opensdk failed, try to launch by scheme(%s).", str4);
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
                        w7Var.f165249c = false;
                        w7Var.f165248b = false;
                        w7Var.f165250d = false;
                        w7Var.f165247a = false;
                        lt.i0 i0Var4 = (lt.i0) i95.n0.c(lt.i0.class);
                        android.os.Bundle bundle = this.f160093p;
                        ((kt.c) i0Var4).getClass();
                        z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(context, intent, null, w7Var, bundle);
                    }
                }
            }
        }
        w7Var.f165247a = z17;
        w7Var.f165250d = true;
        if (w7Var.f165249c) {
            t7Var.a(z17, w7Var.f165248b);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f160089i);
        parcel.writeString(this.f160090m);
        parcel.writeString(this.f160091n);
        parcel.writeString(this.f160092o);
        parcel.writeBundle(this.f160093p);
        parcel.writeByte(this.f160094q ? (byte) 1 : (byte) 0);
    }

    public C11924x1ce6280(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o7 o7Var) {
        b(parcel);
    }
}

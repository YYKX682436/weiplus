package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* renamed from: com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask */
/* loaded from: classes8.dex */
public class C19541x2b0e01ee extends com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.AbstractC19538xebb9e287 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19541x2b0e01ee> f38794x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.r();

    /* renamed from: h, reason: collision with root package name */
    public int f269884h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f269885i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f269886m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f269887n;

    /* renamed from: o, reason: collision with root package name */
    public long f269888o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f269889p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f269890q;

    /* renamed from: r, reason: collision with root package name */
    public int f269891r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f269892s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2457x798ad335.EnumC19533xfc0809e f269893t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Runnable f269894u;

    public /* synthetic */ C19541x2b0e01ee(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.q qVar) {
        this(parcel);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.AbstractC19538xebb9e287
    public void B(android.os.Parcel parcel) {
        this.f269884h = parcel.readInt();
        this.f269885i = parcel.readString();
        this.f269886m = parcel.readString();
        this.f269887n = parcel.readString();
        this.f269888o = parcel.readLong();
        this.f269889p = parcel.readString();
        this.f269890q = parcel.readString();
        this.f269891r = parcel.readInt();
        this.f269892s = parcel.readString();
        this.f269893t = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2457x798ad335.EnumC19533xfc0809e) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2457x798ad335.EnumC19533xfc0809e.class.getClassLoader());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.AbstractC19538xebb9e287
    public void C(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f269884h);
        parcel.writeString(this.f269885i);
        parcel.writeString(this.f269886m);
        parcel.writeString(this.f269887n);
        parcel.writeLong(this.f269888o);
        parcel.writeString(this.f269889p);
        parcel.writeString(this.f269890q);
        parcel.writeInt(this.f269891r);
        parcel.writeString(this.f269892s);
        parcel.writeParcelable(this.f269893t, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.Runnable runnable = this.f269894u;
        if (runnable != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.d0) runnable).run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.q(this);
        if (this.f269884h == 1) {
            xz4.i.a().c(this.f269885i, qVar);
            return;
        }
        xz4.i a17 = xz4.i.a();
        int i17 = this.f269884h;
        java.lang.String str = this.f269885i;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.f269886m;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.f269887n;
        if (str3 == null) {
            str3 = "";
        }
        long j17 = this.f269888o;
        java.lang.String str4 = this.f269889p;
        if (str4 == null) {
            str4 = "";
        }
        java.lang.String str5 = this.f269890q;
        if (str5 == null) {
            str5 = "";
        }
        a17.f(i17, str, "", str2, str3, j17, str4, "", str5, this.f269891r, qVar);
    }

    public C19541x2b0e01ee() {
    }

    private C19541x2b0e01ee(android.os.Parcel parcel) {
        v(parcel);
    }
}

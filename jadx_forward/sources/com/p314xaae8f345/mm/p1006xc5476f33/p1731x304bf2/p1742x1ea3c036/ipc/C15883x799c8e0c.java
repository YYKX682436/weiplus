package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ipc;

/* renamed from: com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask */
/* loaded from: classes8.dex */
public class C15883x799c8e0c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ipc.C15883x799c8e0c> f36926x681a0c0c = new w43.b();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f221099f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f221100g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f221101h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f221102i;

    public /* synthetic */ C15883x799c8e0c(android.os.Parcel parcel, w43.a aVar) {
        this(parcel);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f221099f = parcel.readString();
        this.f221100g = parcel.readString();
        this.f221101h = parcel.readByte() == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f221099f);
        parcel.writeString(this.f221100g);
        parcel.writeByte(this.f221101h ? (byte) 1 : (byte) 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.Runnable runnable = this.f221102i;
        if (runnable != null) {
            ((b53.i) runnable).run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f221100g) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f221099f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f221099f, this.f221100g, new w43.a(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddShortcutTask", "appid or username is null");
            this.f221101h = false;
        }
    }

    public C15883x799c8e0c() {
    }

    private C15883x799c8e0c(android.os.Parcel parcel) {
        v(parcel);
    }
}

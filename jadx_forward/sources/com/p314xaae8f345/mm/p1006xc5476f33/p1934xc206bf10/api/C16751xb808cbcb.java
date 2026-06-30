package com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api;

/* renamed from: com.tencent.mm.plugin.normsg.api.AudioModeStatus */
/* loaded from: classes13.dex */
public class C16751xb808cbcb implements android.os.Parcelable, java.lang.Cloneable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb> f37710x681a0c0c = new fo3.a();

    /* renamed from: d, reason: collision with root package name */
    public int f233934d;

    /* renamed from: e, reason: collision with root package name */
    public long f233935e;

    /* renamed from: f, reason: collision with root package name */
    public int f233936f;

    /* renamed from: g, reason: collision with root package name */
    public long f233937g;

    public C16751xb808cbcb() {
        this.f233934d = -1;
        this.f233935e = 0L;
        this.f233936f = -1;
        this.f233937g = 0L;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb a() {
        android.media.AudioManager audioManager = (android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb c16751xb808cbcb = new com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb();
        c16751xb808cbcb.f233934d = audioManager.getMode();
        return c16751xb808cbcb;
    }

    public com.p314xaae8f345.mm.p975xc206bf10.a b() {
        return new com.p314xaae8f345.mm.p975xc206bf10.a(this.f233934d, this.f233935e, this.f233936f, this.f233937g);
    }

    /* renamed from: clone */
    public java.lang.Object m67465x5a5dd5d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb c16751xb808cbcb;
        synchronized (this) {
            c16751xb808cbcb = new com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb();
            c16751xb808cbcb.f233934d = this.f233934d;
            c16751xb808cbcb.f233935e = this.f233935e;
            c16751xb808cbcb.f233936f = this.f233936f;
            c16751xb808cbcb.f233937g = this.f233937g;
        }
        return c16751xb808cbcb;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f233934d);
        parcel.writeLong(this.f233935e);
        parcel.writeInt(this.f233936f);
        parcel.writeLong(this.f233937g);
    }

    public C16751xb808cbcb(android.os.Parcel parcel) {
        this.f233934d = -1;
        this.f233935e = 0L;
        this.f233936f = -1;
        this.f233937g = 0L;
        this.f233934d = parcel.readInt();
        this.f233935e = parcel.readLong();
        this.f233936f = parcel.readInt();
        this.f233937g = parcel.readLong();
    }
}

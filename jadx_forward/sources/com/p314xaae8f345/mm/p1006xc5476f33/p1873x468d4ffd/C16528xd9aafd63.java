package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd;

/* renamed from: com.tencent.mm.plugin.mmsight.SightParams */
/* loaded from: classes10.dex */
public class C16528xd9aafd63 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63> f37633x681a0c0c = new ai3.f();

    /* renamed from: d, reason: collision with root package name */
    public int f230350d;

    /* renamed from: e, reason: collision with root package name */
    public int f230351e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f230352f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f230353g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f230354h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f230355i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f230356m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f230357n;

    /* renamed from: o, reason: collision with root package name */
    public final int f230358o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f230359p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f230360q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f230361r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f230362s;

    /* renamed from: t, reason: collision with root package name */
    public final int f230363t;

    public C16528xd9aafd63(int i17, int i18) {
        this.f230350d = 0;
        this.f230351e = 2;
        this.f230353g = "";
        this.f230354h = "";
        this.f230355i = "";
        this.f230356m = "";
        this.f230357n = true;
        this.f230358o = -1;
        this.f230359p = true;
        this.f230360q = "";
        this.f230361r = true;
        this.f230362s = false;
        this.f230363t = 0;
        if (i17 == 1) {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            this.f230352f = d11.s.fj().cj();
        } else if (i17 == 2 || i17 == 3 || i17 == 4) {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            this.f230352f = d11.s.fj().pj();
        } else if (i17 == 7) {
            this.f230352f = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Di();
        } else {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            this.f230352f = d11.s.fj().pj();
        }
        this.f230358o = i17;
        this.f230350d = i18;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f230355i = str;
        this.f230353g = str2;
        this.f230354h = str3;
        this.f230356m = str4;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f230350d);
        parcel.writeParcelable(this.f230352f, i17);
        parcel.writeString(this.f230353g);
        parcel.writeString(this.f230354h);
        parcel.writeString(this.f230355i);
        parcel.writeString(this.f230356m);
        parcel.writeInt(this.f230363t);
        parcel.writeInt(this.f230351e);
        parcel.writeInt(this.f230357n ? 1 : 0);
        parcel.writeInt(this.f230358o);
        parcel.writeByte(this.f230359p ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f230360q);
        parcel.writeByte(this.f230361r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f230362s ? (byte) 1 : (byte) 0);
    }

    public C16528xd9aafd63(android.os.Parcel parcel) {
        this.f230350d = 0;
        this.f230351e = 2;
        this.f230353g = "";
        this.f230354h = "";
        this.f230355i = "";
        this.f230356m = "";
        this.f230357n = true;
        this.f230358o = -1;
        this.f230359p = true;
        this.f230360q = "";
        this.f230361r = true;
        this.f230362s = false;
        this.f230363t = 0;
        this.f230350d = parcel.readInt();
        this.f230352f = (com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d) parcel.readParcelable(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d.class.getClassLoader());
        this.f230353g = parcel.readString();
        this.f230354h = parcel.readString();
        this.f230355i = parcel.readString();
        this.f230356m = parcel.readString();
        this.f230363t = parcel.readInt();
        this.f230351e = parcel.readInt();
        this.f230357n = parcel.readInt() > 0;
        this.f230358o = parcel.readInt();
        this.f230359p = parcel.readByte() != 0;
        this.f230360q = parcel.readString();
        this.f230361r = parcel.readByte() != 0;
        this.f230362s = parcel.readByte() != 0;
    }
}

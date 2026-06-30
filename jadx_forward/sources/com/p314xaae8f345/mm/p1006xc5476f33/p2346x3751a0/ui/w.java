package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes.dex */
public final class w implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final int f258546d;

    /* renamed from: e, reason: collision with root package name */
    public final int f258547e;

    /* renamed from: f, reason: collision with root package name */
    public final int f258548f;

    /* renamed from: g, reason: collision with root package name */
    public final int f258549g;

    /* renamed from: h, reason: collision with root package name */
    public final int f258550h;

    /* renamed from: i, reason: collision with root package name */
    public final int f258551i;

    /* renamed from: m, reason: collision with root package name */
    public final int f258552m;

    public w(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f258546d = i17;
        this.f258547e = i18;
        this.f258548f = i19;
        this.f258549g = i27;
        this.f258550h = i28;
        this.f258551i = i29;
        this.f258552m = i37;
    }

    public final byte[] a() {
        int i17 = this.f258552m;
        return new byte[]{0, 0, (byte) this.f258546d, (byte) this.f258547e, (byte) this.f258548f, (byte) this.f258549g, (byte) this.f258550h, (byte) this.f258551i, (byte) (i17 & 65535), (byte) ((i17 >> 8) & 65535), (byte) ((i17 >> 16) & 65535), (byte) ((i17 >> 24) & 65535)};
    }

    /* renamed from: equals */
    public boolean m72885xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.w)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.w) obj;
        return this.f258546d == wVar.f258546d && this.f258547e == wVar.f258547e && this.f258548f == wVar.f258548f && this.f258549g == wVar.f258549g && this.f258550h == wVar.f258550h && this.f258551i == wVar.f258551i && this.f258552m == wVar.f258552m;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    /* renamed from: hashCode */
    public int m72886x8cdac1b() {
        return (((((((((((java.lang.Integer.hashCode(this.f258546d) * 31) + java.lang.Integer.hashCode(this.f258547e)) * 31) + java.lang.Integer.hashCode(this.f258548f)) * 31) + java.lang.Integer.hashCode(this.f258549g)) * 31) + java.lang.Integer.hashCode(this.f258550h)) * 31) + java.lang.Integer.hashCode(this.f258551i)) * 31) + java.lang.Integer.hashCode(this.f258552m);
    }

    /* renamed from: toString */
    public java.lang.String m72887x9616526c() {
        return "QosParams(codec=" + this.f258546d + ", codecSize=" + this.f258547e + ", fps=" + this.f258548f + ", iPeriod=" + this.f258549g + ", interval=" + this.f258550h + ", rsLevel=" + this.f258551i + ", bitrate=" + this.f258552m + ')';
    }
}

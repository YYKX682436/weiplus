package com.p314xaae8f345.p457x3304c6.p477x633fb29;

/* renamed from: com.tencent.maas.model.MJMusicInfo */
/* loaded from: classes5.dex */
public class C4116xf4b2c356 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f129807a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f129808b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f129809c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f129810d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f129811e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f129812f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90[] f129813g;

    /* renamed from: h, reason: collision with root package name */
    public final java.nio.ByteBuffer f129814h;

    public C4116xf4b2c356(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f129807a = str;
        this.f129808b = str2;
        this.f129809c = str3;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        this.f129812f = c4128x879fba0a;
        this.f129811e = c4128x879fba0a;
        this.f129813g = null;
        this.f129814h = null;
    }

    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90[] a(java.lang.Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90[] c4114xcb0ccc90Arr = new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90[objArr.length];
        for (int i17 = 0; i17 < objArr.length; i17++) {
            c4114xcb0ccc90Arr[i17] = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90) objArr[i17];
        }
        return c4114xcb0ccc90Arr;
    }

    /* renamed from: equals */
    public boolean m33851xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f129807a.equals(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) obj).f129807a);
    }

    /* renamed from: getClientBuffer */
    public java.nio.ByteBuffer m33852xee94c261() {
        return this.f129814h;
    }

    /* renamed from: getCoverImageURL */
    public java.lang.String m33853x298d2b35() {
        return this.f129810d;
    }

    /* renamed from: getDuration */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33854x51e8b0a() {
        return this.f129811e;
    }

    /* renamed from: getLyricObjs */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90[] m33855xed0634a5() {
        return this.f129813g;
    }

    /* renamed from: getMusicID */
    public java.lang.String m33856x92013dca() {
        return this.f129807a;
    }

    /* renamed from: getSingerNames */
    public java.lang.String m33857x158977f6() {
        return this.f129809c;
    }

    /* renamed from: getSongName */
    public java.lang.String m33858xd75a8eb6() {
        return this.f129808b;
    }

    /* renamed from: getStartTime */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33859x8082fb99() {
        return this.f129812f;
    }

    /* renamed from: hashCode */
    public int m33860x8cdac1b() {
        return this.f129807a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m33861x9616526c() {
        return "MJMusicInfo{musicID='" + this.f129807a + "', songName='" + this.f129808b + "'}";
    }

    public C4116xf4b2c356(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        this.f129807a = str;
        this.f129808b = str2;
        this.f129809c = str3;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        this.f129812f = c4128x879fba0a;
        this.f129811e = c4128x879fba0a;
        this.f129813g = a(objArr);
        this.f129814h = null;
    }

    public C4116xf4b2c356(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, java.lang.Object[] objArr) {
        this.f129807a = str;
        this.f129808b = str2;
        this.f129809c = str3;
        this.f129812f = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        this.f129811e = c4128x879fba0a;
        this.f129813g = a(objArr);
        this.f129814h = null;
    }

    public C4116xf4b2c356(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2, java.lang.Object[] objArr) {
        this.f129807a = str;
        this.f129808b = str2;
        this.f129809c = str3;
        this.f129810d = str4;
        this.f129811e = c4128x879fba0a;
        this.f129812f = c4128x879fba0a2;
        this.f129813g = a(objArr);
        this.f129814h = null;
    }

    public C4116xf4b2c356(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2, java.lang.Object[] objArr, java.nio.ByteBuffer byteBuffer) {
        this.f129807a = str;
        this.f129808b = str2;
        this.f129809c = str3;
        this.f129810d = str4;
        this.f129811e = c4128x879fba0a;
        this.f129812f = c4128x879fba0a2;
        this.f129813g = a(objArr);
        this.f129814h = byteBuffer;
    }
}

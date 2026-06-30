package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class h1 implements com.p314xaae8f345.mm.vfs.a0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.regex.Pattern f294498i = java.util.regex.Pattern.compile("[A-Za-z0-9_]+");

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f294499d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1 f294500e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f294501f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f294502g;

    /* renamed from: h, reason: collision with root package name */
    public char f294503h;

    public h1(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, java.lang.String str, java.lang.String str2) {
        this.f294499d = interfaceC22750xe27c22eb;
        this.f294500e = new com.p314xaae8f345.mm.vfs.f1(str);
        this.f294501f = str2;
        c();
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Iterable b(java.util.Map map) {
        java.lang.String[] b17 = this.f294500e.b(map);
        return b17 == null ? java.util.Collections.emptyList() : new pm5.b(java.util.Arrays.asList(b17), new com.p314xaae8f345.mm.vfs.g1(this, map));
    }

    public final void c() {
        java.util.regex.Pattern pattern = f294498i;
        java.lang.String str = this.f294501f;
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            throw new java.lang.IllegalArgumentException("No output variable recognized: " + str);
        }
        int end = matcher.end();
        if (end == str.length()) {
            this.f294502g = null;
            return;
        }
        this.f294503h = str.charAt(end);
        this.f294502g = new java.util.ArrayList();
        do {
            this.f294502g.add(matcher.group());
        } while (matcher.find());
    }

    public void d(android.os.Parcel parcel) {
        parcel.writeString(this.f294500e.f294454a);
        parcel.writeString(this.f294501f);
        java.lang.Object obj = this.f294499d;
        if (obj instanceof com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) {
            parcel.writeByte((byte) 0);
            parcel.writeParcelable((com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) obj, 0);
        } else {
            parcel.writeByte((byte) 1);
            ((com.p314xaae8f345.mm.vfs.h1) obj).d(parcel);
        }
    }

    /* renamed from: equals */
    public boolean m82400xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.h1)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.h1 h1Var = (com.p314xaae8f345.mm.vfs.h1) obj;
        return this.f294499d.equals(h1Var.f294499d) && this.f294500e.m82387xb2c87fbf(h1Var.f294500e) && this.f294501f.equals(h1Var.f294501f);
    }

    /* renamed from: hashCode */
    public int m82401x8cdac1b() {
        java.lang.Object[] objArr = {this.f294499d, this.f294500e, this.f294501f};
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
        return java.util.Arrays.deepHashCode(objArr);
    }

    /* renamed from: toString */
    public java.lang.String m82402x9616526c() {
        return "$:" + this.f294499d;
    }

    public h1(android.os.Parcel parcel) {
        this.f294500e = new com.p314xaae8f345.mm.vfs.f1(parcel.readString());
        this.f294501f = parcel.readString();
        if (parcel.readByte() == 0) {
            this.f294499d = parcel.readParcelable(com.p314xaae8f345.mm.vfs.h1.class.getClassLoader());
        } else {
            this.f294499d = new com.p314xaae8f345.mm.vfs.h1(parcel);
        }
        c();
    }
}

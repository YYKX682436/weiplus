package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f284666a;

    /* renamed from: b, reason: collision with root package name */
    public final int f284667b;

    /* renamed from: c, reason: collision with root package name */
    public final int f284668c;

    public w(int i17, int i18, int i19) {
        this.f284666a = i17;
        this.f284667b = i18;
        this.f284668c = i19;
    }

    /* renamed from: equals */
    public boolean m79917xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w wVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w) obj;
        return this.f284666a == wVar.f284666a && this.f284667b == wVar.f284667b && this.f284668c == wVar.f284668c;
    }

    /* renamed from: hashCode */
    public int m79918x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f284666a) * 31) + java.lang.Integer.hashCode(this.f284667b)) * 31) + java.lang.Integer.hashCode(this.f284668c);
    }

    /* renamed from: toString */
    public java.lang.String m79919x9616526c() {
        return "ContentSize(width=" + this.f284666a + ", height=" + this.f284667b + ", textLength=" + this.f284668c + ')';
    }
}

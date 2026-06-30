package cw3;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f305690a;

    /* renamed from: b, reason: collision with root package name */
    public int f305691b;

    /* renamed from: c, reason: collision with root package name */
    public int f305692c;

    /* renamed from: d, reason: collision with root package name */
    public int f305693d;

    /* renamed from: e, reason: collision with root package name */
    public int f305694e;

    public d(int i17, int i18, int i19, int i27, int i28, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i29 & 1) != 0 ? com.p314xaae8f345.mm.R.raw.f79703xc84d169a : i17;
        i18 = (i29 & 2) != 0 ? i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) : i18;
        i19 = (i29 & 4) != 0 ? i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs) : i19;
        i27 = (i29 & 8) != 0 ? i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19) : i27;
        i28 = (i29 & 16) != 0 ? i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj) : i28;
        this.f305690a = i17;
        this.f305691b = i18;
        this.f305692c = i19;
        this.f305693d = i27;
        this.f305694e = i28;
    }

    /* renamed from: equals */
    public boolean m122940xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw3.d)) {
            return false;
        }
        cw3.d dVar = (cw3.d) obj;
        return this.f305690a == dVar.f305690a && this.f305691b == dVar.f305691b && this.f305692c == dVar.f305692c && this.f305693d == dVar.f305693d && this.f305694e == dVar.f305694e;
    }

    /* renamed from: hashCode */
    public int m122941x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f305690a) * 31) + java.lang.Integer.hashCode(this.f305691b)) * 31) + java.lang.Integer.hashCode(this.f305692c)) * 31) + java.lang.Integer.hashCode(this.f305693d)) * 31) + java.lang.Integer.hashCode(this.f305694e);
    }

    /* renamed from: toString */
    public java.lang.String m122942x9616526c() {
        return "BehaviorStatusViewConfig(successImgRes=" + this.f305690a + ", successImgSize=" + this.f305691b + ", progressViewSize=" + this.f305692c + ", successImgColor=" + this.f305693d + ", progressViewColor=" + this.f305694e + ')';
    }
}

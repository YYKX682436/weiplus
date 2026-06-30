package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f296470a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f296471b;

    /* renamed from: c, reason: collision with root package name */
    public final int f296472c;

    public e(int i17) {
        this.f296470a = i17;
        int i18 = 0;
        this.f296471b = i17 == 2 || i17 == 7 || i17 == 4 || i17 == 5;
        switch (i17) {
            case 3:
            case 4:
                i18 = 180;
                break;
            case 5:
            case 8:
                i18 = 270;
                break;
            case 6:
            case 7:
                i18 = 90;
                break;
        }
        this.f296472c = i18;
    }

    /* renamed from: equals */
    public boolean m83903xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.e.class == obj.getClass() && this.f296470a == ((com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.e) obj).f296470a;
    }

    /* renamed from: hashCode */
    public int m83904x8cdac1b() {
        return this.f296470a;
    }

    /* renamed from: toString */
    public java.lang.String m83905x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ExifOrientationHelper(");
        int i17 = this.f296470a;
        switch (i17) {
            case 0:
                str = "UNDEFINED";
                break;
            case 1:
                str = "NORMAL";
                break;
            case 2:
                str = "FLIP_HORIZONTAL";
                break;
            case 3:
                str = "ROTATE_180";
                break;
            case 4:
                str = "FLIP_VERTICAL";
                break;
            case 5:
                str = "TRANSPOSE";
                break;
            case 6:
                str = "ROTATE_90";
                break;
            case 7:
                str = "TRANSVERSE";
                break;
            case 8:
                str = "ROTATE_270";
                break;
            default:
                str = java.lang.String.valueOf(i17);
                break;
        }
        sb6.append(str);
        sb6.append(')');
        return sb6.toString();
    }
}

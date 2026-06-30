package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class ob {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f282781a;

    /* renamed from: b, reason: collision with root package name */
    public final int f282782b;

    /* renamed from: c, reason: collision with root package name */
    public final int f282783c;

    /* renamed from: d, reason: collision with root package name */
    public final int f282784d;

    /* renamed from: e, reason: collision with root package name */
    public final int f282785e;

    /* renamed from: f, reason: collision with root package name */
    public final int f282786f;

    public ob(java.lang.String codecStr, int i17, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codecStr, "codecStr");
        this.f282781a = codecStr;
        this.f282782b = i17;
        this.f282783c = i18;
        this.f282784d = i19;
        this.f282785e = i27;
        this.f282786f = i28;
    }

    /* renamed from: equals */
    public boolean m79621xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ob)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ob obVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ob) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f282781a, obVar.f282781a) && this.f282782b == obVar.f282782b && this.f282783c == obVar.f282783c && this.f282784d == obVar.f282784d && this.f282785e == obVar.f282785e && this.f282786f == obVar.f282786f;
    }

    /* renamed from: hashCode */
    public int m79622x8cdac1b() {
        return (((((((((this.f282781a.hashCode() * 31) + java.lang.Integer.hashCode(this.f282782b)) * 31) + java.lang.Integer.hashCode(this.f282783c)) * 31) + java.lang.Integer.hashCode(this.f282784d)) * 31) + java.lang.Integer.hashCode(this.f282785e)) * 31) + java.lang.Integer.hashCode(this.f282786f);
    }

    /* renamed from: toString */
    public java.lang.String m79623x9616526c() {
        return "StaticInfo(codecStr=" + this.f282781a + ", bitrate=" + this.f282782b + ", fps=" + this.f282783c + ", width=" + this.f282784d + ", height=" + this.f282785e + ", durationSec=" + this.f282786f + ')';
    }
}

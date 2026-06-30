package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class t8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f282941a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282942b;

    /* renamed from: c, reason: collision with root package name */
    public final fk4.u f282943c;

    public t8(int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, fk4.u uVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        uVar = (i18 & 4) != 0 ? null : uVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f282941a = i17;
        this.f282942b = msg;
        this.f282943c = uVar;
    }

    /* renamed from: equals */
    public boolean m79641xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t8)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t8 t8Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t8) obj;
        return this.f282941a == t8Var.f282941a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f282942b, t8Var.f282942b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f282943c, t8Var.f282943c);
    }

    /* renamed from: hashCode */
    public int m79642x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f282941a) * 31) + this.f282942b.hashCode()) * 31;
        fk4.u uVar = this.f282943c;
        return hashCode + (uVar == null ? 0 : uVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m79643x9616526c() {
        return "VideoItem(position=" + this.f282941a + ", msg=" + this.f282942b + ", downloader=" + this.f282943c + ')';
    }
}

package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

/* loaded from: classes12.dex */
public final class a1 implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k f134220d;

    public a1(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4667x259fedbb c4667x259fedbb, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k origin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        this.f134220d = origin;
    }

    /* renamed from: equals */
    public boolean m40996xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a1)) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134220d, ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a1) obj).f134220d);
    }

    /* renamed from: hashCode */
    public int m40997x8cdac1b() {
        return this.f134220d.hashCode();
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void off() {
        this.f134220d.on();
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void on() {
        this.f134220d.off();
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j
    /* renamed from: serial */
    public boolean mo40995xca01fdf4() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k kVar = this.f134220d;
        if (kVar instanceof com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j) {
            return ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j) kVar).mo40995xca01fdf4();
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m40998x9616526c() {
        return this.f134220d.toString();
    }
}

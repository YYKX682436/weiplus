package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.AbstractC19245xf232fb8a f263320a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f263321b;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.AbstractC19245xf232fb8a action, yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        this.f263320a = action;
        this.f263321b = block;
    }

    /* renamed from: equals */
    public boolean m74146xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f263320a, eVar.f263320a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f263321b, eVar.f263321b);
    }

    /* renamed from: hashCode */
    public int m74147x8cdac1b() {
        return (this.f263320a.hashCode() * 31) + this.f263321b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m74148x9616526c() {
        return "WebEvent(action=" + this.f263320a + ", block=" + this.f263321b + ')';
    }
}

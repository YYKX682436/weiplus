package mn2;

/* loaded from: classes2.dex */
public final class e0 extends mn2.q3 {

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 f411473i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 blurMediaType) {
        super(str, blurMediaType);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blurMediaType, "blurMediaType");
        this.f411473i = blurMediaType;
    }

    @Override // mn2.q3, ip0.c
    public java.lang.String n() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f411473i.f209907d);
        sb6.append("_finder_blur_");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f411632h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        sb6.append((java.lang.String) mo141623x754a37bb);
        return sb6.toString();
    }
}

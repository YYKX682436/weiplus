package mn2;

/* loaded from: classes2.dex */
public final class j3 extends mn2.c1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(r45.mb4 mediaObj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 type) {
        super(mediaObj, type, null, null, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObj, "mediaObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
    }

    @Override // mn2.c1, ip0.c
    public java.lang.String n() {
        java.lang.String m75945x2fec8307;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_image_");
        sb6.append(this.f411457f.f209907d);
        sb6.append('_');
        r45.mb4 mb4Var = this.f411456e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(9))) {
            java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(0);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            m75945x2fec8307 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec83072.getBytes());
        } else {
            m75945x2fec8307 = mb4Var.m75945x2fec8307(9);
        }
        sb6.append(m75945x2fec8307);
        return sb6.toString();
    }
}

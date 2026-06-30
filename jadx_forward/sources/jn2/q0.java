package jn2;

/* loaded from: classes10.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.r0 f382202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f382203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(jn2.r0 r0Var, java.util.List list) {
        super(1);
        this.f382202d = r0Var;
        this.f382203e = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.z22 song = (r45.z22) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(song, "song");
        java.lang.String str = song.f473162f;
        if (!(str == null || str.length() == 0) && this.f382202d.f382212h.contains(song.f473162f)) {
            this.f382203e.add(song);
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}

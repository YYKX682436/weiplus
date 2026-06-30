package xl2;

/* loaded from: classes.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.q f536646a;

    public b(yz5.q qVar) {
        this.f536646a = qVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        yz5.q qVar = this.f536646a;
        if (qVar == null) {
            return null;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.f152149b);
        java.util.LinkedList m75941xfb821914 = ((r45.g13) fVar.f152151d).m75941xfb821914(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSong_infos(...)");
        java.util.LinkedList m75941xfb8219142 = ((r45.g13) fVar.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getBlock_song_names(...)");
        qVar.mo147xb9724478(valueOf, m75941xfb821914, m75941xfb8219142);
        return jz5.f0.f384359a;
    }
}

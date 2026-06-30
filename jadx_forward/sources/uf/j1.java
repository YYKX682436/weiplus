package uf;

/* loaded from: classes7.dex */
public final class j1 extends b06.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uf.o1 f508570b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(java.lang.Object obj, uf.o1 o1Var) {
        super(obj);
        this.f508570b = o1Var;
    }

    @Override // b06.b
    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        if (uf.g1.f508559a[((uf.b) obj2).ordinal()] == 1) {
            uf.o1 o1Var = this.f508570b;
            if (o1Var.f508615q) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = o1Var.f508608g;
                if (c11510xdd90c2f2 != null) {
                    c11510xdd90c2f2.P(25, -1, o1Var.f508616r);
                }
                if (c11510xdd90c2f2 != null) {
                    c11510xdd90c2f2.P(24, -1, o1Var.f508617s);
                }
                o1Var.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, o1Var.f508618t);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = o1Var.f508608g;
            if (c11510xdd90c2f22 != null) {
                c11510xdd90c2f22.B1(o1Var.f508616r);
            }
            if (c11510xdd90c2f22 != null) {
                c11510xdd90c2f22.B1(o1Var.f508617s);
            }
            o1Var.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().unregisterContentObserver(o1Var.f508618t);
        }
    }
}

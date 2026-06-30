package ow1;

/* loaded from: classes14.dex */
public final class a implements hw1.c {

    /* renamed from: a, reason: collision with root package name */
    public ow1.b f430893a;

    @Override // hw1.c
    public java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ow1.b bVar = this.f430893a;
        if (bVar != null) {
            synchronized (bVar) {
                ar4.d dVar = bVar.f430894a;
                if (dVar != null) {
                    dVar.a();
                }
                bVar.f430894a = null;
                android.opengl.GLES20.glDeleteProgram(bVar.f430895b);
                ar4.c cVar = ar4.c.f94934a;
                ar4.c.f94935b = null;
                ar4.c.f94936c = false;
            }
        }
        this.f430893a = null;
        jz5.f0 f0Var = jz5.f0.f384359a;
        pz5.a aVar = pz5.a.f440719d;
        return f0Var;
    }

    @Override // hw1.c
    public java.lang.Object c(hw1.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(aVar);
        if (this.f430893a == null) {
            ar4.c.f94934a.b(rh0.b0.f477114e);
            ow1.b bVar = new ow1.b();
            this.f430893a = bVar;
            ar4.d dVar = bVar.f430894a;
            if (dVar != null && dVar.f94943f) {
                dVar.f94943f = false;
                p05.l4 l4Var = dVar.f94942e;
                if (l4Var != null) {
                    l4Var.C(false);
                }
            }
        }
        throw null;
    }
}

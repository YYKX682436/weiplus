package rv0;

/* loaded from: classes5.dex */
public final class c6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f481491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f481492e;

    public c6(rv0.z6 z6Var, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        this.f481491d = z6Var;
        this.f481492e = c3971x241f78;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int w17;
        int y17;
        rv0.z6 z6Var = this.f481491d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = z6Var.p7().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null || (w17 = c1162x665295de.w()) > (y17 = c1162x665295de.y())) {
            return;
        }
        while (true) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = z6Var.p7().p0(w17);
            sv0.e eVar = p07 instanceof sv0.e ? (sv0.e) p07 : null;
            if (eVar != null) {
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID = this.f481492e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.f494754i, segmentID) && eVar.f494754i != null) {
                    rv0.a6 a6Var = (rv0.a6) eVar.f494749d;
                    a6Var.getClass();
                    ex0.a0 v76 = a6Var.f481459a.v7();
                    dx0.p m17 = v76 != null ? v76.m(segmentID) : null;
                    if ((m17 != null ? m17.f326000a : null) != null) {
                        eVar.j().setRotation(m17.f326001b);
                        eVar.j().setImageBitmap(m17.f326000a);
                    }
                }
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }
}

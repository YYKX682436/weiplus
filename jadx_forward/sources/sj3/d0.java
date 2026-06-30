package sj3;

/* loaded from: classes14.dex */
public final class d0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f490002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b f490003e;

    public d0(sj3.a1 a1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b) {
        this.f490002d = a1Var;
        this.f490003e = c16586x7058535b;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        cv.w0 w0Var = (cv.w0) i95.n0.c(cv.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        boolean Di = ((gl.i) w0Var).Di(list);
        sj3.a1 a1Var = this.f490002d;
        a1Var.G = Di;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Di().f554707o.getClass();
        cv.v0 Bi = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "speaker audio list changed: " + a1Var.G + ", " + Bi);
        a1Var.H.a();
        int i17 = Bi.f304049a;
        if (i17 == 2 && Bi.f304051c == 3) {
            return;
        }
        this.f490003e.c(i17 == 1, a1Var.G, Bi.f304050b);
    }
}

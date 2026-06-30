package gx0;

/* loaded from: classes5.dex */
public final class a2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f357714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ow0.g f357715e;

    public a2(gx0.u2 u2Var, ow0.g gVar) {
        this.f357714d = u2Var;
        this.f357715e = gVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) obj;
        if (c3971x241f78 == null) {
            return;
        }
        gx0.u2 u2Var = this.f357714d;
        dx0.g gVar = u2Var.B;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverThumbnailProvider");
            throw null;
        }
        dx0.p d17 = gVar.d(c3971x241f78);
        if (d17 != null) {
            this.f357715e.E(c3971x241f78, d17);
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c n76 = u2Var.n7();
        if (n76 != null) {
            n76.j();
        }
    }
}

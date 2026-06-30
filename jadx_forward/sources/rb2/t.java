package rb2;

/* loaded from: classes2.dex */
public final class t extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475293b;

    public t(in5.s0 s0Var, so2.y0 y0Var) {
        this.f475292a = s0Var;
        this.f475293b = y0Var;
    }

    @Override // ym5.n0
    /* renamed from: getExposedId */
    public long mo55681x18a217a5(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return this.f475293b.mo2128x1ed62e84();
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context = this.f475292a.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).Gk(context, this.f475293b.f492236d.f68959xf9a02e3e, (r18 & 4) != 0 ? false : false, (r18 & 8) != 0 ? false : true, 1, (r18 & 32) != 0 ? false : false);
        }
    }
}

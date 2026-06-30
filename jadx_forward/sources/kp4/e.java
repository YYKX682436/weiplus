package kp4;

/* loaded from: classes10.dex */
public final class e implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp4.c1 f392632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kp4.f f392633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kp4.h f392634c;

    public e(kp4.c1 c1Var, kp4.f fVar, boolean z17, boolean z18, kp4.h hVar) {
        this.f392632a = c1Var;
        this.f392633b = fVar;
        this.f392634c = hVar;
    }

    public void a(boolean z17) {
        kp4.c1 c1Var = this.f392632a;
        c1Var.f392616m = z17;
        c1Var.f392615l = !z17;
        kp4.f fVar = this.f392633b;
        fVar.f392637f.a(c1Var, fVar.f392635d, true, true);
        fVar.f392638g.d(fVar.f392637f.getShowWidth() - (fVar.f392636e * 2), fVar.f392637f.getMinWidth(), fVar.f392636e);
        if (z17) {
            fVar.f392638g.f(true, fVar.f392636e + ((int) ((((float) c1Var.f392607d) / ((float) c1Var.d())) * fVar.f392637f.getTotalFrameWidth())));
            fVar.f392638g.f(false, fVar.f392636e + fVar.f392637f.getFrameWidth());
        } else {
            int d17 = (int) ((((float) (c1Var.f392608e - c1Var.f392607d)) / ((float) c1Var.d())) * fVar.f392637f.getTotalFrameWidth());
            fVar.f392638g.f(true, fVar.f392636e);
            fVar.f392638g.f(false, fVar.f392636e + d17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450 c16531xba313450 = fVar.f392638g;
        android.view.ViewGroup.LayoutParams layoutParams = c16531xba313450.getLayoutParams();
        layoutParams.width = fVar.f392637f.getShowWidth();
        c16531xba313450.setLayoutParams(layoutParams);
        android.view.View view = fVar.f3639x46306858;
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.width = fVar.f392637f.m72626xeb160320();
        view.setLayoutParams(layoutParams2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18806xf42dd2e6 c18806xf42dd2e6 = fVar.f392637f;
        android.view.ViewGroup.LayoutParams layoutParams3 = c18806xf42dd2e6.getLayoutParams();
        layoutParams3.width = fVar.f392637f.getShowWidth();
        c18806xf42dd2e6.setLayoutParams(layoutParams3);
        fVar.f3639x46306858.setLayoutDirection(z17 ? 1 : 0);
        long j17 = c1Var.f392607d;
        c1Var.d();
        fVar.f392637f.getTotalWidth();
        int i17 = fVar.f392636e;
        kp4.g gVar = this.f392634c.f392645g;
        if (gVar != null) {
            int m8183xf806b362 = fVar.m8183xf806b362();
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 c18809x90659727 = ((kp4.f0) gVar).f392640a;
            c18809x90659727.f257572w = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae1456 = c18809x90659727.f257556d;
            if (c18811xb3ae1456 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14562 = c18809x90659727.f257556d;
            if (c18811xb3ae14562 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c18811xb3ae1456.measure(makeMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(c18811xb3ae14562.getHeight(), 1073741824));
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14563 = c18809x90659727.f257556d;
            if (c18811xb3ae14563 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            int width = c18811xb3ae14563.getWidth();
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14564 = c18809x90659727.f257556d;
            if (c18811xb3ae14564 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c18811xb3ae14563.layout(0, 0, width, c18811xb3ae14564.getHeight());
            if (z17) {
                int i18 = m8183xf806b362 - 1;
                long j18 = c18809x90659727.m72638x2ae9e9d3().get(m8183xf806b362).f392608e;
                kp4.c0 callback = c18809x90659727.getCallback();
                if (callback != null) {
                    callback.b(i18, z17, 0L, c18809x90659727.m72638x2ae9e9d3().get(m8183xf806b362).f392608e);
                    return;
                }
                return;
            }
            int i19 = m8183xf806b362 - 1;
            long j19 = c18809x90659727.m72638x2ae9e9d3().get(m8183xf806b362).f392607d;
            c18809x90659727.m72638x2ae9e9d3().get(m8183xf806b362).d();
            kp4.c0 callback2 = c18809x90659727.getCallback();
            if (callback2 != null) {
                callback2.b(i19, z17, c18809x90659727.m72638x2ae9e9d3().get(m8183xf806b362).f392607d, c18809x90659727.m72638x2ae9e9d3().get(m8183xf806b362).d());
            }
        }
    }
}

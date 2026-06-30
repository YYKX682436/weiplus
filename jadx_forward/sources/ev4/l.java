package ev4;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final fv4.i f338490a;

    /* renamed from: b, reason: collision with root package name */
    public tg0.z1 f338491b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f338492c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2396x9608917e.C19213x72abea4d f338493d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.x, com.tencent.mm.plugin.websearch.searchplatformwebview.PlatformWebViewLifecycle$lifecycleObserver$1] */
    public l(fv4.i logicCtx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logicCtx, "logicCtx");
        this.f338490a = logicCtx;
        ?? r07 = new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.websearch.searchplatformwebview.PlatformWebViewLifecycle$lifecycleObserver$1
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                ev4.l lVar = ev4.l.this;
                lVar.f338490a.f348546g = true;
                tg0.z1 z1Var = lVar.f338491b;
                if (z1Var != null) {
                    ((ev4.k) z1Var).a();
                }
                lVar.f338491b = null;
                tg0.l1 l1Var = (tg0.l1) i95.n0.c(tg0.l1.class);
                tg0.c2 c2Var = lVar.f338490a.f348542c;
                if (l1Var != null) {
                    ((yg0.o3) l1Var).hj(c2Var != null ? c2Var.f500589k : 0, true, c2Var != null ? c2Var.f500583e : null, c2Var != null ? c2Var.f500587i : null);
                }
            }

            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onResume */
            public void mo7055x57429eec(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                ev4.l lVar = ev4.l.this;
                if (lVar.f338492c) {
                    lVar.f338492c = false;
                    lVar.f338490a.f348541b.i();
                }
            }

            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onStop */
            public void mo7798xc39f8281(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                ev4.l.this.f338492c = true;
            }
        };
        this.f338493d = r07;
        android.app.Activity a17 = logicCtx.a();
        if (a17 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) a17).mo273xed6858b4().a(r07);
            this.f338491b = new ev4.k(a17, this);
        }
    }
}

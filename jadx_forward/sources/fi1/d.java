package fi1;

/* loaded from: classes8.dex */
public final class d implements ei1.b, android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f344306d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f344307e;

    /* renamed from: f, reason: collision with root package name */
    public final fi1.g f344308f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f344309g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewTreeObserver f344310h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f344311i;

    /* renamed from: m, reason: collision with root package name */
    public int f344312m;

    /* JADX WARN: Multi-variable type inference failed */
    public d(android.content.Context context, yz5.l contentViewConfigureAction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentViewConfigureAction, "contentViewConfigureAction");
        this.f344306d = context;
        fi1.g gVar = new fi1.g(context);
        this.f344308f = gVar;
        this.f344309g = jz5.h.a(jz5.i.f384364f, new fi1.c(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12480x1c9fd528 c12480x1c9fd528 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12480x1c9fd528(context instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? ((com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) context).m81186xd24c19fa() : context);
        contentViewConfigureAction.mo146xb9724478(c12480x1c9fd528);
        gVar.f344316f.m52083x590ab8fc(c12480x1c9fd528);
        gVar.setOnDismissListener(new fi1.a(this));
        fi1.b bVar = new fi1.b(this);
        p012xc85e97e9.p093xedfae76a.y yVar = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        if (yVar != null) {
            yVar.mo273xed6858b4().a(new com.p314xaae8f345.mm.p819xedfae76a.C10825x73454863(bVar));
        }
    }

    public final void a() {
        android.view.ViewTreeObserver viewTreeObserver = this.f344310h;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                android.view.View view = (android.view.View) this.f344309g.mo141623x754a37bb();
                viewTreeObserver = view != null ? view.getViewTreeObserver() : null;
                this.f344310h = viewTreeObserver;
            }
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            this.f344310h = null;
        }
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        this.f344308f.f344316f.mo10668x2efc64();
    }

    /* renamed from: hide */
    public void m129587x30dd42() {
        android.content.Context context = this.f344306d;
        boolean z17 = context instanceof android.app.Activity;
        fi1.g gVar = this.f344308f;
        if (!z17 || ((android.app.Activity) context).isFinishing() || ((android.app.Activity) context).isDestroyed()) {
            gVar.dismiss();
        } else {
            gVar.dismiss();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.f344308f.isShowing()) {
            android.view.View view = (android.view.View) this.f344309g.mo141623x754a37bb();
            boolean z17 = true;
            if (!(view == null || !(view.isShown() || view.getVisibility() == 0))) {
                boolean z18 = this.f344311i;
                android.content.Context context = this.f344306d;
                if (z18 == (2 == context.getResources().getConfiguration().orientation)) {
                    if (this.f344312m == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        z17 = false;
                    }
                }
                if (!z17) {
                    return;
                }
            }
            m129587x30dd42();
        }
    }
}

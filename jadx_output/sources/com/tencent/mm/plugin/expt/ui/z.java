package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes11.dex */
public class z extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f99853m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f99854n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f99855o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f99856p;

    public z(android.content.Context context) {
        super(context);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StartMonitorKVEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StartMonitorKVEvent>(a0Var) { // from class: com.tencent.mm.plugin.expt.ui.ExptReportBanner$4
            {
                this.__eventId = -337129945;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.StartMonitorKVEvent startMonitorKVEvent) {
                com.tencent.mm.autogen.events.StartMonitorKVEvent startMonitorKVEvent2 = startMonitorKVEvent;
                com.tencent.mm.plugin.expt.ui.z zVar = com.tencent.mm.plugin.expt.ui.z.this;
                com.tencent.mars.xlog.Log.i("MicroMsg.ExptReportBanner", "expt report banner callback %s", java.lang.Integer.valueOf(zVar.hashCode()));
                if (startMonitorKVEvent2 == null) {
                    return false;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(startMonitorKVEvent2.f54860g.f7753a)) {
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.expt.ui.y(zVar));
                    return false;
                }
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.expt.ui.x(zVar));
                return false;
            }
        };
        this.f99856p = iListener;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptReportBanner", "expt report banner initialize %d", java.lang.Integer.valueOf(hashCode()));
        iListener.alive();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(g62.b.wi().f269074d)) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.expt.ui.x(this));
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.expt.ui.y(this));
        }
    }

    @Override // s35.b
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptReportBanner", "expt report banner destroy %d", java.lang.Integer.valueOf(hashCode()));
        this.f99856p.dead();
    }

    @Override // s35.b
    public int b() {
        return com.tencent.mm.R.layout.a_n;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        this.f99853m = view.findViewById(com.tencent.mm.R.id.aey);
        this.f99854n = view.findViewById(com.tencent.mm.R.id.f483349af1);
        this.f99855o = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486175kh1);
        this.f99853m.setOnClickListener(new com.tencent.mm.plugin.expt.ui.w(this));
    }
}

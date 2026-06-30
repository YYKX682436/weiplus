package i33;

/* loaded from: classes10.dex */
public final class x implements u23.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i33.a0 f369818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f369819b;

    public x(i33.a0 a0Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f369818a = a0Var;
        this.f369819b = activityC0065xcd7aa112;
    }

    @Override // u23.o
    public void a() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f369819b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        i33.t0 t0Var = (i33.t0) pf5.z.f435481a.a(activity).a(i33.t0.class);
        t0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t0Var.f369780f, "disableShow force=false");
        t0Var.f369796y = false;
    }

    @Override // u23.o
    public void b(java.util.List result, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        int size = result.isEmpty() ^ true ? ((v23.b) result.get(0)).f514420b.size() : 0;
        i33.a0 a0Var = this.f369818a;
        android.app.Activity context = a0Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        i33.b1 b1Var = (i33.b1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(i33.b1.class);
        java.lang.String ticket = a0Var.f369683o;
        b1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ticket, "ticket");
        i33.v vVar = (i33.v) ((java.util.LinkedHashMap) b1Var.f369697i).get(ticket);
        if (vVar != null) {
            vVar.f369812d = java.lang.System.currentTimeMillis();
            vVar.f369813e = size;
        }
        if (z17) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6630xab45bdc9 c6630xab45bdc9 = b1Var.f369695g;
            if (c6630xab45bdc9.f139841s <= 0) {
                c6630xab45bdc9.f139841s = java.lang.System.currentTimeMillis();
            }
        }
        java.util.List list = a0Var.f369682n;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(result);
        if (!((java.util.ArrayList) list).isEmpty()) {
            yz5.a aVar = a0Var.f369680i;
            if (aVar != null && (c15655x4db85b14 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14) aVar.mo152xb9724478()) != null) {
                v23.b bVar = a0Var.f369684p;
                if (bVar == null) {
                    bVar = (v23.b) ((java.util.ArrayList) list).get(0);
                }
                c15655x4db85b14.b(list, bVar);
            }
            java.lang.String str2 = "";
            i33.l1.x3(this.f369818a, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a0Var.X6(), "") ? ((v23.b) ((java.util.ArrayList) list).get(0)).f514419a : a0Var.X6(), z17, null, 4, null);
            if (!z17) {
                java.lang.String X6 = a0Var.X6();
                v23.b bVar2 = a0Var.f369684p;
                if (bVar2 != null && (str = bVar2.f514421c) != null) {
                    str2 = str;
                }
                a0Var.f369684p = a0Var.W6(list, X6, str2);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a0Var.f369677f, "[MediaLoader.DataListener] onReady: " + result.size() + ", folderName: " + a0Var.X6() + ", willNewFolder: " + z17);
    }

    @Override // u23.o
    public void c() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f369819b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        i33.t0 t0Var = (i33.t0) pf5.z.f435481a.a(activity).a(i33.t0.class);
        t0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t0Var.f369780f, "disableShow force=true");
        t0Var.f369796y = true;
    }
}

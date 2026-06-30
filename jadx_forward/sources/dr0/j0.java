package dr0;

/* loaded from: classes12.dex */
public final class j0 extends ph.f {

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f323969b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f323970c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f323971d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.content.Context context) {
        super(true);
        this.f323971d = context;
        jz5.i iVar = jz5.i.f384362d;
        this.f323969b = jz5.h.a(iVar, dr0.i0.f323966d);
        this.f323970c = jz5.h.a(iVar, dr0.h0.f323963d);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        try {
            context.registerReceiver(new android.content.BroadcastReceiver() { // from class: com.tencent.mm.matrix.battery.accumulate.ProcLifeAccMonitor$onInit$4$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(android.content.Context context2, android.content.Intent intent) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
                    java.lang.String action = intent.getAction();
                    if (action != null) {
                        dr0.j0 j0Var = dr0.j0.this;
                        ((ku5.t0) ku5.t0.f394148d).g(new dr0.g0(j0Var, action));
                    }
                }
            }, intentFilter);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "registerReceiver failed: " + e17.getMessage());
        }
    }

    @Override // ph.f, ph.g
    public boolean a(ph.c batteryState, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batteryState, "batteryState");
        j(batteryState, "BatteryPowerChanged");
        return !this.f435796a;
    }

    @Override // ph.f, ph.g
    public boolean f(ph.c batteryState, java.lang.String event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batteryState, "batteryState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        j(batteryState, event);
        return super.f(batteryState, event);
    }

    public final java.util.Map h() {
        return (java.util.Map) this.f323970c.mo141623x754a37bb();
    }

    public final boolean i() {
        return ((java.lang.Boolean) this.f323969b.mo141623x754a37bb()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f6, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3.f384366d, java.lang.String.valueOf(r8)) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0211, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x020f, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3.f384366d, java.lang.String.valueOf(r7)) == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(ph.c r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr0.j0.j(ph.c, java.lang.String):void");
    }

    public final void k(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map) {
        jz5.l lVar;
        synchronized (h()) {
            if (h().containsKey(str2) && (lVar = (jz5.l) h().get(str2)) != null) {
                java.lang.String str4 = (java.lang.String) lVar.f384366d;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str4)) {
                    return;
                }
                ap.a.a(1, "battStateTrack", null, map, str, str2, str4 + ">>" + str3, java.lang.String.valueOf((java.lang.System.currentTimeMillis() - ((java.lang.Number) lVar.f384367e).longValue()) / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8));
            }
        }
    }
}

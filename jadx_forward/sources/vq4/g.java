package vq4;

/* loaded from: classes12.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f520829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vq4.i f520830e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(vq4.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f520830e = iVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vq4.g(this.f520830e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vq4.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        long e17;
        int a17;
        java.lang.Double d17;
        double doubleValue;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f520829d;
        if (i18 != 0 && i18 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        do {
            vq4.i iVar = this.f520830e;
            vq4.y yVar = (vq4.y) iVar.f520836b.mo141623x754a37bb();
            yVar.getClass();
            android.content.Intent registerReceiver = yVar.f520922a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z17 = iVar.f520847m;
            jz5.g gVar = iVar.f520836b;
            if (z17) {
                ((vq4.y) gVar.mo141623x754a37bb()).getClass();
                java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("batterymanager");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
                if (((android.os.BatteryManager) systemService).isCharging()) {
                    iVar.f520847m = false;
                }
            }
            ((vq4.y) gVar.mo141623x754a37bb()).getClass();
            int intExtra = (registerReceiver != null ? registerReceiver.getIntExtra("temperature", 0) : 0) / 10;
            if (intExtra != Integer.MAX_VALUE && intExtra != Integer.MIN_VALUE) {
                ((java.util.ArrayList) iVar.f520844j).add(new java.lang.Integer(intExtra));
            }
            ((vq4.y) gVar.mo141623x754a37bb()).getClass();
            java.util.Iterator it = vq4.y.f520921b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i17 = Integer.MIN_VALUE;
                    break;
                }
                try {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(new java.io.File((java.lang.String) it.next()));
                    java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(fileInputStream);
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
                    java.lang.String readLine = bufferedReader.readLine();
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                    d17 = java.lang.Double.valueOf(java.lang.Double.parseDouble(readLine));
                } catch (java.lang.NumberFormatException | java.lang.Exception unused) {
                    d17 = null;
                }
                if (d17 != null) {
                    double doubleValue2 = d17.doubleValue();
                    if (-30.0d <= doubleValue2 && doubleValue2 <= 250.0d) {
                        doubleValue = d17.doubleValue();
                    } else {
                        double d18 = 1000;
                        double doubleValue3 = d17.doubleValue() / d18;
                        doubleValue = ((-30.0d) > doubleValue3 ? 1 : ((-30.0d) == doubleValue3 ? 0 : -1)) <= 0 && (doubleValue3 > 250.0d ? 1 : (doubleValue3 == 250.0d ? 0 : -1)) <= 0 ? d17.doubleValue() / d18 : 0.0d;
                    }
                    i17 = (int) doubleValue;
                }
            }
            if (i17 != Integer.MAX_VALUE && i17 != Integer.MIN_VALUE) {
                ((java.util.ArrayList) iVar.f520845k).add(new java.lang.Integer(i17));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfilerMonitor", "startMonitor: currentTmp battery " + intExtra + " cpu " + i17);
            if (fp.e0.e() && (a17 = (int) pj.h.a()) != -1) {
                ((java.util.ArrayList) iVar.f520846l).add(new java.lang.Integer(a17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfilerMonitor", "startMonitor: currentTmp phone " + a17);
            }
            iVar.f520840f = (iVar.f520840f + com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e.f134646s.b().f134647d) / 2;
            int i19 = s26.a.f483901f;
            e17 = s26.c.e(1, s26.d.f483906h);
            this.f520829d = 1;
        } while (p3325xe03a0797.p3326xc267989b.k1.c(e17, this) != aVar);
        return aVar;
    }
}

package nh5;

/* loaded from: classes12.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public long f418673d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2715xbf8d97c1.C22442xfd39a897 f418674e;

    public f0(com.p314xaae8f345.mm.ui.p2715xbf8d97c1.C22442xfd39a897 c22442xfd39a897) {
        this.f418674e = c22442xfd39a897;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/matrix/MatrixSettingHeaderPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f418673d;
        if (j17 > currentTimeMillis || currentTimeMillis - j17 > 300) {
            this.f418673d = currentTimeMillis;
            yj0.a.h(this, "com/tencent/mm/ui/matrix/MatrixSettingHeaderPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f418673d = currentTimeMillis;
        android.content.Context context = view.getContext();
        final java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("[ver  ] ");
        sb6.append(java.lang.String.format(java.util.Locale.ENGLISH, "%s %08X", com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.b(context, o45.wf.f424562g, true), java.lang.Integer.valueOf(o45.wf.f424562g)));
        sb6.append("\n");
        java.lang.Object[] objArr = new java.lang.Object[1];
        int i17 = 0;
        objArr[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k ? "arm64-v8a" : "armeabi-v7a";
        sb6.append(java.lang.String.format("[eabi ] %s\n", objArr));
        tp3.a aVar = tp3.a.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d) aVar.a(vp3.c.class);
        if (dVar != null && dVar.h().e()) {
            i17 = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d dVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d) aVar.a(wp3.b.class);
        if (dVar2 != null && dVar2.h().e()) {
            i17 |= 2;
        }
        sb6.append("[diag ] ");
        sb6.append(i17);
        sb6.append("\n");
        ph.a.b(rh.w.class, new wh.t0() { // from class: nh5.f0$$a
            @Override // wh.t0
            /* renamed from: accept */
            public final void mo40853xab27b508(java.lang.Object obj) {
                rh.w wVar = (rh.w) obj;
                nh5.f0 f0Var = nh5.f0.this;
                f0Var.getClass();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(android.os.Process.myPid()));
                com.p314xaae8f345.mm.ui.p2715xbf8d97c1.C22442xfd39a897 c22442xfd39a897 = f0Var.f418674e;
                android.app.ActivityManager activityManager = (android.app.ActivityManager) c22442xfd39a897.f279303d.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                if (activityManager != null) {
                    for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                        if (runningAppProcessInfo.processName.contains(c22442xfd39a897.f279303d.getPackageName()) && !sb7.toString().contains(java.lang.String.valueOf(runningAppProcessInfo.pid))) {
                            sb7.append("|");
                            sb7.append(runningAppProcessInfo.pid);
                        }
                    }
                }
                java.lang.StringBuilder sb8 = sb6;
                sb8.append("[bat.pids  ] ");
                sb8.append((java.lang.CharSequence) sb7);
                sb8.append("\n");
                rh.v k17 = wVar.k(0L);
                sb8.append("[bat.dice  ] ");
                sb8.append(mm.o.c() ? 1 : 0);
                sb8.append("\n");
                sb8.append("[bat.uptime] ");
                sb8.append(k17.f477051d.f477085a);
                sb8.append("\n");
                sb8.append("[bat.fg    ] ");
                sb8.append(k17.f477052e.f477085a);
                sb8.append("\n");
                sb8.append("[bat.bg    ] ");
                sb8.append(k17.f477053f.f477085a);
                sb8.append("\n");
                sb8.append("[bat.fgSrv ] ");
                sb8.append(k17.f477054g.f477085a);
                sb8.append("\n");
                java.util.List list = wVar.l(0L).f527336b;
                int i18 = 0;
                java.util.List subList = list.subList(0, java.lang.Math.min(list.size(), 3));
                while (i18 < subList.size()) {
                    wh.h2 h2Var = (wh.h2) subList.get(i18);
                    sb8.append("[bat.uiTop");
                    i18++;
                    sb8.append(i18);
                    sb8.append("] ");
                    sb8.append(h2Var.f527329a);
                    sb8.append("/");
                    sb8.append(h2Var.f527330b);
                    sb8.append("\n");
                }
            }
        });
        ph.a.b(rh.d2.class, new wh.t0() { // from class: nh5.f0$$b
            @Override // wh.t0
            /* renamed from: accept */
            public final void mo40853xab27b508(java.lang.Object obj) {
                rh.a2 m17 = ((rh.d2) obj).m(0L);
                java.lang.StringBuilder sb7 = sb6;
                sb7.append("[bat.charge] ");
                sb7.append(m17.f476833e.f477085a);
                sb7.append("\n");
                sb7.append("[bat.dim   ] ");
                sb7.append(m17.f476835g.f477085a);
                sb7.append("\n");
            }
        });
        ph.a.b(uh.h.class, new wh.t0() { // from class: nh5.f0$$c
            @Override // wh.t0
            /* renamed from: accept */
            public final void mo40853xab27b508(java.lang.Object obj) {
                uh.g k17 = ((uh.h) obj).k();
                final java.lang.StringBuilder sb7 = sb6;
                sb7.append("\n");
                nh5.C29208x5b3bb1a c29208x5b3bb1a = new nh5.C29208x5b3bb1a();
                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.y2) i95.n0.c(ob0.y2.class))).getClass();
                long Ri = ((dr0.m) ((lh.l) i95.n0.c(lh.l.class))).Ri();
                if (Ri > 0) {
                    java.util.Calendar calendar = java.util.Calendar.getInstance();
                    calendar.add(14, java.util.TimeZone.getDefault().getOffset(calendar.getTimeInMillis()));
                    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, java.util.Locale.getDefault());
                    java.util.Date date = new java.util.Date(Ri);
                    sb7.append("[bat.chargeLast] ");
                    sb7.append(simpleDateFormat.format(date));
                    sb7.append("\n");
                    sb7.append("[bat.chargeLast] ");
                    sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - Ri)));
                    sb7.append(" ago\n");
                }
                ph.a.b(rh.k1.class, new wh.t0() { // from class: nh5.f0$$e
                    @Override // wh.t0
                    /* renamed from: accept */
                    public final void mo40853xab27b508(java.lang.Object obj2) {
                        wh.n1 n1Var = ((rh.k1) obj2).f476968k;
                        java.lang.StringBuilder sb8 = sb7;
                        sb8.append("[power.prof] ");
                        sb8.append(n1Var != null && n1Var.l());
                        sb8.append("\n");
                        sb8.append("[power.type] ");
                        sb8.append(wh.n1.f527374f);
                        sb8.append("\n");
                    }
                });
                sb7.append("");
                sb7.append("[power.cpu] ");
                sb7.append(k17.f509216g.f477085a);
                sb7.append("\n");
                sb7.append("[power.wakelocks] ");
                sb7.append(k17.f509218h.f477085a);
                sb7.append("\n");
                sb7.append("[power.mobile] ");
                sb7.append(k17.f509220i.f477085a);
                sb7.append("\n");
                sb7.append("[power.wifi] ");
                sb7.append(k17.f509222j.f477085a);
                sb7.append("\n");
                sb7.append("[power.blueTooth] ");
                sb7.append(k17.f509224k.f477085a);
                sb7.append("\n");
                sb7.append("[power.gps] ");
                sb7.append(k17.f509226l.f477085a);
                sb7.append("\n");
                sb7.append("[power.sensors] ");
                sb7.append(k17.f509228m.f477085a);
                sb7.append("\n");
                sb7.append("[power.camera] ");
                sb7.append(k17.f509230n.f477085a);
                sb7.append("\n");
                sb7.append("[power.flashLight] ");
                sb7.append(k17.f509232o.f477085a);
                sb7.append("\n");
                sb7.append("[power.audio] ");
                sb7.append(k17.f509234p.f477085a);
                sb7.append("\n");
                sb7.append("[power.video] ");
                sb7.append(k17.f509236q.f477085a);
                sb7.append("\n");
                sb7.append("[power.screen] ");
                sb7.append(k17.f509238r.f477085a);
                sb7.append("\n");
                sb7.append("[power.systemService] ");
                sb7.append(k17.f509240s.f477085a);
                sb7.append("\n");
                sb7.append("[power.idle] ");
                sb7.append(k17.f509242t.f477085a);
                sb7.append("\n");
                sb7.append("[power.total] ");
                sb7.append(k17.d());
                sb7.append("\n");
                sb7.append("");
                sb7.append("\n");
                sb7.append("[cpuPowerMams] ");
                sb7.append(k17.f509244u.f477085a);
                sb7.append("\n");
                sb7.append("[cpuUsrTimeMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509246v.f477085a));
                sb7.append("\n");
                sb7.append("[cpuSysTimeMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509248w.f477085a));
                sb7.append("\n");
                sb7.append("[realTimeMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509250x.f477085a));
                sb7.append("\n");
                sb7.append("[upTimeMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509252y.f477085a));
                sb7.append("\n");
                sb7.append("[offRealTimeMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509254z.f477085a));
                sb7.append("\n");
                sb7.append("[offUpTimeMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.A.f477085a));
                sb7.append("\n");
                sb7.append("[mobilePowerMams] ");
                sb7.append(k17.B.f477085a);
                sb7.append("\n");
                sb7.append("[mobileRadioActiveMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.C.f477085a));
                sb7.append("\n");
                sb7.append("[mobileIdleMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.D.f477085a));
                sb7.append("\n");
                sb7.append("[mobileRxMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.E.f477085a));
                sb7.append("\n");
                sb7.append("[mobileTxMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.F.f477085a));
                sb7.append("\n");
                sb7.append("[mobileRxBytes] ");
                sb7.append(java.lang.Long.valueOf(((java.lang.Long) k17.G.f477085a).longValue() / 1000000));
                sb7.append("\n");
                sb7.append("[mobileTxBytes] ");
                sb7.append(java.lang.Long.valueOf(((java.lang.Long) k17.H.f477085a).longValue() / 1000000));
                sb7.append("\n");
                sb7.append("[mobileRxPackets] ");
                sb7.append(k17.I.f477085a);
                sb7.append("\n");
                sb7.append("[mobileTxPackets] ");
                sb7.append(k17.f509206J.f477085a);
                sb7.append("\n");
                sb7.append("[wifiPowerMams] ");
                sb7.append(k17.K.f477085a);
                sb7.append("\n");
                sb7.append("[wifiIdleMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.L.f477085a));
                sb7.append("\n");
                sb7.append("[wifiRxMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.M.f477085a));
                sb7.append("\n");
                sb7.append("[wifiTxMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.N.f477085a));
                sb7.append("\n");
                sb7.append("[wifiRunningMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.O.f477085a));
                sb7.append("\n");
                sb7.append("[wifiLockMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.P.f477085a));
                sb7.append("\n");
                sb7.append("[wifiScanMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.Q.f477085a));
                sb7.append("\n");
                sb7.append("[wifiMulticastMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.R.f477085a));
                sb7.append("\n");
                sb7.append("[wifiRxBytes] ");
                sb7.append(java.lang.Long.valueOf(((java.lang.Long) k17.S.f477085a).longValue() / 1000000));
                sb7.append("\n");
                sb7.append("[wifiTxBytes] ");
                sb7.append(java.lang.Long.valueOf(((java.lang.Long) k17.T.f477085a).longValue() / 1000000));
                sb7.append("\n");
                sb7.append("[wifiRxPackets] ");
                sb7.append(k17.U.f477085a);
                sb7.append("\n");
                sb7.append("[wifiTxPackets] ");
                sb7.append(k17.V.f477085a);
                sb7.append("\n");
                sb7.append("[blueToothPowerMams] ");
                sb7.append(k17.W.f477085a);
                sb7.append("\n");
                sb7.append("[blueToothIdleMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.X.f477085a));
                sb7.append("\n");
                sb7.append("[blueToothRxMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.Y.f477085a));
                sb7.append("\n");
                sb7.append("[blueToothTxMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.Z.f477085a));
                sb7.append("\n");
                sb7.append("[wakelocksPartialMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509207a0.f477085a));
                sb7.append("\n");
                sb7.append("[wakelocksFullMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509208b0.f477085a));
                sb7.append("\n");
                sb7.append("[wakelocksWindowMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509209c0.f477085a));
                sb7.append("\n");
                sb7.append("[wakelocksDrawMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509211d0.f477085a));
                sb7.append("\n");
                sb7.append("[wakelocksPidSum] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509213e0.f477085a));
                sb7.append("\n");
                sb7.append("[gpsMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509215f0.f477085a));
                sb7.append("\n");
                sb7.append("[sensorsPowerMams] ");
                sb7.append(k17.f509217g0.f477085a);
                sb7.append("\n");
                sb7.append("[cameraMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509219h0.f477085a));
                sb7.append("\n");
                sb7.append("[flashLightMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509221i0.f477085a));
                sb7.append("\n");
                sb7.append("[audioMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509223j0.f477085a));
                sb7.append("\n");
                sb7.append("[videoMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509225k0.f477085a));
                sb7.append("\n");
                sb7.append("[jobsMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509227l0.f477085a));
                sb7.append("\n");
                sb7.append("[syncMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509229m0.f477085a));
                sb7.append("\n");
                sb7.append("[fgActMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509231n0.f477085a));
                sb7.append("\n");
                sb7.append("[procTopAppMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509233o0.f477085a));
                sb7.append("\n");
                sb7.append("[procTopSleepMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509235p0.f477085a));
                sb7.append("\n");
                sb7.append("[procFgMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509237q0.f477085a));
                sb7.append("\n");
                sb7.append("[procFgSrvMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509239r0.f477085a));
                sb7.append("\n");
                sb7.append("[procBgMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509241s0.f477085a));
                sb7.append("\n");
                sb7.append("[procCacheMs] ");
                sb7.append((java.lang.String) c29208x5b3bb1a.mo1850x58b836e((java.lang.Long) k17.f509243t0.f477085a));
                sb7.append("\n");
                sb7.append("");
            }
        });
        java.lang.String Bi = ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).Bi();
        if (android.text.TextUtils.isEmpty(Bi)) {
            Bi = "";
        }
        sb6.append(Bi);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(sb6);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        textView.setTextColor(this.f418674e.f279303d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        textView.setVerticalScrollBarEnabled(true);
        textView.setVerticalFadingEdgeEnabled(true);
        db5.e1.q(context, null, textView, null);
        yj0.a.h(this, "com/tencent/mm/ui/matrix/MatrixSettingHeaderPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

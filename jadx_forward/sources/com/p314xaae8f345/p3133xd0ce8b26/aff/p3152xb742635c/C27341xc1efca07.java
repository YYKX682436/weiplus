package com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.ilink_stream.ZIDL_NyGFwFn1K */
/* loaded from: classes5.dex */
public class C27341xc1efca07 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298740a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298741b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298742c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298743d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298744e = new java.util.concurrent.ConcurrentHashMap();

    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    /* renamed from: ZIDL_HI */
    private void m113169x1964d249(byte[] bArr, int i17, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x xVar;
        e70.c0 c0Var;
        e70.c0 c0Var2;
        e70.c0 c0Var3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStreamStateNotifyEvent size: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298740a;
        sb6.append(concurrentHashMap.size());
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IlinkStreamChannelK", sb6.toString(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IlinkStreamChannelK", "onStreamStateNotifyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.m mVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.m) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            if (i17 == 0) {
                xVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x.kIlinkStreamStateOK;
            } else if (i17 == 1) {
                xVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x.kIlinkStreamStateNotExist;
            } else if (i17 == 2) {
                xVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x.kIlinkStreamStateEnding;
            } else if (i17 == 3) {
                xVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x.kIlinkStreamStateFragmentTooLarge;
            } else if (i17 != 400) {
                switch (i17) {
                    case 100:
                        xVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x.kIlinkStreamStateError;
                        break;
                    case 101:
                        xVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x.kIlinkStreamStateCancel;
                        break;
                    case 102:
                        xVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x.kIlinkStreamStateDataSyncError;
                        break;
                    case 103:
                        xVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x.kIlinkStreamStateDataLostError;
                        break;
                    case 104:
                        xVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x.kIlinkStreamStateAccountChanged;
                        break;
                    default:
                        xVar = null;
                        break;
                }
            } else {
                xVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x.kIlinkStreamStateServerAbort;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.a aVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.a) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.a.f298746h, bArr2);
            d83.t0 t0Var = ((d83.n0) mVar).f308534a;
            d83.t0.a(t0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkStreamController", "subscribeStreamStateNotifyEvent() clientStreamId: " + str + ", code: " + xVar.name());
            int i18 = d83.m0.f308530a[xVar.ordinal()];
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = t0Var.f308556c;
            if (i18 == 1) {
                d83.h0 h0Var = (d83.h0) concurrentHashMap2.get(str);
                if (h0Var != null && (c0Var3 = h0Var.f308511i) != null) {
                    ((d83.f0) c0Var3).f();
                }
            } else if (i18 != 2) {
                d83.h0 h0Var2 = (d83.h0) concurrentHashMap2.get(str);
                if (h0Var2 != null && (c0Var = h0Var2.f308511i) != null) {
                    ((d83.f0) c0Var).g(xVar);
                }
            } else {
                d83.h0 h0Var3 = (d83.h0) concurrentHashMap2.get(str);
                if (h0Var3 != null && (c0Var2 = h0Var3.f308511i) != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
                    ((d83.f0) c0Var2).d(aVar);
                }
            }
        }
    }

    /* renamed from: ZIDL_II */
    private void m113170x1964d268(byte[] bArr) {
        java.lang.Integer num;
        e70.c0 c0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceiveStreamFragmentEvent size: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298741b;
        sb6.append(concurrentHashMap.size());
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IlinkStreamChannelK", sb6.toString(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IlinkStreamChannelK", "onReceiveStreamFragmentEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.k kVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.k) entry.getValue();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.f fVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.f) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.f.f298799i, bArr);
            d83.l0 l0Var = (d83.l0) kVar;
            l0Var.getClass();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onReceive clientStreamId: ");
            boolean z17 = true;
            sb7.append(fVar.f298804h[1] ? fVar.f298800d : "");
            sb7.append(", fragmentItems.size: ");
            java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.u> linkedList = fVar.f298801e;
            sb7.append(linkedList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkStreamController", sb7.toString());
            d83.t0 t0Var = l0Var.f308526a;
            d83.t0.a(t0Var);
            boolean[] zArr = fVar.f298804h;
            java.lang.String str = zArr[1] ? fVar.f298800d : "";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.u uVar : linkedList) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = uVar.f298840f[2] ? uVar.f298839e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            }
            d83.h0 h0Var = (d83.h0) t0Var.f308556c.get(str);
            if (h0Var != null && (c0Var = h0Var.f308511i) != null) {
                ((d83.f0) c0Var).e(arrayList);
            }
            if (zArr[3]) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkStreamController", "down stream received end seq: " + fVar.f298802f);
                if (h0Var != null) {
                    h0Var.f308510h = java.lang.Integer.valueOf(fVar.f298802f);
                }
            }
            if (h0Var != null && (num = h0Var.f308510h) != null) {
                int intValue = num.intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkStreamController", "received seq: ".concat(kz5.n0.g0(linkedList, null, null, null, 0, null, d83.k0.f308520d, 31, null)));
                if (!linkedList.isEmpty()) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.u) it.next()).f298838d >= intValue) {
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    ((d83.f0) h0Var.f308511i).h();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkStreamController", "onDownStreamEnd");
                }
            }
        }
    }

    /* renamed from: ZIDL_JI */
    private void m113171x1964d287(byte[] bArr) {
        e70.c0 c0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStreamReportNotifyEvent size: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298742c;
        sb6.append(concurrentHashMap.size());
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IlinkStreamChannelK", sb6.toString(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IlinkStreamChannelK", "onStreamReportNotifyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.l lVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.l) entry.getValue();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.v vVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.v) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.v.f298841w, bArr);
            d83.t0 t0Var = ((d83.q0) lVar).f308541a;
            d83.t0.a(t0Var);
            if (vVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ILinkStreamController", "onReceive StreamReportNotifyEvent but data is null");
            } else {
                java.lang.String str = vVar.f298857v[3] ? vVar.f298844f : "";
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = t0Var.f308556c;
                d83.h0 h0Var = (d83.h0) concurrentHashMap2.get(str);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = t0Var.f308557d;
                if (h0Var == null) {
                    h0Var = (d83.h0) concurrentHashMap3.get(str);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkStreamController", "onReceive StreamReportNotifyEvent clientStreamId: " + str + ", endCode: " + vVar.f298847i + ", upStreamFinished: " + vVar.f298848m + ", downStreamFinished: " + vVar.f298849n + ", lastFragmentReceived: " + vVar.f298850o + ", inStreamList: " + concurrentHashMap2.containsKey(str) + ", inPending: " + concurrentHashMap3.containsKey(str));
                if (h0Var != null && (c0Var = h0Var.f308511i) != null) {
                    ((d83.f0) c0Var).c(vVar);
                }
                d83.h0 h0Var2 = (d83.h0) concurrentHashMap3.remove(str);
                if (h0Var2 != null) {
                    h0Var2.f308506d.clear();
                }
            }
        }
    }

    /* renamed from: ZIDL_KI */
    private void m113172x1964d2a6(byte[] bArr) {
        e70.c0 c0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUpStreamFragmentReportNotifyEvent size: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298743d;
        sb6.append(concurrentHashMap.size());
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IlinkStreamChannelK", sb6.toString(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IlinkStreamChannelK", "onUpStreamFragmentReportNotifyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.n nVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.n) entry.getValue();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.b0 b0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.b0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.b0.f298763y, bArr);
            d83.o0 o0Var = (d83.o0) nVar;
            o0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkStreamController", "onReceive UpStreamFragmentReportNotifyEvent");
            d83.t0 t0Var = o0Var.f308536a;
            d83.t0.a(t0Var);
            if (b0Var != null) {
                d83.h0 h0Var = (d83.h0) t0Var.f308556c.get(b0Var.f298781x[3] ? b0Var.f298766f : "");
                if (h0Var != null && (c0Var = h0Var.f308511i) != null) {
                    ((d83.f0) c0Var).b(b0Var);
                }
            }
        }
    }

    /* renamed from: ZIDL_LI */
    private void m113173x1964d2c5(byte[] bArr) {
        e70.c0 c0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownStreamFragmentReportNotifyEvent size: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298744e;
        sb6.append(concurrentHashMap.size());
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IlinkStreamChannelK", sb6.toString(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IlinkStreamChannelK", "onDownStreamFragmentReportNotifyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.j jVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.j) entry.getValue();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.g) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.g.f298805u, bArr);
            d83.p0 p0Var = (d83.p0) jVar;
            p0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkStreamController", "onReceive DownStreamFragmentReportNotifyEvent");
            d83.t0 t0Var = p0Var.f308537a;
            d83.t0.a(t0Var);
            if (gVar != null) {
                d83.h0 h0Var = (d83.h0) t0Var.f308556c.get(gVar.f298819t[3] ? gVar.f298808f : "");
                if (h0Var != null && (c0Var = h0Var.f308511i) != null) {
                    ((d83.f0) c0Var).a(gVar);
                }
            }
        }
    }

    /* renamed from: ZIDL_NyGFwFn1D */
    public static native void m113174xc1efca00(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: ZIDL_A */
    public native void m113175x9db8edf9(long j17, int i17);

    /* renamed from: ZIDL_B */
    public native void m113176x9db8edfa(long j17, byte[] bArr, byte[] bArr2);

    /* renamed from: ZIDL_C */
    public native byte[] m113177x9db8edfb(long j17, int i17, byte[] bArr);

    /* renamed from: ZIDL_D */
    public native byte[] m113178x9db8edfc(long j17, int i17, byte[] bArr);

    /* renamed from: ZIDL_E */
    public native byte[] m113179x9db8edfd(long j17, int i17, byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: ZIDL_F */
    public native void m113180x9db8edfe(long j17, byte[] bArr);

    /* renamed from: ZIDL_G */
    public native void m113181x9db8edff(long j17, byte[] bArr);

    /* renamed from: ZIDL_NyGFwFn1C */
    public native void m113182xc1efc9ff(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);
}

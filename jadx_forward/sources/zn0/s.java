package zn0;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 f555916a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f555917b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f555918c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f555919d;

    /* renamed from: e, reason: collision with root package name */
    public zn0.t f555920e;

    /* renamed from: f, reason: collision with root package name */
    public zn0.t f555921f;

    /* renamed from: g, reason: collision with root package name */
    public zn0.k f555922g;

    /* renamed from: h, reason: collision with root package name */
    public int f555923h;

    /* renamed from: i, reason: collision with root package name */
    public int f555924i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f555925j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f555926k;

    /* renamed from: l, reason: collision with root package name */
    public final android.os.Handler f555927l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f555928m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f555929n;

    /* renamed from: o, reason: collision with root package name */
    public zn0.u f555930o;

    public s(com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 trtcInstance) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trtcInstance, "trtcInstance");
        this.f555916a = trtcInstance;
        this.f555922g = zn0.k.f555892d;
        this.f555927l = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static final void a(zn0.s sVar, boolean z17) {
        if (sVar.f555922g != zn0.k.f555892d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "currentState: " + sVar.f555922g);
            return;
        }
        if (sVar.f555921f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "Has nextDataWrap");
            sVar.f555920e = sVar.f555921f;
            sVar.f555921f = null;
        } else if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "nextDataWrap is null, forcePublish is false.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "forcePublish: " + z17 + ",shouldRetryPublishMediaStreamWithoutDelay: " + sVar.f555926k);
        sVar.f555926k = false;
        sVar.f();
    }

    public static final int b(zn0.s sVar, android.os.Bundle bundle) {
        boolean z17;
        java.lang.Object obj;
        int intValue;
        boolean z18;
        sVar.getClass();
        boolean z19 = false;
        if (bundle == null) {
            z17 = false;
        } else {
            z17 = true;
            if (bundle.containsKey(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4) && (obj = bundle.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4)) != null) {
                if (obj instanceof java.lang.Number) {
                    intValue = ((java.lang.Number) obj).intValue();
                    z19 = true;
                    z18 = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "hasExtraInfo: " + z18 + ", hasErrorCodeObj: " + z19 + ", errorCodeObjIsNumber: " + z17 + ", serverErrorCode: " + intValue);
                    return intValue;
                }
                intValue = 0;
                z18 = true;
                z19 = true;
                z17 = intValue == true ? 1 : 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "hasExtraInfo: " + z18 + ", hasErrorCodeObj: " + z19 + ", errorCodeObjIsNumber: " + z17 + ", serverErrorCode: " + intValue);
                return intValue;
            }
        }
        intValue = 0;
        z18 = z17;
        z17 = intValue == true ? 1 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "hasExtraInfo: " + z18 + ", hasErrorCodeObj: " + z19 + ", errorCodeObjIsNumber: " + z17 + ", serverErrorCode: " + intValue);
        return intValue;
    }

    public static final void c(zn0.s sVar, java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        sVar.getClass();
        if (z17) {
            if (i17 == 2000 || i17 == 2001 || i17 == 2021) {
                return;
            }
            if (i17 == 3000 || i17 == 5001 || i17 == 4006) {
                sVar.i();
                return;
            } else {
                if (i17 != 4007) {
                    sVar.i();
                    return;
                }
                return;
            }
        }
        if (i17 != 2018) {
            if (i17 != 2021) {
                if (i17 != 3000) {
                    if (i17 != 4003) {
                        switch (i17) {
                            case 2000:
                            case 2001:
                                break;
                            case 2002:
                                break;
                            default:
                                int i18 = sVar.f555924i + 1;
                                sVar.f555924i = i18;
                                if (i18 <= 5) {
                                    sVar.j();
                                    return;
                                }
                                sVar.f555924i = 0;
                                sVar.f555923h = 0;
                                sVar.f555919d = sVar.f555918c;
                                sVar.f555918c = null;
                                sVar.i();
                                return;
                        }
                    }
                    sVar.f555924i = 0;
                    sVar.f555923h = 0;
                    sVar.f555919d = sVar.f555918c;
                    sVar.f555918c = null;
                    sVar.i();
                    return;
                }
            }
            sVar.f555924i = 0;
            return;
        }
        sVar.f555924i = 0;
        sVar.j();
    }

    public final void d() {
        java.lang.Runnable runnable = this.f555929n;
        if (runnable != null) {
            this.f555927l.removeCallbacks(runnable);
            this.f555929n = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r4 = this;
            r0 = 1
            r4.f555925j = r0
            boolean r0 = r4.f555926k
            if (r0 == 0) goto L8
            goto L18
        L8:
            int r0 = r4.f555923h
            r1 = 10
            if (r0 < r1) goto L11
            r0 = 30000(0x7530, double:1.4822E-319)
            goto L1a
        L11:
            r1 = 2
            if (r0 < r1) goto L18
            int r0 = r0 * 500
            long r0 = (long) r0
            goto L1a
        L18:
            r0 = 100
        L1a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "delayTime: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = ", requestFailedCount: "
            r2.append(r3)
            int r3 = r4.f555923h
            r2.append(r3)
            java.lang.String r3 = ",shouldRetryPublishMediaStreamWithoutDelay: "
            r2.append(r3)
            boolean r3 = r4.f555926k
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderLivePublishMediaStream"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            r2 = 0
            r4.f555926k = r2
            java.lang.Runnable r2 = r4.f555928m
            android.os.Handler r3 = r4.f555927l
            if (r2 == 0) goto L50
            r3.removeCallbacks(r2)
            r2 = 0
            r4.f555928m = r2
        L50:
            zn0.m r2 = new zn0.m
            r2.<init>(r4)
            r4.f555928m = r2
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zn0.s.e():void");
    }

    public final void f() {
        if (this.f555922g == zn0.k.f555892d) {
            if (!(this.f555920e == null)) {
                boolean z17 = this.f555925j;
                android.os.Handler handler = this.f555927l;
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "shouldPublishMediaStreamAfterDelay is true");
                    this.f555925j = false;
                    java.lang.Runnable runnable = this.f555928m;
                    if (runnable != null) {
                        handler.removeCallbacks(runnable);
                        this.f555928m = null;
                    }
                }
                if (this.f555926k) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "shouldRetryPublishMediaStreamWithoutDelay is YES");
                    this.f555926k = false;
                }
                d();
                zn0.l lVar = new zn0.l(this);
                this.f555929n = lVar;
                handler.postDelayed(lVar, 12000L);
                java.lang.String str = this.f555918c;
                boolean z18 = str == null || str.length() == 0;
                com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8 = this.f555916a;
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "startPublishMediaStream.");
                    this.f555922g = zn0.k.f555893e;
                    this.f555917b = true;
                    zn0.t tVar = this.f555920e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
                    zn0.t tVar2 = this.f555920e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar2);
                    zn0.t tVar3 = this.f555920e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar3);
                    abstractC26786xbe57dcc8.mo30389x2c0bb7f7(tVar.f555931a, tVar2.f555932b, tVar3.f555933c);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "updatePublishMediaStream, publishMediaStreamTaskId: " + this.f555918c);
                this.f555922g = zn0.k.f555894f;
                java.lang.String str2 = this.f555918c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                zn0.t tVar4 = this.f555920e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar4);
                zn0.t tVar5 = this.f555920e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar5);
                zn0.t tVar6 = this.f555920e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar6);
                abstractC26786xbe57dcc8.mo30422xd419809e(str2, tVar4.f555931a, tVar5.f555932b, tVar6.f555933c);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "realPublishMediaStream failed, currentState: " + this.f555922g + ", currentDataWrap: " + this.f555920e);
    }

    public final void g(zn0.j jVar, java.lang.String str, int i17, java.lang.String str2, int i18) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Long l17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        zn0.u uVar = this.f555930o;
        sb6.append(uVar != null ? uVar.f555934a : null);
        sb6.append(',');
        zn0.u uVar2 = this.f555930o;
        sb6.append((uVar2 == null || (l17 = uVar2.f555935b) == null) ? "" : pm0.v.u(l17.longValue()));
        sb6.append(',');
        zn0.u uVar3 = this.f555930o;
        if (uVar3 == null || (str3 = uVar3.f555936c) == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(',');
        zn0.u uVar4 = this.f555930o;
        sb6.append(uVar4 != null ? uVar4.f555937d : null);
        sb6.append(',');
        zn0.u uVar5 = this.f555930o;
        if (uVar5 == null || (str4 = uVar5.f555938e) == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(',');
        sb6.append(jVar);
        sb6.append(',');
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(',');
        sb6.append(i17);
        sb6.append(',');
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(',');
        sb6.append(this.f555923h);
        sb6.append(',');
        sb6.append(i18);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "36011, publishMediaStreamResultLogString: " + sb7);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(36011, sb7);
    }

    public final void h() {
        if (this.f555922g != zn0.k.f555892d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "Invalid currentState: " + this.f555922g);
        } else {
            if (this.f555925j) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "shouldPublishMediaStreamAfterDelay is true");
            }
            e();
        }
    }

    public final void i() {
        if (this.f555922g != zn0.k.f555892d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "Invalid currentState: " + this.f555922g);
            return;
        }
        java.lang.String str = this.f555919d;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "Retry start");
            h();
            return;
        }
        d();
        zn0.l lVar = new zn0.l(this);
        this.f555929n = lVar;
        this.f555927l.postDelayed(lVar, 12000L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "stopPublishMediaStream, lastPublishMediaStreamTaskId: " + this.f555919d);
        this.f555922g = zn0.k.f555895g;
        java.lang.String str2 = this.f555919d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        this.f555916a.mo30408x53095397(str2);
    }

    public final void j() {
        if (this.f555925j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "shouldPublishMediaStreamAfterDelay is true");
        }
        e();
    }
}

package ih2;

/* loaded from: classes10.dex */
public final class b implements hh2.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f373083a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f373084b;

    /* renamed from: c, reason: collision with root package name */
    public dn0.a f373085c;

    /* renamed from: d, reason: collision with root package name */
    public final lh2.a f373086d;

    /* renamed from: e, reason: collision with root package name */
    public hh2.b f373087e;

    public b(java.lang.String type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f373084b = jz5.h.b(ih2.a.f373082d);
        this.f373085c = dn0.a.Live_DAFX_kOrigin;
        this.f373086d = new lh2.a("mm_reverb_" + type + ".pcm");
    }

    @Override // hh2.a
    public void a(hh2.b callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f373087e = callback;
    }

    @Override // hh2.a
    public boolean b(om2.m type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f373085c = d(type);
        if (!this.f373083a) {
            return false;
        }
        boolean a17 = ((dn0.d) ((jz5.n) this.f373084b).mo141623x754a37bb()).a(d(type));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMReverbTMECoreImpl", "setReverbId type: " + type + " res: " + a17);
        return a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    @Override // hh2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ih2.b.c(com.tencent.trtc.TRTCCloudDef$TRTCAudioFrame):void");
    }

    public final dn0.a d(om2.m mVar) {
        int i17 = mVar.f427889d;
        om2.m mVar2 = om2.m.f427880g;
        if (i17 == 15) {
            return dn0.a.Live_DAFX_kKing;
        }
        om2.m mVar3 = om2.m.f427880g;
        if (i17 == 9) {
            return dn0.a.Live_DAFX_kTheater;
        }
        om2.m mVar4 = om2.m.f427880g;
        if (i17 == 10) {
            return dn0.a.Live_DAFX_kChurch;
        }
        om2.m mVar5 = om2.m.f427880g;
        if (i17 == 11) {
            return dn0.a.Live_DAFX_kConcertHall;
        }
        om2.m mVar6 = om2.m.f427880g;
        if (i17 == 12) {
            return dn0.a.Live_DAFX_kStudy;
        }
        om2.m mVar7 = om2.m.f427880g;
        if (i17 == 13) {
            return dn0.a.Live_DAFX_kOrigin;
        }
        om2.m mVar8 = om2.m.f427880g;
        return i17 == 14 ? dn0.a.Live_DAFX_kCD : dn0.a.Live_DAFX_kStudio;
    }
}

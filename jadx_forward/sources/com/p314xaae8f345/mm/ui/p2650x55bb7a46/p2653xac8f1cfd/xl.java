package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes14.dex */
public final class xl implements x21.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f281771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm f281772b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f281773c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f281774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f281775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f281776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f281777g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f281778h;

    public xl(java.util.ArrayList arrayList, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, yb5.d dVar, long j17, long j18, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2) {
        this.f281771a = arrayList;
        this.f281772b = fmVar;
        this.f281773c = c0Var;
        this.f281774d = dVar;
        this.f281775e = j17;
        this.f281776f = j18;
        this.f281777g = f0Var;
        this.f281778h = c0Var2;
    }

    public void a(java.lang.String filePath, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "MicroMsg.MSP " + filePath + " oncomp");
        java.util.ArrayList arrayList = this.f281771a;
        if (i17 < arrayList.size() && arrayList.size() > 0 && filePath.length() > 0) {
            int size = arrayList.size() - 1;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar = this.f281772b;
            if (i17 == size) {
                p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f281778h;
                if (!c0Var.f391645d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "notify end");
                    c0Var.f391645d = true;
                    fmVar.m0(2);
                    fmVar.t0(this.f281774d);
                }
            }
            java.lang.Object obj = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            r45.tc6 tc6Var = (r45.tc6) obj;
            int i18 = tc6Var.f467849e;
            java.lang.String str = tc6Var.f467848d;
            boolean z17 = false;
            int length = i18 + (str != null ? str.length() : 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f281777g;
            int i19 = f0Var.f391649d;
            long j17 = this.f281775e;
            if (length != i19) {
                sb5.h2 h2Var = fmVar.f280596i;
                if (h2Var != null) {
                    h2Var.a(length, java.lang.Long.valueOf(j17));
                }
                f0Var.f391649d = length;
            }
            int i27 = i17 + 1;
            if (i27 < arrayList.size()) {
                r45.tc6 tc6Var2 = (r45.tc6) arrayList.get(i27);
                if (tc6Var2 != null && tc6Var2.f467850f) {
                    z17 = true;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "notify pausePlay, index: %s", java.lang.Integer.valueOf(i17));
                    x21.l lVar = fmVar.f280594g;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f533078b, "pausePlay");
                    lVar.f533081e.a(true);
                    r45.tc6 tc6Var3 = (r45.tc6) arrayList.get(i27);
                    java.lang.String str2 = tc6Var3 != null ? tc6Var3.f467848d : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    fmVar.s0(i27, j17, str2);
                }
            }
        }
    }

    public void b(java.lang.String filePath, int i17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        java.util.ArrayList arrayList = this.f281771a;
        if (i17 >= arrayList.size()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar = this.f281772b;
        r45.uc6 uc6Var = fmVar.f280599o;
        if (i17 >= uc6Var.f468760e) {
            uc6Var.f468760e = i17 + 1;
            uc6Var.f468761f++;
        }
        long j17 = this.f281775e;
        if (i17 == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f281773c;
            if (!c0Var.f391645d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "notify start");
                yb5.d dVar = this.f281774d;
                fmVar.n0(dVar);
                fmVar.o0(dVar);
                fmVar.f280592e = j17;
                fmVar.f280599o.f468759d = this.f281776f;
                fmVar.f280593f = 0L;
                c0Var.f391645d = true;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wl(dVar));
            }
        }
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.tc6 tc6Var = (r45.tc6) obj;
        int ceil = tc6Var.f467849e + ((int) java.lang.Math.ceil((tc6Var.f467848d != null ? r10.length() : 0) * f17));
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f281777g;
        if (ceil != f0Var.f391649d) {
            sb5.h2 h2Var = fmVar.f280596i;
            if (h2Var != null) {
                h2Var.a(ceil, java.lang.Long.valueOf(j17));
            }
            f0Var.f391649d = ceil;
        }
    }
}

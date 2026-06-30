package hg0;

@j95.b
/* loaded from: classes12.dex */
public final class k extends i95.w implements eg0.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f362864d = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ai(hg0.g gVar, hg0.f fVar) {
        long elapsedRealtime;
        w21.w0 w0Var;
        int i17;
        boolean z17 = true;
        int i18 = (fVar.f362848b == null && (w0Var = fVar.f362847a) != null && w0Var.f524025i == 99 && (i17 = w0Var.f524024h) > 0 && w0Var.f524023g >= i17) ? 1 : 0;
        long j17 = -1;
        if (fVar.f362849c) {
            elapsedRealtime = -1;
        } else {
            long j18 = gVar.f362855f;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j18;
        }
        java.lang.String str = null;
        if (fVar.f362847a != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(r5.f524024h);
            if ((valueOf.longValue() > 0) == false) {
                valueOf = null;
            }
            if (valueOf != null) {
                j17 = valueOf.longValue();
            }
        }
        java.util.LinkedHashMap j19 = kz5.c1.j(new jz5.l("info_file_name", gVar.f362850a), new jz5.l("is_ok", java.lang.Integer.valueOf(i18)), new jz5.l("is_new_download", java.lang.Integer.valueOf(gVar.f362851b ? 1 : 0)), new jz5.l("is_group_chat", java.lang.Integer.valueOf(gVar.f362852c ? 1 : 0)), new jz5.l("last_use_cgi", java.lang.Integer.valueOf(gVar.f362854e ? 1 : 0)), new jz5.l("first_use_cgi", java.lang.Integer.valueOf(gVar.f362853d ? 1 : 0)), new jz5.l("duration_ms", java.lang.Long.valueOf(elapsedRealtime)), new jz5.l("file_size_bytes", java.lang.Long.valueOf(j17)), new jz5.l("bytes_per_ms", java.lang.Double.valueOf((elapsedRealtime <= 0 || j17 < 0) ? -1.0d : a06.d.c((j17 / elapsedRealtime) * 1000.0d) / 1000.0d)));
        java.lang.String str2 = fVar.f362848b;
        if (str2 == null) {
            java.lang.String str3 = gVar.f362856g;
            if ((str3.length() > 0) != false) {
                str = str3;
            }
        } else {
            str = str2;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            j19.put("other_info", str);
        }
        hg0.e.a("voice_download_outcome", j19);
    }

    public void Bi(java.lang.String fileName, java.lang.String otherInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(otherInfo, "otherInfo");
        if (otherInfo.length() == 0) {
            return;
        }
        this.f362864d.computeIfPresent(fileName, new hg0.h(otherInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Di(java.lang.String fileName, boolean z17, boolean z18, boolean z19, int i17, int i18) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        boolean z27 = false;
        if ((fileName.length() == 0) == true) {
            return;
        }
        if (1 <= i17 && i17 <= i18) {
            z27 = true;
        }
        if (z27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voice.VoiceDownloadOutcomeReportService", "openSession: skipped already-complete, fileName=".concat(fileName));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f362864d;
        concurrentHashMap.computeIfAbsent(fileName, new hg0.j(c0Var, fileName, z17, z18, z19));
        if (c0Var.f391645d) {
            if (concurrentHashMap.size() > 256) {
                java.util.Collection values = concurrentHashMap.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                java.util.Iterator it = values.iterator();
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (it.hasNext()) {
                        long j17 = ((hg0.g) next).f362855f;
                        do {
                            java.lang.Object next2 = it.next();
                            long j18 = ((hg0.g) next2).f362855f;
                            if (j17 > j18) {
                                next = next2;
                                j17 = j18;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                hg0.g gVar = (hg0.g) obj;
                if (gVar != null) {
                    java.lang.String str = gVar.f362850a;
                    hg0.g gVar2 = (hg0.g) concurrentHashMap.remove(str);
                    if (gVar2 != null) {
                        Ai(gVar2, new hg0.f(Ni(str), "overflow_evicted", true));
                    }
                }
            }
            hg0.e.a("voice_download_begin", kz5.c1.j(new jz5.l("info_file_name", fileName), new jz5.l("is_new_download", java.lang.Integer.valueOf(z17 ? 1 : 0))));
        }
    }

    public final w21.w0 Ni(java.lang.String str) {
        try {
            ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).getClass();
            return w21.x0.j(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voice.VoiceDownloadOutcomeReportService", "safeGetVoiceInfo: failed, fileName=" + str + ", err=" + e17);
            return null;
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f362864d;
        java.util.Set keySet = concurrentHashMap.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        for (java.lang.String str : kz5.n0.S0(keySet)) {
            hg0.g gVar = (hg0.g) concurrentHashMap.remove(str);
            if (gVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                Ai(gVar, new hg0.f(Ni(str), "account_release", true));
            }
        }
    }

    public void wi(java.lang.String fileName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        hg0.g gVar = (hg0.g) this.f362864d.remove(fileName);
        if (gVar == null) {
            return;
        }
        Ai(gVar, new hg0.f(Ni(fileName), null, false, 6, null));
    }
}

package n12;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n12.n f415615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n12.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f415615d = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new n12.i(this.f415615d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n12.i iVar = (n12.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        java.lang.String string;
        java.lang.String str;
        int i18;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        n12.n nVar = this.f415615d;
        nVar.getClass();
        java.lang.String str2 = "mime";
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        gp.c cVar = new gp.c();
        try {
            try {
                cVar.k(nVar.f415634a);
                int d17 = cVar.d();
                android.media.MediaFormat mediaFormat = null;
                android.media.MediaFormat mediaFormat2 = null;
                int i19 = 0;
                while (true) {
                    if (i19 >= d17) {
                        i17 = 0;
                        break;
                    }
                    android.media.MediaFormat e17 = cVar.e(i19);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getTrackFormat(...)");
                    if (e17.containsKey(str2) && (string = e17.getString(str2)) != null) {
                        str = str2;
                        i18 = d17;
                        i17 = 0;
                        if (r26.i0.y(string, "video/", false)) {
                            if (mediaFormat == null) {
                                mediaFormat = e17;
                            }
                        } else if (r26.i0.y(string, "audio/", false) && mediaFormat2 == null) {
                            mediaFormat2 = e17;
                        }
                        if (mediaFormat2 != null && mediaFormat != null) {
                            break;
                        }
                        i19++;
                        str2 = str;
                        d17 = i18;
                    }
                    str = str2;
                    i18 = d17;
                    i19++;
                    str2 = str;
                    d17 = i18;
                }
                if (mediaFormat != null) {
                    if (mediaFormat.containsKey("durationUs")) {
                        int i27 = (int) (mediaFormat.getLong("durationUs") / 1000);
                        nVar.f415636c = i27;
                        if (i27 < 500) {
                            throw new java.lang.IllegalStateException("Invalid video duration, duration: " + nVar.f415636c);
                        }
                    }
                    int integer = mediaFormat.containsKey("width") ? mediaFormat.getInteger("width") : i17;
                    int integer2 = mediaFormat.containsKey("height") ? mediaFormat.getInteger("height") : i17;
                    if (mediaFormat.containsKey("frame-rate")) {
                        mediaFormat.getInteger("frame-rate");
                    }
                    if (integer == 0 || integer2 == 0) {
                        throw new java.lang.IllegalArgumentException("Invalid video resolution: " + integer + " x " + integer2);
                    }
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) nVar.f415637d).k(new android.util.Size(integer, integer2));
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmoticonCustomCreatePreprocessLogic", "failed to parse video metadata. " + e18);
            }
            cVar.g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonCustomCreatePreprocessLogic", "loadItemFromExtractor used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            cVar.g();
            throw th6;
        }
    }
}

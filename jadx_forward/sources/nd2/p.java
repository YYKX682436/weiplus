package nd2;

/* loaded from: classes10.dex */
public final class p implements com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.InterfaceC24291xeb3bcf8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nd2.q f417998a;

    public p(nd2.q qVar) {
        this.f417998a = qVar;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.InterfaceC24291xeb3bcf8
    /* renamed from: dispose */
    public void mo90032x63a5261f(long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerPlugin", "dispose viewId=" + j17);
        nd2.q qVar = this.f417998a;
        nd2.o oVar = (nd2.o) qVar.f418001c.get(java.lang.Long.valueOf(j17));
        if (oVar != null) {
            oVar.mo31847x63a5261f();
        }
        qVar.f418001c.remove(java.lang.Long.valueOf(j17));
        qVar.f418002d.remove(java.lang.Long.valueOf(j17));
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a)));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.InterfaceC24291xeb3bcf8
    /* renamed from: pause */
    public void mo90033x65825f6(long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerPlugin", "pause viewId=" + j17);
        nd2.o oVar = (nd2.o) this.f417998a.f418001c.get(java.lang.Long.valueOf(j17));
        if (oVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerContainer", "pause");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = oVar.f417987m;
            if (c14522x8ffd8962 != null) {
                c14522x8ffd8962.mo58388x65825f6();
            }
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a)));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.InterfaceC24291xeb3bcf8
    /* renamed from: resume */
    public void mo90034xc84dc82d(long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerPlugin", "resume viewId=" + j17);
        nd2.o oVar = (nd2.o) this.f417998a.f418001c.get(java.lang.Long.valueOf(j17));
        if (oVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerContainer", "resume");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = oVar.f417987m;
            if (c14522x8ffd8962 != null) {
                c14522x8ffd8962.mo58390xc84dc82d();
            }
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a)));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.InterfaceC24291xeb3bcf8
    /* renamed from: setMute */
    public void mo90035x764d819b(long j17, boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerPlugin", "setMute viewId=" + j17 + " isMuted=" + z17);
        nd2.o oVar = (nd2.o) this.f417998a.f418001c.get(java.lang.Long.valueOf(j17));
        if (oVar != null) {
            oVar.f417995u = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerContainer", "setMute isMuted=" + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = oVar.f417987m;
            if (c14522x8ffd8962 != null) {
                c14522x8ffd8962.mo58394x764d819b(z17);
            }
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a)));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.InterfaceC24291xeb3bcf8
    /* renamed from: startPlay */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo90036x8113c2b6(long r29, java.lang.String r31, yz5.l r32) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd2.p.mo90036x8113c2b6(long, java.lang.String, yz5.l):void");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.InterfaceC24291xeb3bcf8
    /* renamed from: stopPlay */
    public void mo90037x66343656(long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerPlugin", "stopPlay viewId=" + j17);
        nd2.o oVar = (nd2.o) this.f417998a.f418001c.get(java.lang.Long.valueOf(j17));
        if (oVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerContainer", "stopPlay");
            oVar.f417997w = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = oVar.f417987m;
            if (c14522x8ffd8962 != null) {
                c14522x8ffd8962.mo58404x360802();
            }
            oVar.c();
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a)));
    }
}

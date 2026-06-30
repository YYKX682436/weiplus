package dz4;

/* loaded from: classes12.dex */
public final class d0 implements dz4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.p f326725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f326726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f326727c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.k4 f326728d;

    public d0(com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.p pVar, dz4.j0 j0Var, long j17, dz4.k4 k4Var) {
        this.f326725a = pVar;
        this.f326726b = j0Var;
        this.f326727c = j17;
        this.f326728d = k4Var;
    }

    public void a(double d17, java.lang.String playId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playId, "playId");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.p pVar = this.f326725a;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(playId, pVar.b())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterWeNoteNativeHelperImpl", "onPlayCompleted: skip, " + playId + ", " + pVar.b());
            return;
        }
        dz4.j0.a(this.f326726b, this.f326727c, playId, 1, pVar.f298385g);
        if (d17 >= 1.0d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayCompleted: destroying completed voice, playId=");
            sb6.append(playId);
            sb6.append(", path=");
            boolean[] zArr = pVar.f298387i;
            sb6.append(zArr[2] ? pVar.f298383e : "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", sb6.toString());
            java.lang.String str = zArr[2] ? pVar.f298383e : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getPath(...)");
            dz4.k4 k4Var = this.f326728d;
            k4Var.getClass();
            java.lang.String str2 = "destroy: path=" + str + ", currentPlayingPath=" + k4Var.f326862d;
            java.lang.String str3 = k4Var.f326859a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
            java.util.Map map = k4Var.f326860b;
            fz4.m mVar = (fz4.m) ((java.util.LinkedHashMap) map).get(str);
            if (mVar != null) {
                mVar.b();
            }
            map.remove(str);
            java.util.Map map2 = k4Var.f326861c;
            dz4.l lVar = (dz4.l) ((java.util.LinkedHashMap) map2).get(str);
            if (lVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterNoteVoiceProgressMonitor", "release: ");
                lVar.b();
                lVar.f326866d = null;
                lVar.f326863a.removeCallbacksAndMessages(null);
            }
            map2.remove(str);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k4Var.f326862d, str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "destroy: clearing currentPlayingPath from " + k4Var.f326862d + " to null");
                k4Var.f326862d = null;
                return;
            }
            if (k4Var.f326862d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "destroy: currentPlayingPath(" + k4Var.f326862d + ") != path(" + str + "), but still clearing due to completion");
                k4Var.f326862d = null;
            }
        }
    }

    public void b(java.lang.String playId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playId, "playId");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.p pVar = this.f326725a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(playId, pVar.b())) {
            dz4.j0.a(this.f326726b, this.f326727c, playId, 0, pVar.f298386h * pVar.f298385g);
        }
    }
}

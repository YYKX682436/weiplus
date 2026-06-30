package ef0;

/* loaded from: classes12.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.l80 f333696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(bw5.l80 l80Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333696d = l80Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ef0.a2(this.f333696d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ef0.a2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        int i17;
        boolean z17;
        int o17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if0.a0 a0Var = if0.a0.f372545a;
        java.lang.String m12386x5000ed37 = this.f333696d.m12386x5000ed37();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m12386x5000ed37, "getFilePath(...)");
        boolean z18 = false;
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(m12386x5000ed37, false);
        if (i18 == null || r26.n0.N(i18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingLocalFileUtil", "checkIsMusic inputPath is null");
        } else {
            int e17 = a0Var.e();
            if (e17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingLocalFileUtil", "checkIsMusic close rec");
            } else {
                ((oy4.v) ((qk.u7) i95.n0.c(qk.u7.class))).getClass();
                ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
                java.lang.String g17 = p05.a3.f431972a.g("MODEL_TING_AUDIO_CLS");
                if (g17 == null || !com.p314xaae8f345.mm.vfs.w6.j(g17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingLocalFileUtil", "checkIsMusic modelPath " + g17 + " not exist");
                    a0Var.b(0, null);
                    z18 = false;
                } else if (e17 == 2 || (o17 = if0.a0.f372547c.o(a0Var.f(i18, g17), 0)) < 1) {
                    if0.y yVar = new if0.y(i18, g17);
                    int o18 = a0Var.d().o("REC_LOCAL_FILE_CRASH_TIMES", 0);
                    if (o18 > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingLocalFileUtil", "canCallNow hasCrashFlag last time crashTimes=" + o18);
                        j17 = o18 != 1 ? o18 != 2 ? 604800000L : 86400000L : 10800000L;
                        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    } else {
                        j17 = 0;
                    }
                    long j18 = a0Var.d().getLong("KEY_REC_LOCAL_FILE_LAST_TIME", 0L);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long abs = java.lang.Math.abs(currentTimeMillis - j18);
                    if (abs < j17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingLocalFileUtil", "canCallNow delta(" + abs + ") < interval(" + j17 + ')');
                        if (if0.a0.f372549e) {
                            i17 = 1;
                        } else {
                            ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Bi("MusicRec", 7, null);
                            i17 = 1;
                            if0.a0.f372549e = true;
                        }
                        z17 = false;
                    } else {
                        i17 = 1;
                        a0Var.d().B("KEY_REC_LOCAL_FILE_LAST_TIME", currentTimeMillis);
                        z17 = true;
                    }
                    if (z17) {
                        a0Var.d().A("REC_LOCAL_FILE_CRASH_TIMES", o18 + i17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingLocalFileUtil", "safeCall set crash flag");
                        java.lang.Boolean bool = (java.lang.Boolean) yVar.mo152xb9724478();
                        bool.booleanValue();
                        a0Var.d().A("REC_LOCAL_FILE_CRASH_TIMES", 0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingLocalFileUtil", "safeCall reset crash flag");
                        z18 = bool.booleanValue();
                    } else {
                        z18 = false;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingLocalFileUtil", "checkIsMusic cache result " + o17);
                    a0Var.b(6, null);
                    if (o17 == 1) {
                        z18 = true;
                    }
                }
            }
        }
        return java.lang.Boolean.valueOf(z18);
    }
}

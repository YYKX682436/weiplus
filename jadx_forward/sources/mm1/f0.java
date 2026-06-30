package mm1;

@j95.b(m140513x1e06fd29 = {e70.q.class})
/* loaded from: classes11.dex */
public final class f0 extends i95.w implements rv.k2 {

    /* renamed from: d, reason: collision with root package name */
    public mm1.b0 f410193d;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0106, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2.d().m13170xcc16feb8(), r5.d().m13170xcc16feb8()) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013b, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0139, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2.b(), r5.b()) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void wi(mm1.f0 r9, b66.a r10, il4.e r11, int r12) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm1.f0.wi(mm1.f0, b66.a, il4.e, int):void");
    }

    public qk.ia Ai() {
        return qk.ia.f445702e.a(tm1.h.f502003a.b().i());
    }

    public rv.j2 Bi() {
        if (this.f410193d == null) {
            this.f410193d = new mm1.b0();
        }
        mm1.b0 b0Var = this.f410193d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var);
        return b0Var;
    }

    public boolean Di() {
        return Ai() == qk.ia.f445704g || Ai() == qk.ia.f445705h;
    }

    public final boolean Ni(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("audio");
        android.media.AudioManager audioManager = systemService instanceof android.media.AudioManager ? (android.media.AudioManager) systemService : null;
        if (audioManager == null) {
            return false;
        }
        int ringerMode = audioManager.getRingerMode();
        if (ringerMode == 2) {
            if (audioManager.getStreamVolume(3) != 0) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioRouter", "isMuteOrVolumeZero: STREAM_MUSIC volume is 0");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioRouter", "isMuteOrVolumeZero: ringerMode=" + ringerMode + " (SILENT=0, VIBRATE=1, NORMAL=2)");
        return true;
    }

    public boolean Ri() {
        return Ai() == qk.ia.f445706i;
    }

    public boolean Ui(java.lang.String str) {
        b66.n b17 = tm1.h.f502003a.b();
        if (!Ri()) {
            return false;
        }
        bw5.lp0 g17 = ((b66.q) b17).g();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g17 != null ? g17.b() : null, str);
    }

    public boolean Vi(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        b66.n b17 = tm1.h.f502003a.b();
        if (!Di()) {
            return false;
        }
        bw5.lp0 g17 = ((b66.q) b17).g();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g17 != null ? g17.b() : null, id6);
    }

    public void Zi(bw5.lp0 item, il4.e ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        if (ext.f373639c == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.BizAudioServicesImpl", "play with fromScene 0", new java.lang.Object[0]);
        }
        pm0.v.X(new mm1.c0(this, item, ext));
    }

    public void aj(bw5.lp0 lp0Var, java.util.List list, bw5.o50 o50Var, bw5.pp0 pp0Var, il4.e ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        if (lp0Var != null && list == null && o50Var == null && pp0Var == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.BizAudioServicesImpl", "playWithCategory with only tingItem, fallback to playItem", new java.lang.Object[0]);
            Zi(lp0Var, ext);
            return;
        }
        if (ext.f373639c == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.BizAudioServicesImpl", "playWithCategory with fromScene 0", new java.lang.Object[0]);
        }
        if (lp0Var == null && list == null && o50Var == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.BizAudioServicesImpl", "playWithCategory with invalid params", new java.lang.Object[0]);
        } else {
            pm0.v.X(new mm1.d0(list, lp0Var, o50Var, pp0Var, ext, this));
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioServicesImpl", "TingServicesImpl init");
        synchronized (mm1.f0.class) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p.f299298b.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioServicesImpl", "setInitialized");
        }
    }
}

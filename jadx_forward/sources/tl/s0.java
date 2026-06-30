package tl;

/* loaded from: classes12.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f501648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f501649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f501650f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tl.q0 f501651g;

    public s0(tl.q0 q0Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18) {
        this.f501651g = q0Var;
        this.f501648d = m1Var;
        this.f501649e = i17;
        this.f501650f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        int i17;
        long j17;
        hg0.g gVar;
        int i18;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f501648d;
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        tl.q0 q0Var = this.f501651g;
        if (mo808xfb85f7b0 == 128) {
            q0Var.f501632m = false;
            if (!(m1Var instanceof w21.k)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceService", "onSceneEnd DownloadVoice scene is not NetSceneDownloadVoice: ".concat(m1Var.getClass().getName()));
                return;
            }
            w21.k kVar = (w21.k) m1Var;
            str = kVar.f523937f;
            i17 = kVar.f523940i;
            if (!kVar.f523943o && str != null) {
                hg0.k kVar2 = (hg0.k) ((eg0.e) i95.n0.c(eg0.e.class));
                kVar2.getClass();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = kVar2.f362864d;
                if (concurrentHashMap.get(str) != null) {
                    w21.w0 Ni = kVar2.Ni(str);
                    if (!(Ni != null && ((i18 = Ni.f524025i) == 99 || i18 == 98)) && (gVar = (hg0.g) concurrentHashMap.remove(str)) != null) {
                        kVar2.Ai(gVar, new hg0.f(Ni, Ni == null ? "scene_aborted_record_gone" : "scene_aborted_nonretry", false, 4, null));
                    }
                }
            }
        } else {
            if (m1Var.mo808xfb85f7b0() != 127) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoiceService", "onSceneEnd Error SceneType:" + m1Var.mo808xfb85f7b0());
                return;
            }
            q0Var.f501633n = false;
            if (m1Var instanceof w21.o) {
                str = ((w21.o) m1Var).f523965f;
                i17 = ((w21.o) m1Var).f523970n;
            } else if ((m1Var.mo47948x7f0c4558() instanceof com.p314xaae8f345.mm.p944x882e457a.o) && (((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a instanceof r45.dv6)) {
                return;
            } else {
                str = null;
                i17 = 0;
            }
        }
        w21.w0 j18 = w21.x0.j(str);
        if (m1Var.mo808xfb85f7b0() == 128 && j18 != null && j18.c() && j18.f524025i != 98) {
            w21.x0.s(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SceneVoiceService", "re-download set error");
        }
        if (str == null || ((java.util.HashMap) q0Var.f501631i).get(str) == null) {
            j17 = 0;
        } else {
            j17 = ((fp.j) ((java.util.HashMap) q0Var.f501631i).get(str)).a();
            ((java.util.HashMap) q0Var.f501631i).remove(str);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd SceneType:");
        sb6.append(m1Var.mo808xfb85f7b0());
        sb6.append(" errtype:");
        int i19 = this.f501649e;
        sb6.append(i19);
        sb6.append(" errCode:");
        sb6.append(this.f501650f);
        sb6.append(" retCode:");
        sb6.append(i17);
        sb6.append(" file:");
        sb6.append(str);
        sb6.append(" time:");
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceService", sb6.toString());
        if (i19 == 3 && i17 != 0) {
            q0Var.f501635p--;
        } else if (i19 != 0) {
            q0Var.f501635p = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceService", "onSceneEnd stop:" + q0Var.f501635p + " running:" + q0Var.f501634o + " recving:" + q0Var.f501632m + " sending:" + q0Var.f501633n);
        if (q0Var.f501635p > 0) {
            tl.q0.b(q0Var);
            return;
        }
        if (q0Var.f501633n || q0Var.f501632m) {
            return;
        }
        q0Var.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceService", "onSceneEnd fin and try next delay 3s [%d, %d] [%b]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(tl.q0.f501624t));
        if (tl.q0.f501624t && i19 == 4) {
            q0Var.d().mo50297x7c4d7ca2(new tl.r0(this), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        }
    }

    /* renamed from: toString */
    public java.lang.String m166739x9616526c() {
        return super.toString() + "|onSceneEnd";
    }
}

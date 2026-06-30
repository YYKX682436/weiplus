package ul4;

/* loaded from: classes11.dex */
public final class i extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 implements qk.a9, f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 f510149d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 f510150e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f510151f;

    /* renamed from: g, reason: collision with root package name */
    public f25.l0 f510152g;

    /* renamed from: h, reason: collision with root package name */
    public f25.m0 f510153h;

    /* renamed from: i, reason: collision with root package name */
    public jm4.e0 f510154i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f510155m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f510156n;

    public i(bw5.eq0 appId, com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036, com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac2060362) {
        f25.l0 e0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f510149d = c26845xac206036;
        this.f510150e = c26845xac2060362;
        java.lang.String taskId = appId.name() + '-' + java.util.UUID.randomUUID();
        this.f510151f = taskId;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        int ordinal = appId.ordinal();
        if (ordinal == 2) {
            e0Var = new f25.e0(taskId);
        } else if (ordinal == 3 || ordinal == 5) {
            vl4.u uVar = vl4.u.f519437a;
            e0Var = uVar.c(uVar.a()) ? new f25.c0(taskId) : new f25.b0(taskId);
        } else {
            e0Var = ordinal != 6 ? ordinal != 7 ? new f25.a0(taskId) : new f25.d0(taskId) : f25.k.f340634c;
        }
        this.f510152g = e0Var;
    }

    public final b66.n a() {
        b66.g gVar;
        b66.n a17;
        com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036 = this.f510149d;
        if (c26845xac206036 != null && (gVar = (b66.g) c26845xac206036.m106052x32c52b()) != null && (a17 = ((b66.i) gVar).a()) != null) {
            return a17;
        }
        com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac2060362 = this.f510150e;
        if (c26845xac2060362 != null) {
            return (b66.n) c26845xac2060362.m106052x32c52b();
        }
        return null;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioFocusController", "TingAudioFocusController " + this.f510151f + " onPause, canDuck:" + z17);
        pm0.v.X(new ul4.c(this));
    }

    public final void d(f25.m0 m0Var, boolean z17) {
        java.lang.String G;
        if (!z17) {
            if (!((m0Var != null ? ((g25.e) m0Var).f349514d : null) instanceof f25.t)) {
                if (!((m0Var != null ? ((g25.e) m0Var).f349514d : null) instanceof f25.h0)) {
                    if (!((m0Var != null ? ((g25.e) m0Var).f349514d : null) instanceof f25.u)) {
                        pm0.v.X(ul4.e.f510143d);
                        return;
                    }
                }
            }
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (z17) {
            G = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ge8);
        } else {
            G = (m0Var != null ? ((g25.e) m0Var).f349514d : null) instanceof f25.h0 ? iq.b.G(context, iq.b.E()) : iq.b.G(context, false);
        }
        pm0.v.X(new ul4.d(context, G));
    }

    public void e(jm4.h0 type, byte[] context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((ku5.t0) ku5.t0.f394148d).h(new ul4.h(this, type, context), "TingPlayAppAudioFocus.requestFocus");
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioFocusController", "TingAudioFocusController " + this.f510151f + " onResume");
        pm0.v.X(new ul4.g(this));
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioFocusController", "TingAudioFocusController " + this.f510151f + " onStop");
        b66.n a17 = a();
        if (a17 != null) {
            b66.m.a(a17, null, 1, null);
        }
        if (kl4.g.f390439b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioFocusLossToastLogic", "mark lost audio focus in background");
            kl4.g.f390438a = true;
        }
    }
}

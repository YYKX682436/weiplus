package fl;

/* loaded from: classes12.dex */
public final class a extends xm1.j {

    /* renamed from: k, reason: collision with root package name */
    public final f25.f f345218k;

    /* renamed from: l, reason: collision with root package name */
    public f25.m0 f345219l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f345220m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f345221n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f345222o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f345223p;

    /* renamed from: q, reason: collision with root package name */
    public tl.h f345224q;

    public a(f25.f onAudioFocusChanged) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAudioFocusChanged, "onAudioFocusChanged");
        this.f345218k = onAudioFocusChanged;
        this.f345220m = true;
        this.f345221n = true;
        i();
        ym1.f.f544667h.h(this, "music");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r0.mo166728xc00617a4() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(boolean r6, boolean r7) {
        /*
            r5 = this;
            tl.h r0 = r5.f345224q
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r0 = r0.mo166728xc00617a4()
            r2 = 1
            if (r0 != r2) goto Ld
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r2 == 0) goto L19
            tl.h r0 = r5.f345224q
            if (r0 == 0) goto L19
            boolean r6 = r0.f(r6)
            goto L1a
        L19:
            r6 = r1
        L1a:
            java.lang.Class<ym1.f> r0 = ym1.f.class
            i95.m r2 = i95.n0.c(r0)
            java.lang.String r3 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            ym1.f r2 = (ym1.f) r2
            xm1.h r2 = r2.f544669e
            if (r2 != 0) goto L4b
            xm1.j r2 = new xm1.j
            r2.<init>()
            i95.m r4 = i95.n0.c(r0)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r3)
            ym1.f r4 = (ym1.f) r4
            r4.f544669e = r2
            i95.m r0 = i95.n0.c(r0)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r3)
            ym1.f r0 = (ym1.f) r0
            java.lang.String r3 = "music"
            java.lang.String[] r0 = r0.f544671g
            r0[r1] = r3
        L4b:
            r2.v()
            boolean r0 = r5.f345222o
            if (r0 == 0) goto L68
            if (r7 == 0) goto L68
            f25.m0 r7 = r5.f345219l
            if (r7 == 0) goto L63
            java.lang.Class<f25.n0> r0 = f25.n0.class
            i95.m r0 = i95.n0.c(r0)
            f25.n0 r0 = (f25.n0) r0
            r0.yg(r7)
        L63:
            r7 = 0
            r5.f345219l = r7
            r5.f345222o = r1
        L68:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fl.a.D(boolean, boolean):boolean");
    }

    public final void E(boolean z17) {
        v();
        if (!z17) {
            q("music");
        }
        if (this.f345222o) {
            f25.m0 m0Var = this.f345219l;
            if (m0Var != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            }
            this.f345219l = null;
            this.f345222o = false;
        }
    }

    public final void F() {
        tl.h hVar = this.f345224q;
        if (hVar != null) {
            hVar.i(false);
        }
        if (this.f345220m) {
            f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.j0.f340633c, this.f345218k);
            this.f345219l = m96;
            this.f345222o = m96 != null ? ((g25.e) m96).f349513c : false;
        }
        this.f345221n = true;
        if (ym1.f.f544667h.j()) {
            r("music", 1);
        } else {
            r("music", 2);
        }
    }

    public final void G(java.lang.String filepath, int i17) {
        tl.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filepath, "filepath");
        if (this.f345220m && (hVar = this.f345224q) != null) {
            hVar.mo166732x764d819b(!this.f345222o);
        }
        tl.h hVar2 = this.f345224q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar2);
        if (hVar2.e(filepath, this.f345223p, i17)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceAudioManager", "start play error fileName[" + filepath + "], [" + this.f345223p + ']');
        q("music");
    }

    @Override // xm1.h, cv.y0
    public void a(boolean z17) {
        tl.h hVar;
        if (this.f345223p == z17 || (hVar = this.f345224q) == null) {
            return;
        }
        boolean z18 = false;
        if (hVar != null && hVar.mo166728xc00617a4()) {
            z18 = true;
        }
        if (z18) {
            A(z17);
            tl.h hVar2 = this.f345224q;
            if (hVar2 != null) {
                hVar2.g(z17);
            }
            this.f345223p = z17;
        }
    }

    @Override // xm1.h
    public void o(int i17) {
        if (i17 == 2) {
            a(false);
        }
    }
}

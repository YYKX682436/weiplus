package l75;

/* loaded from: classes11.dex */
public abstract class s0 implements l75.l0 {

    /* renamed from: defaults */
    private final l75.v0 f72767x2666f252 = new l75.o0(this);

    /* renamed from: loadedListener */
    private final l75.v0 f72768x67d283d9 = new l75.p0(this);

    /* renamed from: access$000 */
    public static void m145259xbbd77af0(l75.s0 s0Var, l75.q0 q0Var, l75.w0 w0Var) {
        s0Var.getClass();
        q0Var.mo735xb0dfc7d8(w0Var.f398506a, w0Var);
    }

    /* renamed from: access$100 */
    public static void m145260xbbd77eb1(l75.s0 s0Var, l75.r0 r0Var, java.lang.String str) {
        s0Var.getClass();
        r0Var.a();
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var) {
        this.f72767x2666f252.a(q0Var, android.os.Looper.getMainLooper());
    }

    /* renamed from: addLoadedListener */
    public void m145261xf3269ada(l75.r0 r0Var) {
        this.f72768x67d283d9.a(r0Var, android.os.Looper.getMainLooper());
    }

    /* renamed from: doNotify */
    public void m145262xf35bbb4() {
        l75.w0 w0Var = new l75.w0("*");
        this.f72767x2666f252.d(w0Var);
        this.f72767x2666f252.c();
        mo77982x77686a54(w0Var);
    }

    /* renamed from: extraStepsAfterNotifying */
    public void mo77982x77686a54(l75.w0 w0Var) {
    }

    /* renamed from: lock */
    public void mo78027x32c52b() {
        this.f72767x2666f252.f398503a++;
    }

    /* renamed from: lockCount */
    public int m145263xc7051ea4() {
        return this.f72767x2666f252.f398503a;
    }

    @Override // l75.l0
    /* renamed from: remove */
    public void mo49775xc84af884(l75.q0 q0Var) {
        this.f72767x2666f252.j(q0Var);
    }

    /* renamed from: removeLoadedListener */
    public void m145264x8ef5117d(l75.r0 r0Var) {
        this.f72768x67d283d9.j(r0Var);
    }

    /* renamed from: unlock */
    public void mo78028xcde7df44() {
        l75.v0 v0Var = this.f72767x2666f252;
        int i17 = v0Var.f398503a - 1;
        v0Var.f398503a = i17;
        if (i17 <= 0) {
            v0Var.f398503a = 0;
            v0Var.e();
        }
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var, android.os.Looper looper) {
        this.f72767x2666f252.a(q0Var, looper);
    }

    public void add(xu5.b bVar, l75.q0 q0Var) {
        this.f72767x2666f252.b(q0Var, bVar);
    }

    @Override // l75.l0
    public void add(java.lang.String str, l75.q0 q0Var) {
        this.f72767x2666f252.b(q0Var, xu5.b.a(str));
    }

    @Override // l75.l0
    /* renamed from: doNotify */
    public void mo145247xf35bbb4(java.lang.String str) {
        l75.w0 w0Var = new l75.w0(str);
        this.f72767x2666f252.d(w0Var);
        this.f72767x2666f252.c();
        mo77982x77686a54(w0Var);
    }

    /* renamed from: doNotify */
    public void mo142179xf35bbb4(java.lang.String str, int i17, java.lang.Object obj) {
        l75.w0 w0Var = new l75.w0();
        w0Var.f398506a = str;
        w0Var.f398507b = i17;
        w0Var.f398509d = obj;
        w0Var.f398508c = this;
        this.f72767x2666f252.d(w0Var);
        this.f72767x2666f252.c();
        mo77982x77686a54(w0Var);
    }
}

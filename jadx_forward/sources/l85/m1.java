package l85;

/* loaded from: classes5.dex */
public abstract class m1 extends i95.w implements i95.x, p012xc85e97e9.p093xedfae76a.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f398729d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean[] f398730e;

    /* renamed from: f, reason: collision with root package name */
    public final pf5.q f398731f;

    public m1(java.lang.String uicClassName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uicClassName, "uicClassName");
        this.f398729d = uicClassName;
        this.f398730e = new java.lang.Boolean[]{java.lang.Boolean.FALSE};
        this.f398731f = new pf5.q();
    }

    @Override // p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 mo2512x119738b3() {
        return this.f398731f.f435463f;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f398730e[0].booleanValue()) {
            synchronized (this.f398730e) {
                if (this.f398730e[0].booleanValue()) {
                    this.f398731f.c();
                    this.f398730e[0] = java.lang.Boolean.FALSE;
                }
            }
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        wi();
    }

    public final void wi() {
        if (this.f398730e[0].booleanValue()) {
            return;
        }
        synchronized (this.f398730e) {
            if (!this.f398730e[0].booleanValue()) {
                this.f398731f.b(this.f398729d);
                this.f398730e[0] = java.lang.Boolean.TRUE;
            }
        }
    }
}

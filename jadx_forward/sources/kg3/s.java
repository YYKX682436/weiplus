package kg3;

/* loaded from: classes12.dex */
public final class s implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: o, reason: collision with root package name */
    public static final kg3.r f389256o = new kg3.r(null);

    /* renamed from: d, reason: collision with root package name */
    public final kg3.f f389257d;

    /* renamed from: e, reason: collision with root package name */
    public int f389258e;

    /* renamed from: f, reason: collision with root package name */
    public int f389259f;

    /* renamed from: g, reason: collision with root package name */
    public int f389260g;

    /* renamed from: h, reason: collision with root package name */
    public float f389261h;

    /* renamed from: i, reason: collision with root package name */
    public int f389262i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f389263m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f389264n;

    public s(kg3.f listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f389257d = listener;
        this.f389258e = -1;
        this.f389259f = -1;
        this.f389260g = -1;
        this.f389264n = true;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        if (i17 == 2) {
            this.f389263m = true;
        }
        if (i17 == 0) {
            this.f389258e = -1;
        }
        if (i17 == 1) {
            this.f389263m = true;
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        int i19;
        this.f389262i = i18;
        if (this.f389263m) {
            float f18 = this.f389261h;
            if (f18 > 0.0f) {
                if (f17 > f18) {
                    this.f389264n = true;
                } else {
                    this.f389264n = false;
                }
                this.f389263m = false;
            }
        }
        this.f389261h = f17;
        int i27 = this.f389259f;
        if (i27 < 0) {
            return;
        }
        if (this.f389258e < 0) {
            this.f389258e = i27;
        }
        kg3.f fVar = this.f389257d;
        if (i18 != 0 || (i19 = this.f389260g) == -1) {
            fVar.D1(this.f389258e);
            fVar.D1(this.f389264n ? this.f389258e + 1 : this.f389258e - 1);
        } else {
            fVar.M1(i19);
            fVar.D1(this.f389260g);
            fVar.D1(this.f389259f);
            this.f389258e = -1;
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        this.f389260g = this.f389259f;
        this.f389259f = i17;
        this.f389257d.mo143395x510f45c9(i17);
    }
}

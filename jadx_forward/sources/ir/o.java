package ir;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final ir.h f375413a;

    /* renamed from: b, reason: collision with root package name */
    public final ir.n0 f375414b;

    /* renamed from: c, reason: collision with root package name */
    public ir.q f375415c;

    /* renamed from: d, reason: collision with root package name */
    public ir.q f375416d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 f375417e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 f375418f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f375419g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f375420h;

    public o(ir.h config, ir.n0 dataListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataListener, "dataListener");
        this.f375413a = config;
        this.f375414b = dataListener;
        this.f375415c = new ir.q();
        this.f375416d = new ir.q();
        new java.util.HashSet();
    }

    public final void a(ir.r rVar) {
        int size = this.f375416d.f375424b.size();
        this.f375416d.f375424b.add(rVar);
        this.f375416d.f375425c.add(new ir.y0(rVar, size));
    }

    public final void b() {
        synchronized (this) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelData", "postUpdate() delay: %s", 0L);
            if (this.f375419g) {
                this.f375420h = true;
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelData", "updateData: start " + this.f375413a.f375377c + ", " + this.f375413a.f375378d + ", " + this.f375413a.f375381g + ", " + this.f375413a.f375383i + ", " + this.f375413a.f375376b);
            this.f375419g = true;
            pm0.v.Q("EmojiPanelData_updateData", false, new ir.n(this), 0L, 2, null);
        }
    }
}

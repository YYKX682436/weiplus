package aw2;

/* loaded from: classes10.dex */
public final class x0 implements ya2.r1 {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.List f14806s = kz5.c0.i(34, 36, 47);

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f14807d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f14808e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f14809f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f14810g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f14811h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14812i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f14813m;

    /* renamed from: n, reason: collision with root package name */
    public r45.zi2 f14814n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14815o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f14816p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f14817q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f14818r;

    public x0(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f14807d = activity;
        this.f14808e = jz5.h.b(new aw2.q0(this));
        this.f14809f = jz5.h.b(new aw2.o0(this));
        this.f14810g = jz5.h.b(new aw2.u0(this));
        this.f14811h = jz5.h.b(new aw2.r0(this));
        this.f14813m = jz5.h.b(new aw2.v0(this));
        this.f14816p = jz5.h.b(new aw2.n0(this));
        this.f14817q = jz5.h.b(new aw2.w0(this));
        this.f14818r = jz5.h.b(new aw2.p0(this));
    }

    public final android.view.View a() {
        return (android.view.View) ((jz5.n) this.f14808e).getValue();
    }

    public final boolean b() {
        return ((java.lang.Boolean) ((jz5.n) this.f14811h).getValue()).booleanValue();
    }

    public final r45.kc4 c() {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem;
        if (!b() || (finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) ((jz5.n) this.f14810g).getValue()) == null) {
            return null;
        }
        android.widget.CheckBox checkBox = (android.widget.CheckBox) ((jz5.n) this.f14809f).getValue();
        int i17 = (checkBox == null || !checkBox.isChecked()) ? 0 : 1;
        r45.kc4 kc4Var = new r45.kc4();
        kc4Var.set(0, java.lang.Long.valueOf(finderItem.getId()));
        kc4Var.set(7, finderItem.getDupFlag());
        kc4Var.set(1, finderItem.getObjectNonceId());
        kc4Var.set(2, finderItem.getUserName());
        kc4Var.set(3, finderItem.getNickName());
        kc4Var.set(5, java.lang.Integer.valueOf(i17));
        kc4Var.set(6, (java.lang.String) ((jz5.n) this.f14813m).getValue());
        if (((java.lang.Boolean) ((jz5.n) this.f14816p).getValue()).booleanValue()) {
            r2 = 3;
        } else if (!this.f14812i) {
            java.lang.String str = (java.lang.String) ((jz5.n) this.f14817q).getValue();
            kotlin.jvm.internal.o.f(str, "<get-topicWord>(...)");
            r2 = (str.length() <= 0 ? 0 : 1) != 0 ? 2 : 0;
        }
        kc4Var.set(4, java.lang.Integer.valueOf(r2));
        return kc4Var;
    }
}

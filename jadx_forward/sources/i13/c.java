package i13;

/* loaded from: classes10.dex */
public abstract class c implements in5.c {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f368807g = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f368808d;

    /* renamed from: e, reason: collision with root package name */
    public final long f368809e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f368810f;

    public c(java.lang.String id6, long j17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f368808d = id6;
        this.f368809e = j17;
        this.f368810f = new i13.b(this);
        java.util.HashMap hashMap = f368807g;
        i13.a aVar = (i13.a) hashMap.get(id6);
        boolean z17 = aVar != null ? aVar.f368805c : false;
        i13.a aVar2 = (i13.a) hashMap.get(id6);
        if (aVar2 == null || (str = aVar2.f368804b) == null) {
            str = id6 + "-removeSelf";
        }
        hashMap.put(id6, new i13.a(id6, str, z17));
    }

    public int a() {
        return ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).f384746g ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.r_) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560677r7);
    }

    public android.graphics.drawable.Drawable b() {
        return m95.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, com.p314xaae8f345.mm.R.raw.f81412xf7d471f2, 0.0f);
    }

    public java.lang.String c() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.feh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public final boolean d() {
        i13.a aVar = (i13.a) f368807g.get(this.f368808d);
        if (aVar != null) {
            return aVar.f368805c;
        }
        return false;
    }

    public abstract boolean e();

    public abstract boolean f();

    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyMsgItem", "id=" + this.f368808d + " onAddToList");
    }

    public void i() {
    }

    public void j() {
        if (d()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id=");
        java.lang.String str = this.f368808d;
        sb6.append(str);
        sb6.append(" onExpose");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyMsgItem", sb6.toString());
        java.lang.String q17 = q();
        i13.a aVar = (i13.a) f368807g.get(str);
        if (aVar != null) {
            aVar.f368805c = true;
        }
        ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).n(q17);
        long j17 = this.f368809e;
        if (j17 != 0) {
            ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).k(this.f368810f, j17, q17);
        }
    }

    public abstract void k(android.view.View view);

    public void l(boolean z17) {
        if (d()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id=");
            java.lang.String str = this.f368808d;
            sb6.append(str);
            sb6.append(" onHide");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyMsgItem", sb6.toString());
            i13.a aVar = (i13.a) f368807g.get(str);
            if (aVar != null) {
                aVar.f368805c = false;
            }
            ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).n(q());
        }
    }

    public abstract void n(in5.s0 s0Var, android.view.View view, int i17);

    public void o() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id=");
        java.lang.String str = this.f368808d;
        sb6.append(str);
        sb6.append(" onRemoveFromList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyMsgItem", sb6.toString());
        i13.a aVar = (i13.a) f368807g.get(str);
        if (aVar != null) {
            aVar.f368805c = false;
        }
        ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).n(q());
    }

    public void p() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyMsgItem", "id=" + this.f368808d + " onUpdateInList");
        java.lang.String q17 = q();
        ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).n(q17);
        if (d()) {
            ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).k(this.f368810f, this.f368809e, q17);
        }
    }

    public final java.lang.String q() {
        java.lang.String str;
        i13.a aVar = (i13.a) f368807g.get(this.f368808d);
        return (aVar == null || (str = aVar.f368804b) == null) ? "" : str;
    }

    public /* synthetic */ c(java.lang.String str, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i17 & 2) != 0 ? 0L : j17);
    }
}

package pk2;

/* loaded from: classes3.dex */
public final class g7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f437312a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f437313b;

    /* renamed from: c, reason: collision with root package name */
    public final db5.g4 f437314c;

    /* renamed from: d, reason: collision with root package name */
    public db5.o4 f437315d;

    /* renamed from: e, reason: collision with root package name */
    public db5.t4 f437316e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f437317f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f437318g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Integer f437319h;

    public g7(java.lang.String levelId, java.lang.String str, db5.g4 menu, db5.o4 o4Var, db5.t4 t4Var, boolean z17, android.view.View view, java.lang.Integer num, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i17 & 2) != 0 ? null : str;
        o4Var = (i17 & 8) != 0 ? null : o4Var;
        t4Var = (i17 & 16) != 0 ? null : t4Var;
        z17 = (i17 & 32) != 0 ? true : z17;
        view = (i17 & 64) != 0 ? null : view;
        num = (i17 & 128) != 0 ? null : num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(levelId, "levelId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        this.f437312a = levelId;
        this.f437313b = str;
        this.f437314c = menu;
        this.f437315d = o4Var;
        this.f437316e = t4Var;
        this.f437317f = z17;
        this.f437318g = view;
        this.f437319h = num;
    }

    /* renamed from: equals */
    public boolean m158638xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk2.g7)) {
            return false;
        }
        pk2.g7 g7Var = (pk2.g7) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f437312a, g7Var.f437312a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f437313b, g7Var.f437313b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f437314c, g7Var.f437314c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f437315d, g7Var.f437315d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f437316e, g7Var.f437316e) && this.f437317f == g7Var.f437317f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f437318g, g7Var.f437318g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f437319h, g7Var.f437319h);
    }

    /* renamed from: hashCode */
    public int m158639x8cdac1b() {
        int hashCode = this.f437312a.hashCode() * 31;
        java.lang.String str = this.f437313b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f437314c.hashCode()) * 31;
        db5.o4 o4Var = this.f437315d;
        int hashCode3 = (hashCode2 + (o4Var == null ? 0 : o4Var.hashCode())) * 31;
        db5.t4 t4Var = this.f437316e;
        int hashCode4 = (((hashCode3 + (t4Var == null ? 0 : t4Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f437317f)) * 31;
        android.view.View view = this.f437318g;
        int hashCode5 = (hashCode4 + (view == null ? 0 : view.hashCode())) * 31;
        java.lang.Integer num = this.f437319h;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m158640x9616526c() {
        return "LevelConfig(levelId=" + this.f437312a + ", title=" + this.f437313b + ", menu=" + this.f437314c + ", onCreateMenuListener=" + this.f437315d + ", onMenuSelectedListener=" + this.f437316e + ", visible=" + this.f437317f + ", customWidget=" + this.f437318g + ", highlightItemId=" + this.f437319h + ')';
    }
}

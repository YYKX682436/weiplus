package k50;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f385751a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f385752b;

    /* renamed from: c, reason: collision with root package name */
    public final k50.o0 f385753c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f385754d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f385755e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f385756f;

    public h0(android.graphics.drawable.Drawable drawable, java.lang.String name, k50.o0 selectedApp, java.lang.String str, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedApp, "selectedApp");
        this.f385751a = drawable;
        this.f385752b = name;
        this.f385753c = selectedApp;
        this.f385754d = str;
        this.f385755e = z17;
        this.f385756f = aVar;
    }

    /* renamed from: equals */
    public boolean m141978xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k50.h0)) {
            return false;
        }
        k50.h0 h0Var = (k50.h0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385751a, h0Var.f385751a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385752b, h0Var.f385752b) && this.f385753c == h0Var.f385753c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385754d, h0Var.f385754d) && this.f385755e == h0Var.f385755e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385756f, h0Var.f385756f);
    }

    /* renamed from: hashCode */
    public int m141979x8cdac1b() {
        android.graphics.drawable.Drawable drawable = this.f385751a;
        int hashCode = (((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.f385752b.hashCode()) * 31) + this.f385753c.hashCode()) * 31;
        java.lang.String str = this.f385754d;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f385755e)) * 31;
        yz5.a aVar = this.f385756f;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m141980x9616526c() {
        return "AppItem(icon=" + this.f385751a + ", name=" + this.f385752b + ", selectedApp=" + this.f385753c + ", subtitle=" + this.f385754d + ", isSubtitleBelow=" + this.f385755e + ", onClick=" + this.f385756f + ')';
    }

    public /* synthetic */ h0(android.graphics.drawable.Drawable drawable, java.lang.String str, k50.o0 o0Var, java.lang.String str2, boolean z17, yz5.a aVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(drawable, str, o0Var, (i17 & 8) != 0 ? null : str2, (i17 & 16) != 0 ? false : z17, (i17 & 32) != 0 ? null : aVar);
    }
}

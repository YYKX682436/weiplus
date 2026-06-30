package yf;

/* loaded from: classes11.dex */
public final class m1 implements yf.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f542948a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f542949b;

    /* renamed from: c, reason: collision with root package name */
    public final int f542950c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p454x32b0ec.p455x6572ad33.EnumC3960x7b9a5e68 f542951d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f542952e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f542953f;

    /* renamed from: g, reason: collision with root package name */
    public final yf.j1 f542954g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p454x32b0ec.p455x6572ad33.EnumC3959x7e4b36f8 f542955h;

    public m1(int i17, java.lang.String name, int i18, com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p454x32b0ec.p455x6572ad33.EnumC3960x7b9a5e68 triggerAction, java.lang.String resPath, java.lang.String resPathMd5, yf.j1 j1Var, com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p454x32b0ec.p455x6572ad33.EnumC3959x7e4b36f8 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(triggerAction, "triggerAction");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resPath, "resPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resPathMd5, "resPathMd5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f542948a = i17;
        this.f542949b = name;
        this.f542950c = i18;
        this.f542951d = triggerAction;
        this.f542952e = resPath;
        this.f542953f = resPathMd5;
        this.f542954g = j1Var;
        this.f542955h = type;
    }

    @Override // yf.k
    public java.lang.String a() {
        return "StickerItemInfo(resPath='" + this.f542952e + "', resPathMd5='" + this.f542953f + "')";
    }

    /* renamed from: equals */
    public boolean m176941xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.m1)) {
            return false;
        }
        yf.m1 m1Var = (yf.m1) obj;
        return this.f542948a == m1Var.f542948a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542949b, m1Var.f542949b) && this.f542950c == m1Var.f542950c && this.f542951d == m1Var.f542951d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542952e, m1Var.f542952e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542953f, m1Var.f542953f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542954g, m1Var.f542954g) && this.f542955h == m1Var.f542955h;
    }

    /* renamed from: hashCode */
    public int m176942x8cdac1b() {
        int hashCode = ((((((((((java.lang.Integer.hashCode(this.f542948a) * 31) + this.f542949b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f542950c)) * 31) + this.f542951d.hashCode()) * 31) + this.f542952e.hashCode()) * 31) + this.f542953f.hashCode()) * 31;
        yf.j1 j1Var = this.f542954g;
        return ((hashCode + (j1Var == null ? 0 : j1Var.m176939x8cdac1b())) * 31) + this.f542955h.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m176943x9616526c() {
        return "StickerItemInfo(id=" + this.f542948a + ", name=" + this.f542949b + ", frameCount=" + this.f542950c + ", triggerAction=" + this.f542951d + ", resPath=" + this.f542952e + ", resPathMd5=" + this.f542953f + ", pos=" + this.f542954g + ", type=" + this.f542955h + ')';
    }
}

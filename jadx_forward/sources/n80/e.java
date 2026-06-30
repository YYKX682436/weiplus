package n80;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f417131a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f417132b;

    /* renamed from: c, reason: collision with root package name */
    public int f417133c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f417134d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f417135e;

    /* renamed from: f, reason: collision with root package name */
    public n80.a f417136f;

    public e(boolean z17, java.lang.String desc, int i17, boolean z18, boolean z19, n80.a aVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        desc = (i18 & 2) != 0 ? "" : desc;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        z18 = (i18 & 8) != 0 ? false : z18;
        z19 = (i18 & 16) != 0 ? true : z19;
        aVar = (i18 & 32) != 0 ? null : aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f417131a = z17;
        this.f417132b = desc;
        this.f417133c = i17;
        this.f417134d = z18;
        this.f417135e = z19;
        this.f417136f = aVar;
    }

    /* renamed from: equals */
    public boolean m149209xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n80.e)) {
            return false;
        }
        n80.e eVar = (n80.e) obj;
        return this.f417131a == eVar.f417131a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f417132b, eVar.f417132b) && this.f417133c == eVar.f417133c && this.f417134d == eVar.f417134d && this.f417135e == eVar.f417135e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f417136f, eVar.f417136f);
    }

    /* renamed from: hashCode */
    public int m149210x8cdac1b() {
        int hashCode = ((((((((java.lang.Boolean.hashCode(this.f417131a) * 31) + this.f417132b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f417133c)) * 31) + java.lang.Boolean.hashCode(this.f417134d)) * 31) + java.lang.Boolean.hashCode(this.f417135e)) * 31;
        n80.a aVar = this.f417136f;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m149211x9616526c() {
        return "LabelContactDialogBottomTipsConfig(enableShow=" + this.f417131a + ", desc=" + this.f417132b + ", textColor=" + this.f417133c + ", enableClick=" + this.f417134d + ", enableDismissDialogOnClick=" + this.f417135e + ", listener=" + this.f417136f + ')';
    }
}

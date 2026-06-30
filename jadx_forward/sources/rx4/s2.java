package rx4;

/* loaded from: classes8.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final vu4.a f482805a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f482806b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f482807c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f482808d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f482809e;

    public s2(vu4.a actionId, java.lang.String itemInfo, java.lang.String docInfo, boolean z17, java.util.Map extInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionId, "actionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(docInfo, "docInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        this.f482805a = actionId;
        this.f482806b = itemInfo;
        this.f482807c = docInfo;
        this.f482808d = z17;
        this.f482809e = extInfo;
    }

    /* renamed from: equals */
    public boolean m163421xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4.s2)) {
            return false;
        }
        rx4.s2 s2Var = (rx4.s2) obj;
        return this.f482805a == s2Var.f482805a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482806b, s2Var.f482806b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482807c, s2Var.f482807c) && this.f482808d == s2Var.f482808d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482809e, s2Var.f482809e);
    }

    /* renamed from: hashCode */
    public int m163422x8cdac1b() {
        return (((((((this.f482805a.hashCode() * 31) + this.f482806b.hashCode()) * 31) + this.f482807c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f482808d)) * 31) + this.f482809e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163423x9616526c() {
        return "Report26897Item(actionId=" + this.f482805a + ", itemInfo=" + this.f482806b + ", docInfo=" + this.f482807c + ", isCache=" + this.f482808d + ", extInfo=" + this.f482809e + ')';
    }

    public /* synthetic */ s2(vu4.a aVar, java.lang.String str, java.lang.String str2, boolean z17, java.util.Map map, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(aVar, str, str2, z17, (i17 & 16) != 0 ? kz5.q0.f395534d : map);
    }
}

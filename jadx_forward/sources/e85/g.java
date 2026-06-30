package e85;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f331841a;

    /* renamed from: b, reason: collision with root package name */
    public final int f331842b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f331843c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f331844d;

    public g(int i17, int i18, boolean z17, java.util.List list, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i19 & 4) != 0 ? true : z17;
        list = (i19 & 8) != 0 ? null : list;
        this.f331841a = i17;
        this.f331842b = i18;
        this.f331843c = z17;
        this.f331844d = list;
    }

    /* renamed from: equals */
    public boolean m127187xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e85.g)) {
            return false;
        }
        e85.g gVar = (e85.g) obj;
        return this.f331841a == gVar.f331841a && this.f331842b == gVar.f331842b && this.f331843c == gVar.f331843c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331844d, gVar.f331844d);
    }

    /* renamed from: hashCode */
    public int m127188x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f331841a) * 31) + java.lang.Integer.hashCode(this.f331842b)) * 31) + java.lang.Boolean.hashCode(this.f331843c)) * 31;
        java.util.List list = this.f331844d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m127189x9616526c() {
        return "BusinessConfigItem(descPrefix=" + this.f331841a + ", descSuffix=" + this.f331842b + ", needCheckSwitch=" + this.f331843c + ", noNeedDialogPageList=" + this.f331844d + ')';
    }
}

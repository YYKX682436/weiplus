package dd5;

/* loaded from: classes8.dex */
public final class k2 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310726a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f310727b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f310728c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310729d;

    public k2(java.lang.CharSequence title, java.lang.CharSequence desc, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f310726a = title;
        this.f310727b = desc;
        this.f310728c = str;
        this.f310729d = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310726a, this.f310727b);
    }

    /* renamed from: equals */
    public boolean m124045xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.k2)) {
            return false;
        }
        dd5.k2 k2Var = (dd5.k2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310726a, k2Var.f310726a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310727b, k2Var.f310727b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310728c, k2Var.f310728c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310729d, k2Var.f310729d);
    }

    /* renamed from: hashCode */
    public int m124046x8cdac1b() {
        int hashCode = ((this.f310726a.hashCode() * 31) + this.f310727b.hashCode()) * 31;
        java.lang.String str = this.f310728c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f310729d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124047x9616526c() {
        return "ViewModel(title=" + ((java.lang.Object) this.f310726a) + ", desc=" + ((java.lang.Object) this.f310727b) + ", recordItem=" + this.f310728c + ", msgInfo=" + this.f310729d + ')';
    }
}

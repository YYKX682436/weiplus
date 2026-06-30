package fr3;

/* loaded from: classes10.dex */
public final class k extends fr3.m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f347332a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.List dataList) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f347332a = dataList;
    }

    /* renamed from: equals */
    public boolean m130068xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr3.k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f347332a, ((fr3.k) obj).f347332a);
    }

    /* renamed from: hashCode */
    public int m130069x8cdac1b() {
        return this.f347332a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m130070x9616526c() {
        return "getContactStates(dataList=" + this.f347332a + ')';
    }
}

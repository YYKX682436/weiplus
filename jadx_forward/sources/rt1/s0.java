package rt1;

/* loaded from: classes4.dex */
public final class s0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f481017a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f481018b;

    public s0(java.util.ArrayList oldList, java.util.ArrayList newList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldList, "oldList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
        this.f481017a = oldList;
        this.f481018b = newList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        java.lang.String str = (java.lang.String) kz5.n0.a0(this.f481017a, i17);
        return str != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, (java.lang.String) kz5.n0.a0(this.f481018b, i18));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        return a(i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f481018b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f481017a.size();
    }
}

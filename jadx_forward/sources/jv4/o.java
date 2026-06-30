package jv4;

/* loaded from: classes12.dex */
public final class o extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f383792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f383793b;

    public o(java.util.List list, java.util.List list2) {
        this.f383792a = list;
        this.f383793b = list2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mv4.g) this.f383792a.get(i17)).f413205a, ((jv4.n) this.f383793b.get(i18)).v());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        return ((mv4.g) this.f383792a.get(i17)).f413206b == ((jv4.n) this.f383793b.get(i18)).mo141457xfb85f7b0();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f383793b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f383792a.size();
    }
}

package lf4;

/* loaded from: classes4.dex */
public final class j extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f399948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f399949b;

    public j(java.util.List list, java.util.List list2) {
        this.f399948a = list;
        this.f399949b = list2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399948a.get(i17), this.f399949b.get(i18));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        return ((if4.f) this.f399948a.get(i17)).f372779d == ((if4.f) this.f399949b.get(i18)).f372779d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f399949b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f399948a.size();
    }
}

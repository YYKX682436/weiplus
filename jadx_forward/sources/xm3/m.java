package xm3;

/* loaded from: classes4.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f536886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f536887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe) {
        super(0);
        this.f536886d = list;
        this.f536887e = c16718x7059cefe;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Iterator it = this.f536886d.iterator();
        while (it.hasNext()) {
            this.f536887e.x((xm3.o0) it.next());
        }
        return jz5.f0.f384359a;
    }
}

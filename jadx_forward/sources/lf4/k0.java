package lf4;

/* loaded from: classes4.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if4.a f399967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f399968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(if4.a aVar, lf4.q0 q0Var) {
        super(0);
        this.f399967d = aVar;
        this.f399968e = q0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if4.a aVar = this.f399967d;
        aVar.f372770e = false;
        aVar.f372771f = false;
        aVar.f372769d = false;
        java.util.Iterator it = aVar.f372772g.iterator();
        while (it.hasNext()) {
            ((gf4.a) it.next()).f352868f = false;
        }
        java.util.Iterator it6 = aVar.f372773h.iterator();
        while (it6.hasNext()) {
            ((gf4.a) it6.next()).f352868f = false;
        }
        java.util.Iterator it7 = aVar.f372775j.iterator();
        while (it7.hasNext()) {
            ((gf4.a) it7.next()).f352868f = false;
        }
        lf4.q0 q0Var = this.f399968e;
        q0Var.n();
        ((sf4.a1) q0Var.f399995f).d();
        return jz5.f0.f384359a;
    }
}

package n0;

/* loaded from: classes14.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f415064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f415065e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.util.List list) {
        super(3);
        this.f415064d = f0Var;
        this.f415065e = list;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.e applier = (n0.e) obj;
        n0.o4 slots = (n0.o4) obj2;
        n0.d4 rememberManager = (n0.d4) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applier, "applier");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slots, "slots");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rememberManager, "rememberManager");
        int i17 = this.f415064d.f391649d;
        if (i17 > 0) {
            applier = new n0.x2(applier, i17);
        }
        java.util.List list = this.f415065e;
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            ((yz5.q) list.get(i18)).mo147xb9724478(applier, slots, rememberManager);
        }
        return jz5.f0.f384359a;
    }
}

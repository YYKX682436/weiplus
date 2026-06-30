package ch2;

/* loaded from: classes10.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ia4 f122949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122950e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r45.ia4 ia4Var, ch2.o2 o2Var) {
        super(0);
        this.f122949d = ia4Var;
        this.f122950e = o2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        boolean z17 = pm0.v.z(this.f122949d.f458416u, 1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f122950e.i7().f410520q.f461834n, this.f122949d.f458404f)) {
            zi2.w wVar = (zi2.w) this.f122950e.R6(zi2.w.class);
            if (wVar != null) {
                wVar.x1().b(!z17);
            }
        } else {
            java.util.List list = this.f122950e.o7().f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
            r45.ia4 ia4Var = this.f122949d;
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390703a, ia4Var.f458404f)) {
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if (qVar != null) {
                qVar.f390716n = z17;
            }
            zi2.w wVar2 = (zi2.w) this.f122950e.R6(zi2.w.class);
            if (wVar2 != null) {
                wVar2.D1();
            }
        }
        return jz5.f0.f384359a;
    }
}

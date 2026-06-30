package ch2;

/* loaded from: classes10.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ia4 f41416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r45.ia4 ia4Var, ch2.o2 o2Var) {
        super(0);
        this.f41416d = ia4Var;
        this.f41417e = o2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        boolean z17 = pm0.v.z(this.f41416d.f376883u, 1);
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f41417e.i7().f328987q.f380301n, this.f41416d.f376871f)) {
            zi2.w wVar = (zi2.w) this.f41417e.R6(zi2.w.class);
            if (wVar != null) {
                wVar.x1().b(!z17);
            }
        } else {
            java.util.List list = this.f41417e.o7().f329327v;
            kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
            r45.ia4 ia4Var = this.f41416d;
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309170a, ia4Var.f376871f)) {
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if (qVar != null) {
                qVar.f309183n = z17;
            }
            zi2.w wVar2 = (zi2.w) this.f41417e.R6(zi2.w.class);
            if (wVar2 != null) {
                wVar2.D1();
            }
        }
        return jz5.f0.f302826a;
    }
}

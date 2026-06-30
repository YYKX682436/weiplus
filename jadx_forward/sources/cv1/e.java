package cv1;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ms f304086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ms f304087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ms f304088f;

    public e(r45.ms msVar, r45.ms msVar2, r45.ms msVar3) {
        this.f304086d = msVar;
        this.f304087e = msVar2;
        this.f304088f = msVar3;
    }

    @Override // java.lang.Runnable
    public void run() {
        fp.j jVar = new fp.j();
        com.p314xaae8f345.mm.p947xba6de98f.s1 Zi = com.p314xaae8f345.mm.p947xba6de98f.s1.Zi();
        if (Zi.f152663q == null) {
            Zi.f152663q = new com.p314xaae8f345.mm.p947xba6de98f.p1(Zi);
        }
        if (Zi.f152663q != null && this.f304086d != null) {
            com.p314xaae8f345.mm.p947xba6de98f.s1 Zi2 = com.p314xaae8f345.mm.p947xba6de98f.s1.Zi();
            if (Zi2.f152663q == null) {
                Zi2.f152663q = new com.p314xaae8f345.mm.p947xba6de98f.p1(Zi2);
            }
            com.p314xaae8f345.mm.p944x882e457a.k0 k0Var = Zi2.f152663q;
            r45.ms msVar = this.f304086d;
            r45.ms msVar2 = this.f304087e;
            r45.ms msVar3 = this.f304088f;
            com.p314xaae8f345.mm.p947xba6de98f.p1 p1Var = (com.p314xaae8f345.mm.p947xba6de98f.p1) k0Var;
            p1Var.getClass();
            msVar.getClass();
            java.util.Objects.toString(com.p314xaae8f345.mm.p947xba6de98f.s1.cj());
            if (com.p314xaae8f345.mm.p947xba6de98f.s1.cj() != null) {
                com.p314xaae8f345.mm.p947xba6de98f.s1.cj().h(msVar, msVar2, msVar3, null, null, null, "");
                ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p947xba6de98f.o1(p1Var), "MicroMsg.Cdn.ThreadName");
            }
            jVar.a();
        }
        jVar.a();
    }
}

package ug0;

/* loaded from: classes8.dex */
public final class m implements zy2.da {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ug0.q f508999a;

    public m(ug0.q qVar) {
        this.f508999a = qVar;
    }

    @Override // zy2.da
    public boolean a(r45.vs2 ctrInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrInfo, "ctrInfo");
        int i17 = ctrInfo.f470020e;
        if (i17 >= 500000 && i17 < 599999) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
            jbVar.t0(ctrInfo);
            j75.f Ai = this.f508999a.f381800d.Ai();
            if (Ai != null) {
                Ai.B3(new tg0.o2(jbVar));
            }
        }
        return false;
    }
}

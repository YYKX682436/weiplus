package al2;

/* loaded from: classes3.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ al2.f f87360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.z42 f87361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f87362c;

    public c(al2.f fVar, r45.z42 z42Var, yz5.l lVar) {
        this.f87360a = fVar;
        this.f87361b = z42Var;
        this.f87362c = lVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        yz5.l lVar = this.f87362c;
        al2.f fVar2 = this.f87360a;
        if (i17 == 0 && fVar.f152149b == 0) {
            fVar2.f87370d.remove(this.f87361b);
            if (lVar == null) {
                fVar2.f87369c.mo7808x76db6cb1(new al2.g(fVar.f152149b, 3, null, this.f87361b, null, null, 48, null));
            } else {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
            al2.h.a(fVar2, null, 1, null);
        } else if (lVar == null) {
            fVar2.f87369c.mo7808x76db6cb1(new al2.g(fVar.f152149b, 3, null, null, null, fVar.f152150c, 28, null));
        } else {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}

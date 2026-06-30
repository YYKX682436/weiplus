package bd2;

/* loaded from: classes2.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f100799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f100800b;

    public l(yz5.l lVar, yz5.a aVar) {
        this.f100799a = lVar;
        this.f100800b = aVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        r45.vw0 vw0Var = (r45.vw0) fVar.f152151d;
        int i17 = fVar.f152149b;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0 && fVar.f152148a == 0) {
            yz5.l lVar = this.f100799a;
            if (lVar != null) {
                java.util.LinkedList m75941xfb821914 = vw0Var.m75941xfb821914(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getNot_interested_wording_list(...)");
                lVar.mo146xb9724478(m75941xfb821914);
                return f0Var;
            }
        } else {
            yz5.a aVar = this.f100800b;
            if (aVar != null) {
                aVar.mo152xb9724478();
                return f0Var;
            }
        }
        return null;
    }
}

package zi4;

/* loaded from: classes4.dex */
public class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f554786a;

    /* renamed from: b, reason: collision with root package name */
    public final zi4.h0 f554787b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f554788c;

    public r1(yz5.l callback, zi4.h0 h0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f554786a = callback;
        this.f554787b = h0Var;
    }

    public void a(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, long j17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        zi4.h0 h0Var = this.f554787b;
        if (h0Var != null) {
            if (this.f554788c) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                return;
            }
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f554786a.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24923xd8b43e97(h0Var.f554713d, j17, errMsg, new com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24928xe4a82335(fVar != null ? fVar.mo14344x5f01b1f6() : null)))));
            this.f554788c = true;
        }
    }
}

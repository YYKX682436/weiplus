package vd2;

/* loaded from: classes3.dex */
public final class n3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f517357c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f517358d;

    public n3(java.lang.String str, java.lang.String str2, vd2.g5 g5Var, vd2.g5 g5Var2) {
        this.f517355a = str;
        this.f517356b = str2;
        this.f517357c = g5Var;
        this.f517358d = g5Var2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        r45.h32 h32Var = (r45.h32) ((r45.st0) fVar.f152151d).m75936x14adae67(1);
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0 && fVar.f152149b == 0 && h32Var != null) {
            vd2.j1 j1Var = (vd2.j1) ((zy2.x7) i95.n0.c(zy2.x7.class));
            j1Var.getClass();
            java.lang.String username = this.f517355a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            java.lang.String noticeId = this.f517356b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
            j1Var.f517304e.put(new vd2.h1(username, noticeId), new vd2.i1(h32Var, c01.id.e()));
            vd2.g5 g5Var = this.f517357c;
            if (g5Var != null) {
                g5Var.a(java.lang.Boolean.valueOf(h32Var.m75939xb282bd08(1) == 0));
                return f0Var;
            }
        } else {
            vd2.g5 g5Var2 = this.f517358d;
            if (g5Var2 != null) {
                g5Var2.a(java.lang.Integer.valueOf(fVar.f152149b));
                return f0Var;
            }
        }
        return null;
    }
}

package c61;

/* loaded from: classes2.dex */
public final class v8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f120884a;

    public v8(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f120884a = h0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152149b;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f120884a;
        if (i17 == 0 && fVar.f152148a == 0) {
            ot5.g.c("FinderReportFeatureService", "successfully! size=" + ((java.util.LinkedList) h0Var.f391656d).size());
        } else {
            ot5.g.d("FinderReportFeatureService", "fail to report! size=" + ((java.util.LinkedList) h0Var.f391656d).size());
        }
        return jz5.f0.f384359a;
    }
}

package sr2;

/* loaded from: classes10.dex */
public final class y4 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493353a;

    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6) {
        this.f493353a = c14609xb4d6eef6;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        aw2.c0 c0Var = this.f493353a.f204062u;
        if (c0Var != null) {
            return kz5.b1.e(new jz5.l("highlight_topic_name", c0Var.f96266p ? c0Var.f96265o : null));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("highlightTopicWidget");
        throw null;
    }
}

package ro2;

/* loaded from: classes2.dex */
public final class m implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f479597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f479599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f479600d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var) {
        this.f479597a = abstractC14490x69736cb5;
        this.f479598b = context;
        this.f479599c = qeVar;
        this.f479600d = s0Var;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        pm0.v.X(new ro2.l(this.f479597a, this.f479598b, this.f479599c, this.f479600d, destPath));
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        pm0.v.X(new ro2.i(this.f479598b));
    }
}

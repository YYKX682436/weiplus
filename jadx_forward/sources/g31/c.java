package g31;

/* loaded from: classes9.dex */
public final class c implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g31.l f349600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349601b;

    public c(g31.l lVar, java.lang.String str) {
        this.f349600a = lVar;
        this.f349601b = str;
    }

    @Override // e31.i
    public void a() {
        g31.e eVar = g31.e.f349607d;
        g31.l lVar = this.f349600a;
        lVar.k(this.f349601b, eVar);
        lVar.r(g31.f.f349608d);
    }

    @Override // e31.i
    public void b(java.lang.String templateId, e31.j result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        g31.l.j(this.f349600a, templateId, result);
    }
}

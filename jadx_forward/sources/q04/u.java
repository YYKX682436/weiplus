package q04;

/* loaded from: classes12.dex */
public final class u extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q04.y f440938d;

    public u(q04.y yVar) {
        this.f440938d = yVar;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        q04.y yVar = this.f440938d;
        if (!yVar.f440943d.isEmpty()) {
            u04.f fVar = yVar.f440944e;
            fVar.f505014b.removeCallbacks(fVar.f505015c);
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        q04.y yVar = this.f440938d;
        if (!yVar.f440943d.isEmpty()) {
            yVar.f440944e.a();
        }
    }
}

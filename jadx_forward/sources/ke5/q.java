package ke5;

/* loaded from: classes9.dex */
public final class q implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f388649a;

    public q(ld5.b model, java.util.List msgInfos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfos, "msgInfos");
        this.f388649a = msgInfos;
    }

    @Override // he5.t
    public int a() {
        return this.f388649a.size();
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s sVar) {
        if (list != null) {
            list.addAll(this.f388649a);
        }
        if (list != null) {
            list.size();
        }
        if (sVar != null) {
            ((hd5.f) sVar).a();
        }
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        java.util.Objects.toString(oVar);
        if (oVar != null) {
            oVar.mo133232x338af3();
        }
    }

    @Override // he5.t
    /* renamed from: close */
    public void mo133462x5a5ddf8() {
    }

    @Override // he5.t
    public long d() {
        return 0L;
    }
}

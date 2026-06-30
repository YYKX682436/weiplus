package fd2;

/* loaded from: classes2.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dq.b f342797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fd2.j f342798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dq.b bVar, fd2.j jVar) {
        super(1);
        this.f342797d = bVar;
        this.f342798e = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            dq.b bVar = this.f342797d;
            if (bVar.a("dislike_edu_tips")) {
                fd2.j jVar = this.f342798e;
                jVar.f342809g = p3325xe03a0797.p3326xc267989b.l.d(jVar.f342810h, null, null, new fd2.c(jVar, bVar, null), 3, null);
            }
        }
        return jz5.f0.f384359a;
    }
}

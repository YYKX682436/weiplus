package wr;

/* loaded from: classes4.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr.j f530270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wr.j jVar) {
        super(0);
        this.f530270d = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.l lVar;
        wr.j jVar = this.f530270d;
        wr.c cVar = jVar.f530285c;
        if (cVar != null && (lVar = cVar.f530269d) != null) {
            lVar.mo146xb9724478(cVar.f530266a);
        }
        jVar.f530284b = false;
        wr.j.a(jVar);
        return jz5.f0.f384359a;
    }
}

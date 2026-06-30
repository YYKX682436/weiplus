package wr;

/* loaded from: classes4.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr.j f530271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f530272e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(wr.j jVar, java.lang.String str) {
        super(0);
        this.f530271d = jVar;
        this.f530272e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.p pVar;
        wr.j jVar = this.f530271d;
        wr.c cVar = jVar.f530285c;
        if (cVar != null && (pVar = cVar.f530268c) != null) {
            pVar.mo149xb9724478(cVar.f530266a, this.f530272e);
        }
        jVar.f530284b = false;
        wr.j.a(jVar);
        return jz5.f0.f384359a;
    }
}

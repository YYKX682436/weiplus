package nd1;

/* loaded from: classes7.dex */
public final class w implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f417944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f417945e;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, yz5.a aVar) {
        this.f417944d = o6Var;
        this.f417945e = aVar;
    }

    @Override // u81.f
    public void D(java.lang.String appId, u81.b state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (u81.b.BACKGROUND == state) {
            this.f417944d.N.c(this);
            this.f417945e.mo152xb9724478();
        }
    }
}

package wr;

/* loaded from: classes4.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr.j f530277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a f530278e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(wr.j jVar, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a aVar) {
        super(0);
        this.f530277d = jVar;
        this.f530278e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wr.c cVar;
        wr.j jVar = this.f530277d;
        java.util.ArrayList arrayList = jVar.f530283a;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a aVar = this.f530278e;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = aVar.f147576b;
        if (interfaceC4987x84e327cb != null) {
            cVar = new wr.c(aVar.f147575a, interfaceC4987x84e327cb);
            cVar.f530269d = aVar.f147578d;
            cVar.f530268c = aVar.f147577c;
        } else {
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6 t6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6.class);
            java.lang.String md52 = aVar.f147575a;
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4 r4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) t6Var;
            r4Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
            cVar = new wr.c(aVar.f147575a, r4Var.Bi(md52, null));
            cVar.f530269d = aVar.f147578d;
            cVar.f530268c = aVar.f147577c;
        }
        arrayList.add(cVar);
        wr.j.a(jVar);
        return jz5.f0.f384359a;
    }
}

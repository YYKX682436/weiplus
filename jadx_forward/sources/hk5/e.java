package hk5;

/* loaded from: classes5.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk5.k f363535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(hk5.k kVar) {
        super(1);
        this.f363535d = kVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s05.d dVar;
        s05.d dVar2;
        s05.d dVar3;
        vg5.a state = (vg5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar4 = state.f379599d;
        if (dVar4 != null && (dVar4 instanceof wg5.e)) {
            hk5.k kVar = this.f363535d;
            kVar.W6().g().setVisibility(8);
            nb5.b bVar = new nb5.b();
            bVar.m126728xdc93280d(state.f518307e);
            v05.b j17 = bVar.j();
            boolean z17 = true;
            if (!((j17 == null || (dVar3 = (s05.d) j17.m75936x14adae67(j17.f513848e + 39)) == null || dVar3.m163514xfb85f7b0() != 1) ? false : true)) {
                java.util.ArrayList arrayList = (java.util.ArrayList) state.f518308f;
                if (arrayList.size() == 1) {
                    java.lang.String str = (java.lang.String) arrayList.get(0);
                    java.lang.String str2 = null;
                    kVar.f363543m = null;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wxid_wi_1d142z0zdj03", str)) {
                        v05.b j18 = bVar.j();
                        java.lang.String m163512x74292566 = (j18 == null || (dVar2 = (s05.d) j18.m75936x14adae67(j18.f513848e + 39)) == null) ? null : dVar2.m163512x74292566();
                        if (m163512x74292566 != null && m163512x74292566.length() != 0) {
                            z17 = false;
                        }
                        if (z17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForwardMsgPreviewAppBrandUIC", "getAndUploadPageContent appId is null");
                        } else {
                            v05.b j19 = bVar.j();
                            if (j19 != null && (dVar = (s05.d) j19.m75936x14adae67(j19.f513848e + 39)) != null) {
                                str2 = dVar.p();
                            }
                            kVar.f363543m = new hk5.c(m163512x74292566, str2);
                            hk5.g gVar = new hk5.g(kVar);
                            kVar.W6().a().setOnClickListener(gVar);
                            kVar.W6().i().setOnClickListener(gVar);
                            kVar.W6().e().c(new hk5.f(gVar));
                        }
                    }
                    if (c01.e2.Z(str)) {
                        kVar.W6().g().setVisibility(0);
                    }
                }
            }
            em.b W6 = kVar.W6();
            if (W6.f335614d == null) {
                W6.f335614d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) W6.f335611a.findViewById(com.p314xaae8f345.mm.R.id.he_);
            }
            W6.f335614d.setOnClickListener(new hk5.d(kVar));
        }
        return jz5.f0.f384359a;
    }
}

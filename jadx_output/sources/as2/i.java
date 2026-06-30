package as2;

/* loaded from: classes2.dex */
public final class i implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ as2.k f13466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13468c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13471f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ as2.h f13472g;

    public i(as2.k kVar, long j17, int i17, long j18, boolean z17, int i18, as2.h hVar) {
        this.f13466a = kVar;
        this.f13467b = j17;
        this.f13468c = i17;
        this.f13469d = j18;
        this.f13470e = z17;
        this.f13471f = i18;
        this.f13472g = hVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.feed.ct ctVar;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        long j17 = this.f13467b;
        as2.k kVar = this.f13466a;
        as2.h hVar = this.f13472g;
        if ((i17 == 0 && fVar.f70616b == 0) || hc2.p.b(i17, fVar.f70616b)) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject != null) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
                com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
                finderContact.setUsername(contact != null ? contact.getUsername() : null);
                com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderObject.getContact();
                finderContact.setNickname(contact2 != null ? contact2.getNickname() : null);
                com.tencent.mm.protocal.protobuf.FinderContact contact3 = finderObject.getContact();
                finderContact.setHeadUrl(contact3 != null ? contact3.getHeadUrl() : null);
                com.tencent.mm.protocal.protobuf.FinderContact contact4 = finderObject.getContact();
                finderContact.setAuthInfo(contact4 != null ? contact4.getAuthInfo() : null);
                com.tencent.mm.protocal.protobuf.FinderContact contact5 = finderObject.getContact();
                finderContact.setExtInfo(contact5 != null ? contact5.getExtInfo() : null);
                ya2.g.m(ya2.h.f460484a, finderContact, false, 2, null);
                com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
                this.f13466a.S6(this.f13467b, this.f13468c, this.f13469d, this.f13470e, this.f13471f);
                if (hVar != null) {
                    r45.en2 place_holder_info = a17.getFinderObject().getPlace_holder_info();
                    com.tencent.mm.plugin.finder.feed.pz pzVar = ((com.tencent.mm.plugin.finder.feed.zy) hVar).f111309a;
                    if (place_holder_info == null && (ctVar = pzVar.f108759m) != null) {
                        ((com.tencent.mm.plugin.finder.feed.v00) ctVar).q(false);
                    }
                    if (pzVar.C.getDataList().size() != 0) {
                        return f0Var;
                    }
                    com.tencent.mars.xlog.Log.i(pzVar.U, "preloadCallback data list size = 0 feedId=" + a17.getId());
                    pzVar.C.getDataList().add(cu2.u.f222441a.p(a17));
                    com.tencent.mm.plugin.finder.feed.ct ctVar2 = pzVar.f108759m;
                    if (ctVar2 == null || (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar2).getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
                        return f0Var;
                    }
                    adapter.notifyDataSetChanged();
                    return f0Var;
                }
            } else {
                this.f13466a.S6(this.f13467b, this.f13468c, this.f13469d, this.f13470e, this.f13471f);
                kVar.getClass();
                bu2.j.f24534a.l(j17);
                if (hVar != null) {
                    return f0Var;
                }
            }
        } else {
            this.f13466a.S6(this.f13467b, this.f13468c, this.f13469d, this.f13470e, this.f13471f);
            kVar.getClass();
            bu2.j.f24534a.l(j17);
            if (hVar != null) {
                return f0Var;
            }
        }
        return null;
    }
}

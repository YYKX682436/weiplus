package eq1;

/* loaded from: classes11.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f337323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f337325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p944x882e457a.f fVar, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f337323d = fVar;
        this.f337324e = str;
        this.f337325f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f337323d;
        if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2)) != null) {
            eq1.h hVar = eq1.h.f337345a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "it.resp.feedObject != null");
            java.lang.Object obj = eq1.h.f337347c;
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) obj).put(this.f337324e, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2));
        }
        yz5.l lVar = this.f337325f;
        if (lVar != null) {
            lVar.mo146xb9724478((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2));
        }
        return jz5.f0.f384359a;
    }
}

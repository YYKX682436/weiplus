package sv2;

/* loaded from: classes10.dex */
public final class b extends pv2.l {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494785e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f494786f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        super("draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f494785e = draftItem;
        this.f494786f = "Finder.FinderDraftSuccessStage";
    }

    @Override // pv2.g
    public int a() {
        return 100;
    }

    @Override // pv2.a
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494786f, "succ, localId:" + this.f494785e.f66236x88be67a1);
    }
}

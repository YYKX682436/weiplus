package b33;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iy1.c f17673e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i17, iy1.c cVar) {
        super(1);
        this.f17672d = i17;
        this.f17673e = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.gallery.BaseMediaTabActivity baseMediaTabActivity = (com.tencent.mm.ui.gallery.BaseMediaTabActivity) obj;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Tj(baseMediaTabActivity, 12, 3, false);
        aVar.fk(baseMediaTabActivity, "publish_source_scene", java.lang.Integer.valueOf(this.f17672d));
        aVar.ak(baseMediaTabActivity, this.f17673e);
        return jz5.f0.f302826a;
    }
}

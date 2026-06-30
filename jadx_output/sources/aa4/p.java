package aa4;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview f2677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v94.g f2678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview snsImageBackPreview, v94.g gVar) {
        super(1);
        this.f2677d = snsImageBackPreview;
        this.f2678e = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        v94.i snsCoverReporter;
        v94.i snsCoverReporter2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1");
        android.graphics.Bitmap it = (android.graphics.Bitmap) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1");
        kotlin.jvm.internal.o.g(it, "it");
        pc4.d dVar = pc4.d.f353410a;
        boolean y17 = dVar.y();
        com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview snsImageBackPreview = this.f2677d;
        if (y17) {
            android.view.ViewGroup.LayoutParams layoutParams = com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview.access$getCoverFoldImageView(snsImageBackPreview).getLayoutParams();
            layoutParams.height = com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview.access$getFoldHeight$p(snsImageBackPreview);
            com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview.access$getCoverFoldImageView(snsImageBackPreview).setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview.access$getCoverFoldImageView(snsImageBackPreview).setImageBitmap(it);
        boolean y18 = dVar.y();
        v94.g gVar = this.f2678e;
        if (y18) {
            com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview.access$getCoverFoldImageView(snsImageBackPreview).post(new aa4.o(snsImageBackPreview, gVar));
        }
        v94.k access$getSnsCoverStatusProvider$p = com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview.access$getSnsCoverStatusProvider$p(snsImageBackPreview);
        if (access$getSnsCoverStatusProvider$p != null && (snsCoverReporter2 = access$getSnsCoverStatusProvider$p.getSnsCoverReporter()) != null) {
            ((ba4.a) snsCoverReporter2).d();
        }
        v94.k access$getSnsCoverStatusProvider$p2 = com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview.access$getSnsCoverStatusProvider$p(snsImageBackPreview);
        if (access$getSnsCoverStatusProvider$p2 != null && (snsCoverReporter = access$getSnsCoverStatusProvider$p2.getSnsCoverReporter()) != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.tencent.mm.plugin.sns.storage.x1 x1Var = (com.tencent.mm.plugin.sns.storage.x1) gVar;
            java.lang.Long u07 = x1Var.u0();
            kotlin.jvm.internal.o.f(u07, "getSnsObjId(...)");
            jSONObject.put("snsid", u07.longValue());
            jSONObject.put("url", x1Var.t0());
            jSONObject.put("width", it.getWidth());
            jSONObject.put("height", it.getHeight());
            ((ba4.a) snsCoverReporter).b(jSONObject.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1");
        return f0Var;
    }
}

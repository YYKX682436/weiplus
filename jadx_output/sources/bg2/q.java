package bg2;

/* loaded from: classes2.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20390d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f20391e;

    /* renamed from: f, reason: collision with root package name */
    public int f20392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20393g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20394h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bg2.r f20395i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context, java.lang.String str, bg2.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20393g = context;
        this.f20394h = str;
        this.f20395i = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.q(this.f20393g, this.f20394h, this.f20395i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f20392f;
        android.content.Context context = this.f20393g;
        bg2.r rVar = this.f20395i;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int color = context.getResources().getColor(com.tencent.mm.R.color.f479549ab0);
            java.lang.String str = this.f20394h;
            if (str == null || str.length() == 0) {
                rVar.f20438n = "";
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = rVar.f20436i;
                if (weImageView != null) {
                    weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_call_good, color));
                }
                return jz5.f0.f302826a;
            }
            rVar.f20438n = str;
            this.f20391e = str;
            this.f20390d = color;
            this.f20392f = 1;
            kotlinx.coroutines.r rVar2 = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar2.k();
            v65.n nVar = new v65.n(rVar2);
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f));
            bg2.p pVar = new bg2.p(nVar);
            a17.getClass();
            a17.f447873d = pVar;
            a17.f();
            java.lang.Object j17 = rVar2.j();
            if (j17 == aVar) {
                return aVar;
            }
            i17 = color;
            obj = j17;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f20390d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = rVar.f20436i;
            if (weImageView2 != null) {
                weImageView2.setLayerPaint(null);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = rVar.f20436i;
            if (weImageView3 != null) {
                weImageView3.setImageBitmap(bitmap);
            }
        } else {
            com.tencent.mars.xlog.Log.i("LiveConvertCheerUIController", "updateCheerIcon resource is null!");
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = rVar.f20436i;
            if (weImageView4 != null) {
                weImageView4.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_call_good, i17));
            }
        }
        return jz5.f0.f302826a;
    }
}

package bp4;

/* loaded from: classes2.dex */
public final class l3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f23248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f23250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f23251g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(kotlin.jvm.internal.h0 h0Var, int i17, int i18, android.graphics.Matrix matrix, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f23248d = h0Var;
        this.f23249e = i17;
        this.f23250f = i18;
        this.f23251g = matrix;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bp4.l3(this.f23248d, this.f23249e, this.f23250f, this.f23251g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bp4.l3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.jvm.internal.h0 h0Var = this.f23248d;
        java.lang.Object obj2 = h0Var.f310123d;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        int width = ((android.graphics.Bitmap) obj2).getWidth();
        int i17 = this.f23249e;
        int height = ((android.graphics.Bitmap) h0Var.f310123d).getHeight();
        int i18 = this.f23250f;
        zj0.a aVar2 = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar2.c(java.lang.Boolean.TRUE);
        aVar2.c(this.f23251g);
        aVar2.c(java.lang.Integer.valueOf(i18));
        aVar2.c(java.lang.Integer.valueOf(i17));
        aVar2.c(java.lang.Integer.valueOf((height - i18) / 2));
        aVar2.c(java.lang.Integer.valueOf((width - i17) / 2));
        aVar2.c(bitmap);
        java.lang.Object obj3 = new java.lang.Object();
        yj0.a.d(obj3, aVar2.b(), "com/tencent/mm/plugin/vlog/ui/plugin/ThumbLoadingPlugin$showThumbLoading$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
        yj0.a.e(obj3, createBitmap, "com/tencent/mm/plugin/vlog/ui/plugin/ThumbLoadingPlugin$showThumbLoading$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }
}

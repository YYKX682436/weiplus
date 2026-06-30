package bp4;

/* loaded from: classes2.dex */
public final class l3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f104781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f104782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f104783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f104784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17, int i18, android.graphics.Matrix matrix, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f104781d = h0Var;
        this.f104782e = i17;
        this.f104783f = i18;
        this.f104784g = matrix;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bp4.l3(this.f104781d, this.f104782e, this.f104783f, this.f104784g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bp4.l3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f104781d;
        java.lang.Object obj2 = h0Var.f391656d;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        int width = ((android.graphics.Bitmap) obj2).getWidth();
        int i17 = this.f104782e;
        int height = ((android.graphics.Bitmap) h0Var.f391656d).getHeight();
        int i18 = this.f104783f;
        zj0.a aVar2 = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar2.c(java.lang.Boolean.TRUE);
        aVar2.c(this.f104784g);
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

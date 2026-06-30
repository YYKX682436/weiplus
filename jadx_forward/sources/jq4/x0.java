package jq4;

/* loaded from: classes5.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f382749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f382750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f382751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382752g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f382753h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382754i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.graphics.Bitmap bitmap, jq4.z0 z0Var, android.view.View view, android.widget.ImageView imageView, android.view.View view2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f382750e = bitmap;
        this.f382751f = z0Var;
        this.f382752g = view;
        this.f382753h = imageView;
        this.f382754i = view2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jq4.x0(this.f382750e, this.f382751f, this.f382752g, this.f382753h, this.f382754i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((jq4.x0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f382749d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.graphics.Bitmap bitmap = null;
            android.graphics.Bitmap bitmap2 = this.f382750e;
            if (bitmap2 != null) {
                android.view.View view = this.f382752g;
                int width = view.getWidth();
                int height = view.getHeight();
                this.f382751f.getClass();
                android.graphics.Bitmap m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(width, height, android.graphics.Bitmap.Config.ARGB_8888, false);
                if (m17 != null) {
                    android.graphics.Bitmap X = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.X(bitmap2, 3);
                    if (width > 0 && X != null) {
                        android.graphics.Bitmap k07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(X, X.getWidth(), (height * X.getWidth()) / width, true);
                        android.graphics.Canvas canvas = new android.graphics.Canvas(m17);
                        canvas.drawBitmap(k07, (android.graphics.Rect) null, new android.graphics.Rect(0, 0, canvas.getWidth(), canvas.getHeight()), (android.graphics.Paint) null);
                    }
                    bitmap = m17;
                }
            }
            android.graphics.Bitmap bitmap3 = bitmap;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            jq4.w0 w0Var = new jq4.w0(this.f382753h, this.f382754i, this.f382752g, bitmap3, null);
            this.f382749d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, w0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}

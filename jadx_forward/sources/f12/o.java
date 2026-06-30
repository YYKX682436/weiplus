package f12;

/* loaded from: classes3.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f340185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 f340186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340187f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f21.d0 f340188g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79, java.lang.String str, f21.d0 d0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f340186e = activityC13254xf536ee79;
        this.f340187f = str;
        this.f340188g = d0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new f12.o(this.f340186e, this.f340187f, this.f340188g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((f12.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f340185d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            f12.n nVar = new f12.n(this.f340187f, this.f340188g, null);
            this.f340185d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, nVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79 = this.f340186e;
        f12.c0 c0Var = activityC13254xf536ee79.f178973f;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var.f340112h.setImageBitmap(bitmap);
        if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            f12.c0 c0Var2 = activityC13254xf536ee79.f178973f;
            if (c0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = c0Var2.f340112h.getLayoutParams();
            float width = bitmap.getWidth() / bitmap.getHeight();
            if (activityC13254xf536ee79.f178973f == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            layoutParams.height = (int) (r7.f340112h.getWidth() / width);
            f12.c0 c0Var3 = activityC13254xf536ee79.f178973f;
            if (c0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            c0Var3.f340112h.requestLayout();
        }
        return jz5.f0.f384359a;
    }
}

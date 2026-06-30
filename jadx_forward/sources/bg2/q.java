package bg2;

/* loaded from: classes2.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f101923d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f101924e;

    /* renamed from: f, reason: collision with root package name */
    public int f101925f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f101926g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101927h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bg2.r f101928i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context, java.lang.String str, bg2.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101926g = context;
        this.f101927h = str;
        this.f101928i = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.q(this.f101926g, this.f101927h, this.f101928i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f101925f;
        android.content.Context context = this.f101926g;
        bg2.r rVar = this.f101928i;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0);
            java.lang.String str = this.f101927h;
            if (str == null || str.length() == 0) {
                rVar.f101971n = "";
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = rVar.f101969i;
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79655x5636c5e6, color));
                }
                return jz5.f0.f384359a;
            }
            rVar.f101971n = str;
            this.f101924e = str;
            this.f101923d = color;
            this.f101925f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar2 = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar2.k();
            v65.n nVar = new v65.n(rVar2);
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
            bg2.p pVar = new bg2.p(nVar);
            a17.getClass();
            a17.f529406d = pVar;
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
            i17 = this.f101923d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = rVar.f101969i;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setLayerPaint(null);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = rVar.f101969i;
            if (c22699x3dcdb3523 != null) {
                c22699x3dcdb3523.setImageBitmap(bitmap);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertCheerUIController", "updateCheerIcon resource is null!");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = rVar.f101969i;
            if (c22699x3dcdb3524 != null) {
                c22699x3dcdb3524.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79655x5636c5e6, i17));
            }
        }
        return jz5.f0.f384359a;
    }
}

package f32;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 f340824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f340825e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 c13407x91e79130, int i17) {
        super(0);
        this.f340824d = c13407x91e79130;
        this.f340825e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 c13407x91e79130 = this.f340824d;
        d32.t tVar = c13407x91e79130.E;
        tVar.getClass();
        android.graphics.Rect previewRect = c13407x91e79130.H;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewRect, "previewRect");
        int i17 = tVar.f307725t;
        int i18 = this.f340825e;
        if (i17 != i18) {
            tVar.f307725t = i18;
            tVar.B.set(previewRect);
            os0.a aVar = tVar.f307726u;
            if (aVar != null) {
                aVar.n();
            }
            d32.s sVar = tVar.f307727v;
            if (sVar != null) {
                sVar.n();
            }
            is0.c cVar = tVar.f307730y;
            if (cVar != null) {
                cVar.close();
            }
            tVar.w();
            tVar.f412484g = tVar.f();
            os0.a aVar2 = tVar.f307726u;
            if (aVar2 != null) {
                aVar2.w(tVar.f412478a, tVar.f412479b);
            }
            os0.a aVar3 = tVar.f307726u;
            if (aVar3 != null) {
                aVar3.u(tVar.f307731z, tVar.A);
            }
            os0.a aVar4 = tVar.f307726u;
            if (aVar4 != null) {
                aVar4.f429538n = tVar.f412491n;
            }
            if (aVar4 != null) {
                aVar4.f429540p = tVar.f412492o;
            }
            d32.s sVar2 = tVar.f307727v;
            if (sVar2 != null) {
                sVar2.w(tVar.f307731z, tVar.A);
            }
            d32.s sVar3 = tVar.f307727v;
            if (sVar3 != null) {
                sVar3.u(tVar.f412480c, tVar.f412481d);
            }
            tVar.v();
        }
        pm0.v.X(new f32.e(c13407x91e79130));
        return jz5.f0.f384359a;
    }
}

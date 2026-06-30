package iv0;

/* loaded from: classes5.dex */
public final class i implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv0.w f376603d;

    public i(iv0.w wVar) {
        this.f376603d = wVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ou0.g gVar = (ou0.g) obj;
        iv0.w wVar = this.f376603d;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 k76 = iv0.w.k7(wVar);
        if (k76 != null) {
            yw0.g gVar2 = wVar.f376635z;
            if (gVar2 != null) {
                android.graphics.PointF o07 = k76.o0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o07, "getLayerScale(...)");
                gVar2.f(o07);
            }
            yw0.g gVar3 = wVar.f376635z;
            if (gVar3 != null) {
                android.graphics.PointF l07 = k76.l0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l07, "getLayerNormalizedPosition(...)");
                gVar3.e(l07);
            }
            yw0.g gVar4 = wVar.f376635z;
            if (gVar4 != null) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 o17 = k76.o1();
                gVar4.f548076d = java.lang.Float.valueOf(o17 != null ? (float) o17.f129896b : 0.5625f);
                ((yw0.l) gVar4.f548120a).a();
            }
        }
        rv0.n1 n1Var = (rv0.n1) ((jz5.n) wVar.f376630u).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
        n1Var.v7(gVar);
    }
}

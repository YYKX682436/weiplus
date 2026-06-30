package uj0;

/* loaded from: classes15.dex */
public class c implements rj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rj0.b f509717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p786x600aa8b.ui.C10726x5870354e f509718b;

    public c(com.p314xaae8f345.mm.p786x600aa8b.ui.C10726x5870354e c10726x5870354e, rj0.b bVar) {
        this.f509718b = c10726x5870354e;
        this.f509717a = bVar;
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onImageLoadError */
    public void mo15805x5cb2b166(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
        com.p314xaae8f345.mm.p786x600aa8b.ui.C10726x5870354e c10726x5870354e = this.f509718b;
        if (c10726x5870354e.f149758q != null) {
            c10726x5870354e.q(c1434xa197a886.f4423xa7c470f2);
            c10726x5870354e.f149762u = true;
            c10726x5870354e.u();
        }
        rj0.b bVar = this.f509717a;
        if (bVar != null) {
            bVar.mo15805x5cb2b166(c1434xa197a886);
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onImageLoaded */
    public void mo15806x91f79de1(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p786x600aa8b.ui.C10726x5870354e c10726x5870354e = this.f509718b;
        if (c10726x5870354e.f149750f != null && c10726x5870354e.f149758q != null && c10726x5870354e.f149760s) {
            c10726x5870354e.q(0);
            c10726x5870354e.f149762u = true;
            c10726x5870354e.u();
        }
        rj0.b bVar = this.f509717a;
        if (bVar != null) {
            bVar.mo15806x91f79de1(bitmap);
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewLoadError */
    public void mo15807xaf7fedd9(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
        com.p314xaae8f345.mm.p786x600aa8b.ui.C10726x5870354e c10726x5870354e = this.f509718b;
        if (c10726x5870354e.f149757p != null) {
            c10726x5870354e.s(c1434xa197a886.f4423xa7c470f2);
            c10726x5870354e.f149761t = true;
            c10726x5870354e.u();
        }
        rj0.b bVar = this.f509717a;
        if (bVar != null) {
            bVar.mo15807xaf7fedd9(c1434xa197a886);
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewLoaded */
    public void mo15808x3c79ee4e() {
        com.p314xaae8f345.mm.p786x600aa8b.ui.C10726x5870354e c10726x5870354e = this.f509718b;
        if (c10726x5870354e.f149750f != null && c10726x5870354e.f149757p != null && c10726x5870354e.f149759r) {
            c10726x5870354e.s(0);
            c10726x5870354e.f149757p.f501216h = 0;
            c10726x5870354e.f149761t = true;
            c10726x5870354e.u();
        }
        rj0.b bVar = this.f509717a;
        if (bVar != null) {
            bVar.mo15808x3c79ee4e();
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewReleased */
    public void mo15809x76d22946() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxBaseImageView", "onPreviewReleased");
        rj0.b bVar = this.f509717a;
        if (bVar != null) {
            bVar.mo15809x76d22946();
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onReady */
    public void mo15810xb03baf04() {
        rj0.b bVar = this.f509717a;
        if (bVar != null) {
            bVar.mo15810xb03baf04();
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onTileLoadError */
    public void mo15811x68961215(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
        com.p314xaae8f345.mm.p786x600aa8b.ui.C10726x5870354e c10726x5870354e = this.f509718b;
        if (c10726x5870354e.f149758q != null) {
            c10726x5870354e.q(c1434xa197a886.f4423xa7c470f2);
            c10726x5870354e.f149762u = true;
            c10726x5870354e.u();
        }
        rj0.b bVar = this.f509717a;
        if (bVar != null) {
            bVar.mo15811x68961215(c1434xa197a886);
        }
    }
}

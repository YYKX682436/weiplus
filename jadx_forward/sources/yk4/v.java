package yk4;

/* loaded from: classes10.dex */
public final class v implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c f544390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f544391e;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c, yz5.a aVar) {
        this.f544390d = c18713x3be2dc6c;
        this.f544391e = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        this.f544390d.m72080x14cd10dd().removeOnLayoutChangeListener(this);
        this.f544391e.mo152xb9724478();
    }
}

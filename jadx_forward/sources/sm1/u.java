package sm1;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 f490870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f490871e;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7, yz5.a aVar) {
        this.f490870d = c12827x691a1aa7;
        this.f490871e = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        this.f490870d.m53852x14cd10dd().removeOnLayoutChangeListener(this);
        this.f490871e.mo152xb9724478();
    }
}

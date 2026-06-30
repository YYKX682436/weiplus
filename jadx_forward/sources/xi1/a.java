package xi1;

/* loaded from: classes7.dex */
public class a implements xi1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xi1.b f536219a;

    public a(xi1.b bVar) {
        this.f536219a = bVar;
    }

    @Override // xi1.k
    public android.view.ViewGroup a(android.view.View view) {
        xi1.g gVar = this.f536219a.f536221b;
        android.app.Activity w17 = gVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) gVar).w() : null;
        return w17 == null ? (android.view.ViewGroup) view.getRootView() : (android.view.ViewGroup) w17.getWindow().getDecorView();
    }
}

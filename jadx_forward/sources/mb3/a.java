package mb3;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f406884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f406885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mb3.d f406886f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d f406887g;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d abstractActivityC16322x2b9a639d, java.lang.Class cls, android.content.Intent intent, mb3.d dVar) {
        this.f406887g = abstractActivityC16322x2b9a639d;
        this.f406884d = cls;
        this.f406885e = intent;
        this.f406886f = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f406887g.T6(this.f406884d, this.f406885e, this.f406886f);
    }
}

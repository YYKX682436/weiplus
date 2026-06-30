package r02;

/* loaded from: classes8.dex */
public class b implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f449819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r02.c f449820b;

    public b(r02.c cVar, android.os.Bundle bundle) {
        this.f449820b = cVar;
        this.f449819a = bundle;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BottomEntranceView", "OpenLiteApp fail");
        r02.c cVar = this.f449820b;
        java.lang.String str = cVar.f449823d.f178890d.f119131e;
        android.os.Bundle bundle = this.f449819a;
        bundle.putString("rawUrl", str);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Bi(cVar.f449823d.getContext(), bundle);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BottomEntranceView", "OpenLiteApp success");
    }
}

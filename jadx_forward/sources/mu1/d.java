package mu1;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mu1.e f412877d;

    public d(mu1.e eVar) {
        this.f412877d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mu1.e eVar = this.f412877d;
        int B = (i65.a.B(eVar.f412868b) - i65.a.h(eVar.f412868b, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn)) - i65.a.h(eVar.f412868b, com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        if (eVar.f412870d.isShown()) {
            B -= i65.a.b(eVar.f412868b, 48);
        }
        if (eVar.f412888q.isShown()) {
            B -= eVar.f412888q.getWidth();
        }
        if (eVar.f412885n.isShown()) {
            B -= i65.a.b(eVar.f412868b, 20);
        }
        if (B > 0) {
            eVar.f412871e.setMaxWidth(B);
        }
    }
}

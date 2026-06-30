package v61;

/* loaded from: classes12.dex */
public class k implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v61.n f514985d;

    public k(v61.n nVar) {
        this.f514985d = nVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DoInit", "do init canceled");
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        v61.n nVar = this.f514985d;
        d17.d(nVar.f514997g);
        ((w11.k0) nVar.f514997g).getClass();
        gm0.j1.d().q(139, nVar);
    }
}

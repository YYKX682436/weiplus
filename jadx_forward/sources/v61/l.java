package v61;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f514988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v61.n f514989e;

    public l(v61.n nVar, int i17) {
        this.f514989e = nVar;
        this.f514988d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        v61.n nVar = this.f514989e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = nVar.f514996f;
        if (u3Var != null) {
            u3Var.setMessage(nVar.f514995e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572002vy) + this.f514988d + "%");
        }
    }
}

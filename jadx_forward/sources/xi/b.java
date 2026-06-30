package xi;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj.a f536181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xi.e f536182e;

    public b(xi.e eVar, bj.a aVar) {
        this.f536182e = eVar;
        this.f536181d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        xi.e eVar = this.f536182e;
        android.widget.Toast toast = new android.widget.Toast(eVar.f536184a);
        toast.setDuration(1);
        toast.setGravity(16, 0, 0);
        toast.setView(android.view.LayoutInflater.from(eVar.f536184a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cgq, (android.view.ViewGroup) null));
        toast.show();
        android.os.Looper.myQueue().addIdleHandler(new xi.a(this, toast));
    }
}

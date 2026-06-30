package k14;

/* loaded from: classes15.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.k f384875d;

    public j(k14.k kVar) {
        this.f384875d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckFinderManagerSwithFun", "startShowLoading");
        k14.k kVar = this.f384875d;
        android.content.Context context = kVar.f384877e;
        kVar.f384878f = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), kVar.f384877e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), true, true, new k14.i(this));
    }
}

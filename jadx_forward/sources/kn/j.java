package kn;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kn.l f390944d;

    public j(kn.l lVar) {
        this.f390944d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckFinderManagerSwithFun", "startShowLoading");
        kn.l lVar = this.f390944d;
        android.content.Context context = lVar.f390946e;
        lVar.f390947f = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), lVar.f390946e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4v), true, true, new kn.i(this));
    }
}

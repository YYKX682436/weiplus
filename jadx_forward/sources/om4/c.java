package om4;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ om4.e f427946d;

    public c(om4.e eVar) {
        this.f427946d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckFinderManagerSwithFun", "startShowLoading");
        om4.e eVar = this.f427946d;
        android.content.Context context = eVar.f427948e;
        eVar.f427949f = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), eVar.f427948e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), true, true, new om4.b(this));
    }
}

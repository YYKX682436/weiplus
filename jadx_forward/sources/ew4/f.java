package ew4;

/* loaded from: classes.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ew4.g f338612d;

    public f(ew4.g gVar) {
        this.f338612d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ew4.g gVar = this.f338612d;
        gVar.getClass();
        gVar.m145253xb158737d("WebViewHistory", "delete from WebViewHistory where  timeStamp < " + ((java.lang.System.currentTimeMillis() / 1000) - 604800));
        int mo78086x7444f759 = gVar.mo78086x7444f759() + (-500);
        if (mo78086x7444f759 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewHistoryStorage", "deleteItem: " + gVar.m145253xb158737d("WebViewHistory", "delete from WebViewHistory order by timeStamp limit " + mo78086x7444f759));
        }
    }
}

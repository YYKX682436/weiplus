package ln1;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln1.k f401309d;

    public j(ln1.k kVar) {
        this.f401309d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ln1.l lVar;
        ln1.k kVar = this.f401309d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCalculator", "run: isCalculatorCancel:%s callbackConvForChoose:%s", java.lang.Boolean.valueOf(kVar.f401312f.f401298a), kVar.f401310d);
        if (kVar.f401312f.f401298a || (lVar = kVar.f401310d) == null) {
            return;
        }
        lVar.s2(kVar.f401311e);
    }
}

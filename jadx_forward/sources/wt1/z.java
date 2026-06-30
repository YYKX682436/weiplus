package wt1;

/* loaded from: classes8.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f530902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f530903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f530904f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f530905g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wt1.c0 f530906h;

    public z(wt1.c0 c0Var, java.lang.String str, int i17, int i18, int i19) {
        this.f530906h = c0Var;
        this.f530902d = str;
        this.f530903e = i17;
        this.f530904f = i18;
        this.f530905g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        wt1.c0 c0Var = this.f530906h;
        java.lang.String str = this.f530902d;
        c0Var.c(str, this.f530903e, this.f530904f, this.f530905g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "run the unmark task, the card is " + str + " system.time:" + java.lang.System.currentTimeMillis());
    }
}

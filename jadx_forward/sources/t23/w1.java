package t23;

/* loaded from: classes10.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f496819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f496820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t23.x1 f496821g;

    public w1(t23.x1 x1Var, java.lang.String str, int i17, long j17) {
        this.f496821g = x1Var;
        this.f496818d = str;
        this.f496819e = i17;
        this.f496820f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        t23.x1 x1Var = this.f496821g;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaQueryService", "queryMediaItemsInAlbum Begin...");
            x1Var.f496829e.a(this.f496818d, this.f496819e, new t23.v1(this), this.f496820f);
        } catch (java.lang.SecurityException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaQueryService", e17, "", new java.lang.Object[0]);
            t23.x1.a(x1Var, new java.util.LinkedList(), this.f496820f, false);
        }
    }

    /* renamed from: toString */
    public java.lang.String m165774x9616526c() {
        return super.toString() + "|queryMediaInAlbums";
    }
}

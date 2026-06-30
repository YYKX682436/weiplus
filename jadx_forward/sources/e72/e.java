package e72;

/* loaded from: classes14.dex */
public class e {

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f331423j = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.h().concat("/fdv_v_");

    /* renamed from: d, reason: collision with root package name */
    public tl.w f331427d;

    /* renamed from: e, reason: collision with root package name */
    public yl.b f331428e;

    /* renamed from: a, reason: collision with root package name */
    public e72.d f331424a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f331425b = false;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f331426c = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f331429f = new java.util.ArrayList(5);

    /* renamed from: g, reason: collision with root package name */
    public int f331430g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final tl.v f331431h = new e72.a(this);

    /* renamed from: i, reason: collision with root package name */
    public final tl.v f331432i = new e72.b(this);

    static {
        fp.m.b().getAbsolutePath();
    }

    public void a(tl.c cVar) {
        synchronized (this.f331429f) {
            this.f331429f.add(cVar);
        }
    }

    public void b() {
        this.f331425b = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceVoiceRecordLogic", "hy: face start reset");
        synchronized (this) {
            tl.w wVar = this.f331427d;
            if (wVar != null) {
                wVar.l();
                this.f331427d = null;
            }
            yl.b bVar = this.f331428e;
            if (bVar != null) {
                bVar.d();
                this.f331428e = null;
            }
        }
    }
}

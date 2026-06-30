package m93;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m93.h f406551f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f406552g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m93.i f406553h;

    public b(m93.i iVar, java.lang.String str, int i17, m93.h hVar, boolean z17) {
        this.f406553h = iVar;
        this.f406549d = str;
        this.f406550e = i17;
        this.f406551f = hVar;
        this.f406552g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f406549d;
        sb6.append(str);
        sb6.append("_");
        int i17 = this.f406550e;
        sb6.append(java.lang.Integer.toString(i17));
        java.lang.String sb7 = sb6.toString();
        m93.i iVar = this.f406553h;
        boolean containsKey = ((java.util.concurrent.ConcurrentHashMap) iVar.f406572e).containsKey(sb7);
        m93.h hVar = this.f406551f;
        if (containsKey) {
            hVar.b(((m93.f) ((java.util.concurrent.ConcurrentHashMap) iVar.f406572e).get(sb7)).f406563a);
        } else {
            iVar.a(str, this.f406552g, i17, hVar);
        }
    }
}

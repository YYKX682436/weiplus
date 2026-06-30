package xp1;

/* loaded from: classes11.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xp1.p f537419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f537420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f537421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f537422g;

    public i(xp1.p pVar, android.content.Context context, android.util.Pair pair, boolean z17) {
        this.f537419d = pVar;
        this.f537420e = context;
        this.f537421f = pair;
        this.f537422g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            cr3.d0 d0Var = ((cr3.m) this.f537419d).f303490a;
            xp1.c.c(d0Var.f303464d, d0Var.f303465e.d1(), true);
            android.content.Context context = this.f537420e;
            android.util.Pair pair = this.f537421f;
            xp1.d.h(context, ((java.lang.Integer) pair.first).intValue(), ((java.lang.Integer) pair.second).intValue(), this.f537422g, null, false);
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShortcutUtil", e17.toString());
        }
    }
}

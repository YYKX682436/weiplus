package no3;

/* loaded from: classes11.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f420286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f420287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f420288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f420289g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ no3.g f420290h;

    public f(no3.g gVar, int i17, boolean z17, int i18, java.util.Map map) {
        this.f420290h = gVar;
        this.f420286d = i17;
        this.f420287e = z17;
        this.f420288f = i18;
        this.f420289g = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f420286d;
        if (i17 >= 0) {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).getClass();
            com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.h0.d(i17);
        }
        int i18 = this.f420288f;
        boolean z17 = this.f420287e;
        if (!z17) {
            c01.m8 f17 = c01.d9.f();
            java.lang.String str = this.f420290h.f420291d;
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) f17).getClass();
            com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.h0.e(str, i18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationObserver", "NotificationObserver refresh total badge count: %d, and talker badge count: %d, talker is mute: %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
        s75.d.f486168a.a(new no3.e(this), "NotificationObserver", false);
    }
}

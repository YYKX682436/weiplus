package ek2;

/* loaded from: classes3.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d81 f335005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f335006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f335007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f335008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f335009h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f335010i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f335011m;

    public i3(r45.d81 d81Var, int i17, int i18, int i19, yz5.p pVar, int i27, int i28) {
        this.f335005d = d81Var;
        this.f335006e = i17;
        this.f335007f = i18;
        this.f335008g = i19;
        this.f335009h = pVar;
        this.f335010i = i27;
        this.f335011m = i28;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f335011m;
        int i18 = this.f335010i;
        yz5.p pVar = this.f335009h;
        try {
            try {
                ek2.k3.a(ek2.k3.f335025a, this.f335005d, this.f335006e, this.f335007f, this.f335008g);
                if (pVar == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveGiftListResultProcessor", "Error processing live gift list result", e17);
                if (pVar == null) {
                    return;
                }
            }
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        } catch (java.lang.Throwable th6) {
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            }
            throw th6;
        }
    }
}

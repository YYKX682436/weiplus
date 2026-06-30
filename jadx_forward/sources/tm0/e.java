package tm0;

/* loaded from: classes8.dex */
public final class e implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: e, reason: collision with root package name */
    public boolean f501992e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f501993f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f501994g;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f501991d = jz5.h.b(tm0.d.f501990d);

    /* renamed from: h, reason: collision with root package name */
    public final i75.a f501995h = new i75.a(this);

    public final tm0.c a() {
        return (tm0.c) ((jz5.n) this.f501991d).mo141623x754a37bb();
    }

    public final boolean b() {
        ((com.p314xaae8f345.mm.ui.a9) ((hh5.e) i95.n0.c(hh5.e.class))).getClass();
        return com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78442x336b58a0() == 2;
    }

    public final void c(boolean z17) {
        boolean z18 = this.f501994g;
        if (z18 && !z17) {
            this.f501994g = false;
            a().mo127124xc2079749(kz5.b0.c(new tm0.a(tm0.b.f501988n, this)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreTabStateOwner", "OnTabFromExposeToUnExpose");
        } else {
            if (z18 || !z17) {
                return;
            }
            this.f501994g = true;
            a().mo127124xc2079749(kz5.b0.c(new tm0.a(tm0.b.f501987m, this)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreTabStateOwner", "OnTabFromUnExposeToExpose");
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f501995h;
    }
}

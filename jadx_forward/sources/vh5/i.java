package vh5;

/* loaded from: classes10.dex */
public final class i implements sy3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mg3.b f518751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vh5.q f518752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f518753c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh5.k f518754d;

    public i(mg3.b bVar, vh5.q qVar, int i17, vh5.k kVar) {
        this.f518751a = bVar;
        this.f518752b = qVar;
        this.f518753c = i17;
        this.f518754d = kVar;
    }

    @Override // sy3.a
    public void a(float f17, float f18, float f19) {
        mg3.b bVar = this.f518751a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.ChatXGestureAdapter", "zoomTo currentScale:" + bVar.mo66618xfd74f284() + " targetScale" + f17);
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(0L, 0L, 0, f18, f19, 0);
        mg3.c cVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) bVar).D1;
        if (cVar != null) {
            cVar.onDoubleTap(obtain);
        }
    }

    @Override // sy3.a
    public float b(float f17, float f18) {
        mg3.b bVar = this.f518751a;
        float mo66618xfd74f284 = bVar.mo66618xfd74f284();
        float mo66621x560f951d = bVar.mo66621x560f951d();
        float f19 = 100;
        int i17 = (int) (mo66618xfd74f284 * f19);
        int i18 = (int) (f19 * mo66621x560f951d);
        float f27 = java.lang.Math.abs(i17 - i18) <= 10 ? 2.0f : mo66621x560f951d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.ChatXGestureAdapter", "doubleTabZoom curScale:" + mo66618xfd74f284 + '(' + i17 + "%) minScale:" + mo66621x560f951d + '(' + i18 + "%) targetScale:" + f27 + " threshold:10");
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(0L, 0L, 0, f17, f18, 0);
        mg3.c cVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) bVar).D1;
        if (cVar != null) {
            cVar.onDoubleTap(obtain);
        }
        return f27;
    }

    @Override // sy3.a
    public float c() {
        return 1.0f;
    }

    @Override // sy3.a
    public float d() {
        return this.f518751a.mo66618xfd74f284();
    }

    @Override // sy3.a
    /* renamed from: dispatchTouchEvent */
    public boolean mo144663xb864a2b5(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        vh5.k kVar = this.f518754d;
        kVar.getClass();
        return kVar.f518758b.dispatchTouchEvent(motionEvent);
    }

    @Override // sy3.a
    public void e(sy3.b bVar) {
        mg3.b bVar2 = this.f518751a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 c16501x5a606100 = bVar2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) bVar2 : null;
        if (c16501x5a606100 == null) {
            return;
        }
        c16501x5a606100.m66627xf9f1f85f(new vh5.h(bVar));
    }

    @Override // sy3.a
    public void f() {
        vh5.q qVar = this.f518752b;
        if (qVar != null) {
            qVar.c(this.f518753c, new wh5.i0(true));
        }
    }

    @Override // sy3.a
    /* renamed from: reset */
    public void mo144664x6761d4f() {
        vh5.q qVar = this.f518752b;
        if (qVar != null) {
            qVar.c(this.f518753c, new wh5.i0(false));
        }
    }
}

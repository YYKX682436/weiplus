package pn0;

/* loaded from: classes14.dex */
public abstract class a implements pn0.b {

    /* renamed from: e, reason: collision with root package name */
    public int f438474e;

    /* renamed from: f, reason: collision with root package name */
    public int f438475f;

    /* renamed from: g, reason: collision with root package name */
    public int f438476g;

    /* renamed from: j, reason: collision with root package name */
    public final nn0.o f438479j;

    /* renamed from: a, reason: collision with root package name */
    public int f438470a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f438471b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f438472c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f438473d = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f438477h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f438478i = false;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf f438480k = null;

    public a(nn0.o oVar) {
        this.f438479j = null;
        this.f438479j = oVar;
    }

    @Override // pn0.b
    public void B(boolean z17) {
    }

    @Override // pn0.b
    public boolean a(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        return true;
    }

    @Override // pn0.b
    public void b(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f438480k = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
    }

    @Override // pn0.b
    public void c(int i17, int i18) {
        if (this.f438472c == i17 && this.f438473d == i18) {
            return;
        }
        this.f438472c = i17;
        this.f438473d = i18;
    }

    public boolean d() {
        return mo158745xcf572877() != null && mo158745xcf572877().isValid();
    }

    @Override // pn0.b
    /* renamed from: release */
    public void mo158742x41012807() {
    }

    @Override // pn0.b
    /* renamed from: setRenderMode */
    public void mo158743x638e3a5b(int i17) {
        this.f438475f = i17;
    }

    @Override // pn0.b
    /* renamed from: setRenderRotation */
    public void mo158744x4594f436(int i17) {
        this.f438476g = i17;
    }

    @Override // pn0.b
    public void u(int i17, int i18) {
        if (i17 == this.f438470a && i18 == this.f438471b) {
            return;
        }
        this.f438470a = i17;
        this.f438471b = i18;
    }
}

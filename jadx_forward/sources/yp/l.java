package yp;

/* loaded from: classes10.dex */
public class l implements yp.j, yp.k {

    /* renamed from: d, reason: collision with root package name */
    public boolean f545917d;

    /* renamed from: e, reason: collision with root package name */
    public yp.i f545918e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p672x55b6590f.p673xc84b4196.C10429x362d5b9d f545919f;

    public l(com.p314xaae8f345.mm.p672x55b6590f.p673xc84b4196.C10429x362d5b9d c10429x362d5b9d) {
        this.f545919f = c10429x362d5b9d;
        c10429x362d5b9d.f146405d = this;
    }

    @Override // yp.j
    public void a(yp.i iVar) {
        this.f545918e = iVar;
    }

    @Override // yp.j
    public float b() {
        return this.f545919f.getY();
    }

    @Override // yp.j
    /* renamed from: getView */
    public android.view.View mo177446xfb86a31b() {
        return this.f545919f;
    }

    @Override // yp.j
    /* renamed from: lockCanvas */
    public android.graphics.Canvas mo177447x18d65a63() {
        return null;
    }

    @Override // yp.j
    /* renamed from: setOnTouchListener */
    public void mo177448xcc7da8b2(android.view.View.OnTouchListener onTouchListener) {
        this.f545919f.setOnTouchListener(onTouchListener);
    }

    @Override // yp.j
    /* renamed from: unlock */
    public void mo177449xcde7df44() {
    }

    @Override // yp.j
    /* renamed from: unlockCanvasAndPost */
    public void mo177450x65a3f1bb(android.graphics.Canvas canvas) {
    }
}

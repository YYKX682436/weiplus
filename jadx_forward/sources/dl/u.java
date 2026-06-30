package dl;

/* loaded from: classes10.dex */
public class u extends dl.b {

    /* renamed from: q, reason: collision with root package name */
    public float f316666q;

    /* renamed from: r, reason: collision with root package name */
    public float f316667r;

    /* renamed from: s, reason: collision with root package name */
    public float f316668s;

    /* renamed from: t, reason: collision with root package name */
    public float f316669t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f316670u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f316671v = false;

    /* renamed from: w, reason: collision with root package name */
    public int f316672w = dn5.c.D[2];

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Path f316673x = new android.graphics.Path();

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f316674y = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final hk0.y f316675z = new hk0.y();
    public boolean A = false;

    @Override // dl.b
    public void A(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DoodleArtist", "forwardUndo >> editId: %s", str);
        hk0.u0 l17 = l();
        if (l17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DoodleArtist", "forwardUndo but model is null");
            return;
        }
        hk0.c c17 = l17.f363351i.c(str);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DoodleArtist", "forwardUndo editData is null");
            return;
        }
        hk0.h hVar = hk0.h.f363274f;
        xk0.d dVar = c17.f363239d;
        if (c17.f363238c != hVar) {
            d().add(dVar);
            E(false);
            return;
        }
        java.util.ArrayList arrayList = c17.f363240e;
        if (arrayList != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DoodleArtist", "onForwardUndo eraser list");
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((um.e) d()).a((xk0.d) it.next());
            }
        } else if (dVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DoodleArtist", "onForwardUndo eraser single");
            ((um.e) d()).a(dVar);
        }
        E(true);
    }

    @Override // dl.b
    public void C() {
        E(true);
    }

    @Override // dl.b
    public dl.a m() {
        return dl.a.DOODLE;
    }

    @Override // dl.b
    public void t() {
        super.t();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DoodleArtist", "DoodleArtist >> onAlive");
        ((l45.n) this.f316572a).k();
        dl.C28231x35bb4c c28231x35bb4c = new dl.C28231x35bb4c(this);
        hk0.y yVar = this.f316675z;
        yVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditEraserHelper", "setDoodleSelectCallback");
        yVar.f363377d = c28231x35bb4c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r3 != 5) goto L83;
     */
    @Override // dl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.u.x(android.view.MotionEvent):boolean");
    }

    @Override // dl.b
    public void y(android.graphics.Canvas canvas) {
        canvas.save();
        canvas.clipRect(this.f316574c);
        v(canvas);
        android.graphics.Path path = this.f316673x;
        if (!path.isEmpty()) {
            new xk0.d(path, ((l45.n) this.f316572a).k() / ((l45.n) this.f316572a).g(), this.f316672w).a(canvas);
        }
        canvas.restore();
    }
}

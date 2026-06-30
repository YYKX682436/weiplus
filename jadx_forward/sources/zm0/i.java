package zm0;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f555653a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f555654b;

    /* renamed from: c, reason: collision with root package name */
    public final zm0.f f555655c;

    /* renamed from: d, reason: collision with root package name */
    public final zm0.c f555656d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f555657e;

    /* renamed from: f, reason: collision with root package name */
    public final zm0.e f555658f = new zm0.e(this);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f555659g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f555660h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final android.view.Choreographer.FrameCallback f555661i = new zm0.h(this);

    /* renamed from: j, reason: collision with root package name */
    public yz5.a f555662j;

    public i(android.content.Context context, android.widget.FrameLayout frameLayout, zm0.f fVar, zm0.c cVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f555653a = context;
        this.f555654b = frameLayout;
        this.f555655c = fVar;
        this.f555656d = cVar;
    }

    public final void a(java.lang.String source, java.util.List bulletList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bulletList, "bulletList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LinearBulletManager", "addBullet: source=" + source + ", bulletSize=" + bulletList.size());
        zm0.e eVar = this.f555658f;
        eVar.getClass();
        eVar.f555639c.addAll(bulletList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a7 A[LOOP:0: B:11:0x0031->B:69:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bb A[EDGE_INSN: B:70:0x02bb->B:71:0x02bb BREAK  A[LOOP:0: B:11:0x0031->B:69:0x02a7], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v11, types: [d92.f] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [zm0.d, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r23) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zm0.i.b(boolean):void");
    }

    public final void c(int i17, zm0.d dVar) {
        android.view.ViewParent parent = dVar.f555636a.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(dVar.f555636a);
        }
        java.util.HashMap hashMap = this.f555659g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(valueOf, obj);
        }
        ((java.util.ArrayList) obj).add(dVar);
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LinearBulletManager", "stop: isStart=" + this.f555657e);
        if (this.f555657e) {
            this.f555657e = false;
            android.view.Choreographer.getInstance().removeFrameCallback(this.f555661i);
        }
    }
}

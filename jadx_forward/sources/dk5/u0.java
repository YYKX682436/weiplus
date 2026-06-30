package dk5;

/* loaded from: classes11.dex */
public class u0 extends com.p314xaae8f345.mm.ui.p2690x38b72420.o4 {

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22566x6f3df1e3 f316454m;

    /* renamed from: n, reason: collision with root package name */
    public p13.c f316455n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f316456o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f316457p;

    /* renamed from: q, reason: collision with root package name */
    public p13.v f316458q;

    /* renamed from: r, reason: collision with root package name */
    public final o13.x f316459r;

    public u0(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22566x6f3df1e3 activityC22566x6f3df1e3, int i17) {
        super(activityC22566x6f3df1e3, false, i17);
        this.f316456o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f316459r = new dk5.t0(this);
        this.f316454m = activityC22566x6f3df1e3;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list;
        p13.v vVar = this.f316458q;
        if (vVar == null || (list = vVar.f432693e) == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar;
        p13.y yVar = (p13.y) this.f316458q.f432693e.get(i17);
        if (yVar.f432720e.equals("no_result\u200b")) {
            dVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.x0(i17);
        } else {
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
            uVar.C = yVar;
            uVar.A = this.f316458q.f432692d;
            uVar.f288369e = this.f288611f;
            uVar.f288388x = true;
            uVar.f288387w = i17 + 1;
            int i18 = yVar.f432717b;
            int i19 = yVar.f432718c;
            uVar.f288386v = i18;
            uVar.f288385u = i19;
            dVar = uVar;
        }
        dVar.f288381q = this.f316457p;
        dVar.f288384t = this.f288613h;
        dVar.f288369e = false;
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void r() {
        if (this.f316455n != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f316455n);
        }
        this.f316457p = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        this.f316457p = str;
        p13.u uVar = new p13.u();
        uVar.f432685n = this.f316456o;
        uVar.f432684m = this.f316459r;
        uVar.f432674c = str;
        uVar.f432683l = r13.b.f450135d;
        uVar.f432678g = new int[]{131072};
        uVar.f432681j.add("filehelper");
        uVar.f432681j.add(c01.z1.r());
        uVar.f432681j.addAll(this.f316454m.F.t());
        uVar.f432681j.addAll(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.c());
        this.f316455n = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }
}

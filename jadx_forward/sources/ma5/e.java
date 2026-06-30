package ma5;

/* loaded from: classes15.dex */
public class e extends ma5.b implements o.f0, o.p {

    /* renamed from: h, reason: collision with root package name */
    public o.r f406769h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f406770i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f406771m;

    /* renamed from: n, reason: collision with root package name */
    public final ma5.d f406772n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f406773o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f406774p;

    public e(android.app.Activity activity, ma5.d dVar) {
        super(activity);
        this.f406774p = new ma5.c(this);
        this.f406772n = dVar;
    }

    @Override // o.f0
    public void a(o.r rVar, boolean z17) {
        ma5.d dVar = this.f406772n;
        if (dVar != null) {
            dVar.a(rVar, z17);
        }
    }

    @Override // o.p
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        ma5.d dVar = this.f406772n;
        if (dVar != null) {
            return dVar.b(rVar, menuItem);
        }
        return false;
    }

    @Override // o.f0
    public boolean c(o.r rVar) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if ((r2 != null && r2.m()) != false) goto L26;
     */
    @Override // o.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(o.r r6) {
        /*
            r5 = this;
            androidx.appcompat.app.b r0 = r5.f406765e
            r1 = 1
            if (r0 == 0) goto L52
            ma5.k r0 = (ma5.k) r0
            androidx.appcompat.widget.x0 r0 = r0.f406790e
            if (r0 == 0) goto L52
            androidx.appcompat.widget.z2 r0 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) r0
            androidx.appcompat.widget.Toolbar r2 = r0.f91280a
            int r3 = r2.getVisibility()
            r4 = 0
            if (r3 != 0) goto L20
            androidx.appcompat.widget.ActionMenuView r2 = r2.f91011d
            if (r2 == 0) goto L20
            boolean r2 = r2.f90872y
            if (r2 == 0) goto L20
            r2 = r1
            goto L21
        L20:
            r2 = r4
        L21:
            if (r2 == 0) goto L52
            androidx.appcompat.widget.Toolbar r6 = r0.f91280a
            androidx.appcompat.widget.ActionMenuView r2 = r6.f91011d
            if (r2 == 0) goto L39
            androidx.appcompat.widget.q r2 = r2.f90873z
            if (r2 == 0) goto L35
            boolean r2 = r2.m()
            if (r2 == 0) goto L35
            r2 = r1
            goto L36
        L35:
            r2 = r4
        L36:
            if (r2 == 0) goto L39
            goto L3a
        L39:
            r1 = r4
        L3a:
            if (r1 == 0) goto L40
            r0.b()
            goto L55
        L40:
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L55
            androidx.appcompat.widget.ActionMenuView r6 = r6.f91011d
            if (r6 == 0) goto L55
            androidx.appcompat.widget.q r6 = r6.f90873z
            if (r6 == 0) goto L55
            r6.o()
            goto L55
        L52:
            r6.c(r1)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ma5.e.d(o.r):void");
    }

    @Override // ma5.b
    public p012xc85e97e9.p016x746ad0e3.app.b e() {
        if (!this.f406771m) {
            this.f406771m = true;
            if (!this.f406773o) {
                this.f406773o = true;
                ((ma5.c) this.f406774p).run();
            }
        }
        if (this.f406765e == null) {
            this.f406765e = new ma5.k(this.f406764d, this.f406770i, null);
        }
        return this.f406765e;
    }
}

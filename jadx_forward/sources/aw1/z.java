package aw1;

/* loaded from: classes12.dex */
public final class z implements aw1.x, com.p314xaae8f345.mm.vfs.l6 {

    /* renamed from: a, reason: collision with root package name */
    public int f96237a;

    /* renamed from: b, reason: collision with root package name */
    public long f96238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f96239c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f96240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f96241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f96242f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f96243g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f96244h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f96245i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f96246j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long[] f96247k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ aw1.w f96248l;

    public z(java.util.Set set, java.util.Set set2, java.util.Set set3, java.util.Set set4, java.util.Set set5, java.util.Set set6, byte[] bArr, long j17, long[] jArr, aw1.w wVar) {
        this.f96239c = set;
        this.f96240d = set2;
        this.f96241e = set3;
        this.f96242f = set4;
        this.f96243g = set5;
        this.f96244h = set6;
        this.f96245i = bArr;
        this.f96246j = j17;
        this.f96247k = jArr;
        this.f96248l = wVar;
    }

    @Override // aw1.x
    public void a(boolean z17) {
        aw1.w wVar = this.f96248l;
        if (wVar != null) {
            wVar.b(z17, this.f96238b, this.f96237a);
        }
    }

    @Override // aw1.x
    public void b(com.p314xaae8f345.mm.vfs.k6 entry) {
        aw1.w wVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "entry");
        com.p314xaae8f345.mm.vfs.x1 x1Var = entry.f294567c;
        boolean z17 = x1Var.f294769f;
        int i17 = entry.f294565a;
        int a17 = aw1.c0.a(i17, z17);
        int i18 = i17 & 4095;
        if (i18 >= 21) {
            i18 = 0;
        }
        byte b17 = this.f96245i[i18];
        boolean z18 = (i17 & 16384) != 0;
        entry.m82423x9616526c();
        if (b17 <= 1 || x1Var.f294768e <= this.f96246j) {
            long[] jArr = this.f96247k;
            java.lang.String str = entry.f294566b;
            if (str != null) {
                java.lang.String relPath = x1Var.f294764a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relPath, "relPath");
                if ((relPath.length() == 0) || this.f96239c.contains(str)) {
                    return;
                }
                if (this.f96240d.contains(str) && !z18) {
                    return;
                }
                if (this.f96241e.contains(str) && z18) {
                    return;
                }
                if (this.f96242f.contains(str) || ((this.f96243g.contains(str) && !z18) || (this.f96244h.contains(str) && z18))) {
                    entry.m82423x9616526c();
                    x1Var.b(false);
                    this.f96237a++;
                    long j17 = this.f96238b;
                    long j18 = x1Var.f294767d;
                    this.f96238b = j17 + j18;
                    jArr[i18] = jArr[i18] + j18;
                    return;
                }
            }
            if (a17 >= b17) {
                entry.m82423x9616526c();
                x1Var.b(false);
                int i19 = this.f96237a + 1;
                this.f96237a = i19;
                long j19 = this.f96238b;
                long j27 = x1Var.f294767d;
                long j28 = j19 + j27;
                this.f96238b = j28;
                jArr[i18] = jArr[i18] + j27;
                if ((i19 & 64) != 0 || (wVar = this.f96248l) == null) {
                    return;
                }
                wVar.a(i19, j28);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.l6
    public boolean c(int i17, java.lang.String str, com.p314xaae8f345.mm.vfs.x1 entry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "entry");
        if (str == null) {
            return true;
        }
        boolean z17 = (i17 & 16384) != 0;
        if (this.f96239c.contains(str)) {
            return false;
        }
        if (this.f96240d.contains(str) && !z17) {
            return false;
        }
        if (this.f96241e.contains(str) && z17) {
            return false;
        }
        if (this.f96242f.contains(str)) {
            return true;
        }
        if (this.f96243g.contains(str) && !z17) {
            return true;
        }
        if (this.f96244h.contains(str) && z17) {
            return true;
        }
        int a17 = aw1.c0.a(i17, false);
        int i18 = i17 & 4095;
        if (i18 >= 21) {
            i18 = 0;
        }
        return a17 >= this.f96245i[i18];
    }
}

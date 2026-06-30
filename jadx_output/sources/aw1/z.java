package aw1;

/* loaded from: classes12.dex */
public final class z implements aw1.x, com.tencent.mm.vfs.l6 {

    /* renamed from: a, reason: collision with root package name */
    public int f14704a;

    /* renamed from: b, reason: collision with root package name */
    public long f14705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f14706c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f14707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f14708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f14709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f14710g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f14711h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f14712i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f14713j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long[] f14714k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ aw1.w f14715l;

    public z(java.util.Set set, java.util.Set set2, java.util.Set set3, java.util.Set set4, java.util.Set set5, java.util.Set set6, byte[] bArr, long j17, long[] jArr, aw1.w wVar) {
        this.f14706c = set;
        this.f14707d = set2;
        this.f14708e = set3;
        this.f14709f = set4;
        this.f14710g = set5;
        this.f14711h = set6;
        this.f14712i = bArr;
        this.f14713j = j17;
        this.f14714k = jArr;
        this.f14715l = wVar;
    }

    @Override // aw1.x
    public void a(boolean z17) {
        aw1.w wVar = this.f14715l;
        if (wVar != null) {
            wVar.b(z17, this.f14705b, this.f14704a);
        }
    }

    @Override // aw1.x
    public void b(com.tencent.mm.vfs.k6 entry) {
        aw1.w wVar;
        kotlin.jvm.internal.o.g(entry, "entry");
        com.tencent.mm.vfs.x1 x1Var = entry.f213034c;
        boolean z17 = x1Var.f213236f;
        int i17 = entry.f213032a;
        int a17 = aw1.c0.a(i17, z17);
        int i18 = i17 & 4095;
        if (i18 >= 21) {
            i18 = 0;
        }
        byte b17 = this.f14712i[i18];
        boolean z18 = (i17 & 16384) != 0;
        entry.toString();
        if (b17 <= 1 || x1Var.f213235e <= this.f14713j) {
            long[] jArr = this.f14714k;
            java.lang.String str = entry.f213033b;
            if (str != null) {
                java.lang.String relPath = x1Var.f213231a;
                kotlin.jvm.internal.o.f(relPath, "relPath");
                if ((relPath.length() == 0) || this.f14706c.contains(str)) {
                    return;
                }
                if (this.f14707d.contains(str) && !z18) {
                    return;
                }
                if (this.f14708e.contains(str) && z18) {
                    return;
                }
                if (this.f14709f.contains(str) || ((this.f14710g.contains(str) && !z18) || (this.f14711h.contains(str) && z18))) {
                    entry.toString();
                    x1Var.b(false);
                    this.f14704a++;
                    long j17 = this.f14705b;
                    long j18 = x1Var.f213234d;
                    this.f14705b = j17 + j18;
                    jArr[i18] = jArr[i18] + j18;
                    return;
                }
            }
            if (a17 >= b17) {
                entry.toString();
                x1Var.b(false);
                int i19 = this.f14704a + 1;
                this.f14704a = i19;
                long j19 = this.f14705b;
                long j27 = x1Var.f213234d;
                long j28 = j19 + j27;
                this.f14705b = j28;
                jArr[i18] = jArr[i18] + j27;
                if ((i19 & 64) != 0 || (wVar = this.f14715l) == null) {
                    return;
                }
                wVar.a(i19, j28);
            }
        }
    }

    @Override // com.tencent.mm.vfs.l6
    public boolean c(int i17, java.lang.String str, com.tencent.mm.vfs.x1 entry) {
        kotlin.jvm.internal.o.g(entry, "entry");
        if (str == null) {
            return true;
        }
        boolean z17 = (i17 & 16384) != 0;
        if (this.f14706c.contains(str)) {
            return false;
        }
        if (this.f14707d.contains(str) && !z17) {
            return false;
        }
        if (this.f14708e.contains(str) && z17) {
            return false;
        }
        if (this.f14709f.contains(str)) {
            return true;
        }
        if (this.f14710g.contains(str) && !z17) {
            return true;
        }
        if (this.f14711h.contains(str) && z17) {
            return true;
        }
        int a17 = aw1.c0.a(i17, false);
        int i18 = i17 & 4095;
        if (i18 >= 21) {
            i18 = 0;
        }
        return a17 >= this.f14712i[i18];
    }
}

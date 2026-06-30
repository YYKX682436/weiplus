package z2;

/* loaded from: classes13.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Bundle f550969a;

    /* renamed from: b, reason: collision with root package name */
    public p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b f550970b;

    /* renamed from: c, reason: collision with root package name */
    public final z2.v1[] f550971c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f550972d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f550973e;

    /* renamed from: f, reason: collision with root package name */
    public final int f550974f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f550975g;

    /* renamed from: h, reason: collision with root package name */
    public final int f550976h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.CharSequence f550977i;

    /* renamed from: j, reason: collision with root package name */
    public final android.app.PendingIntent f550978j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f550979k;

    public f0(int i17, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        this(i17 != 0 ? p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b.e(null, "", i17) : null, charSequence, pendingIntent, new android.os.Bundle(), null, null, true, 0, true, false, false);
    }

    public p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b a() {
        int i17;
        if (this.f550970b == null && (i17 = this.f550976h) != 0) {
            this.f550970b = p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b.e(null, "", i17);
        }
        return this.f550970b;
    }

    public f0(p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b c1090x3d9c397b, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, z2.v1[] v1VarArr, z2.v1[] v1VarArr2, boolean z17, int i17, boolean z18, boolean z19, boolean z27) {
        this.f550973e = true;
        this.f550970b = c1090x3d9c397b;
        if (c1090x3d9c397b != null) {
            int i18 = c1090x3d9c397b.f92570a;
            if ((i18 == -1 ? f3.e.c(c1090x3d9c397b.f92571b) : i18) == 2) {
                this.f550976h = c1090x3d9c397b.f();
            }
        }
        this.f550977i = z2.k0.c(charSequence);
        this.f550978j = pendingIntent;
        this.f550969a = bundle == null ? new android.os.Bundle() : bundle;
        this.f550971c = v1VarArr;
        this.f550972d = z17;
        this.f550974f = i17;
        this.f550973e = z18;
        this.f550975g = z19;
        this.f550979k = z27;
    }
}

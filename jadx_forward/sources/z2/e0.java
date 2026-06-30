package z2;

/* loaded from: classes11.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b f550955a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f550956b;

    /* renamed from: c, reason: collision with root package name */
    public final android.app.PendingIntent f550957c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f550958d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f550959e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f550960f;

    /* renamed from: g, reason: collision with root package name */
    public final int f550961g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f550962h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f550963i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f550964j;

    public e0(p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b c1090x3d9c397b, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        this(c1090x3d9c397b, charSequence, pendingIntent, new android.os.Bundle(), null, true, 0, true, false, false);
    }

    public z2.f0 a() {
        java.util.Set set;
        if (this.f550963i && this.f550957c == null) {
            throw new java.lang.NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = this.f550960f;
        if (arrayList3 != null) {
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                z2.v1 v1Var = (z2.v1) it.next();
                if ((v1Var.f551062c || (set = v1Var.f551064e) == null || set.isEmpty()) ? false : true) {
                    arrayList.add(v1Var);
                } else {
                    arrayList2.add(v1Var);
                }
            }
        }
        return new z2.f0(this.f550955a, this.f550956b, this.f550957c, this.f550959e, arrayList2.isEmpty() ? null : (z2.v1[]) arrayList2.toArray(new z2.v1[arrayList2.size()]), arrayList.isEmpty() ? null : (z2.v1[]) arrayList.toArray(new z2.v1[arrayList.size()]), this.f550958d, this.f550961g, this.f550962h, this.f550963i, this.f550964j);
    }

    public e0(int i17, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        this(i17 != 0 ? p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b.e(null, "", i17) : null, charSequence, pendingIntent, new android.os.Bundle(), null, true, 0, true, false, false);
    }

    public e0(p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b c1090x3d9c397b, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, z2.v1[] v1VarArr, boolean z17, int i17, boolean z18, boolean z19, boolean z27) {
        this.f550958d = true;
        this.f550962h = true;
        this.f550955a = c1090x3d9c397b;
        this.f550956b = z2.k0.c(charSequence);
        this.f550957c = pendingIntent;
        this.f550959e = bundle;
        this.f550960f = v1VarArr == null ? null : new java.util.ArrayList(java.util.Arrays.asList(v1VarArr));
        this.f550958d = z17;
        this.f550961g = i17;
        this.f550962h = z18;
        this.f550963i = z19;
        this.f550964j = z27;
    }
}

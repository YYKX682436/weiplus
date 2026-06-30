package xb;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f534397a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final xb.f f534398b;

    /* renamed from: c, reason: collision with root package name */
    public xb.c[] f534399c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Set f534400d;

    public e(xb.f fVar) {
        this.f534398b = fVar;
    }

    public void a(float f17) {
        java.util.ArrayList arrayList = this.f534397a;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            xb.d dVar = (xb.d) arrayList.get(i17);
            if (f17 == 1.0f) {
                dVar.f534382c = dVar.f534383d;
                dVar.f534394o = 0.0f;
                dVar.f534395p = 0.0f;
            }
            float f18 = dVar.f534381b.f534403c;
            float abs = ((java.lang.Math.abs(dVar.f534386g - dVar.f534385f) * f18) * f17) / f18;
            int i18 = (int) abs;
            float f19 = dVar.f534395p * (1.0f - f17);
            int i19 = dVar.f534396q;
            dVar.f534388i = ((abs - i18) * f18 * i19) + f19;
            dVar.f534387h = dVar.f534385f + (i18 * i19);
            dVar.f534389j = f18;
            float f27 = dVar.f534390k;
            dVar.f534391l = f27 + ((dVar.f534392m - f27) * f17);
        }
    }
}

package u2;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public float f505382d;

    /* renamed from: f, reason: collision with root package name */
    public u2.i f505384f;

    /* renamed from: a, reason: collision with root package name */
    public int f505379a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f505380b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f505381c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f505383e = new float[7];

    /* renamed from: g, reason: collision with root package name */
    public u2.b[] f505385g = new u2.b[8];

    /* renamed from: h, reason: collision with root package name */
    public int f505386h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f505387i = 0;

    public j(u2.i iVar, java.lang.String str) {
        this.f505384f = iVar;
    }

    public final void a(u2.b bVar) {
        int i17 = 0;
        while (true) {
            int i18 = this.f505386h;
            if (i17 >= i18) {
                u2.b[] bVarArr = this.f505385g;
                if (i18 >= bVarArr.length) {
                    this.f505385g = (u2.b[]) java.util.Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                u2.b[] bVarArr2 = this.f505385g;
                int i19 = this.f505386h;
                bVarArr2[i19] = bVar;
                this.f505386h = i19 + 1;
                return;
            }
            if (this.f505385g[i17] == bVar) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final void b(u2.b bVar) {
        int i17 = this.f505386h;
        for (int i18 = 0; i18 < i17; i18++) {
            if (this.f505385g[i18] == bVar) {
                for (int i19 = 0; i19 < (i17 - i18) - 1; i19++) {
                    u2.b[] bVarArr = this.f505385g;
                    int i27 = i18 + i19;
                    bVarArr[i27] = bVarArr[i27 + 1];
                }
                this.f505386h--;
                return;
            }
        }
    }

    public void c() {
        this.f505384f = u2.i.UNKNOWN;
        this.f505381c = 0;
        this.f505379a = -1;
        this.f505380b = -1;
        this.f505382d = 0.0f;
        this.f505386h = 0;
        this.f505387i = 0;
    }

    public final void d(u2.b bVar) {
        int i17 = this.f505386h;
        for (int i18 = 0; i18 < i17; i18++) {
            u2.b bVar2 = this.f505385g[i18];
            u2.a aVar = bVar2.f505352c;
            int i19 = aVar.f505347h;
            while (true) {
                for (int i27 = 0; i19 != -1 && i27 < aVar.f505340a; i27++) {
                    int i28 = aVar.f505344e[i19];
                    u2.j jVar = bVar.f505350a;
                    if (i28 == jVar.f505379a) {
                        float f17 = aVar.f505346g[i19];
                        aVar.g(jVar, false);
                        u2.a aVar2 = bVar.f505352c;
                        int i29 = aVar2.f505347h;
                        for (int i37 = 0; i29 != -1 && i37 < aVar2.f505340a; i37++) {
                            aVar.a(aVar.f505342c.f505356c[aVar2.f505344e[i29]], aVar2.f505346g[i29] * f17, false);
                            i29 = aVar2.f505345f[i29];
                        }
                        bVar2.f505351b += bVar.f505351b * f17;
                        i19 = aVar.f505347h;
                    } else {
                        i19 = aVar.f505345f[i19];
                    }
                }
            }
        }
        this.f505386h = 0;
    }

    /* renamed from: toString */
    public java.lang.String m167427x9616526c() {
        return "null";
    }
}

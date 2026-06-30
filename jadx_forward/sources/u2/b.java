package u2;

/* loaded from: classes15.dex */
public class b implements u2.e {

    /* renamed from: c, reason: collision with root package name */
    public final u2.a f505352c;

    /* renamed from: a, reason: collision with root package name */
    public u2.j f505350a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f505351b = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f505353d = false;

    public b(u2.c cVar) {
        this.f505352c = new u2.a(this, cVar);
    }

    public u2.b a(u2.f fVar, int i17) {
        u2.j i18 = fVar.i(i17, "ep");
        u2.a aVar = this.f505352c;
        aVar.f(i18, 1.0f);
        aVar.f(fVar.i(i17, "em"), -1.0f);
        return this;
    }

    public u2.b b(u2.j jVar, u2.j jVar2, u2.j jVar3, int i17) {
        boolean z17 = false;
        if (i17 != 0) {
            if (i17 < 0) {
                i17 *= -1;
                z17 = true;
            }
            this.f505351b = i17;
        }
        u2.a aVar = this.f505352c;
        if (z17) {
            aVar.f(jVar, 1.0f);
            aVar.f(jVar2, -1.0f);
            aVar.f(jVar3, -1.0f);
        } else {
            aVar.f(jVar, -1.0f);
            aVar.f(jVar2, 1.0f);
            aVar.f(jVar3, 1.0f);
        }
        return this;
    }

    public u2.b c(u2.j jVar, u2.j jVar2, u2.j jVar3, int i17) {
        boolean z17 = false;
        if (i17 != 0) {
            if (i17 < 0) {
                i17 *= -1;
                z17 = true;
            }
            this.f505351b = i17;
        }
        u2.a aVar = this.f505352c;
        if (z17) {
            aVar.f(jVar, 1.0f);
            aVar.f(jVar2, -1.0f);
            aVar.f(jVar3, 1.0f);
        } else {
            aVar.f(jVar, -1.0f);
            aVar.f(jVar2, 1.0f);
            aVar.f(jVar3, -1.0f);
        }
        return this;
    }

    public void d(u2.j jVar) {
        u2.j jVar2 = this.f505350a;
        u2.a aVar = this.f505352c;
        if (jVar2 != null) {
            aVar.f(jVar2, -1.0f);
            this.f505350a = null;
        }
        float g17 = aVar.g(jVar, true) * (-1.0f);
        this.f505350a = jVar;
        if (g17 == 1.0f) {
            return;
        }
        this.f505351b /= g17;
        int i17 = aVar.f505347h;
        for (int i18 = 0; i17 != -1 && i18 < aVar.f505340a; i18++) {
            float[] fArr = aVar.f505346g;
            fArr[i17] = fArr[i17] / g17;
            i17 = aVar.f505345f[i17];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* renamed from: toString */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m167423x9616526c() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.b.m167423x9616526c():java.lang.String");
    }
}

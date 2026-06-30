package v8;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final v8.h f515529a = new v8.h();

    /* renamed from: b, reason: collision with root package name */
    public final t9.p f515530b = new t9.p(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f515531c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f515532d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f515533e;

    public boolean a(q8.f fVar) {
        int i17;
        int i18;
        int i19;
        t9.a.d(fVar != null);
        boolean z17 = this.f515533e;
        t9.p pVar = this.f515530b;
        if (z17) {
            this.f515533e = false;
            pVar.s();
        }
        while (!this.f515533e) {
            int i27 = this.f515531c;
            v8.h hVar = this.f515529a;
            if (i27 < 0) {
                if (!hVar.a(fVar, true)) {
                    return false;
                }
                int i28 = hVar.f515538d;
                if ((hVar.f515535a & 1) == 1 && pVar.f498075c == 0) {
                    this.f515532d = 0;
                    int i29 = 0;
                    do {
                        int i37 = this.f515532d;
                        int i38 = 0 + i37;
                        if (i38 >= hVar.f515537c) {
                            break;
                        }
                        this.f515532d = i37 + 1;
                        i19 = hVar.f515540f[i38];
                        i29 += i19;
                    } while (i19 == 255);
                    i28 += i29;
                    i18 = this.f515532d + 0;
                } else {
                    i18 = 0;
                }
                ((q8.b) fVar).f(i28);
                this.f515531c = i18;
            }
            int i39 = this.f515531c;
            this.f515532d = 0;
            int i47 = 0;
            do {
                int i48 = this.f515532d;
                int i49 = i39 + i48;
                if (i49 >= hVar.f515537c) {
                    break;
                }
                this.f515532d = i48 + 1;
                i17 = hVar.f515540f[i49];
                i47 += i17;
            } while (i17 == 255);
            int i57 = this.f515531c + this.f515532d;
            if (i47 > 0) {
                int a17 = pVar.a();
                int i58 = pVar.f498075c + i47;
                if (a17 < i58) {
                    pVar.f498073a = java.util.Arrays.copyOf(pVar.f498073a, i58);
                }
                ((q8.b) fVar).e(pVar.f498073a, pVar.f498075c, i47, false);
                pVar.v(pVar.f498075c + i47);
                this.f515533e = hVar.f515540f[i57 + (-1)] != 255;
            }
            if (i57 == hVar.f515537c) {
                i57 = -1;
            }
            this.f515531c = i57;
        }
        return true;
    }
}

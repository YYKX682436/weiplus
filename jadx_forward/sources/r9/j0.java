package r9;

/* loaded from: classes7.dex */
public final class j0 implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final r9.k f474907a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.i f474908b;

    public j0(r9.k kVar, r9.i iVar) {
        kVar.getClass();
        this.f474907a = kVar;
        iVar.getClass();
        this.f474908b = iVar;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        int a17 = this.f474907a.a(bArr, i17, i18);
        if (a17 > 0) {
            s9.e eVar = (s9.e) this.f474908b;
            if (eVar.f486452d != null) {
                int i19 = 0;
                while (i19 < a17) {
                    try {
                        long j17 = eVar.f486456h;
                        long j18 = eVar.f486450b;
                        if (j17 == j18) {
                            eVar.a();
                            eVar.b();
                        }
                        int min = (int) java.lang.Math.min(a17 - i19, j18 - eVar.f486456h);
                        eVar.f486454f.write(bArr, i17 + i19, min);
                        i19 += min;
                        long j19 = min;
                        eVar.f486456h += j19;
                        eVar.f486457i += j19;
                    } catch (java.io.IOException e17) {
                        throw new s9.d(e17);
                    }
                }
            }
        }
        return a17;
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        r9.n nVar2 = nVar;
        long b17 = this.f474907a.b(nVar2);
        if (nVar2.f474920e == -1 && b17 != -1) {
            nVar2 = new r9.n(nVar2.f474916a, nVar2.f474918c, nVar2.f474919d, b17, nVar2.f474921f, nVar2.f474922g);
        }
        s9.e eVar = (s9.e) this.f474908b;
        eVar.getClass();
        try {
            if (nVar2.f474920e == -1) {
                if (!((nVar2.f474922g & 2) == 2)) {
                    eVar.f486452d = null;
                    return b17;
                }
            }
            eVar.b();
            return b17;
        } catch (java.io.IOException e17) {
            throw new s9.d(e17);
        }
        eVar.f486452d = nVar2;
        eVar.f486457i = 0L;
    }

    @Override // r9.k
    /* renamed from: close */
    public void mo10286x5a5ddf8() {
        r9.i iVar = this.f474908b;
        try {
            this.f474907a.mo10286x5a5ddf8();
            s9.e eVar = (s9.e) iVar;
            if (eVar.f486452d == null) {
                return;
            }
            try {
                eVar.a();
            } catch (java.io.IOException e17) {
                throw new s9.d(e17);
            }
        } catch (java.lang.Throwable th6) {
            s9.e eVar2 = (s9.e) iVar;
            if (eVar2.f486452d != null) {
                try {
                    eVar2.a();
                } catch (java.io.IOException e18) {
                    throw new s9.d(e18);
                }
            }
            throw th6;
        }
    }

    @Override // r9.k
    /* renamed from: getUri */
    public android.net.Uri mo10287xb5887636() {
        return this.f474907a.mo10287xb5887636();
    }
}

package l5;

/* loaded from: classes14.dex */
public final class m extends l5.k {
    public boolean i(java.lang.Object obj) {
        if (obj == null) {
            obj = l5.k.f398066m;
        }
        if (!l5.k.f398065i.b(this, null, obj)) {
            return false;
        }
        l5.k.b(this);
        return true;
    }

    public boolean j(java.lang.Throwable th6) {
        th6.getClass();
        if (!l5.k.f398065i.b(this, null, new l5.e(th6))) {
            return false;
        }
        l5.k.b(this);
        return true;
    }

    public boolean k(wa.a aVar) {
        l5.e eVar;
        aVar.getClass();
        java.lang.Object obj = this.f398067d;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!l5.k.f398065i.b(this, null, l5.k.e(aVar))) {
                    return false;
                }
                l5.k.b(this);
            } else {
                l5.h hVar = new l5.h(this, aVar);
                if (l5.k.f398065i.b(this, null, hVar)) {
                    try {
                        aVar.mo606x162a7075(hVar, l5.l.INSTANCE);
                    } catch (java.lang.Throwable th6) {
                        try {
                            eVar = new l5.e(th6);
                        } catch (java.lang.Throwable unused) {
                            eVar = l5.e.f398047b;
                        }
                        l5.k.f398065i.b(this, hVar, eVar);
                    }
                } else {
                    obj = this.f398067d;
                }
            }
            return true;
        }
        if (!(obj instanceof l5.c)) {
            return false;
        }
        aVar.cancel(((l5.c) obj).f398045a);
        return false;
    }
}

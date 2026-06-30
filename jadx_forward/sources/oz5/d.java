package oz5;

/* loaded from: classes14.dex */
public final class d implements oz5.l, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final oz5.l f431858d;

    /* renamed from: e, reason: collision with root package name */
    public final oz5.i f431859e;

    public d(oz5.l left, oz5.i element) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(left, "left");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        this.f431858d = left;
        this.f431859e = element;
    }

    /* renamed from: equals */
    public boolean m157507xb2c87fbf(java.lang.Object obj) {
        boolean z17;
        if (this != obj) {
            if (!(obj instanceof oz5.d)) {
                return false;
            }
            oz5.d dVar = (oz5.d) obj;
            dVar.getClass();
            int i17 = 2;
            oz5.d dVar2 = dVar;
            int i18 = 2;
            while (true) {
                oz5.l lVar = dVar2.f431858d;
                dVar2 = lVar instanceof oz5.d ? (oz5.d) lVar : null;
                if (dVar2 == null) {
                    break;
                }
                i18++;
            }
            oz5.d dVar3 = this;
            while (true) {
                oz5.l lVar2 = dVar3.f431858d;
                dVar3 = lVar2 instanceof oz5.d ? (oz5.d) lVar2 : null;
                if (dVar3 == null) {
                    break;
                }
                i17++;
            }
            if (i18 != i17) {
                return false;
            }
            oz5.d dVar4 = this;
            while (true) {
                oz5.i iVar = dVar4.f431859e;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.get(iVar.mo7094xb5884f29()), iVar)) {
                    z17 = false;
                    break;
                }
                oz5.l lVar3 = dVar4.f431858d;
                if (!(lVar3 instanceof oz5.d)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(lVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    oz5.i iVar2 = (oz5.i) lVar3;
                    z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.get(iVar2.mo7094xb5884f29()), iVar2);
                    break;
                }
                dVar4 = (oz5.d) lVar3;
            }
            if (!z17) {
                return false;
            }
        }
        return true;
    }

    @Override // oz5.l
    /* renamed from: fold */
    public java.lang.Object mo7093x300c01(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(this.f431858d.mo7093x300c01(obj, operation), this.f431859e);
    }

    @Override // oz5.l
    public oz5.i get(oz5.j key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        oz5.d dVar = this;
        while (true) {
            oz5.i iVar = dVar.f431859e.get(key);
            if (iVar != null) {
                return iVar;
            }
            oz5.l lVar = dVar.f431858d;
            if (!(lVar instanceof oz5.d)) {
                return lVar.get(key);
            }
            dVar = (oz5.d) lVar;
        }
    }

    /* renamed from: hashCode */
    public int m157508x8cdac1b() {
        return this.f431858d.hashCode() + this.f431859e.hashCode();
    }

    @Override // oz5.l
    /* renamed from: minusKey */
    public oz5.l mo7095xafa9a7cf(oz5.j key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        oz5.i iVar = this.f431859e;
        oz5.i iVar2 = iVar.get(key);
        oz5.l lVar = this.f431858d;
        if (iVar2 != null) {
            return lVar;
        }
        oz5.l mo7095xafa9a7cf = lVar.mo7095xafa9a7cf(key);
        return mo7095xafa9a7cf == lVar ? this : mo7095xafa9a7cf == oz5.m.f431862d ? iVar : new oz5.d(mo7095xafa9a7cf, iVar);
    }

    @Override // oz5.l
    /* renamed from: plus */
    public oz5.l mo7096x348d9a(oz5.l lVar) {
        return oz5.g.a(this, lVar);
    }

    /* renamed from: toString */
    public java.lang.String m157509x9616526c() {
        return "[" + ((java.lang.String) mo7093x300c01("", oz5.c.f431857d)) + ']';
    }
}

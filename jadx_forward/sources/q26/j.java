package q26;

/* loaded from: classes12.dex */
public final class j implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f441386d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Iterator f441387e;

    /* renamed from: f, reason: collision with root package name */
    public int f441388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q26.k f441389g;

    public j(q26.k kVar) {
        this.f441389g = kVar;
        this.f441386d = kVar.f441393a.mo144672x467c086e();
    }

    public final boolean b() {
        java.util.Iterator it;
        java.util.Iterator it6 = this.f441387e;
        if (it6 != null && it6.hasNext()) {
            this.f441388f = 1;
            return true;
        }
        do {
            java.util.Iterator it7 = this.f441386d;
            if (!it7.hasNext()) {
                this.f441388f = 2;
                this.f441387e = null;
                return false;
            }
            java.lang.Object next = it7.next();
            q26.k kVar = this.f441389g;
            it = (java.util.Iterator) kVar.f441395c.mo146xb9724478(kVar.f441394b.mo146xb9724478(next));
        } while (!it.hasNext());
        this.f441387e = it;
        this.f441388f = 1;
        return true;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i17 = this.f441388f;
        if (i17 == 1) {
            return true;
        }
        if (i17 == 2) {
            return false;
        }
        return b();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441388f;
        if (i17 == 2) {
            throw new java.util.NoSuchElementException();
        }
        if (i17 == 0 && !b()) {
            throw new java.util.NoSuchElementException();
        }
        this.f441388f = 0;
        java.util.Iterator it = this.f441387e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

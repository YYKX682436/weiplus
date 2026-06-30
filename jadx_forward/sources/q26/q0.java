package q26;

/* loaded from: classes5.dex */
public final class q0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f441421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q26.r0 f441422e;

    public q0(q26.r0 r0Var) {
        this.f441422e = r0Var;
        this.f441421d = r0Var.f441423a.mo144672x467c086e();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441421d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return this.f441422e.f441424b.mo146xb9724478(this.f441421d.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

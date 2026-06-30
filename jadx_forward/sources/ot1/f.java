package ot1;

/* loaded from: classes12.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f430367d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot1.g f430368e;

    public f(ot1.g gVar, ot1.e eVar) {
        this.f430368e = gVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f430367d == null) {
            ot1.g gVar = this.f430368e;
            boolean moveToNext = gVar.f430369d.moveToNext();
            if (!moveToNext) {
                gVar.f430369d.close();
            }
            this.f430367d = java.lang.Boolean.valueOf(moveToNext);
        }
        return this.f430367d.booleanValue();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        ot1.g gVar = this.f430368e;
        java.lang.Object j17 = gVar.j(gVar.f430369d);
        this.f430367d = null;
        return j17;
    }
}

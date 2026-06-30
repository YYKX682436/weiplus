package cc;

/* loaded from: classes14.dex */
public final class n extends cc.l implements java.util.ListIterator {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cc.o f40393g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(cc.o oVar) {
        super(oVar);
        this.f40393g = oVar;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        cc.o oVar = this.f40393g;
        boolean isEmpty = oVar.isEmpty();
        b().add(obj);
        oVar.f40394i.f40398h++;
        if (isEmpty) {
            oVar.d();
        }
    }

    public final java.util.ListIterator b() {
        a();
        return (java.util.ListIterator) this.f40384d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(cc.o oVar, int i17) {
        super(oVar, ((java.util.List) oVar.f40389e).listIterator(i17));
        this.f40393g = oVar;
    }
}

package cc;

/* loaded from: classes14.dex */
public class o extends cc.m implements java.util.List {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cc.r f121927i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(cc.r rVar, java.lang.Object obj, java.util.List list, cc.m mVar) {
        super(rVar, obj, list, mVar);
        this.f121927i = rVar;
    }

    @Override // java.util.List
    public void add(int i17, java.lang.Object obj) {
        e();
        boolean isEmpty = this.f121922e.isEmpty();
        ((java.util.List) this.f121922e).add(i17, obj);
        this.f121927i.f121931h++;
        if (isEmpty) {
            d();
        }
    }

    @Override // java.util.List
    public boolean addAll(int i17, java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((java.util.List) this.f121922e).addAll(i17, collection);
        if (addAll) {
            this.f121927i.f121931h += this.f121922e.size() - size;
            if (size == 0) {
                d();
            }
        }
        return addAll;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        e();
        return ((java.util.List) this.f121922e).get(i17);
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        e();
        return ((java.util.List) this.f121922e).indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        e();
        return ((java.util.List) this.f121922e).lastIndexOf(obj);
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        e();
        return new cc.n(this);
    }

    @Override // java.util.List
    public java.lang.Object remove(int i17) {
        e();
        java.lang.Object remove = ((java.util.List) this.f121922e).remove(i17);
        cc.r rVar = this.f121927i;
        rVar.f121931h--;
        g();
        return remove;
    }

    @Override // java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        e();
        return ((java.util.List) this.f121922e).set(i17, obj);
    }

    @Override // java.util.List
    public java.util.List subList(int i17, int i18) {
        e();
        java.util.List subList = ((java.util.List) this.f121922e).subList(i17, i18);
        cc.m mVar = this.f121923f;
        if (mVar == null) {
            mVar = this;
        }
        cc.r rVar = this.f121927i;
        rVar.getClass();
        boolean z17 = subList instanceof java.util.RandomAccess;
        java.lang.Object obj = this.f121921d;
        return z17 ? new cc.i(rVar, obj, subList, mVar) : new cc.o(rVar, obj, subList, mVar);
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i17) {
        e();
        return new cc.n(this, i17);
    }
}

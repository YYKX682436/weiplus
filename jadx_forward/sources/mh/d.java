package mh;

/* loaded from: classes11.dex */
public final class d extends java.util.ArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f407793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i17, java.lang.String str) {
        super(i17);
        this.f407793d = i17;
        this.f407794e = str;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        if (super.size() >= this.f407793d) {
            super.remove(0);
            d();
        }
        super.add(i17, obj);
    }

    public final void d() {
        java.lang.String str = "listOverHeat-" + this.f407794e;
        ((ku5.t0) ku5.t0.f394148d).A(str);
        ((ku5.t0) ku5.t0.f394148d).l(new mh.c(this.f407794e, this), 60000L, str);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        if (super.size() >= this.f407793d) {
            super.remove(0);
            d();
        }
        return super.add(obj);
    }
}

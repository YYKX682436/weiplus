package q01;

/* loaded from: classes.dex */
public final class f0 extends java.util.ArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f440811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(int i17) {
        super(i17);
        this.f440811d = i17;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        if (super.size() >= this.f440811d) {
            super.remove(0);
        }
        super.add(i17, obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        if (super.size() >= this.f440811d) {
            super.remove(0);
        }
        return super.add(obj);
    }
}

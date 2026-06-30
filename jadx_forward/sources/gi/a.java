package gi;

/* loaded from: classes7.dex */
public final class a extends java.util.LinkedHashMap {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f353518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17) {
        super(i17);
        this.f353518d = i17;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(java.util.Map.Entry entry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "entry");
        return super.size() > this.f353518d;
    }
}

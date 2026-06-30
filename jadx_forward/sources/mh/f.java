package mh;

/* loaded from: classes10.dex */
public final class f extends java.util.LinkedHashMap {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f407797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i17, java.lang.String str) {
        super(i17);
        this.f407797d = i17;
        this.f407798e = str;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(java.util.Map.Entry entry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "entry");
        boolean z17 = super.size() > this.f407797d;
        java.lang.String str = this.f407798e;
        if (z17) {
            java.lang.String str2 = "mapOverHeat-" + str;
            ((ku5.t0) ku5.t0.f394148d).A(str2);
            ((ku5.t0) ku5.t0.f394148d).l(new mh.e(str, this), 60000L, str2);
        }
        return z17;
    }
}

package jg;

/* loaded from: classes3.dex */
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    None(0),
    JPEGs(1);


    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f381059f = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f381061d;

    static {
        for (jg.c cVar : m140877xcee59d22()) {
            ((java.util.HashMap) f381059f).put(java.lang.Integer.valueOf(cVar.f381061d), cVar);
        }
    }

    c(int i17) {
        this.f381061d = i17;
    }
}

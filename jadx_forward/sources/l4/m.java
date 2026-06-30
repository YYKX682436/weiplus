package l4;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f397263a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f397264b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f397265c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f397266d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.concurrent.Executor f397267e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.concurrent.Executor f397268f;

    /* renamed from: g, reason: collision with root package name */
    public p4.e f397269g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f397270h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f397272j;

    /* renamed from: l, reason: collision with root package name */
    public java.util.Set f397274l;

    /* renamed from: i, reason: collision with root package name */
    public boolean f397271i = true;

    /* renamed from: k, reason: collision with root package name */
    public final l4.p f397273k = new l4.p();

    public m(android.content.Context context, java.lang.Class cls, java.lang.String str) {
        this.f397265c = context;
        this.f397263a = cls;
        this.f397264b = str;
    }

    public l4.m a(m4.a... aVarArr) {
        if (this.f397274l == null) {
            this.f397274l = new java.util.HashSet();
        }
        for (m4.a aVar : aVarArr) {
            this.f397274l.add(java.lang.Integer.valueOf(aVar.f404927a));
            this.f397274l.add(java.lang.Integer.valueOf(aVar.f404928b));
        }
        l4.p pVar = this.f397273k;
        pVar.getClass();
        for (m4.a aVar2 : aVarArr) {
            int i17 = aVar2.f404927a;
            java.util.HashMap hashMap = pVar.f397278a;
            java.util.TreeMap treeMap = (java.util.TreeMap) hashMap.get(java.lang.Integer.valueOf(i17));
            if (treeMap == null) {
                treeMap = new java.util.TreeMap();
                hashMap.put(java.lang.Integer.valueOf(i17), treeMap);
            }
            int i18 = aVar2.f404928b;
            m4.a aVar3 = (m4.a) treeMap.get(java.lang.Integer.valueOf(i18));
            if (aVar3 != null) {
                aVar3.toString();
                aVar2.toString();
            }
            treeMap.put(java.lang.Integer.valueOf(i18), aVar2);
        }
        return this;
    }
}

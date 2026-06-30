package hu5;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f366770a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f366771b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f366772c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f366773d;

    /* renamed from: e, reason: collision with root package name */
    public final hu5.a f366774e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f366775f = false;

    public c(int i17, java.lang.String str, boolean z17, boolean z18, hu5.a aVar, hu5.b bVar) {
        this.f366770a = 0;
        this.f366771b = "";
        this.f366772c = false;
        this.f366773d = false;
        this.f366774e = null;
        this.f366770a = i17;
        this.f366771b = str;
        this.f366772c = z17;
        this.f366773d = z18;
        this.f366774e = aVar;
    }

    public static void a(hu5.c cVar, zt5.k kVar) {
        hu5.a aVar = cVar.f366774e;
        if (aVar != null && !cVar.f366775f) {
            if (kVar == null) {
                aVar.a(-1, com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);
            } else if (kVar.a()) {
                aVar.mo134170xe05b4124();
            } else {
                aVar.a(kVar.f557138a, kVar.f557139b);
            }
        }
        cVar.f366775f = true;
    }
}

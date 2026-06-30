package yg;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e8.e f543637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f543638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f543639f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab f543640g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 f543641h;

    public m(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83, e8.e eVar, java.lang.String str, java.lang.Object obj, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab) {
        this.f543641h = abstractC4208x204d5c83;
        this.f543637d = eVar;
        this.f543638e = str;
        this.f543639f = obj;
        this.f543640g = c1592x888963ab;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f543641h.f130110a != 0) {
            com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f543641h;
            abstractC4208x204d5c83.m34777xa07e88bb(abstractC4208x204d5c83.f130110a, this.f543638e, this.f543639f, this.f543640g);
            return;
        }
        e8.e eVar = this.f543637d;
        java.lang.Object obj = this.f543639f;
        ((d8.c) eVar).getClass();
        if (obj != null) {
            ((com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8) obj).mo17133x408b7293();
        }
    }
}

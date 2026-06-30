package hr3;

/* loaded from: classes11.dex */
public class db implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r35.a f365014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f365016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.eb f365017d;

    public db(hr3.eb ebVar, r35.a aVar, java.lang.String str, java.util.LinkedList linkedList) {
        this.f365017d = ebVar;
        this.f365014a = aVar;
        this.f365015b = str;
        this.f365016c = linkedList;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
        hr3.eb ebVar = this.f365017d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17).n(ebVar.f365053f.L.d1(), true);
        java.lang.String str3 = "";
        if (n17 != null && (str2 = n17.F1) != null) {
            str3 = str2;
        }
        r35.a aVar = this.f365014a;
        aVar.m(str3);
        aVar.a(ebVar.f365053f.L.d1(), this.f365015b, this.f365016c);
    }
}

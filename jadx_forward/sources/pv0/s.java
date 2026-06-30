package pv0;

/* loaded from: classes5.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv0.y f440083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440084e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(pv0.y yVar, java.lang.String str) {
        super(1);
        this.f440083d = yVar;
        this.f440084e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        pv0.y yVar = this.f440083d;
        dw0.c k76 = yVar.k7();
        boolean z17 = true;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f440084e, (k76 == null || (c4104x6d422cb2 = k76.f325619a) == null) ? null : dw0.f.a(c4104x6d422cb2))) {
            boolean q76 = yVar.q7(pv0.p.f440075d);
            if (!yVar.m7()) {
                z17 = q76;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}

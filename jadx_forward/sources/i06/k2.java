package i06;

/* loaded from: classes15.dex */
public final class k2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.n2 f368215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(i06.n2 n2Var) {
        super(0);
        this.f368215d = n2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        h16.c cVar;
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        t06.g a17 = i06.n2.a(this.f368215d);
        if (a17 == null || (cVar = a17.f496070b) == null || (strArr = cVar.f359764c) == null || (strArr2 = cVar.f359766e) == null) {
            return null;
        }
        jz5.l h17 = m16.j.h(strArr, strArr2);
        return new jz5.o((m16.h) h17.f384366d, (i16.o0) h17.f384367e, cVar.f359763b);
    }
}

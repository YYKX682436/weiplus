package f40;

/* loaded from: classes12.dex */
public final class l implements java.util.function.BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f40.k f340970a;

    public l(f40.k kVar) {
        this.f340970a = kVar;
    }

    @Override // java.util.function.BiFunction
    public java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        f40.k kVar = (f40.k) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((java.lang.String) obj, "<anonymous parameter 0>");
        f40.k kVar2 = this.f340970a;
        if (kVar2.f340969c > 0 || kVar == null) {
            return kVar2;
        }
        kVar.f340967a = kVar2.f340967a;
        return kVar;
    }
}

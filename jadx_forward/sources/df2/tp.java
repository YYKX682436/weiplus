package df2;

/* loaded from: classes8.dex */
public final class tp extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.vp f312998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp(df2.vp vpVar) {
        super(1);
        this.f312998d = vpVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
        int i17 = 2;
        java.lang.Integer[] numArr = {2003, java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46353xae58057)};
        int i18 = 0;
        while (true) {
            if (i18 >= 2) {
                z17 = false;
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(numArr[i18], valueOf)) {
                z17 = true;
                break;
            }
            i18++;
        }
        df2.vp vpVar = this.f312998d;
        if (!z17) {
            i17 = intValue < 0 ? 1 : vpVar.f313155o;
        }
        vpVar.f313155o = i17;
        return jz5.f0.f384359a;
    }
}

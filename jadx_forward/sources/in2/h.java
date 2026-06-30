package in2;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f374375d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(in2.s sVar) {
        super(3);
        this.f374375d = sVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        dk2.yg musicItem = (dk2.yg) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicItem, "musicItem");
        in2.s sVar = this.f374375d;
        int[] iArr = sVar.C1;
        if (iArr[0] == 0 || iArr[1] == 0) {
            view.getLocationOnScreen(iArr);
        }
        int i17 = iArr[0];
        int i18 = iArr[1];
        rl5.r rVar = sVar.B1;
        rVar.a();
        rVar.h(view, new in2.q(sVar), new in2.r(sVar, musicItem, intValue), i17, i18);
        rVar.k(com.p314xaae8f345.mm.R.C30861xcebc809e.c5k);
        rVar.U = true;
        rVar.T = com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230;
        return jz5.f0.f384359a;
    }
}

package jn2;

/* loaded from: classes10.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f382167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(jn2.r1 r1Var, jn2.z1 z1Var) {
        super(3);
        this.f382167d = r1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i17;
        int i18;
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        r45.z22 songInfo = (r45.z22) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        jn2.r1 r1Var = this.f382167d;
        int[] iArr = r1Var.f382220x1;
        int i19 = iArr[0];
        if (i19 != 0) {
            i17 = i19;
        } else {
            view.getLocationOnScreen(iArr);
            i17 = iArr[0];
        }
        int i27 = iArr[1];
        if (i27 != 0) {
            i18 = i27;
        } else {
            view.getLocationOnScreen(iArr);
            i18 = iArr[1];
        }
        rl5.r rVar = r1Var.f382218p1;
        rVar.a();
        rVar.h(view, new jn2.p1(r1Var), new jn2.q1(r1Var, songInfo, intValue), i17, i18);
        rVar.k(com.p314xaae8f345.mm.R.C30861xcebc809e.c5k);
        rVar.U = true;
        rVar.T = com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230;
        return jz5.f0.f384359a;
    }
}

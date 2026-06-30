package rk4;

/* loaded from: classes11.dex */
public final class w4 implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw5.e70 f478570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478571b;

    public w4(bw5.e70 e70Var, yz5.l lVar) {
        this.f478570a = e70Var;
        this.f478571b = lVar;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        yz5.l lVar = this.f478571b;
        if (obj != null && (obj instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestMediaInfo success, tid:");
            java.lang.String m11811xb5887159 = this.f478570a.m11811xb5887159();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m11811xb5887159);
            sb6.append((java.lang.Object) jz5.x.a(r26.q0.c(m11811xb5887159)));
            rk4.k5.e(sb6.toString(), "TingFinderSourcePlugin");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj).mo14344x5f01b1f6())));
            return;
        }
        rk4.k5.d("requestMediaInfo fail, errType: " + i17 + ", errCode: " + i18, "TingFinderSourcePlugin");
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("errType: " + i17 + ", errCode: " + i18)))));
    }
}

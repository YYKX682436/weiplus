package cx;

/* loaded from: classes7.dex */
public final class a1 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cx.j1 f305902b;

    public a1(cx.j1 j1Var) {
        this.f305902b = j1Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        java.lang.String pj6;
        cx.j1 j1Var = this.f305902b;
        pj6 = j1Var.pj();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pj6, "hy: onEnterBackground");
        java.lang.Runnable task = j1Var.f305961n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = j1Var.f305960m;
        n3Var.mo50302x6b17ad39(null);
        n3Var.mo50297x7c4d7ca2(task, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        java.lang.String pj6;
        cx.j1 j1Var = this.f305902b;
        pj6 = j1Var.pj();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pj6, "hy: onExitBackground");
        j1Var.f305960m.mo50302x6b17ad39(null);
    }
}

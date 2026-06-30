package yt3;

/* loaded from: classes10.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.o1 f547038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f547039e;

    public j1(yt3.o1 o1Var, android.widget.TextView textView) {
        this.f547038d = o1Var;
        this.f547039e = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        ct0.b bVar = this.f547038d.f547097i;
        h0Var.f391656d = ai3.d.i(bVar != null ? bVar.f303737a : null);
        h0Var.f391656d = ((java.lang.String) h0Var.f391656d) + "\n针对拍摄视频：\n";
        h0Var.f391656d = ((java.lang.String) h0Var.f391656d) + "是否使用CPU预览裁剪方式：" + dw3.f.f325736a + '\n';
        h0Var.f391656d = ((java.lang.String) h0Var.f391656d) + "是否使用两路流录制：" + dw3.f.f325737b + '\n';
        java.lang.String str = ((java.lang.String) h0Var.f391656d) + "预览页视频个数：" + dw3.f.f325738c + '\n';
        h0Var.f391656d = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0) == 1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new yt3.i1(h0Var, this.f547039e));
        }
    }
}

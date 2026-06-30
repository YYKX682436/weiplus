package rp4;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp4.g f480153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f480154e;

    public e(rp4.g gVar, android.widget.TextView textView) {
        this.f480153d = gVar;
        this.f480154e = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        ct0.b bVar = this.f480153d.f480187i;
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
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new rp4.d(h0Var, this.f480154e));
        }
    }
}

package ab5;

/* loaded from: classes9.dex */
public class e0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab5.i0 f84461a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ab5.i0 i0Var, android.os.Looper looper) {
        super(looper);
        this.f84461a = i0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        android.view.View view;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33;
        ab5.i0 i0Var = this.f84461a;
        if (i0Var.f84488h == null || i0Var.f84486f == null || (view = i0Var.f84485e) == null || (c19666xfd6e2f33 = i0Var.f84492o) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceImageBubble", "these references include null reference");
            return;
        }
        android.graphics.Bitmap bitmap = i0Var.f84491n;
        if (bitmap != null) {
            i0Var.mo1040x5481b993(bitmap);
        } else {
            i0Var.d();
        }
        boolean z17 = i0Var.f84493p;
        int i17 = z17 ? 83 : 85;
        int i18 = z17 ? 0 : 10;
        int mo75474x14195698 = c19666xfd6e2f33.mo75474x14195698();
        android.graphics.Rect rect = com.p314xaae8f345.mm.ui.bk.f279511a;
        int i19 = i0Var.f84493p ? 0 : i18 + rect.right;
        int i27 = mo75474x14195698 + rect.bottom;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceImageBubble", "bubble navbar height %s %s", java.lang.Integer.valueOf(rect.right), java.lang.Integer.valueOf(rect.bottom));
        try {
            i0Var.f84486f.showAtLocation(view, i17, i19, i27);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new ab5.f0(i0Var), false).c(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        } catch (android.view.WindowManager.BadTokenException unused) {
        }
    }
}

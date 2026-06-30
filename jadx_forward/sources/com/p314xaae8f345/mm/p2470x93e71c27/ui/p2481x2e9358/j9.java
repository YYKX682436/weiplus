package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class j9 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n9 f271967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n9 n9Var, android.os.Looper looper) {
        super(looper);
        this.f271967a = n9Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        android.graphics.Bitmap bitmap;
        android.view.View view;
        android.view.View view2;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n9 n9Var = this.f271967a;
        if (!((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33) n9Var.f272056l).O0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecentImageBubble", "[checkIfShow] is not support.");
            return;
        }
        android.widget.ImageView imageView = n9Var.f272050f;
        if (imageView == null || n9Var.f272047c == null || (bitmap = n9Var.f272051g) == null || n9Var.f272052h == null || (view = n9Var.f272053i) == null || (view2 = n9Var.f272054j) == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
        boolean z17 = n9Var.f272055k;
        int i17 = z17 ? 83 : 85;
        int i18 = z17 ? 0 : 10;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i8 i8Var = n9Var.f272056l;
        int mo75474x14195698 = i8Var != null ? i8Var.mo75474x14195698() : view2.getHeight();
        android.graphics.Rect rect = com.p314xaae8f345.mm.ui.bk.f279511a;
        int i19 = n9Var.f272055k ? 0 : i18 + rect.right;
        int i27 = mo75474x14195698 + rect.bottom;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentImageBubble", "recent bubble navbar height %s %s", java.lang.Integer.valueOf(rect.right), java.lang.Integer.valueOf(rect.bottom));
        android.content.Context context = n9Var.f272045a;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                try {
                    n9Var.f272052h.showAtLocation(view, i17, i19, i27);
                } catch (java.lang.NullPointerException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RecentImageBubble", e17, "", new java.lang.Object[0]);
                }
            }
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l9(n9Var), false).c(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
    }
}

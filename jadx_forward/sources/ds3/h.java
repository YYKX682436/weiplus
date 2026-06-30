package ds3;

/* loaded from: classes8.dex */
public class h implements com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f324452d;

    /* renamed from: e, reason: collision with root package name */
    public final kk.j f324453e;

    public h(ds3.i iVar) {
        this.f324452d = null;
        try {
            this.f324452d = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Facing.SubCorePwdGroup", e17, "", new java.lang.Object[0]);
        }
        this.f324453e = new jt0.i(15, ds3.h.class);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap W0(java.lang.String str) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public void X9(com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 n1Var) {
        if (n1Var instanceof kv.e0) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().d((kv.e0) n1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String str, int i17, int i18, int i19) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    /* renamed from: loadBitmap */
    public android.graphics.Bitmap mo560xd586ddb5(java.lang.String str) {
        kk.j jVar = this.f324453e;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((jt0.i) jVar).get(str);
        android.graphics.Bitmap bitmap = this.f324452d;
        if (weakReference != null && weakReference.get() != null && !((android.graphics.Bitmap) weakReference.get()).isRecycled() && weakReference.get() == bitmap) {
            return (android.graphics.Bitmap) weakReference.get();
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(str);
        if (a17 == null || a17.isRecycled()) {
            return bitmap;
        }
        ((jt0.i) jVar).j(str, new java.lang.ref.WeakReference(a17));
        return a17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap uc() {
        return this.f324452d;
    }
}

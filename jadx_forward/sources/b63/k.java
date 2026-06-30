package b63;

/* loaded from: classes11.dex */
public class k implements com.p314xaae8f345.mm.p2470x93e71c27.ui.j1, com.p314xaae8f345.mm.p2470x93e71c27.ui.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f99687d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 f99688e;

    public k(com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var) {
        this.f99688e = j1Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap W0(java.lang.String str) {
        android.util.Pair b17 = b(str);
        if (((java.lang.Boolean) b17.second).booleanValue()) {
            return Zg(str, 0, 0, 0);
        }
        return this.f99688e.W0((java.lang.String) b17.first);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public void X9(com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 n1Var) {
        if (n1Var instanceof kv.e0) {
            android.util.Pair b17 = b(n1Var.f272434m);
            boolean booleanValue = ((java.lang.Boolean) b17.second).booleanValue();
            java.lang.String str = (java.lang.String) b17.first;
            if (!booleanValue) {
                n1Var.f272436o = new b63.j(this, str, n1Var);
                this.f99688e.X9(n1Var);
            } else {
                ((java.util.ArrayList) this.f99687d).add(new java.lang.ref.WeakReference(n1Var));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String str, int i17, int i18, int i19) {
        android.util.Pair b17 = b(str);
        java.lang.String str2 = (java.lang.String) b17.first;
        if (!((java.lang.Boolean) b17.second).booleanValue()) {
            return this.f99688e.Zg(str2, i17, i18, i19);
        }
        y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(str2);
        if (Di != null) {
            java.lang.String str3 = Di.f67427x81118851;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str3 == null) {
                str3 = "";
            }
            vo0.d dVar = b63.o.f99695a;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) b63.o.f99695a.a(new b63.e(str3)).e();
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
        }
        ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Ai(str2, new b63.i(this, str2));
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k1
    public boolean a(java.lang.String str) {
        return !com.p314xaae8f345.mm.p2621x8fb0427b.z3.Z3(((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Bi(str));
    }

    public final android.util.Pair b(java.lang.String str) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.Z3(str)) {
            return new android.util.Pair(str, java.lang.Boolean.TRUE);
        }
        java.lang.String Bi = ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Bi(str);
        return new android.util.Pair(Bi, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.Z3(Bi)));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    /* renamed from: loadBitmap */
    public android.graphics.Bitmap mo560xd586ddb5(java.lang.String str) {
        android.util.Pair b17 = b(str);
        if (((java.lang.Boolean) b17.second).booleanValue()) {
            return Zg(str, 0, 0, 0);
        }
        return this.f99688e.mo560xd586ddb5((java.lang.String) b17.first);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap uc() {
        return this.f99688e.uc();
    }
}

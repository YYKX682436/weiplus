package b63;

/* loaded from: classes11.dex */
public class k implements com.tencent.mm.pluginsdk.ui.j1, com.tencent.mm.pluginsdk.ui.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f18154d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.j1 f18155e;

    public k(com.tencent.mm.pluginsdk.ui.j1 j1Var) {
        this.f18155e = j1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap W0(java.lang.String str) {
        android.util.Pair b17 = b(str);
        if (((java.lang.Boolean) b17.second).booleanValue()) {
            return Zg(str, 0, 0, 0);
        }
        return this.f18155e.W0((java.lang.String) b17.first);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public void X9(com.tencent.mm.pluginsdk.ui.n1 n1Var) {
        if (n1Var instanceof kv.e0) {
            android.util.Pair b17 = b(n1Var.f190901m);
            boolean booleanValue = ((java.lang.Boolean) b17.second).booleanValue();
            java.lang.String str = (java.lang.String) b17.first;
            if (!booleanValue) {
                n1Var.f190903o = new b63.j(this, str, n1Var);
                this.f18155e.X9(n1Var);
            } else {
                ((java.util.ArrayList) this.f18154d).add(new java.lang.ref.WeakReference(n1Var));
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String str, int i17, int i18, int i19) {
        android.util.Pair b17 = b(str);
        java.lang.String str2 = (java.lang.String) b17.first;
        if (!((java.lang.Boolean) b17.second).booleanValue()) {
            return this.f18155e.Zg(str2, i17, i18, i19);
        }
        y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(str2);
        if (Di != null) {
            java.lang.String str3 = Di.field_avatarURL;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str3 == null) {
                str3 = "";
            }
            vo0.d dVar = b63.o.f18162a;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) b63.o.f18162a.a(new b63.e(str3)).e();
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
        }
        ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Ai(str2, new b63.i(this, str2));
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k1
    public boolean a(java.lang.String str) {
        return !com.tencent.mm.storage.z3.Z3(((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Bi(str));
    }

    public final android.util.Pair b(java.lang.String str) {
        if (com.tencent.mm.storage.z3.Z3(str)) {
            return new android.util.Pair(str, java.lang.Boolean.TRUE);
        }
        java.lang.String Bi = ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Bi(str);
        return new android.util.Pair(Bi, java.lang.Boolean.valueOf(com.tencent.mm.storage.z3.Z3(Bi)));
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap loadBitmap(java.lang.String str) {
        android.util.Pair b17 = b(str);
        if (((java.lang.Boolean) b17.second).booleanValue()) {
            return Zg(str, 0, 0, 0);
        }
        return this.f18155e.loadBitmap((java.lang.String) b17.first);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap uc() {
        return this.f18155e.uc();
    }
}

package hf3;

/* loaded from: classes5.dex */
public abstract class f {
    public static void a(android.widget.ImageView imageView, java.lang.String str, int i17) {
        if (imageView == null) {
            return;
        }
        java.lang.String str2 = null;
        imageView.setImageBitmap(null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (i17 != 0) {
                imageView.setImageResource(i17);
                return;
            }
            return;
        }
        o11.f fVar = new o11.f();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str2 = java.lang.String.format("%s/%s", lp0.b.D() + "wallet/mall", kk.k.g(str.getBytes()));
        }
        fVar.f423616g = str2;
        fVar.f423611b = true;
        fVar.f423628s = true;
        fVar.f423629t = false;
        if (i17 != 0) {
            fVar.f423624o = i17;
        }
        n11.a.b().h(str, imageView, fVar.a());
    }
}

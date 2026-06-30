package dp0;

/* loaded from: classes5.dex */
public class e extends dp0.d {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f323650d;

    /* renamed from: e, reason: collision with root package name */
    public final float f323651e;

    public e(boolean z17, float f17) {
        this.f323650d = z17;
        this.f323651e = f17;
    }

    @Override // zo0.k
    public hp0.g a(cp0.n nVar, vo0.h hVar, hp0.g gVar) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) gVar.f364446a;
        if (this.f323650d) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f17 = this.f323651e;
            if (width == height) {
                bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap, false, bitmap.getWidth() * f17);
            } else {
                int min = java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight());
                if (min <= 0) {
                    min = java.lang.Math.max(bitmap.getWidth(), bitmap.getHeight());
                }
                bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(bitmap, min, min, true), false, min * f17);
            }
        }
        return new hp0.g(bitmap);
    }

    @Override // zo0.k
    public java.lang.String b(java.lang.String str) {
        return "_round_" + this.f323651e + "_";
    }
}

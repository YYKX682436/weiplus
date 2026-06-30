package ko0;

/* loaded from: classes3.dex */
public final class o {
    public o(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final android.util.Size a(android.util.Size originSize, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originSize, "originSize");
        if ((f17 == 0.0f) || originSize.getWidth() == 0 || originSize.getHeight() == 0) {
            return originSize;
        }
        float width = originSize.getWidth() / originSize.getHeight();
        if (width > f17) {
            return new android.util.Size((((int) (originSize.getHeight() * f17)) / 16) * 16, originSize.getHeight());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCommonUtil", "getCroppedResolution skip crop: currentRatio:" + width + " targetRatio:" + f17);
        return originSize;
    }

    public final long b() {
        return (long) java.lang.Math.max(((java.lang.Runtime.getRuntime().maxMemory() - java.lang.Runtime.getRuntime().totalMemory()) + java.lang.Runtime.getRuntime().freeMemory()) - ko0.p.f391428b, 0.0d);
    }
}

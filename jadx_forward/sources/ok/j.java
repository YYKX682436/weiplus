package ok;

/* loaded from: classes10.dex */
public final class j extends ok.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bn5.f layer) {
        super(layer);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layer, "layer");
    }

    @Override // ok.p
    public android.graphics.Rect a() {
        android.graphics.Rect m10934x9faf4b34 = this.f427487c.m10934x9faf4b34();
        android.graphics.Rect rect = new android.graphics.Rect();
        int height = (int) ((m10934x9faf4b34.height() - (m10934x9faf4b34.width() * 0.9f)) / 2.0f);
        rect.top = height;
        rect.bottom = height;
        return new android.graphics.Rect(m10934x9faf4b34.left + rect.left, m10934x9faf4b34.top + rect.top, m10934x9faf4b34.right - rect.right, m10934x9faf4b34.bottom - rect.bottom);
    }
}

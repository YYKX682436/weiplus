package u3;

/* loaded from: classes13.dex */
public final class l extends u3.r {
    public l(java.lang.String str) {
        super(str, null);
    }

    @Override // u3.t
    public float a(java.lang.Object obj) {
        return ((android.view.View) obj).getRotation();
    }

    @Override // u3.t
    public void b(java.lang.Object obj, float f17) {
        ((android.view.View) obj).setRotation(f17);
    }
}

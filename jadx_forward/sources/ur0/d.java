package ur0;

/* loaded from: classes2.dex */
public final class d implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f511823d;

    public d(float f17) {
        this.f511823d = f17;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        android.util.Size size = (android.util.Size) obj;
        android.util.Size size2 = (android.util.Size) obj2;
        float max = (java.lang.Math.max(size.getWidth(), size.getHeight()) * 1.0f) / java.lang.Math.min(size.getWidth(), size.getHeight());
        float max2 = (java.lang.Math.max(size2.getWidth(), size2.getHeight()) * 1.0f) / java.lang.Math.min(size2.getWidth(), size2.getHeight());
        float f17 = this.f511823d;
        float abs = java.lang.Math.abs(f17 - max) - java.lang.Math.abs(f17 - max2);
        if (abs > 0.0f) {
            return 1;
        }
        return abs < 0.0f ? -1 : 0;
    }
}

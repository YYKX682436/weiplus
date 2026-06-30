package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public final class l2 extends android.util.Property {
    @Override // android.util.Property
    public java.lang.Object get(java.lang.Object obj) {
        return java.lang.Float.valueOf(((androidx.appcompat.widget.SwitchCompat) obj).D);
    }

    @Override // android.util.Property
    public void set(java.lang.Object obj, java.lang.Object obj2) {
        ((androidx.appcompat.widget.SwitchCompat) obj).setThumbPosition(((java.lang.Float) obj2).floatValue());
    }
}

package androidx.preference.internal;

/* loaded from: classes13.dex */
public abstract class AbstractMultiSelectListPreference extends androidx.preference.DialogPreference {
    public AbstractMultiSelectListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    public abstract java.lang.CharSequence[] M();

    public abstract java.lang.CharSequence[] N();

    public abstract java.util.Set O();

    public abstract void Q(java.util.Set set);

    public AbstractMultiSelectListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

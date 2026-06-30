package androidx.appcompat.app;

/* loaded from: classes13.dex */
public class AlertController$RecycleListView extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public final int f9071d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9072e;

    public AlertController$RecycleListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f296193u);
        this.f9072e = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f9071d = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}

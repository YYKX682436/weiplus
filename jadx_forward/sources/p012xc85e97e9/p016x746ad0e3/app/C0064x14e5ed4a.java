package p012xc85e97e9.p016x746ad0e3.app;

/* renamed from: androidx.appcompat.app.AlertController$RecycleListView */
/* loaded from: classes13.dex */
public class C0064x14e5ed4a extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public final int f90604d;

    /* renamed from: e, reason: collision with root package name */
    public final int f90605e;

    public C0064x14e5ed4a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f377726u);
        this.f90605e = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f90604d = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}

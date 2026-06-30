package ol1;

/* loaded from: classes7.dex */
public class l extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol1.m f427666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ol1.m mVar, android.content.Context context) {
        super(context);
        this.f427666d = mVar;
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        this.f427666d.getClass();
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f427666d.f427668e;
        if (i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        super.onMeasure(i17, i18);
    }
}

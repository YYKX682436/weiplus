package androidx.appcompat.app;

/* loaded from: classes13.dex */
public class e extends android.widget.ArrayAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AlertController$RecycleListView f9084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.h f9085e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.h hVar, android.content.Context context, int i17, int i18, java.lang.CharSequence[] charSequenceArr, androidx.appcompat.app.AlertController$RecycleListView alertController$RecycleListView) {
        super(context, i17, i18, charSequenceArr);
        this.f9085e = hVar;
        this.f9084d = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2 = super.getView(i17, view, viewGroup);
        boolean[] zArr = this.f9085e.f9145q;
        if (zArr != null && zArr[i17]) {
            this.f9084d.setItemChecked(i17, true);
        }
        return view2;
    }
}

package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class i1 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ListPopupWindow f9606a;

    public i1(androidx.appcompat.widget.ListPopupWindow listPopupWindow) {
        this.f9606a = listPopupWindow;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        androidx.appcompat.widget.ListPopupWindow listPopupWindow = this.f9606a;
        if (listPopupWindow.isShowing()) {
            listPopupWindow.show();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f9606a.dismiss();
    }
}

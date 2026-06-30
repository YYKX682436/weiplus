package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class y1 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f9740d;

    public y1(androidx.appcompat.widget.SearchView searchView) {
        this.f9740d = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        androidx.appcompat.widget.SearchView searchView = this.f9740d;
        if (searchView.A1 == null) {
            return false;
        }
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.f9441v;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if ((android.text.TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i17 != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.m(0, null, searchAutoComplete.getText().toString());
            return true;
        }
        if (searchView.A1 == null || searchView.V == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i17 == 66 || i17 == 84 || i17 == 61) {
            searchView.o(searchAutoComplete.getListSelection(), 0, null);
        } else {
            if (i17 != 21 && i17 != 22) {
                if (i17 != 19) {
                    return false;
                }
                searchAutoComplete.getListSelection();
                return false;
            }
            searchAutoComplete.setSelection(i17 == 21 ? 0 : searchAutoComplete.length());
            searchAutoComplete.setListSelection(0);
            searchAutoComplete.clearListSelection();
            java.lang.reflect.Method method = androidx.appcompat.widget.SearchView.F1.f9539c;
            if (method != null) {
                try {
                    method.invoke(searchAutoComplete, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return true;
    }
}

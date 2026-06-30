package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class y1 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d f91273d;

    public y1(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d c0100x4c79dc8d) {
        this.f91273d = c0100x4c79dc8d;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d c0100x4c79dc8d = this.f91273d;
        if (c0100x4c79dc8d.A1 == null) {
            return false;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = c0100x4c79dc8d.f90974v;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if ((android.text.TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i17 != 66) {
                return false;
            }
            view.cancelLongPress();
            c0100x4c79dc8d.m(0, null, searchAutoComplete.getText().toString());
            return true;
        }
        if (c0100x4c79dc8d.A1 == null || c0100x4c79dc8d.V == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i17 == 66 || i17 == 84 || i17 == 61) {
            c0100x4c79dc8d.o(searchAutoComplete.getListSelection(), 0, null);
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
            java.lang.reflect.Method method = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.F1.f91072c;
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

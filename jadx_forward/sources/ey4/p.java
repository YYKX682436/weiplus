package ey4;

/* loaded from: classes4.dex */
public class p implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb f339160d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb c19494x6eecdedb) {
        this.f339160d = c19494x6eecdedb;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb c19494x6eecdedb = this.f339160d;
        if (c19494x6eecdedb.f268833o.getText() == null) {
            return;
        }
        c19494x6eecdedb.f268833o.requestFocus();
        boolean z17 = editable.length() > 0 && editable.toString().trim().length() > 0;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(c19494x6eecdedb.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559376d1);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(c19494x6eecdedb.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
        loadAnimation.setDuration(150L);
        loadAnimation2.setDuration(150L);
        android.widget.Button button = c19494x6eecdedb.f268831m;
        if (button == null || c19494x6eecdedb.f268832n == null) {
            return;
        }
        if (z17) {
            if (button.getVisibility() == 8 || c19494x6eecdedb.f268831m.getVisibility() == 4) {
                return;
            }
            c19494x6eecdedb.f268832n.startAnimation(loadAnimation);
            c19494x6eecdedb.f268832n.setVisibility(0);
            c19494x6eecdedb.f268831m.startAnimation(loadAnimation2);
            c19494x6eecdedb.f268831m.setVisibility(8);
        } else {
            if (button.getVisibility() == 0 || c19494x6eecdedb.f268831m.getVisibility() == 0) {
                return;
            }
            c19494x6eecdedb.f268831m.startAnimation(loadAnimation);
            c19494x6eecdedb.f268831m.setVisibility(0);
            c19494x6eecdedb.f268832n.startAnimation(loadAnimation2);
            c19494x6eecdedb.f268832n.setVisibility(8);
        }
        c19494x6eecdedb.f268832n.getParent().requestLayout();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

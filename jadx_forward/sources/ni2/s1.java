package ni2;

/* loaded from: classes3.dex */
public final class s1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.z1 f418999d;

    public s1(ni2.z1 z1Var) {
        this.f418999d = z1Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        int length = str.length();
        boolean z17 = 46 <= length && length < 50;
        ni2.z1 z1Var = this.f418999d;
        if (z17) {
            fg2.p1 p1Var = z1Var.K;
            if (p1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var.f343771r.setVisibility(0);
            fg2.p1 p1Var2 = z1Var.K;
            if (p1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var2.f343771r.setText(java.lang.String.valueOf(50 - str.length()));
            fg2.p1 p1Var3 = z1Var.K;
            if (p1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var3.f343771r.setTextColor(z1Var.f199716e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        } else if (str.length() > 50) {
            fg2.p1 p1Var4 = z1Var.K;
            if (p1Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var4.f343771r.setVisibility(0);
            fg2.p1 p1Var5 = z1Var.K;
            if (p1Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var5.f343771r.setText(java.lang.String.valueOf(50 - str.length()));
            fg2.p1 p1Var6 = z1Var.K;
            if (p1Var6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var6.f343771r.setTextColor(z1Var.f199716e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
        } else {
            fg2.p1 p1Var7 = z1Var.K;
            if (p1Var7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var7.f343771r.setVisibility(8);
        }
        if (z1Var.f0()) {
            fg2.p1 p1Var8 = z1Var.K;
            if (p1Var8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var8.f343757d.setAlpha(1.0f);
            fg2.p1 p1Var9 = z1Var.K;
            if (p1Var9 != null) {
                p1Var9.f343757d.setEnabled(true);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
        }
        fg2.p1 p1Var10 = z1Var.K;
        if (p1Var10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        p1Var10.f343757d.setAlpha(0.5f);
        fg2.p1 p1Var11 = z1Var.K;
        if (p1Var11 != null) {
            p1Var11.f343757d.setEnabled(false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

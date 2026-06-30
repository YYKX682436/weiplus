package db5;

/* loaded from: classes12.dex */
public class j1 implements android.text.TextWatcher, android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public db5.l1 f309933d;

    /* renamed from: e, reason: collision with root package name */
    public db5.k1 f309934e;

    /* renamed from: f, reason: collision with root package name */
    public db5.m1 f309935f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.EditText f309936g;

    /* renamed from: h, reason: collision with root package name */
    public int f309937h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f309938i = 4;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f309939m;

    public j1(android.widget.EditText editText) {
        this.f309936g = editText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        db5.l1 l1Var;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21484x4baee2fa c21484x4baee2fa;
        this.f309939m = editable.toString();
        db5.m1 m1Var = this.f309935f;
        java.lang.String str = "";
        if (m1Var != null) {
            java.util.Iterator it = ((db5.q1) m1Var).f310007a.f278854i.iterator();
            java.lang.String str2 = "";
            while (it.hasNext()) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21484x4baee2fa c21484x4baee2fa2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21484x4baee2fa) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21484x4baee2fa2.getText().toString().trim())) {
                    str2 = str2 + c21484x4baee2fa2.getText().toString().trim();
                }
            }
        }
        int i17 = 0;
        java.lang.String str3 = "";
        for (int i18 = 0; i18 < this.f309939m.length() && (i17 = i17 + 1) <= this.f309938i; i18++) {
            str3 = str3 + this.f309939m.charAt(i18);
        }
        if (i17 > this.f309938i) {
            android.widget.EditText editText = this.f309936g;
            editText.setText(str3);
            editText.setSelection(str3.length());
        }
        if (i17 < this.f309938i || (l1Var = this.f309933d) == null) {
            return;
        }
        int i19 = this.f309937h;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21485x435984bf c21485x435984bf = ((db5.q1) l1Var).f310007a;
        java.util.Iterator it6 = c21485x435984bf.f278854i.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21484x4baee2fa c21484x4baee2fa3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21484x4baee2fa) it6.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21484x4baee2fa3.getText().toString().trim())) {
                str = str + c21484x4baee2fa3.getText().toString().trim();
            }
        }
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.length() != c21485x435984bf.f278849d * c21485x435984bf.f278850e) && (arrayList = c21485x435984bf.f278854i) != null && i19 < arrayList.size() - 1 && (c21484x4baee2fa = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21484x4baee2fa) arrayList.get(i19 + 1)) != null) {
            c21484x4baee2fa.requestFocus();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        db5.k1 k1Var;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21484x4baee2fa c21484x4baee2fa;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMAutoSwitchEditText$AutoSwitchEditTextWatcher", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (i17 == 67 && this.f309936g.getText().toString().trim().length() == 0 && (k1Var = this.f309934e) != null) {
            int i18 = this.f309937h;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21485x435984bf c21485x435984bf = ((db5.q1) k1Var).f310007a;
            java.util.ArrayList arrayList2 = c21485x435984bf.f278854i;
            if (arrayList2 != null && i18 < arrayList2.size() && i18 != 0 && (c21484x4baee2fa = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21484x4baee2fa) c21485x435984bf.f278854i.get(i18 - 1)) != null) {
                c21484x4baee2fa.requestFocus();
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/base/MMAutoSwitchEditText$AutoSwitchEditTextWatcher", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class d4 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f224314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f224316c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144 f224317d;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144 activityC16145xcc3dc144, android.widget.EditText editText, java.lang.String str, int i17) {
        this.f224317d = activityC16145xcc3dc144;
        this.f224314a = editText;
        this.f224315b = str;
        this.f224316c = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k
    public void a(boolean z17) {
        if (z17) {
            android.widget.EditText editText = this.f224314a;
            w11.o0 o0Var = new w11.o0(this.f224316c, editText == null ? this.f224315b : editText.getText().toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144 activityC16145xcc3dc144 = this.f224317d;
            activityC16145xcc3dc144.f224211o = db5.e1.Q(activityC16145xcc3dc144, activityC16145xcc3dc144.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f224317d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c4(this, o0Var));
            c01.d9.e().g(o0Var);
        }
    }
}

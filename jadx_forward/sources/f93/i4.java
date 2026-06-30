package f93;

/* loaded from: classes.dex */
public class i4 implements db5.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 f341890a;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868) {
        this.f341890a = activityC16172xa598f868;
    }

    @Override // db5.d3
    public void a(java.lang.CharSequence charSequence) {
        android.widget.EditText editText;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868 = this.f341890a;
        db5.f3 f3Var = activityC16172xa598f868.f224830e;
        if (f3Var != null && (editText = f3Var.M) != null) {
            activityC16172xa598f868.mo53060x36654fab(editText);
        }
        activityC16172xa598f868.f224830e.B();
        if (!activityC16172xa598f868.f224840r.m79122xe175c322().contains(charSequence.toString())) {
            activityC16172xa598f868.f224833h = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(charSequence.toString());
            c01.d9.e().g(new e93.a(arrayList));
            activityC16172xa598f868.U6(activityC16172xa598f868.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9k));
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = activityC16172xa598f868.f224831f;
        if (f5Var != null) {
            f5Var.d();
        }
    }
}

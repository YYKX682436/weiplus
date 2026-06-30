package hr3;

/* loaded from: classes11.dex */
public class kh implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a f365261d;

    public kh(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a) {
        this.f365261d = activityC16872x6384268a;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        android.view.View view;
        int f17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(editable.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "afterTextChanged() MAX_REMARK_NAME_LENGTH:%s curLength:%s", 64, java.lang.Integer.valueOf(f17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = this.f365261d;
        if (f17 >= 64 && (view = activityC16872x6384268a.f235383n) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$12", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$12", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (activityC16872x6384268a.f235379h.c()) {
            activityC16872x6384268a.U6();
        } else {
            activityC16872x6384268a.V6();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

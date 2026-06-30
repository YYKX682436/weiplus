package hr3;

/* loaded from: classes11.dex */
public class u implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f f365569d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f activityC16833xebe5488f, hr3.h hVar) {
        this.f365569d = activityC16833xebe5488f;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int c17;
        com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(400, editable.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f activityC16833xebe5488f = this.f365569d;
        activityC16833xebe5488f.f235162e.e(this);
        java.lang.String obj = editable.toString();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            int f17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(obj);
            com.p314xaae8f345.mm.ui.p2740x696c9db.v4.d(400, obj);
            if (f17 > 400 && (c17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.c(400, obj)) > 0 && c17 < 400 && c17 < obj.length()) {
                activityC16833xebe5488f.f235162e.m79040x765074af(obj.substring(0, c17 + 1));
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = activityC16833xebe5488f.f235162e;
                c21503x6e5a020a.m79037xf579a34a(c21503x6e5a020a.m79028xfb85ada3().length());
                com.p314xaae8f345.mm.ui.jk.a();
            }
        }
        activityC16833xebe5488f.f235162e.b(this);
        activityC16833xebe5488f.X6();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

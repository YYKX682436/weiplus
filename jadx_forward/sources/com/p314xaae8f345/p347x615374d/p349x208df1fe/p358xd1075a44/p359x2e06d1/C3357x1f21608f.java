package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMToastDialog */
/* loaded from: classes9.dex */
public class C3357x1f21608f implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3537x52552104 {
    private static final java.lang.String TAG = "MMToastDialog";

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3537x52552104
    /* renamed from: show */
    public void mo27144x35dafd(java.lang.String str, java.lang.String str2) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "MMToastDialog showImpl() KindaContext.get() return null!");
            return;
        }
        int m27366xffdf924f = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.m27366xffdf924f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str2);
        int m27370x7513c025 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.m27370x7513c025(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str2, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463);
        if (m27370x7513c025 != 0) {
            m27366xffdf924f = m27370x7513c025;
        }
        db5.t7.i(context, str, m27366xffdf924f);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3537x52552104
    /* renamed from: showDialogToast */
    public void mo27145x8244b282(java.lang.String str) {
    }
}

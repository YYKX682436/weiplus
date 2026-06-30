package xl1;

/* loaded from: classes5.dex */
public class c implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12810x6cc39e95 f536636d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12810x6cc39e95 c12810x6cc39e95) {
        this.f536636d = c12810x6cc39e95;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/sms/EditVerifyCodeView$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (i17 != 67 || keyEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/widget/sms/EditVerifyCodeView$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12810x6cc39e95 c12810x6cc39e95 = this.f536636d;
        java.lang.StringBuilder sb6 = c12810x6cc39e95.f173637d;
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVerifyCodeView", "del before str:" + ((java.lang.Object) sb6));
        int length = sb7.length();
        if (length != 0) {
            if (length > 0 && length <= 6) {
                int i18 = length - 1;
                sb6.delete(i18, length);
                android.widget.TextView[] textViewArr = c12810x6cc39e95.f173639f;
                textViewArr[i18].setVisibility(4);
                textViewArr[i18].setText("");
                c12810x6cc39e95.f173638e[i18].setVisibility(0);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVerifyCodeView", "del after str:" + ((java.lang.Object) sb6));
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/widget/sms/EditVerifyCodeView$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return true;
    }
}

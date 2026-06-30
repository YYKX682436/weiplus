package rx4;

/* loaded from: classes.dex */
public final class q2 extends rx4.p2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // rx4.p2
    public int T6() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bjb;
    }

    @Override // rx4.p2, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("ftsQuery");
        if (stringExtra == null || r26.n0.N(stringExtra)) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.gzd);
        if (textView != null) {
            textView.setText(stringExtra);
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        }
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.gyn);
        if (mo144222x4ff8c0f0 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/HalfScreenFTSActionBarUICForMore", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/HalfScreenFTSActionBarUICForMore", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

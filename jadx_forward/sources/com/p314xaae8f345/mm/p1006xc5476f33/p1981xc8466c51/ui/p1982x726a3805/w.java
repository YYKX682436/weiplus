package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes5.dex */
public class w implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f237107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.x f237108e;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.x xVar, android.widget.TextView textView) {
        this.f237108e = xVar;
        this.f237107d = textView;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.x xVar = this.f237108e;
        boolean z17 = xVar.f237110e;
        et3.b bVar = xVar.f237112g;
        java.lang.String str = z17 ? bVar.f338123a.f456941f : xVar.f237111f.f105799f;
        android.widget.TextView textView = this.f237107d;
        textView.setText(str);
        xVar.f237114i.getClass();
        int i17 = bVar.f338127e;
        int i18 = i17 == 1 ? 6 : i17 == 0 ? 4 : 0;
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.o(textView, 1, i18, null, null, true, true);
    }
}

package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes5.dex */
public class t implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.w f295765d;

    public t(com.p314xaae8f345.mm.p2802xd031a825.ui.w wVar) {
        this.f295765d = wVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f295765d.f295778a.getWindow().clearFlags(1024);
    }
}

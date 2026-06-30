package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class ad implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f64043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectMemberUI f64044f;

    public ad(com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI, java.lang.String str, int i17) {
        this.f64044f = selectMemberUI;
        this.f64042d = str;
        this.f64043e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f64042d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI = this.f64044f;
        if (K0) {
            selectMemberUI.f63971d.setAdapter((android.widget.ListAdapter) selectMemberUI.f63977m);
            selectMemberUI.f63985u.setVisibility(8);
            return;
        }
        selectMemberUI.f63971d.setAdapter((android.widget.ListAdapter) selectMemberUI.f63976i);
        if (this.f64043e > 0) {
            selectMemberUI.f63985u.setVisibility(8);
        } else {
            selectMemberUI.f63985u.setText(o13.q.d(selectMemberUI.getString(com.tencent.mm.R.string.icq), selectMemberUI.getString(com.tencent.mm.R.string.icp), p13.i.a(str, str, false, false)).f351105a);
            selectMemberUI.f63985u.setVisibility(0);
        }
    }
}

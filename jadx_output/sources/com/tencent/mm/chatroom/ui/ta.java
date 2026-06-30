package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class ta implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI f64555d;

    public ta(com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI seeAccessVerifyInfoUI) {
        this.f64555d = seeAccessVerifyInfoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        float height;
        float dimension;
        com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI seeAccessVerifyInfoUI = this.f64555d;
        if (seeAccessVerifyInfoUI.A != null) {
            if (seeAccessVerifyInfoUI.F) {
                height = (r1.getHeight() * 2) + seeAccessVerifyInfoUI.getResources().getDimension(com.tencent.mm.R.dimen.f479567j);
                dimension = seeAccessVerifyInfoUI.getResources().getDimension(com.tencent.mm.R.dimen.f479890i3);
            } else {
                height = r1.getHeight() + seeAccessVerifyInfoUI.getResources().getDimension(com.tencent.mm.R.dimen.f479567j);
                dimension = seeAccessVerifyInfoUI.getResources().getDimension(com.tencent.mm.R.dimen.f479890i3);
            }
            i17 = (int) (height + dimension);
        } else {
            i17 = 0;
        }
        if (seeAccessVerifyInfoUI.f63909e.getCount() / 4 > 0) {
            i17 *= (seeAccessVerifyInfoUI.f63909e.getCount() / 4) + 1;
        }
        seeAccessVerifyInfoUI.D.setLayoutParams(new android.widget.LinearLayout.LayoutParams(seeAccessVerifyInfoUI.D.getWidth(), i17));
    }
}

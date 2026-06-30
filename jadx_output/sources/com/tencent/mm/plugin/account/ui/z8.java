package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class z8 implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f74358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBFriendUI f74359b;

    public z8(com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI, android.widget.TextView textView) {
        this.f74359b = mMFBFriendUI;
        this.f74358a = textView;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        boolean u17 = c01.z1.u();
        com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI = this.f74359b;
        if (u17 && mMFBFriendUI.f73456i) {
            int count = mMFBFriendUI.f73452e.getCount();
            android.widget.TextView textView = this.f74358a;
            if (count == 0) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        mMFBFriendUI.f73456i = false;
    }
}

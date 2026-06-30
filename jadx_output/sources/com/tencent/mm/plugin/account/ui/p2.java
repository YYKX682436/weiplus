package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class p2 implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f74104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI f74105b;

    public p2(com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI inviteMMFBFriendsUI, android.widget.TextView textView) {
        this.f74105b = inviteMMFBFriendsUI;
        this.f74104a = textView;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        if (c01.z1.u()) {
            int count = this.f74105b.f73289e.getCount();
            android.widget.TextView textView = this.f74104a;
            if (count == 0) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
    }
}

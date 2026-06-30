package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2;

/* loaded from: classes11.dex */
public final class a0 implements com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.d0 f289644a;

    public a0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.d0 d0Var) {
        this.f289644a = d0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2
    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnreadConversationItemConvert", "requestDismissClickStatus: delay=" + i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2
    public void b(android.view.View view, int i17, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnreadConversationItemConvert", "onClickItem: position=" + i17 + ", key=" + key);
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2
    public void c(java.lang.String username, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        android.app.Activity activity = this.f289644a.f289650e;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = activity instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 ? (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8) activity : null;
        if (activityC22359x66709fa8 != null) {
            activityC22359x66709fa8.m80491x5d4f20c8(username, bundle, true);
        }
    }
}

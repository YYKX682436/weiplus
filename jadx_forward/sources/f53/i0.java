package f53;

/* loaded from: classes5.dex */
public final class i0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b f341191a;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b) {
        this.f341191a = activityC15905x15a0ec7b;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void a(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostCommentDialogUI", "onSearchDialogShow isShow = " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341191a;
        if (z17) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = activityC15905x15a0ec7b.f221544d;
            if (abstractC19636xc6b37291 != null) {
                abstractC19636xc6b37291.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
                throw null;
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = activityC15905x15a0ec7b.f221544d;
        if (abstractC19636xc6b372912 != null) {
            abstractC19636xc6b372912.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void b(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSendCustomEmoji emoji = ");
        sb6.append(interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.j() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostCommentDialogUI", sb6.toString());
        if (interfaceC4987x84e327cb != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341191a;
            java.lang.String str = activityC15905x15a0ec7b.f221558u;
            if (str == null || str.length() == 0) {
                activityC15905x15a0ec7b.d7(interfaceC4987x84e327cb);
            } else {
                activityC15905x15a0ec7b.c7(interfaceC4987x84e327cb);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void c() {
    }
}

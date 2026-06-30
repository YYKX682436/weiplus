package f53;

/* loaded from: classes5.dex */
public final class h0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f341188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b f341189b;

    public h0(com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b) {
        this.f341188a = abstractC19636xc6b37291;
        this.f341189b = activityC15905x15a0ec7b;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("emoticonID", text);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f341188a;
        android.content.Context context = abstractC19636xc6b37291.getContext();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341189b;
        activityC15905x15a0ec7b.getClass();
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(context, 90, 9002, 1, 2, 0, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.b(hashMap));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC15905x15a0ec7b.f221545e;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
            throw null;
        }
        sb6.append((java.lang.Object) c22621x7603e017.getText());
        sb6.append(text);
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(sb6.toString(), com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2) <= activityC15905x15a0ec7b.F) {
            activityC15905x15a0ec7b.Z6(text);
        } else {
            db5.t7.g(abstractC19636xc6b37291.getContext(), activityC15905x15a0ec7b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fq8));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341189b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC15905x15a0ec7b.f221545e;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
            throw null;
        }
        if (c22621x7603e017.mo81352x6a67d012() == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = activityC15905x15a0ec7b.f221545e;
        if (c22621x7603e0172 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
            throw null;
        }
        c22621x7603e0172.mo81352x6a67d012().sendKeyEvent(new android.view.KeyEvent(0, 67));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = activityC15905x15a0ec7b.f221545e;
        if (c22621x7603e0173 != null) {
            c22621x7603e0173.mo81352x6a67d012().sendKeyEvent(new android.view.KeyEvent(1, 67));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
    }
}

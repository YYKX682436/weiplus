package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class w implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd f178175d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd activityC13154xb3ef6cfd) {
        this.f178175d = activityC13154xb3ef6cfd;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd activityC13154xb3ef6cfd = this.f178175d;
        activityC13154xb3ef6cfd.f178001q.mo69303x360802();
        if (activityC13154xb3ef6cfd.f178005u) {
            return;
        }
        activityC13154xb3ef6cfd.f178005u = true;
        android.graphics.Bitmap f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.f(hx1.b.e(activityC13154xb3ef6cfd.f178003s), null);
        java.lang.String f256131m = activityC13154xb3ef6cfd.f178001q.getF256131m();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.b());
        sb6.append("[RecordMsgFileUI] on play sight error, what=");
        sb6.append(i17);
        sb6.append(", extra=");
        sb6.append(i18);
        sb6.append(", path=");
        sb6.append(f256131m == null ? "" : f256131m);
        z65.c.b(android.util.Base64.encodeToString(sb6.toString().getBytes(), 2), "FullScreenPlaySight");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.v(this, f17, f256131m));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        fp.k.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd activityC13154xb3ef6cfd = this.f178175d;
        activityC13154xb3ef6cfd.f178001q.mo69317x764cf626(true);
        activityC13154xb3ef6cfd.f178001q.mo69330x68ac462();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        return 0;
    }
}

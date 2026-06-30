package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class w3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 f233045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f233046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f233047f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var, android.content.Intent intent, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f233045d = h4Var;
        this.f233046e = intent;
        this.f233047f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.w3(this.f233045d, this.f233046e, this.f233047f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.w3 w3Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.w3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        w3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var = this.f233045d;
        android.content.Intent intent = this.f233046e;
        int i17 = this.f233047f;
        h4Var.getClass();
        if (i17 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("KEY_RECORD_VIDEO_PATH");
            java.lang.String str = stringExtra == null ? "" : stringExtra;
            java.lang.String stringExtra2 = intent.getStringExtra("KEY_RECORD_VIDEO_THUMB_PATH");
            java.lang.String str2 = stringExtra2 != null ? stringExtra2 : "";
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
            boolean j18 = com.p314xaae8f345.mm.vfs.w6.j(str2);
            int i18 = h4Var.f232700n.f233397m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "takePhotoFinished, videoPath:" + str + ", videoExist:" + j17 + ", thumbPath:" + str2 + ", thumbExist:" + j18 + ", pos:" + i18);
            if (j17) {
                ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
                fm3.q qVar = new fm3.q();
                fm3.h hVar = fm3.q.f345637p;
                java.lang.Object obj2 = h4Var.f232694e.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                hVar.c((fm3.q) obj2, qVar);
                qVar.f345642g = 3;
                qVar.f345645m = new fm3.g(str2, str);
                java.lang.Object obj3 = h4Var.f232695f.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                qVar.f345647o = (fm3.q) h4Var.f232694e.get(i18);
                fm3.p pVar = new fm3.p(str + '_' + str.hashCode(), str, d17.f243915a, 0, 0, 24, null);
                pVar.f345631d = d17.f243917c;
                pVar.f345632e = d17.f243918d;
                qVar.f345646n = pVar;
                h4Var.f232694e.set(i18, qVar);
                fm3.g0 g0Var = fm3.g0.f345603a;
                fm3.g0.f345605c = 1;
                g0Var.b(i18, qVar);
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c4(h4Var, i18, qVar));
            }
        }
        return jz5.f0.f384359a;
    }
}

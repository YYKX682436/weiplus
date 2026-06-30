package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class r4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 f232937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f232938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f232939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 v4Var, android.content.Intent intent, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f232937d = v4Var;
        this.f232938e = intent;
        this.f232939f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.r4(this.f232937d, this.f232938e, this.f232939f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.r4 r4Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.r4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.content.Intent intent;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 v4Var = this.f232937d;
        v4Var.getClass();
        if (this.f232939f == -1 && (intent = this.f232938e) != null) {
            java.lang.String stringExtra = intent.getStringExtra("KEY_RECORD_VIDEO_PATH");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.String stringExtra2 = intent.getStringExtra("KEY_RECORD_VIDEO_THUMB_PATH");
            java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(stringExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerFlexEditUIC", "takePhotoFinished, videoPath:" + stringExtra + ", videoExist:" + j17 + ", thumbPath:" + str + ", thumbExist:" + com.p314xaae8f345.mm.vfs.w6.j(str));
            if (j17) {
                ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(stringExtra, true);
                fm3.q qVar = new fm3.q();
                qVar.f345642g = 3;
                qVar.f345645m = new fm3.g(str, stringExtra);
                fm3.p pVar = new fm3.p(stringExtra + '_' + stringExtra.hashCode(), stringExtra, d17.f243915a, 0, 0, 24, null);
                pVar.f345631d = d17.f243917c;
                pVar.f345632e = d17.f243918d;
                qVar.f345646n = pVar;
                fm3.g0 g0Var = fm3.g0.f345603a;
                fm3.g0.f345605c = 1;
                com.p314xaae8f345.mm.p1006xc5476f33.mv.p1915x633fb29.p1916x2ffff9.C16646x38766471 c16646x38766471 = v4Var.f233024h;
                g0Var.b(c16646x38766471.f233598o.size(), qVar);
                gm3.c cVar = new gm3.c("local_-1", 3, java.lang.System.currentTimeMillis(), 0);
                cVar.f355080h = new gm3.a(0L, 0L, null, null, 0, 0, 63, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b();
                c15635xf0ea441b.f219979x = d17.f243915a;
                int i17 = d17.f243916b;
                c15635xf0ea441b.f219981z = d17.f243917c;
                c15635xf0ea441b.f219980y = d17.f243918d;
                c15635xf0ea441b.A = i17;
                c15635xf0ea441b.f219963e = stringExtra;
                c15635xf0ea441b.f219966h = str;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                c15635xf0ea441b.f219968m = currentTimeMillis;
                gm3.a aVar2 = cVar.f355080h;
                if (aVar2 != null) {
                    aVar2.f355070c = str;
                }
                if (aVar2 != null) {
                    aVar2.f355068a = -1L;
                }
                if (aVar2 != null) {
                    aVar2.f355069b = currentTimeMillis;
                }
                if (aVar2 != null) {
                    aVar2.f355071d = c15635xf0ea441b;
                }
                cVar.f355082m = c15635xf0ea441b.f219979x;
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.q(c16646x38766471, cVar, false, 2, null);
                c16646x38766471.D();
                v4Var.f233022f.mo7808x76db6cb1(1);
            }
        }
        return jz5.f0.f384359a;
    }
}

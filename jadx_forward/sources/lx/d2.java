package lx;

/* loaded from: classes.dex */
public final class d2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f403253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f403254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lx.i2 f403255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403256g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(android.content.Context context, lx.i2 i2Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f403254e = context;
        this.f403255f = i2Var;
        this.f403256g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lx.d2(this.f403254e, this.f403255f, this.f403256g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lx.d2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object Di;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f403253d;
        yz5.l lVar = this.f403256g;
        lx.i2 i2Var = this.f403255f;
        try {
        } catch (java.lang.Exception e17) {
            lx.i2.a(i2Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMediaPlugin", "chooseMediaFromCamera: exception", e17);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            lx.c2 c2Var = new lx.c2(lVar, e17, null);
            this.f403253d = 3;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, c2Var, this) == aVar) {
                return aVar;
            }
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 e18 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.e();
            e18.a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.MediaTabCameraKitPluginLayout");
            e18.M.putBoolean("key_forbit_edit_inset_layout", true);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_PARAMS_CONFIG", e18);
            intent.putExtra("KEY_PARAMS_TO_WHERE", 0);
            intent.putExtra("key_params_pageid", "MediaTabCaptureUI");
            java.util.ArrayList d17 = kz5.c0.d(new jz5.l(new java.lang.Integer(2), intent));
            e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
            android.content.Context context = this.f403254e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            this.f403253d = 1;
            Di = ((o23.i) b1Var).Di((p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c) context, 1, d17, 0, this);
            if (Di == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                } else {
                    if (i17 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            Di = obj;
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392103c;
        lx.b2 b2Var = new lx.b2((qc0.m1) Di, i2Var, lVar, null);
        this.f403253d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(p0Var2, b2Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}

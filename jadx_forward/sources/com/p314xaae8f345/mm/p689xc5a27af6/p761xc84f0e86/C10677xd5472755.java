package com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86;

/* renamed from: com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC */
/* loaded from: classes5.dex */
public final class C10677xd5472755 extends wm3.a {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.List f149321p = kz5.c0.i("img_gallery_msg_id", "Chat_Msg_Id", "app_msg_id");

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.List f149322q = kz5.c0.i("img_gallery_talker", "Chat_User", "msg_talker", "key_group_solitatire_chatroom_username");

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.List f149323r = kz5.c0.i("img_gallery_msg_svr_id", "serverMsgID");

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f149324d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f149325e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f149326f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f149327g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f149328h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f149329i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f149330m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f149331n;

    /* renamed from: o, reason: collision with root package name */
    public final cd0.c f149332o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10677xd5472755(final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f149324d = jz5.h.b(new cd0.f(this));
        this.f149325e = jz5.h.b(new cd0.h(this));
        this.f149326f = jz5.h.b(new cd0.g(this));
        this.f149327g = jz5.h.b(new cd0.e(this));
        this.f149328h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f>(activity) { // from class: com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC$revokeReceiveMessageListener$1
            {
                this.f39173x3fe91575 = 675629679;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
            
                if ((r5 != 0 && r3 == r5) != false) goto L18;
             */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f r12) {
                /*
                    r11 = this;
                    com.tencent.mm.autogen.events.RevokeMsgEvent r12 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f) r12
                    java.lang.String r0 = "event"
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "RevokeMsgEvent called with: eventMsgId:"
                    r0.<init>(r1)
                    am.cs r12 = r12.f136246g
                    long r1 = r12.f87927a
                    r0.append(r1)
                    java.lang.String r1 = " openMsgId:"
                    r0.append(r1)
                    com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC r1 = r2
                    long r2 = r1.U6()
                    r0.append(r2)
                    java.lang.String r2 = " eventMsgSrvId:"
                    r0.append(r2)
                    long r2 = r12.f87931e
                    r0.append(r2)
                    java.lang.String r2 = " openMsgSrvId:"
                    r0.append(r2)
                    jz5.g r2 = r1.f149326f
                    r3 = r2
                    jz5.n r3 = (jz5.n) r3
                    java.lang.Object r3 = r3.mo141623x754a37bb()
                    java.lang.Number r3 = (java.lang.Number) r3
                    long r3 = r3.longValue()
                    r0.append(r3)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r3 = "MRevokeChat.LandingPageUIC"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
                    long r3 = r12.f87927a
                    long r5 = r1.U6()
                    r7 = 0
                    int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                    r9 = 1
                    r10 = 0
                    if (r0 != 0) goto L5c
                    goto L62
                L5c:
                    int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r0 != 0) goto L62
                    r0 = r9
                    goto L63
                L62:
                    r0 = r10
                L63:
                    if (r0 != 0) goto L80
                    long r3 = r12.f87931e
                    jz5.n r2 = (jz5.n) r2
                    java.lang.Object r0 = r2.mo141623x754a37bb()
                    java.lang.Number r0 = (java.lang.Number) r0
                    long r5 = r0.longValue()
                    int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                    if (r0 != 0) goto L78
                    goto L7d
                L78:
                    int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r0 != 0) goto L7d
                    goto L7e
                L7d:
                    r9 = r10
                L7e:
                    if (r9 == 0) goto L85
                L80:
                    java.lang.String r12 = r12.f87928b
                    r1.V6(r12)
                L85:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10679x73dc92da.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f149329i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5946x34ca3d16>(activity) { // from class: com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC$mRevokeNativeMessageListener$1
            {
                this.f39173x3fe91575 = 690552614;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5946x34ca3d16 c5946x34ca3d16) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5946x34ca3d16 event = c5946x34ca3d16;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("RevokeNativeMsgEvent called with: eventMsgId:");
                am.ds dsVar = event.f136247g;
                sb6.append(dsVar.f88029a);
                sb6.append(" openMsgId:");
                com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755 c10677xd5472755 = this;
                sb6.append(c10677xd5472755.U6());
                sb6.append(' ');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MRevokeChat.LandingPageUIC", sb6.toString());
                long j17 = dsVar.f88029a;
                long U6 = c10677xd5472755.U6();
                if (U6 != 0 && j17 == U6) {
                    c10677xd5472755.V6(null);
                }
                return false;
            }
        };
        this.f149330m = jz5.h.b(new cd0.d(this, activity));
        this.f149332o = new cd0.c(new java.lang.ref.WeakReference(this));
    }

    public final long T6(java.lang.String preValueKey, java.util.List keyList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preValueKey, "preValueKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyList, "keyList");
        long longExtra = m158359x1e885992().getLongExtra(preValueKey, 0L);
        if (longExtra != 0) {
            return longExtra;
        }
        java.util.Iterator it = keyList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            android.os.Bundle extras = m158359x1e885992().getExtras();
            java.lang.Object obj = extras != null ? extras.get(str) : null;
            long longValue = obj instanceof java.lang.Long ? ((java.lang.Number) obj).longValue() : (!(obj instanceof java.lang.String) || r26.n0.N((java.lang.CharSequence) obj)) ? 0L : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) obj);
            if (longValue != 0) {
                return longValue;
            }
        }
        return 0L;
    }

    public final long U6() {
        return ((java.lang.Number) ((jz5.n) this.f149324d).mo141623x754a37bb()).longValue();
    }

    public final void V6(java.lang.String str) {
        boolean z17 = true;
        if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d()) {
            this.f149331n = true;
            return;
        }
        android.view.LayoutInflater.Factory m158354x19263085 = m158354x19263085();
        cd0.i iVar = m158354x19263085 instanceof cd0.i ? (cd0.i) m158354x19263085 : null;
        if (iVar != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b) iVar;
            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2549xbc1609e9.C20470xe42e4008()) != 1) {
                if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.s8() || viewOnClickListenerC21748xb3d38e6b.L) {
                    z17 = false;
                } else {
                    viewOnClickListenerC21748xb3d38e6b.f282122J = true;
                    viewOnClickListenerC21748xb3d38e6b.K = str;
                }
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MRevokeChat.LandingPageUIC", "tryGoToHomePage: handled by RevokeHandler");
                return;
            }
        }
        ((jz5.n) this.f149330m).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f149328h.mo48813x58998cd();
        this.f149329i.mo48813x58998cd();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(this.f149332o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MRevokeChat.LandingPageUIC", "onCreate() openMsgId:" + U6() + " openMsgSrvId:" + ((java.lang.Number) ((jz5.n) this.f149326f).mo141623x754a37bb()).longValue() + " act:" + m158354x19263085().getClass().getSimpleName());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40976xa01141ab(this.f149332o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MRevokeChat.LandingPageUIC", "onDestroy()");
    }
}

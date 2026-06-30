package com.tencent.mm.feature.revoke;

/* loaded from: classes5.dex */
public final class RevokeChattingLandingPageUIC extends wm3.a {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.List f67788p = kz5.c0.i("img_gallery_msg_id", "Chat_Msg_Id", "app_msg_id");

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.List f67789q = kz5.c0.i("img_gallery_talker", "Chat_User", "msg_talker", "key_group_solitatire_chatroom_username");

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.List f67790r = kz5.c0.i("img_gallery_msg_svr_id", "serverMsgID");

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f67791d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f67792e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f67793f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f67794g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f67795h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f67796i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f67797m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f67798n;

    /* renamed from: o, reason: collision with root package name */
    public final cd0.c f67799o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevokeChattingLandingPageUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f67791d = jz5.h.b(new cd0.f(this));
        this.f67792e = jz5.h.b(new cd0.h(this));
        this.f67793f = jz5.h.b(new cd0.g(this));
        this.f67794g = jz5.h.b(new cd0.e(this));
        this.f67795h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RevokeMsgEvent>(activity) { // from class: com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC$revokeReceiveMessageListener$1
            {
                this.__eventId = 675629679;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
            
                if ((r5 != 0 && r3 == r5) != false) goto L18;
             */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.RevokeMsgEvent r12) {
                /*
                    r11 = this;
                    com.tencent.mm.autogen.events.RevokeMsgEvent r12 = (com.tencent.mm.autogen.events.RevokeMsgEvent) r12
                    java.lang.String r0 = "event"
                    kotlin.jvm.internal.o.g(r12, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "RevokeMsgEvent called with: eventMsgId:"
                    r0.<init>(r1)
                    am.cs r12 = r12.f54713g
                    long r1 = r12.f6394a
                    r0.append(r1)
                    java.lang.String r1 = " openMsgId:"
                    r0.append(r1)
                    com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC r1 = r2
                    long r2 = r1.U6()
                    r0.append(r2)
                    java.lang.String r2 = " eventMsgSrvId:"
                    r0.append(r2)
                    long r2 = r12.f6398e
                    r0.append(r2)
                    java.lang.String r2 = " openMsgSrvId:"
                    r0.append(r2)
                    jz5.g r2 = r1.f67793f
                    r3 = r2
                    jz5.n r3 = (jz5.n) r3
                    java.lang.Object r3 = r3.getValue()
                    java.lang.Number r3 = (java.lang.Number) r3
                    long r3 = r3.longValue()
                    r0.append(r3)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r3 = "MRevokeChat.LandingPageUIC"
                    com.tencent.mars.xlog.Log.i(r3, r0)
                    long r3 = r12.f6394a
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
                    long r3 = r12.f6398e
                    jz5.n r2 = (jz5.n) r2
                    java.lang.Object r0 = r2.getValue()
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
                    java.lang.String r12 = r12.f6395b
                    r1.V6(r12)
                L85:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC$revokeReceiveMessageListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f67796i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RevokeNativeMsgEvent>(activity) { // from class: com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC$mRevokeNativeMessageListener$1
            {
                this.__eventId = 690552614;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RevokeNativeMsgEvent revokeNativeMsgEvent) {
                com.tencent.mm.autogen.events.RevokeNativeMsgEvent event = revokeNativeMsgEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("RevokeNativeMsgEvent called with: eventMsgId:");
                am.ds dsVar = event.f54714g;
                sb6.append(dsVar.f6496a);
                sb6.append(" openMsgId:");
                com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC revokeChattingLandingPageUIC = this;
                sb6.append(revokeChattingLandingPageUIC.U6());
                sb6.append(' ');
                com.tencent.mars.xlog.Log.i("MRevokeChat.LandingPageUIC", sb6.toString());
                long j17 = dsVar.f6496a;
                long U6 = revokeChattingLandingPageUIC.U6();
                if (U6 != 0 && j17 == U6) {
                    revokeChattingLandingPageUIC.V6(null);
                }
                return false;
            }
        };
        this.f67797m = jz5.h.b(new cd0.d(this, activity));
        this.f67799o = new cd0.c(new java.lang.ref.WeakReference(this));
    }

    public final long T6(java.lang.String preValueKey, java.util.List keyList) {
        kotlin.jvm.internal.o.g(preValueKey, "preValueKey");
        kotlin.jvm.internal.o.g(keyList, "keyList");
        long longExtra = getIntent().getLongExtra(preValueKey, 0L);
        if (longExtra != 0) {
            return longExtra;
        }
        java.util.Iterator it = keyList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            android.os.Bundle extras = getIntent().getExtras();
            java.lang.Object obj = extras != null ? extras.get(str) : null;
            long longValue = obj instanceof java.lang.Long ? ((java.lang.Number) obj).longValue() : (!(obj instanceof java.lang.String) || r26.n0.N((java.lang.CharSequence) obj)) ? 0L : com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) obj);
            if (longValue != 0) {
                return longValue;
            }
        }
        return 0L;
    }

    public final long U6() {
        return ((java.lang.Number) ((jz5.n) this.f67791d).getValue()).longValue();
    }

    public final void V6(java.lang.String str) {
        boolean z17 = true;
        if (!com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground()) {
            this.f67798n = true;
            return;
        }
        android.view.LayoutInflater.Factory activity = getActivity();
        cd0.i iVar = activity instanceof cd0.i ? (cd0.i) activity : null;
        if (iVar != null) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = (com.tencent.mm.ui.chatting.gallery.ImageGalleryUI) iVar;
            if (j62.e.g().c(new com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigImageGalleryRevokeEnabled()) != 1) {
                if (!com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.s8() || imageGalleryUI.L) {
                    z17 = false;
                } else {
                    imageGalleryUI.f200589J = true;
                    imageGalleryUI.K = str;
                }
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MRevokeChat.LandingPageUIC", "tryGoToHomePage: handled by RevokeHandler");
                return;
            }
        }
        ((jz5.n) this.f67797m).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f67795h.alive();
        this.f67796i.alive();
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(this.f67799o);
        com.tencent.mars.xlog.Log.i("MRevokeChat.LandingPageUIC", "onCreate() openMsgId:" + U6() + " openMsgSrvId:" + ((java.lang.Number) ((jz5.n) this.f67793f).getValue()).longValue() + " act:" + getActivity().getClass().getSimpleName());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.removeLifecycleCallback(this.f67799o);
        com.tencent.mars.xlog.Log.i("MRevokeChat.LandingPageUIC", "onDestroy()");
    }
}

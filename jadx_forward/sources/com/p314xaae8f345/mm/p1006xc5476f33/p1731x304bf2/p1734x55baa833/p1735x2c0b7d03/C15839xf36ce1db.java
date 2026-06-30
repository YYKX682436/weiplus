package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03;

/* renamed from: com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment */
/* loaded from: classes15.dex */
public class C15839xf36ce1db extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 implements u33.l {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f220241d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d f220242e;

    /* renamed from: f, reason: collision with root package name */
    public final int f220243f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 f220244g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f220245h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f220246i;

    /* renamed from: m, reason: collision with root package name */
    public int f220247m;

    /* renamed from: p, reason: collision with root package name */
    public u33.h f220250p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15724x3096736f f220251q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f220252r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f220253s;

    /* renamed from: t, reason: collision with root package name */
    public long f220254t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5745x9ed8c837 f220255u;

    /* renamed from: n, reason: collision with root package name */
    public boolean f220248n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f220249o = -1;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f220256v = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5745x9ed8c837>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment.1
        {
            this.f39173x3fe91575 = 86036039;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5745x9ed8c837 c5745x9ed8c837) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5745x9ed8c837 c5745x9ed8c8372 = c5745x9ed8c837;
            int i17 = c5745x9ed8c8372.f136068g.f88311a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db c15839xf36ce1db = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db.this;
            if (i17 == 1) {
                if (!c15839xf36ce1db.f220248n || (c15859x7405890d = c15839xf36ce1db.f220242e) == null) {
                    c15839xf36ce1db.f220255u = c5745x9ed8c8372;
                } else {
                    c15859x7405890d.u1(c5745x9ed8c8372);
                    c15839xf36ce1db.f220255u = null;
                }
            } else if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d2 = c15839xf36ce1db.f220242e;
                if (c15859x7405890d2 != null && c15859x7405890d2.f220509v2.getTag() != null) {
                    c15859x7405890d2.f220509v2.setTag(null);
                    android.view.View view = c15859x7405890d2.f220509v2;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "hideNewUserSpeakBubble", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "hideNewUserSpeakBubble", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                c15839xf36ce1db.f220255u = null;
            }
            return false;
        }
    };

    public C15839xf36ce1db(java.lang.String str, int i17) {
        this.f220246i = str;
        this.f220243f = i17;
    }

    @Override // u33.l
    public void I(java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = this.f220242e;
        if (c15859x7405890d != null) {
            c15859x7405890d.I(map);
        }
    }

    @Override // u33.l
    public void c0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = this.f220242e;
        if (c15859x7405890d != null) {
            c15859x7405890d.getClass();
        }
    }

    public final void j0() {
        if (this.f220248n) {
            l0(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = this.f220242e;
        if (c15859x7405890d != null) {
            if (this.f220248n) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5745x9ed8c837 c5745x9ed8c837 = this.f220255u;
                c15859x7405890d.K2 = c15859x7405890d.f220507t2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatListView", "onResume, channelId:%d", java.lang.Integer.valueOf(c15859x7405890d.f220500m2));
                c15859x7405890d.L2 = true;
                c15859x7405890d.u1(c5745x9ed8c837);
                this.f220255u = null;
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatListView", "onPause, channelId:%d", java.lang.Integer.valueOf(c15859x7405890d.f220500m2));
            c15859x7405890d.L2 = false;
            if (c15859x7405890d.f220500m2 == 0) {
                c15859x7405890d.f220493f2.z(2, true, false);
            }
            if (c15859x7405890d.f220509v2.getTag() != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5745x9ed8c837 c5745x9ed8c8372 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5745x9ed8c837();
                c5745x9ed8c8372.f136068g.f88311a = 2;
                c5745x9ed8c8372.e();
            }
        }
    }

    public final void l0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15787x624e3a12 c15787x624e3a12;
        if (this.f220241d == null || this.f220242e != null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ChatChannelFragment", "ChatChannelFragment initChatList, channelId:%d", java.lang.Integer.valueOf(this.f220247m));
        ((android.view.ViewStub) this.f220241d.findViewById(com.p314xaae8f345.mm.R.id.f569114p24)).inflate();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d) this.f220241d.findViewById(com.p314xaae8f345.mm.R.id.f566635gj5);
        this.f220242e = c15859x7405890d2;
        java.lang.String str = this.f220246i;
        c15859x7405890d2.m64431xc62e2123(str);
        this.f220242e.t1(this.f220247m, this.f220245h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d3 = this.f220242e;
        android.view.View view = this.f220241d;
        boolean z18 = true;
        if (c15859x7405890d3.f220509v2 == null) {
            c15859x7405890d3.f220509v2 = view.findViewById(com.p314xaae8f345.mm.R.id.osu);
            c15859x7405890d3.f220510w2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.osv);
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ost);
            c15859x7405890d3.f220511x2 = imageView;
            if (!(c15859x7405890d3.f220500m2 == 0)) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79868x8752620f);
            }
            android.view.View view2 = c15859x7405890d3.f220509v2;
            if (view2 != null) {
                view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.u2(c15859x7405890d3));
            }
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.a5u);
            c15859x7405890d3.f220512y2 = findViewById;
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.v2(c15859x7405890d3));
            c15859x7405890d3.f220513z2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a5v);
        }
        this.f220242e.m64430x5e5629f3();
        u33.h hVar = this.f220250p;
        if (hVar != null) {
            this.f220250p = hVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d4 = this.f220242e;
            if (c15859x7405890d4 != null) {
                c15859x7405890d4.m64433x21b25396(hVar);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15724x3096736f c15724x3096736f = this.f220251q;
        if (c15724x3096736f != null) {
            this.f220251q = c15724x3096736f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d5 = this.f220242e;
            if (c15859x7405890d5 != null) {
                c15859x7405890d5.m64432xb8727ff1(c15724x3096736f);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f220252r;
        if (c15780xf49d6a1c != null) {
            this.f220252r = c15780xf49d6a1c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d6 = this.f220242e;
            if (c15859x7405890d6 != null) {
                c15859x7405890d6.m64435x49fad495(c15780xf49d6a1c);
            }
        }
        java.lang.String str2 = this.f220253s;
        if (str2 != null) {
            this.f220253s = str2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d7 = this.f220242e;
            if (c15859x7405890d7 != null) {
                c15859x7405890d7.m64436xb9ff1174(str2);
            }
        }
        long j17 = this.f220254t;
        if (j17 != 0) {
            this.f220254t = j17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d8 = this.f220242e;
            if (c15859x7405890d8 != null) {
                c15859x7405890d8.m64434x97990b5f(j17);
            }
        }
        j0();
        if (!z17 || this.f220249o != -1 || (c15859x7405890d = this.f220242e) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5580x225208dc c5580x225208dc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5580x225208dc();
        am.we weVar = c5580x225208dc.f135902g;
        weVar.f89811a = 1;
        weVar.f89812b = "cache_game_chat_msg#" + str + c15859x7405890d.I2;
        c5580x225208dc.e();
        byte[] bArr = weVar.f89813c;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            return;
        }
        try {
            c15787x624e3a12 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15787x624e3a12();
        } catch (java.io.IOException unused) {
            c15787x624e3a12 = null;
        }
        try {
            c15787x624e3a12.mo11468x92b714fd(bArr);
        } catch (java.io.IOException unused2) {
            z18 = false;
            if (c15787x624e3a12 == null) {
            } else {
                return;
            }
        }
        if (c15787x624e3a12 == null && z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatListView", "addLastCacheData, user cache, channelId:%d", java.lang.Integer.valueOf(c15859x7405890d.f220500m2));
            u33.h Bi = ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Bi(c15787x624e3a12.f36756xd4d2eca8);
            c15859x7405890d.f220505r2 = Bi;
            if (Bi != null) {
                c15859x7405890d.o1(c15787x624e3a12.f36755x11465d28, 8, null);
            }
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.f220256v.mo48813x58998cd();
        if (this.f220241d == null) {
            this.f220241d = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569914rs, viewGroup, false);
            this.f220249o = ((android.app.Activity) viewGroup.getContext()).getIntent().getIntExtra("target_channel_id", -1);
            int i17 = this.f220247m;
            boolean z17 = (i17 == 0) || i17 == this.f220243f;
            if (z17) {
                try {
                    l0(z17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ChatChannelFragment", "err:" + e17.getMessage());
                }
            }
        }
        return this.f220241d;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
        this.f220256v.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: setUserVisibleHint */
    public void mo7583x951b248c(boolean z17) {
        super.mo7583x951b248c(z17);
        this.f220248n = z17;
        j0();
    }
}

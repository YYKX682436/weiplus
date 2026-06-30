package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI;", "Lcom/tencent/mm/plugin/emoji/ui/picker/EmojiMediaPickerUI;", "<init>", "()V", "e22/e1", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI */
/* loaded from: classes10.dex */
public final class ActivityC13339x8f3095f9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520 {

    /* renamed from: p, reason: collision with root package name */
    public static final e22.e1 f179687p = new e22.e1(null);

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f179688i;

    /* renamed from: m, reason: collision with root package name */
    public int f179689m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13340xd9e4c60a f179690n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f179691o;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13336xbf8c9cdf U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13340xd9e4c60a c13340xd9e4c60a = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13340xd9e4c60a();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("query_source_type", getIntent().getIntExtra("query_source_type", 11));
        bundle.putString("appId", getIntent().getStringExtra("appId"));
        bundle.putString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, getIntent().getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f));
        bundle.putString("query", getIntent().getStringExtra("query"));
        c13340xd9e4c60a.mo7562xe26dab14(bundle);
        this.f179690n = c13340xd9e4c60a;
        return c13340xd9e4c60a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13337xeb4c2673 V6() {
        android.content.Intent intent = getIntent();
        intent.putExtra("max_select_count", 1);
        intent.putExtra("query_source_type", getIntent().getIntExtra("query_source_type", 11));
        intent.putExtra("is_from_emoji_ALBUM", true);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("need_to_clear_top", true);
        intent.putExtra("show_header_view", false);
        intent.addFlags(67108864);
        getIntent().putExtra("album_video_max_duration", 9999);
        getIntent().putExtra("extra_hide_footer", true);
        getIntent().putExtra("key_can_select_video_and_pic", true);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
        java.util.ArrayList arrayList = n22.m.f415828a;
        java.util.ArrayList a17 = gr.t.g().a();
        int i17 = 0;
        for (int i18 = 0; i18 < a17.size(); i18++) {
            if (!n22.m.m(((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) a17.get(i18)).mo42933xb5885648())) {
                i17++;
            }
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
        getIntent().putExtra("max_select_count", java.lang.Math.min(9, gr.z.a() - i17));
        getIntent().putExtra("is_hide_album_preview_footer", true);
        getIntent().putExtra("key_from_scene", this.f179679h);
        java.lang.String str = this.f179691o;
        if (str != null) {
            getIntent().putExtra("addstickers_sessionid", str);
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13337xeb4c2673) lk5.q0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.p1728x5c28046.ActivityC15662x9c49ac73.class, getIntent(), false, false, false, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13337xeb4c2673.class, 28, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520
    public void Y6() {
        java.util.ArrayList y76;
        java.util.List list = null;
        if (X6().m20352xe06bcb0d() == 0) {
            e33.f2 f2Var = this.f179677f;
            if (f2Var != null && (y76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) f2Var).y7()) != null) {
                list = e22.e1.a(f179687p, y76);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13340xd9e4c60a c13340xd9e4c60a = this.f179690n;
            if (c13340xd9e4c60a == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiFinderTabFragment");
                throw null;
            }
            if (c13340xd9e4c60a.l0()) {
                list = kz5.b0.c(new or.a(1, 2, 3, null, 8, null));
            }
        }
        d7("clk_close_button", list);
        super.Y6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520
    public void Z6(int i17, int i18, android.content.Intent intent) {
        if (i17 == 256 && i18 == -1) {
            setResult(i18, intent);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520
    public void a7(oa.i tab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        if (!c7(tab.f425315e)) {
            oa.i k17 = X6().k(this.f179689m);
            if (k17 != null) {
                k17.b();
            }
            X6().s(this.f179689m, 0.0f, true, true);
            return;
        }
        ((p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById(com.p314xaae8f345.mm.R.id.pvp)).m8317x940d026a(tab.f425315e, true);
        this.f179689m = tab.f425315e;
        e7();
        if (tab.f425315e == 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = this.f179678g;
            if (c22632xdab56332 != null) {
                c22632xdab56332.setTextColor(getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560444ac2));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderTitleView");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520
    public void b7(e33.f2 provider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        super.b7(provider);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) provider).f220054h2 = new e22.h1(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r2 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        db5.e1.s(r11, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574199ob3));
        r12 = r11.f179691o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r12 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r8 = or.c.c("warning_pup_win", r12, 3, null, null, 24, null);
        r3 = r11.f179689m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r3 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        or.d.c(r12, 5, r5, null, 0, r8, 16, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r3 != 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002d, code lost:
    
        if (r12.l0() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c7(int r12) {
        /*
            r11 = this;
            int r0 = r11.f179689m
            r1 = 1
            if (r12 != r0) goto L6
            return r1
        L6:
            r0 = 0
            if (r12 != r1) goto L23
            e33.f2 r2 = r11.f179677f
            if (r2 == 0) goto L20
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) r2
            e33.b0 r2 = r2.f220061m
            if (r2 == 0) goto L1b
            int r2 = r2.J()
            if (r2 <= 0) goto L1b
            r2 = r1
            goto L1c
        L1b:
            r2 = r0
        L1c:
            if (r2 != r1) goto L20
            r2 = r1
            goto L21
        L20:
            r2 = r0
        L21:
            if (r2 != 0) goto L2f
        L23:
            if (r12 != 0) goto L71
            com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment r12 = r11.f179690n
            if (r12 == 0) goto L69
            boolean r12 = r12.l0()
            if (r12 == 0) goto L71
        L2f:
            r12 = 2131772752(0x7f104550, float:1.9176872E38)
            java.lang.String r12 = r11.getString(r12)
            java.lang.String r2 = ""
            db5.e1.s(r11, r2, r12)
            java.lang.String r12 = r11.f179691o
            if (r12 != 0) goto L40
            return r0
        L40:
            java.lang.String r3 = "warning_pup_win"
            r2 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r2 = 0
            r7 = 0
            r8 = 24
            r9 = 0
            r6 = 0
            r4 = r12
            java.lang.String r8 = or.c.c(r3, r4, r5, r6, r7, r8, r9)
            r4 = 5
            int r3 = r11.f179689m
            if (r3 != 0) goto L5a
        L58:
            r5 = r1
            goto L5f
        L5a:
            if (r3 != r1) goto L5e
            r1 = 2
            goto L58
        L5e:
            r5 = r0
        L5f:
            r7 = 0
            r9 = 16
            r10 = 0
            r3 = r12
            r6 = r2
            or.d.c(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L69:
            java.lang.String r12 = "multiFinderTabFragment"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r12)
            r12 = 0
            throw r12
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9.c7(int):boolean");
    }

    public final void d7(java.lang.String str, java.util.List list) {
        int i17;
        java.lang.String str2 = this.f179691o;
        if (str2 == null) {
            return;
        }
        java.lang.String c17 = or.c.c(str, str2, java.lang.Integer.valueOf(list != null ? list.size() : 0), list != null ? or.c.d(list) : "", null, 16, null);
        int i18 = 1;
        int i19 = !(list == null || list.isEmpty()) ? ((or.a) kz5.n0.X(list)).f428953c : 0;
        int i27 = this.f179689m;
        if (i27 != 0) {
            if (i27 != 1) {
                i17 = 0;
                or.d.c(str2, 5, i17, java.lang.Integer.valueOf(i19), 0, c17, 16, null);
            }
            i18 = 2;
        }
        i17 = i18;
        or.d.c(str2, 5, i17, java.lang.Integer.valueOf(i19), 0, c17, 16, null);
    }

    public final void e7() {
        java.util.ArrayList y76;
        android.widget.Button button = this.f179688i;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("unifiedNextBtn");
            throw null;
        }
        button.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww));
        if (X6().m20352xe06bcb0d() == 0) {
            e33.f2 f2Var = this.f179677f;
            java.lang.Integer valueOf = (f2Var == null || (y76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) f2Var).y7()) == null) ? null : java.lang.Integer.valueOf(y76.size());
            if (valueOf != null && valueOf.intValue() > 0) {
                android.widget.Button button2 = this.f179688i;
                if (button2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("unifiedNextBtn");
                    throw null;
                }
                button2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww) + '(' + valueOf + ')');
                android.widget.Button button3 = this.f179688i;
                if (button3 != null) {
                    button3.setEnabled(true);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("unifiedNextBtn");
                    throw null;
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13340xd9e4c60a c13340xd9e4c60a = this.f179690n;
            if (c13340xd9e4c60a == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiFinderTabFragment");
                throw null;
            }
            if (c13340xd9e4c60a.l0()) {
                android.widget.Button button4 = this.f179688i;
                if (button4 != null) {
                    button4.setEnabled(true);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("unifiedNextBtn");
                    throw null;
                }
            }
        }
        android.widget.Button button5 = this.f179688i;
        if (button5 != null) {
            button5.setEnabled(false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("unifiedNextBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("addstickers_sessionid");
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            this.f179691o = stringExtra;
        }
        super.onCreate(bundle);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.t7w);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI", "initUnifiedFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI", "initUnifiedFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.t7k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById2;
        this.f179688i = button;
        button.setVisibility(0);
        android.widget.Button button2 = this.f179688i;
        if (button2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("unifiedNextBtn");
            throw null;
        }
        button2.setTextSize(0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b));
        android.widget.Button button3 = this.f179688i;
        if (button3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("unifiedNextBtn");
            throw null;
        }
        button3.setTextColor(getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560695rm));
        android.widget.Button button4 = this.f179688i;
        if (button4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("unifiedNextBtn");
            throw null;
        }
        button4.setOnClickListener(new e22.f1(this));
        e7();
        W6().setOnClickListener(new e22.g1(this));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13335xb2f0fe17) findViewById(com.p314xaae8f345.mm.R.id.pvp)).m54823x5bdaeab9(true);
    }
}

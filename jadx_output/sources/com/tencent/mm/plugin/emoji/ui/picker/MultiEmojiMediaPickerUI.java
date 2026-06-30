package com.tencent.mm.plugin.emoji.ui.picker;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI;", "Lcom/tencent/mm/plugin/emoji/ui/picker/EmojiMediaPickerUI;", "<init>", "()V", "e22/e1", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MultiEmojiMediaPickerUI extends com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI {

    /* renamed from: p, reason: collision with root package name */
    public static final e22.e1 f98154p = new e22.e1(null);

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f98155i;

    /* renamed from: m, reason: collision with root package name */
    public int f98156m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment f98157n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f98158o;

    @Override // com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI
    public com.tencent.mm.plugin.emoji.ui.picker.FinderTabFragment U6() {
        com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment multiSelectFinderTabFragment = new com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("query_source_type", getIntent().getIntExtra("query_source_type", 11));
        bundle.putString("appId", getIntent().getStringExtra("appId"));
        bundle.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE));
        bundle.putString("query", getIntent().getStringExtra("query"));
        multiSelectFinderTabFragment.setArguments(bundle);
        this.f98157n = multiSelectFinderTabFragment;
        return multiSelectFinderTabFragment;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI
    public com.tencent.mm.plugin.emoji.ui.picker.GalleryTabFragment V6() {
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
        ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
        java.util.ArrayList arrayList = n22.m.f334295a;
        java.util.ArrayList a17 = gr.t.g().a();
        int i17 = 0;
        for (int i18 = 0; i18 < a17.size(); i18++) {
            if (!n22.m.m(((com.tencent.mm.storage.emotion.EmojiInfo) a17.get(i18)).getMd5())) {
                i17++;
            }
        }
        ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
        getIntent().putExtra("max_select_count", java.lang.Math.min(9, gr.z.a() - i17));
        getIntent().putExtra("is_hide_album_preview_footer", true);
        getIntent().putExtra("key_from_scene", this.f98146h);
        java.lang.String str = this.f98158o;
        if (str != null) {
            getIntent().putExtra("addstickers_sessionid", str);
        }
        return (com.tencent.mm.plugin.emoji.ui.picker.GalleryTabFragment) lk5.q0.a(com.tencent.mm.plugin.gallery.ui.emoji.EmojiAlbumPreviewUI.class, getIntent(), false, false, false, com.tencent.mm.plugin.emoji.ui.picker.GalleryTabFragment.class, 28, null);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI
    public void Y6() {
        java.util.ArrayList y76;
        java.util.List list = null;
        if (X6().getSelectedTabPosition() == 0) {
            e33.f2 f2Var = this.f98144f;
            if (f2Var != null && (y76 = ((com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) f2Var).y7()) != null) {
                list = e22.e1.a(f98154p, y76);
            }
        } else {
            com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment multiSelectFinderTabFragment = this.f98157n;
            if (multiSelectFinderTabFragment == null) {
                kotlin.jvm.internal.o.o("multiFinderTabFragment");
                throw null;
            }
            if (multiSelectFinderTabFragment.l0()) {
                list = kz5.b0.c(new or.a(1, 2, 3, null, 8, null));
            }
        }
        d7("clk_close_button", list);
        super.Y6();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI
    public void Z6(int i17, int i18, android.content.Intent intent) {
        if (i17 == 256 && i18 == -1) {
            setResult(i18, intent);
            finish();
        }
    }

    @Override // com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI
    public void a7(oa.i tab) {
        kotlin.jvm.internal.o.g(tab, "tab");
        if (!c7(tab.f343782e)) {
            oa.i k17 = X6().k(this.f98156m);
            if (k17 != null) {
                k17.b();
            }
            X6().s(this.f98156m, 0.0f, true, true);
            return;
        }
        ((androidx.viewpager.widget.ViewPager) findViewById(com.tencent.mm.R.id.pvp)).setCurrentItem(tab.f343782e, true);
        this.f98156m = tab.f343782e;
        e7();
        if (tab.f343782e == 1) {
            com.tencent.mm.ui.widget.MMTextView mMTextView = this.f98145g;
            if (mMTextView != null) {
                mMTextView.setTextColor(getResources().getColorStateList(com.tencent.mm.R.color.f478911ac2));
            } else {
                kotlin.jvm.internal.o.o("finderTitleView");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI
    public void b7(e33.f2 provider) {
        kotlin.jvm.internal.o.g(provider, "provider");
        super.b7(provider);
        ((com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) provider).f138521h2 = new e22.h1(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r2 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        db5.e1.s(r11, "", getString(com.tencent.mm.R.string.f492666ob3));
        r12 = r11.f98158o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r12 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r8 = or.c.c("warning_pup_win", r12, 3, null, null, 24, null);
        r3 = r11.f98156m;
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
            int r0 = r11.f98156m
            r1 = 1
            if (r12 != r0) goto L6
            return r1
        L6:
            r0 = 0
            if (r12 != r1) goto L23
            e33.f2 r2 = r11.f98144f
            if (r2 == 0) goto L20
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r2 = (com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) r2
            e33.b0 r2 = r2.f138528m
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
            com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment r12 = r11.f98157n
            if (r12 == 0) goto L69
            boolean r12 = r12.l0()
            if (r12 == 0) goto L71
        L2f:
            r12 = 2131772752(0x7f104550, float:1.9176872E38)
            java.lang.String r12 = r11.getString(r12)
            java.lang.String r2 = ""
            db5.e1.s(r11, r2, r12)
            java.lang.String r12 = r11.f98158o
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
            int r3 = r11.f98156m
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
            kotlin.jvm.internal.o.o(r12)
            r12 = 0
            throw r12
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI.c7(int):boolean");
    }

    public final void d7(java.lang.String str, java.util.List list) {
        int i17;
        java.lang.String str2 = this.f98158o;
        if (str2 == null) {
            return;
        }
        java.lang.String c17 = or.c.c(str, str2, java.lang.Integer.valueOf(list != null ? list.size() : 0), list != null ? or.c.d(list) : "", null, 16, null);
        int i18 = 1;
        int i19 = !(list == null || list.isEmpty()) ? ((or.a) kz5.n0.X(list)).f347420c : 0;
        int i27 = this.f98156m;
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
        android.widget.Button button = this.f98155i;
        if (button == null) {
            kotlin.jvm.internal.o.o("unifiedNextBtn");
            throw null;
        }
        button.setText(getString(com.tencent.mm.R.string.f490502ww));
        if (X6().getSelectedTabPosition() == 0) {
            e33.f2 f2Var = this.f98144f;
            java.lang.Integer valueOf = (f2Var == null || (y76 = ((com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) f2Var).y7()) == null) ? null : java.lang.Integer.valueOf(y76.size());
            if (valueOf != null && valueOf.intValue() > 0) {
                android.widget.Button button2 = this.f98155i;
                if (button2 == null) {
                    kotlin.jvm.internal.o.o("unifiedNextBtn");
                    throw null;
                }
                button2.setText(getString(com.tencent.mm.R.string.f490502ww) + '(' + valueOf + ')');
                android.widget.Button button3 = this.f98155i;
                if (button3 != null) {
                    button3.setEnabled(true);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("unifiedNextBtn");
                    throw null;
                }
            }
        } else {
            com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment multiSelectFinderTabFragment = this.f98157n;
            if (multiSelectFinderTabFragment == null) {
                kotlin.jvm.internal.o.o("multiFinderTabFragment");
                throw null;
            }
            if (multiSelectFinderTabFragment.l0()) {
                android.widget.Button button4 = this.f98155i;
                if (button4 != null) {
                    button4.setEnabled(true);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("unifiedNextBtn");
                    throw null;
                }
            }
        }
        android.widget.Button button5 = this.f98155i;
        if (button5 != null) {
            button5.setEnabled(false);
        } else {
            kotlin.jvm.internal.o.o("unifiedNextBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("addstickers_sessionid");
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            this.f98158o = stringExtra;
        }
        super.onCreate(bundle);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.t7w);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI", "initUnifiedFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI", "initUnifiedFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.t7k);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById2;
        this.f98155i = button;
        button.setVisibility(0);
        android.widget.Button button2 = this.f98155i;
        if (button2 == null) {
            kotlin.jvm.internal.o.o("unifiedNextBtn");
            throw null;
        }
        button2.setTextSize(0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479559b));
        android.widget.Button button3 = this.f98155i;
        if (button3 == null) {
            kotlin.jvm.internal.o.o("unifiedNextBtn");
            throw null;
        }
        button3.setTextColor(getResources().getColorStateList(com.tencent.mm.R.color.f479162rm));
        android.widget.Button button4 = this.f98155i;
        if (button4 == null) {
            kotlin.jvm.internal.o.o("unifiedNextBtn");
            throw null;
        }
        button4.setOnClickListener(new e22.f1(this));
        e7();
        W6().setOnClickListener(new e22.g1(this));
        ((com.tencent.mm.plugin.emoji.ui.picker.EmojiUploadViewPager) findViewById(com.tencent.mm.R.id.pvp)).setDisableTouch(true);
    }
}

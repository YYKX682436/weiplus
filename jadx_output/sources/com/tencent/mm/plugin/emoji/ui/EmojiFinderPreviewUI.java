package com.tencent.mm.plugin.emoji.ui;

@db5.a(34)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiFinderPreviewUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes10.dex */
public final class EmojiFinderPreviewUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f97776d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout f97777e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f97778f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f97779g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f97780h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f97781i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f97782m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f97783n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f97784o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.FrameLayout f97785p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f97786q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f97787r = true;

    public static final void T6(com.tencent.mm.plugin.emoji.ui.EmojiFinderPreviewUI emojiFinderPreviewUI) {
        kk4.b player;
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = emojiFinderPreviewUI.f97777e;
        if (mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null) {
            return;
        }
        if (emojiFinderPreviewUI.f97787r) {
            kk4.b.i(player, false, false, 3, null);
            emojiFinderPreviewUI.f97787r = false;
            emojiFinderPreviewUI.U6(true);
            com.tencent.mars.xlog.Log.i("EmojiFinderPreviewUI", "togglePlayPause: pause");
            return;
        }
        ((kk4.v) player).O();
        emojiFinderPreviewUI.f97787r = true;
        emojiFinderPreviewUI.U6(false);
        com.tencent.mars.xlog.Log.i("EmojiFinderPreviewUI", "togglePlayPause: play");
    }

    public final void U6(boolean z17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f97780h;
        if (weImageView != null) {
            weImageView.setVisibility(z17 ? 0 : 8);
        }
        android.view.View view = this.f97781i;
        if (view == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiFinderPreviewUI", "showPlayIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiFinderPreviewUI", "showPlayIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e4v;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        ya2.b2 b2Var;
        android.widget.ImageView imageView;
        java.lang.String username;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(-16777216);
        com.tencent.mm.ui.bk.i0(getWindow(), false);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_finder_object_bytes");
        if (byteArrayExtra != null) {
            finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
            finderObject.parseFrom(byteArrayExtra);
        } else {
            finderObject = null;
        }
        this.f97776d = finderObject;
        if (finderObject == null) {
            com.tencent.mars.xlog.Log.e("EmojiFinderPreviewUI", "finderObject is null, finish");
            finish();
            return;
        }
        this.f97778f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.o78);
        this.f97779g = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.oy7);
        this.f97780h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.g99);
        this.f97781i = findViewById(com.tencent.mm.R.id.g4y);
        this.f97782m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a8f);
        this.f97783n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a8p);
        this.f97784o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.i1f);
        this.f97785p = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.coc);
        this.f97786q = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.aa9);
        int h17 = com.tencent.mm.ui.bl.h(this);
        android.widget.FrameLayout frameLayout = this.f97785p;
        if (frameLayout != null) {
            frameLayout.setPadding(0, h17, 0, 0);
        }
        android.widget.FrameLayout frameLayout2 = this.f97785p;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout = this.f97786q;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.h2(this));
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f97776d;
        if (finderObject2 != null) {
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject2.getObjectDesc();
            com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = (objectDesc == null || (media = objectDesc.getMedia()) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media);
            if (finderMedia == null) {
                com.tencent.mars.xlog.Log.e("EmojiFinderPreviewUI", "mediaList is empty");
            } else {
                java.lang.String str = finderMedia.getThumbUrl() + finderMedia.getThumb_url_token();
                android.widget.ImageView imageView2 = this.f97778f;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    mn2.h3 e17 = ya2.l.f460502a.e(str, com.tencent.mm.plugin.finder.storage.y90.f128356f);
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    g1Var.e().c(e17, imageView2, g1Var.h(mn2.f1.B));
                }
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                kotlin.jvm.internal.o.d(b6Var);
                float h37 = zy2.b6.h3(b6Var, "EmojiFinderPreviewUI", finderObject2, false, 4, null);
                jz5.l a17 = hc2.f1.a(this, h37, getResources().getDisplayMetrics().heightPixels, "EmojiFinderPreviewUI", 0L, 0, 0, 32, null);
                jz5.o oVar = (jz5.o) a17.f302833d;
                jz5.l lVar = (jz5.l) a17.f302834e;
                com.tencent.mars.xlog.Log.i("EmojiFinderPreviewUI", "initVideoPlayer: ratio=" + h37 + ", parentParams=" + oVar + ", childParams=" + lVar);
                com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = new com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout((android.content.Context) this, false);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(((java.lang.Number) lVar.f302833d).intValue(), ((java.lang.Number) lVar.f302834e).intValue());
                layoutParams.gravity = ((java.lang.Number) oVar.f302843f).intValue();
                mMTPEffectVideoLayout.setLayoutParams(layoutParams);
                mMTPEffectVideoLayout.f();
                dk4.a sj6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).sj(finderObject2);
                if (sj6 == null) {
                    com.tencent.mars.xlog.Log.e("EmojiFinderPreviewUI", "createTPMediaInfo return null");
                } else {
                    mMTPEffectVideoLayout.setMediaInfo(sj6);
                    mMTPEffectVideoLayout.setKeepScreenOn(true);
                    kk4.b player = mMTPEffectVideoLayout.getPlayer();
                    if (player != null) {
                        ((kk4.v) player).f308585j = true;
                    }
                    kk4.b player2 = mMTPEffectVideoLayout.getPlayer();
                    if (player2 != null) {
                        ((kk4.v) player2).A(true);
                    }
                    kk4.b player3 = mMTPEffectVideoLayout.getPlayer();
                    if (player3 != null) {
                        ((kk4.v) player3).C(false);
                    }
                    mMTPEffectVideoLayout.setOnFirstFrameAvailable(new com.tencent.mm.plugin.emoji.ui.i2(this));
                    kk4.b player4 = mMTPEffectVideoLayout.getPlayer();
                    if (player4 != null) {
                        ((kk4.v) player4).O();
                    }
                    this.f97777e = mMTPEffectVideoLayout;
                    android.widget.FrameLayout frameLayout3 = this.f97779g;
                    if (frameLayout3 != null) {
                        android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout3.getLayoutParams();
                        android.widget.FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams2 : null;
                        if (layoutParams3 != null) {
                            layoutParams3.topMargin = ((java.lang.Number) oVar.f302841d).intValue();
                            layoutParams3.bottomMargin = ((java.lang.Number) oVar.f302842e).intValue();
                            layoutParams3.gravity = ((java.lang.Number) oVar.f302843f).intValue();
                        } else {
                            layoutParams3 = null;
                        }
                        frameLayout3.setLayoutParams(layoutParams3);
                    }
                    android.widget.FrameLayout frameLayout4 = this.f97779g;
                    if (frameLayout4 != null) {
                        frameLayout4.addView(this.f97777e, 0);
                    }
                    android.widget.FrameLayout frameLayout5 = this.f97779g;
                    if (frameLayout5 != null) {
                        frameLayout5.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.j2(this));
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f97780h;
                    if (weImageView != null) {
                        weImageView.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.k2(this));
                    }
                }
            }
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = this.f97776d;
        if (finderObject3 == null) {
            return;
        }
        zy2.b6 b6Var2 = (zy2.b6) i95.n0.c(zy2.b6.class);
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject3.getContact();
        if (contact == null || (username = contact.getUsername()) == null) {
            b2Var = null;
        } else {
            c61.l7 l7Var = (c61.l7) b6Var2;
            l7Var.getClass();
            b2Var = l7Var.Jj().y0(username);
        }
        java.lang.String nickname = finderObject3.getNickname();
        if (nickname == null) {
            java.lang.String w07 = b2Var != null ? b2Var.w0() : null;
            nickname = w07 == null ? "" : w07;
        }
        java.lang.String avatarUrl = b2Var != null ? b2Var.getAvatarUrl() : "";
        android.widget.TextView textView = this.f97783n;
        if (textView != null) {
            textView.setText(nickname);
        }
        if ((avatarUrl.length() > 0) && (imageView = this.f97782m) != null) {
            ((c61.l7) b6Var2).getClass();
            ya2.l.f460502a.g(imageView, avatarUrl, com.tencent.mm.plugin.finder.storage.y90.W);
        }
        int likeCount = finderObject3.getLikeCount();
        java.lang.String il6 = likeCount > 0 ? ((c61.l7) b6Var2).il(likeCount) : "0";
        android.widget.TextView textView2 = this.f97784o;
        if (textView2 == null) {
            return;
        }
        textView2.setText(il6);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        kk4.b player;
        kk4.b player2;
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("EmojiFinderPreviewUI", "onDestroy");
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f97777e;
        if (mMTPEffectVideoLayout != null && (player2 = mMTPEffectVideoLayout.getPlayer()) != null) {
            player2.stop();
        }
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.f97777e;
        if (mMTPEffectVideoLayout2 != null && (player = mMTPEffectVideoLayout2.getPlayer()) != null) {
            player.recycle();
        }
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout3 = this.f97777e;
        if (mMTPEffectVideoLayout3 != null) {
            mMTPEffectVideoLayout3.g();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        kk4.b player;
        super.onPause();
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f97777e;
        if (mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null) {
            return;
        }
        kk4.b.i(player, false, false, 3, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        kk4.b player;
        super.onResume();
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f97777e;
        kk4.b player2 = mMTPEffectVideoLayout != null ? mMTPEffectVideoLayout.getPlayer() : null;
        if (player2 != null) {
            ((kk4.v) player2).f308585j = true;
        }
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.f97777e;
        if (mMTPEffectVideoLayout2 == null || (player = mMTPEffectVideoLayout2.getPlayer()) == null) {
            return;
        }
        ((kk4.v) player).O();
    }
}

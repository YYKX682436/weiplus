package com.tencent.mm.plugin.emoji.ui.picker;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/picker/EmojiMediaPickerUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class EmojiMediaPickerUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.picker.GalleryTabTittleView f98142d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f98143e;

    /* renamed from: f, reason: collision with root package name */
    public e33.f2 f98144f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f98145g;

    /* renamed from: h, reason: collision with root package name */
    public int f98146h;

    public com.tencent.mm.plugin.emoji.ui.picker.FinderTabFragment U6() {
        com.tencent.mm.plugin.emoji.ui.picker.FinderTabFragment finderTabFragment = new com.tencent.mm.plugin.emoji.ui.picker.FinderTabFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("query_source_type", getIntent().getIntExtra("query_source_type", 11));
        bundle.putString("appId", getIntent().getStringExtra("appId"));
        bundle.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE));
        bundle.putString("query", getIntent().getStringExtra("query"));
        bundle.putInt("key_from_scene", this.f98146h);
        finderTabFragment.setArguments(bundle);
        return finderTabFragment;
    }

    public com.tencent.mm.plugin.emoji.ui.picker.GalleryTabFragment V6() {
        android.content.Intent intent = getIntent();
        intent.putExtra("max_select_count", 1);
        intent.putExtra("query_source_type", getIntent().getIntExtra("query_source_type", 11));
        intent.putExtra("is_from_emoji_ALBUM", true);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("need_to_clear_top", true);
        intent.putExtra("show_header_view", false);
        intent.putExtra("key_from_scene", this.f98146h);
        intent.addFlags(67108864);
        return (com.tencent.mm.plugin.emoji.ui.picker.GalleryTabFragment) lk5.q0.a(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.class, getIntent(), false, false, false, com.tencent.mm.plugin.emoji.ui.picker.GalleryTabFragment.class, 28, null);
    }

    public final com.tencent.mm.plugin.emoji.ui.picker.GalleryTabTittleView W6() {
        com.tencent.mm.plugin.emoji.ui.picker.GalleryTabTittleView galleryTabTittleView = this.f98142d;
        if (galleryTabTittleView != null) {
            return galleryTabTittleView;
        }
        kotlin.jvm.internal.o.o("galleryTitleView");
        throw null;
    }

    public final com.google.android.material.tabs.TabLayout X6() {
        com.google.android.material.tabs.TabLayout tabLayout = this.f98143e;
        if (tabLayout != null) {
            return tabLayout;
        }
        kotlin.jvm.internal.o.o("tabLayout");
        throw null;
    }

    public void Y6() {
        setResult(0);
        finish();
    }

    public void Z6(int i17, int i18, android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAlbumPickerUI", "onActivityResult data is null");
        }
        setResult(i18, intent);
    }

    public void a7(oa.i tab) {
        kotlin.jvm.internal.o.g(tab, "tab");
        ((androidx.viewpager.widget.ViewPager) findViewById(com.tencent.mm.R.id.pvp)).setCurrentItem(tab.f343782e, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAlbumPickerUI", "onTabSelected, position: " + tab.f343782e);
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

    public void b7(e33.f2 provider) {
        kotlin.jvm.internal.o.g(provider, "provider");
        this.f98144f = provider;
        ((com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) provider).f138519g2 = new e22.f(this);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
        vk5.a.f437771a = 0;
        vk5.a.f437772b = null;
        vk5.a.f437773c = -1;
        vk5.a.f437774d = false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dbx;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        Z6(i17, i18, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (((com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) r0).f138540r.f138565m == true) goto L8;
     */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            r3 = this;
            e33.f2 r0 = r3.f98144f
            if (r0 == 0) goto Lf
            r1 = r0
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r1 = (com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) r1
            com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView r1 = r1.f138540r
            boolean r1 = r1.f138565m
            r2 = 1
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L1c
            if (r0 == 0) goto L1f
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = (com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) r0
            com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView r0 = r0.f138540r
            r0.d()
            goto L1f
        L1c:
            super.onBackPressed()
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI.onBackPressed():void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        int color = getResources().getColor(com.tencent.mm.R.color.f479163rn);
        getWindow().setStatusBarColor(color);
        new n3.m3(getWindow(), getWindow().getDecorView()).c(false);
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-8193));
        hideTitleView();
        setNavigationbarColor(color);
        getWindow().getDecorView().setTag(com.tencent.mm.R.id.p28, this);
        getWindow().getDecorView().setTag(com.tencent.mm.R.id.p2_, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.pvq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f98143e = (com.google.android.material.tabs.TabLayout) findViewById;
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) findViewById(com.tencent.mm.R.id.pvp);
        findViewById(com.tencent.mm.R.id.pvo).setOnClickListener(new e22.a(this));
        this.f98146h = getIntent().getIntExtra("key_from_scene", 0);
        this.f98142d = new com.tencent.mm.plugin.emoji.ui.picker.GalleryTabTittleView(this, null);
        com.tencent.mm.ui.widget.MMTextView mMTextView = new com.tencent.mm.ui.widget.MMTextView(getContext());
        mMTextView.setText(com.tencent.mm.R.string.ldh);
        mMTextView.setTextColor(mMTextView.getResources().getColorStateList(com.tencent.mm.R.color.f478911ac2));
        mMTextView.setTextColor(mMTextView.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        mMTextView.setGravity(17);
        mMTextView.setTextSize(0, mMTextView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479897ia));
        this.f98145g = mMTextView;
        com.google.android.material.tabs.TabLayout X6 = X6();
        oa.i l17 = X6().l();
        l17.f343783f = W6();
        l17.f();
        X6.b(l17);
        com.google.android.material.tabs.TabLayout X62 = X6();
        oa.i l18 = X6().l();
        com.tencent.mm.ui.widget.MMTextView mMTextView2 = this.f98145g;
        if (mMTextView2 == null) {
            kotlin.jvm.internal.o.o("finderTitleView");
            throw null;
        }
        l18.f343783f = mMTextView2;
        l18.f();
        X62.b(l18);
        com.tencent.mm.plugin.emoji.ui.picker.GalleryTabFragment V6 = V6();
        com.tencent.mm.plugin.emoji.ui.picker.FinderTabFragment U6 = U6();
        W6().setOnClickListener(new e22.b(this));
        X6().a(new e22.c(this));
        viewPager.setAdapter(new e22.e(V6, U6, getSupportFragmentManager()));
        viewPager.addOnPageChangeListener(new e22.d(this));
    }
}

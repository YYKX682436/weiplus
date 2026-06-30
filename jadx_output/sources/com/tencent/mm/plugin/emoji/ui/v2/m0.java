package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes11.dex */
public class m0 extends androidx.fragment.app.e2 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener, com.tencent.mm.plugin.emoji.ui.v2.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.mogic.WxViewPager f98373d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f98374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI f98375f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI emojiStoreV2UI, androidx.fragment.app.FragmentActivity fragmentActivity, com.tencent.mm.ui.mogic.WxViewPager wxViewPager, boolean z17) {
        super(fragmentActivity.getSupportFragmentManager(), 0);
        this.f98375f = emojiStoreV2UI;
        this.f98374e = false;
        this.f98374e = z17;
        this.f98373d = wxViewPager;
        wxViewPager.setAdapter(this);
        wxViewPager.setOnPageChangeListener(this);
        wxViewPager.setCurrentItem(emojiStoreV2UI.f98335h);
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView emojiStoreV2TabView = emojiStoreV2UI.f98332e;
        if (emojiStoreV2TabView != null) {
            emojiStoreV2TabView.setOnTabClickListener(this);
        }
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f98374e ? 2 : 1;
    }

    @Override // androidx.fragment.app.e2
    public androidx.fragment.app.Fragment getItem(int i17) {
        return this.f98375f.T6(i17);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        if (i17 == 0) {
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI emojiStoreV2UI = this.f98375f;
            if (emojiStoreV2UI.T6(emojiStoreV2UI.f98335h) != null) {
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment T6 = emojiStoreV2UI.T6(emojiStoreV2UI.f98335h);
                if (T6.f98242q == null || T6.f98246u == null || !T6.q0()) {
                    return;
                }
                T6.f98246u.m();
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView emojiStoreV2TabView = this.f98375f.f98332e;
        if (emojiStoreV2TabView != null) {
            float f18 = emojiStoreV2TabView.f98318d * (i17 + f17);
            android.graphics.Matrix matrix = emojiStoreV2TabView.f98323i;
            matrix.setTranslate(f18, 0.0f);
            emojiStoreV2TabView.f98322h.setImageMatrix(matrix);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.ui.MMTabView mMTabView;
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI emojiStoreV2UI = this.f98375f;
        emojiStoreV2UI.f98335h = i17;
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView emojiStoreV2TabView = emojiStoreV2UI.f98332e;
        if (emojiStoreV2TabView != null) {
            emojiStoreV2TabView.setTo(i17);
        }
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment T6 = emojiStoreV2UI.T6(emojiStoreV2UI.f98335h);
        if (T6 != null) {
            h22.c cVar = T6.f98237i;
            cVar.f278286i = i17;
            cVar.z();
        }
        if (emojiStoreV2UI.f98335h != 1 || emojiStoreV2UI.f98337m) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12090, new java.lang.Object[0]);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN, java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView emojiStoreV2TabView2 = emojiStoreV2UI.f98332e;
        if (emojiStoreV2TabView2 != null && (mMTabView = emojiStoreV2TabView2.f98325n) != null) {
            mMTabView.f196914e.setVisibility(4);
        }
        emojiStoreV2UI.f98337m = true;
    }
}

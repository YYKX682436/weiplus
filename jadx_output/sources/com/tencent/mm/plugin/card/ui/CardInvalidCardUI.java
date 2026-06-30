package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class CardInvalidCardUI extends com.tencent.mm.plugin.card.base.CardBaseUI {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f94871w = 0;

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public xt1.r U6() {
        return xt1.r.INVALID_TYPE;
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void V6() {
        setMMTitle(com.tencent.mm.R.string.at_);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.arp), new com.tencent.mm.plugin.card.ui.q2(this));
        if (this.f94632e.getCount() > 0) {
            enableOptionMenu(true);
        } else {
            enableOptionMenu(false);
        }
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488329qb;
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        super.onSceneEnd(i17, i18, str, m1Var);
        if (i17 == 0 && i18 == 0 && (m1Var instanceof xt1.z)) {
            if (this.f94637m) {
                db5.e1.T(this, getResources().getString(com.tencent.mm.R.string.arr));
            } else {
                db5.e1.T(this, getResources().getString(com.tencent.mm.R.string.as6));
            }
        }
        this.f94637m = false;
    }
}

package com.tencent.mm.plugin.card.ui;

/* loaded from: classes3.dex */
public abstract class CardDetailBaseUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f94752d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f94753e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f94754f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f94755g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f94756h;

    @Override // com.tencent.mm.ui.MMActivity
    public boolean noActionBar() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f488291p9, (android.view.ViewGroup) null);
        this.f94752d = inflate;
        inflate.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478586bk));
        this.f94754f = (android.widget.TextView) this.f94752d.findViewById(com.tencent.mm.R.id.obn);
        this.f94755g = (android.widget.TextView) this.f94752d.findViewById(com.tencent.mm.R.id.nqs);
        this.f94753e = (android.widget.ImageView) this.f94752d.findViewById(com.tencent.mm.R.id.a4p);
        this.f94756h = this.f94752d.findViewById(com.tencent.mm.R.id.d0v);
        if (getContentView() == null || ((android.view.ViewGroup) getContentView()).getChildCount() <= 0) {
            return;
        }
        android.view.View childAt = ((android.view.ViewGroup) getContentView()).getChildAt(0);
        ((android.view.ViewGroup) getContentView()).removeView(childAt);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
        linearLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        linearLayout.addView(this.f94752d, new android.widget.LinearLayout.LayoutParams(-1, displayMetrics.widthPixels > displayMetrics.heightPixels ? getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479622ax) : getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479623ay)));
        linearLayout.addView(childAt);
        ((android.view.ViewGroup) getContentView()).addView(linearLayout);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(10);
        supportRequestWindowFeature(1);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setBackBtn(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f94753e.setOnClickListener(new com.tencent.mm.plugin.card.ui.m(this, onMenuItemClickListener));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMSubTitle(java.lang.String str) {
        this.f94755g.setText(str);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMTitle(java.lang.String str) {
        this.f94754f.setText(str);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMTitleColor(int i17) {
        this.f94754f.setTextColor(i17);
    }
}

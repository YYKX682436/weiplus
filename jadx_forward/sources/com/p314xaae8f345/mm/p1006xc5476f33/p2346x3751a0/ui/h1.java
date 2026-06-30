package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes14.dex */
public class h1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b {

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f258488h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f258489i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f258490m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f258491n;

    public h1(android.content.Context context) {
        super(context, null);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d4u, this);
        this.f258491n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.p59);
        this.f258488h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569158p83);
        this.f258490m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569159p84);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f569157p82);
        this.f258489i = imageView;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79543xa8cb7202, android.graphics.Color.parseColor("#07C160")));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void c(boolean z17) {
        if (!z17) {
            super.c(false);
            return;
        }
        this.f258488h.setVisibility(8);
        android.widget.TextView textView = this.f258490m;
        textView.setVisibility(0);
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kcl);
        textView.setContentDescription(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jpv));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public boolean d() {
        super.d();
        this.f258488h.setVisibility(8);
        android.widget.TextView textView = this.f258490m;
        textView.setVisibility(0);
        textView.setTextColor(android.graphics.Color.parseColor("#FA5151"));
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc_);
        this.f258489i.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79654xc8f97a92, android.graphics.Color.parseColor("#FA5151")));
        setContentDescription("");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void f() {
        this.f258489i.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79653xc84c6d76, android.graphics.Color.parseColor("#07C160")));
        android.widget.TextView textView = this.f258490m;
        textView.setVisibility(8);
        textView.setTextColor(android.graphics.Color.parseColor("#07C160"));
        this.f258488h.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void g() {
        android.widget.TextView textView = this.f258490m;
        textView.setVisibility(0);
        this.f258489i.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79533x4d32081d, android.graphics.Color.parseColor("#FA5151")));
        textView.setTextColor(android.graphics.Color.parseColor("#FA5151"));
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kdc);
        this.f258488h.setVisibility(8);
        super.g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    /* renamed from: getBeautyData */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 mo72879x47a48e3c() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    /* renamed from: getSpatioTemporalFilterData */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 mo72880x5f32c090() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void k(java.lang.String str) {
        android.widget.TextView textView = this.f258488h;
        textView.setTextSize(1, 12.0f);
        textView.setText(str);
        setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jpx));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void l(java.lang.String str) {
        android.widget.TextView textView = this.f258488h;
        textView.setTextSize(1, 14.0f);
        textView.setText(str);
        setContentDescription(java.lang.String.format(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jpw), str));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b, android.view.View
    public void onAnimationEnd() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    /* renamed from: setCaptureView */
    public void mo72881x79f31d49(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2350xae79c325.p2351x34a233.C18926x6d210aeb c18926x6d210aeb) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    /* renamed from: setVoicePlayDevice */
    public void mo72882xbbf730ba(int i17) {
        if (this.f258622e != i17) {
            this.f258622e = i17;
            android.widget.TextView textView = this.f258490m;
            textView.setVisibility(0);
            android.widget.ImageView imageView = this.f258489i;
            if (i17 == 1) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79947x15bb39c8, android.graphics.Color.parseColor("#07C160")));
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc9);
            } else if (i17 == 2) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79714x614cd13e, android.graphics.Color.parseColor("#07C160")));
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc7);
            } else if (i17 == 3) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79762x4abb86a, android.graphics.Color.parseColor("#07C160")));
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc8);
            } else if (i17 == 4) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79650x9f0fe96, android.graphics.Color.parseColor("#07C160")));
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc6);
            }
            this.f258488h.setVisibility(8);
            super.mo72882xbbf730ba(i17);
        }
    }
}

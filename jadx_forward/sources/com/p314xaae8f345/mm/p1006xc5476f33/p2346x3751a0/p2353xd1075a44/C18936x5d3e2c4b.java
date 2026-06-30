package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44;

/* renamed from: com.tencent.mm.plugin.voip.widget.VoipBigIconButton */
/* loaded from: classes13.dex */
public class C18936x5d3e2c4b extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f258633d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f258634e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f258635f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f258636g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f258637h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f258638i;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f258639m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnTouchListener f258640n;

    public C18936x5d3e2c4b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f258635f = null;
        this.f258636g = null;
        this.f258637h = null;
        this.f258638i = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.p(this);
        this.f258640n = pVar;
        this.f258639m = context;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bpn, this);
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, gq4.q.f356137a, 0, 0);
        try {
            android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
            this.f258635f = drawable;
            android.graphics.drawable.Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
            this.f258636g = drawable2;
            android.graphics.drawable.Drawable drawable3 = obtainStyledAttributes.getDrawable(2);
            this.f258637h = drawable3;
            android.graphics.drawable.Drawable drawable4 = obtainStyledAttributes.getDrawable(3);
            this.f258638i = drawable4;
            int resourceId = obtainStyledAttributes.getResourceId(4, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(4, 0);
            java.lang.String string = resourceId2 != 0 ? getContext().getString(resourceId2) : null;
            this.f258636g = drawable2 == null ? drawable : drawable2;
            this.f258638i = drawable4 == null ? drawable3 : drawable4;
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ahe);
            this.f258633d = imageView;
            imageView.setBackgroundDrawable(drawable);
            imageView.setImageDrawable(drawable3);
            imageView.setOnTouchListener(pVar);
            imageView.setContentDescription(string);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ahf);
            this.f258634e = textView;
            if (resourceId != -1) {
                textView.setText(getContext().getString(resourceId));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        this.f258633d.setEnabled(z17);
        this.f258634e.setEnabled(z17);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f258633d.setOnClickListener(onClickListener);
    }
}

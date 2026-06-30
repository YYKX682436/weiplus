package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13;

/* renamed from: com.tencent.mm.plugin.messenger.SwitchContactDialogCustomView */
/* loaded from: classes4.dex */
public class C16507x1bb6d76a extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f230145d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f230146e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f230147f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f230148g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f230149h;

    public C16507x1bb6d76a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569528du, this);
        this.f230145d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f230146e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cgi);
        this.f230147f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567837kv1);
        this.f230148g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        this.f230149h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nqa);
    }

    /* renamed from: setContent */
    public void m66646xe9f5bdb7(java.lang.String str) {
        this.f230146e.setText(str);
    }

    /* renamed from: setDesc */
    public void m66647x76492e13(java.lang.String str) {
        this.f230148g.setText(str);
    }

    /* renamed from: setOnPhotoOnClick */
    public void m66648x3e92b8d8(android.view.View.OnClickListener onClickListener) {
        android.widget.ImageView imageView = this.f230147f;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: setPhoto */
    public void m66649x5386fef0(java.lang.String str) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f230147f, str, null);
    }

    /* renamed from: setSubDesc */
    public void m66650x41d79a2f(java.lang.String str) {
        this.f230149h.setText(str);
    }

    /* renamed from: setTilte */
    public void m66651x53bfc606(java.lang.String str) {
        this.f230145d.setText(str);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.JoinChatRoomConfirmView */
/* loaded from: classes9.dex */
public class C15861xcec1ad88 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f220519d;

    /* renamed from: e, reason: collision with root package name */
    public long f220520e;

    /* renamed from: f, reason: collision with root package name */
    public long f220521f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f220522g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f220523h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f220524i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f220525m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f220526n;

    public C15861xcec1ad88(android.content.Context context) {
        super(context);
        a();
    }

    public final void a() {
        android.content.Context context = getContext();
        this.f220519d = context;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bmk, (android.view.ViewGroup) this, true);
        this.f220522g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566976hp1);
        this.f220523h = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.hoz);
        this.f220524i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hon);
        this.f220525m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hp6);
        this.f220526n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hoq);
    }

    public final android.view.View b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15809xc54f5bf8 c15809xc54f5bf8) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f220519d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569947sn, (android.view.ViewGroup) this, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566977hp2);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566975hp0);
        textView.setText(c15809xc54f5bf8.f36848x83471df4);
        float q17 = i65.a.q(getContext());
        imageView.getLayoutParams().height = (int) (imageView.getLayoutParams().height * q17);
        imageView.getLayoutParams().width = (int) (imageView.getLayoutParams().width * q17);
        imageView.requestLayout();
        if (c15809xc54f5bf8.f36846xf874ff20) {
            textView.setTextColor(this.f220519d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560084al));
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78774x6c82edde);
        } else {
            textView.setTextColor(this.f220519d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78776x5c799090);
        }
        inflate.measure(0, 0);
        return inflate;
    }

    public C15861xcec1ad88(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public C15861xcec1ad88(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}

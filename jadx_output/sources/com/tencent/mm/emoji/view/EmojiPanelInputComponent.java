package com.tencent.mm.emoji.view;

/* loaded from: classes5.dex */
public class EmojiPanelInputComponent extends com.tencent.mm.ui.widget.InputPanelLinearLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final int f64937r = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50);

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f64938g;

    /* renamed from: h, reason: collision with root package name */
    public fl5.i f64939h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageButton f64940i;

    /* renamed from: m, reason: collision with root package name */
    public int f64941m;

    /* renamed from: n, reason: collision with root package name */
    public int f64942n;

    /* renamed from: o, reason: collision with root package name */
    public int f64943o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f64944p;

    /* renamed from: q, reason: collision with root package name */
    public sr.k f64945q;

    public EmojiPanelInputComponent(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64939h = null;
        this.f64941m = -1;
        this.f64942n = -1;
        this.f64943o = 0;
        this.f64944p = true;
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.a6w, this);
        if (com.tencent.mm.pluginsdk.ui.chat.i6.a() == null) {
            this.f64938g = new com.tencent.mm.pluginsdk.ui.chat.t5(context);
            return;
        }
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.jpb);
        this.f64940i = imageButton;
        imageButton.setOnClickListener(new sr.g(this));
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(getContext());
        this.f64938g = wi6;
        wi6.setEntranceScene(0);
        this.f64938g.setVisibility(4);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m7g);
        linearLayout.setOnClickListener(null);
        int g17 = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        this.f64943o = g17;
        linearLayout.addView(this.f64938g, -1, g17);
        this.f64938g.c();
        setBottomPanelHeight(this.f64943o);
        this.f64938g.i();
        this.f64938g.setOnTextOperationListener(new sr.h(this));
    }

    @Override // com.tencent.mm.ui.widget.InputPanelLinearLayout, al5.e0
    public void J2(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelInputComponent", "onInputPanelChange: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        super.J2(z17, i17);
        if (this.f64943o != i17 && i17 != 0) {
            this.f64943o = i17;
            setBottomPanelHeight(i17);
        }
        if (z17) {
            setVisibility(0);
            this.f64940i.setImageResource(com.tencent.mm.R.drawable.f481235o1);
            this.f64940i.setTag("keyboard");
        } else if ("emoji".equals(this.f64940i.getTag())) {
            this.f64940i.setImageResource(com.tencent.mm.R.drawable.f481236o2);
        } else {
            setVisibility(4);
        }
        f(i17);
    }

    public void f(int i17) {
        sr.k kVar = this.f64945q;
        if (kVar != null) {
            kVar.J2(getVisibility() == 0, i17 + f64937r);
        }
    }

    public void g() {
        this.f64938g.h();
        if (com.tencent.mm.sdk.platformtools.d2.j(getContext())) {
            getInputPanelHelper().f(new sr.i(this));
        } else {
            this.f64938g.setVisibility(4);
        }
    }

    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel getSmileyPanel() {
        return this.f64938g;
    }

    public boolean h() {
        return (this.f64938g.getVisibility() == 0) || getVisibility() == 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f64938g != null) {
            setBottomPanelHeight(this.f64943o);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = this.f64941m;
        if (i28 < i27) {
            i28 = i27;
        }
        this.f64941m = i28;
        this.f64942n = i27;
    }

    public void setBottomPanelHeight(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelInputComponent", "setBottomPanelHeight: %s", java.lang.Integer.valueOf(i17));
        android.view.ViewGroup.LayoutParams layoutParams = this.f64938g.getLayoutParams();
        if (layoutParams == null || layoutParams.height == i17) {
            return;
        }
        layoutParams.height = i17;
        this.f64938g.requestLayout();
    }

    public void setInputComponentListener(sr.k kVar) {
        this.f64945q = kVar;
    }

    public void setMMEditText(fl5.i iVar) {
        this.f64939h = iVar;
        iVar.c(new sr.f(this));
    }

    public void setSmileySendButtonEnable(boolean z17) {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f64938g;
        if (chatFooterPanel != null) {
            chatFooterPanel.setSendButtonEnable(z17);
        }
    }

    public void setSmileySendButtonText(java.lang.String str) {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f64938g;
        if (chatFooterPanel != null) {
            chatFooterPanel.setToSendText(str);
        }
    }

    public void setSmileySendTalkerName(java.lang.String str) {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f64938g;
        if (chatFooterPanel != null) {
            chatFooterPanel.setTalkerName(str);
        }
    }
}

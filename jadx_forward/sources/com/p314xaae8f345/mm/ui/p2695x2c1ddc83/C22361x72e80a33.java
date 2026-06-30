package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* renamed from: com.tencent.mm.ui.conversation.ChatBotConversationTextLine */
/* loaded from: classes2.dex */
public class C22361x72e80a33 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f288821d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f288822e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f288823f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f288824g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f288825h;

    public C22361x72e80a33(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f288825h = false;
        a();
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.e0h, this);
        this.f288821d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.spn);
        this.f288822e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.spk);
        this.f288823f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.spl);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f288825h) {
            this.f288825h = false;
            int width = (((i19 - i17) - this.f288822e.getWidth()) - this.f288823f.getWidth()) - i65.a.b(getContext(), 16);
            this.f288821d.setText(this.f288824g);
            if (width > 0) {
                this.f288821d.setMaxWidth(width);
            }
        }
    }

    public C22361x72e80a33(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f288825h = false;
        a();
    }
}

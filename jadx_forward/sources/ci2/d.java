package ci2;

/* loaded from: classes10.dex */
public final class d extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final lj2.v0 f123207d;

    /* renamed from: e, reason: collision with root package name */
    public final fi2.l f123208e;

    /* renamed from: f, reason: collision with root package name */
    public final fg2.o f123209f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, lj2.v0 pluginAbility, fi2.l service) {
        super(context);
        java.lang.String obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f123207d = pluginAbility;
        this.f123208e = service;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e9h, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i17 = com.p314xaae8f345.mm.R.id.f566129th4;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566129th4);
        if (textView != null) {
            i17 = com.p314xaae8f345.mm.R.id.f566130th5;
            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566130th5);
            if (textView2 != null) {
                i17 = com.p314xaae8f345.mm.R.id.th6;
                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.th6);
                if (textView3 != null) {
                    this.f123209f = new fg2.o((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate, textView, textView2, textView3);
                    java.lang.CharSequence text = textView2.getText();
                    a(textView2, (text == null || (obj = text.toString()) == null) ? "" : obj, true);
                    return;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    public final void a(android.widget.TextView textView, java.lang.String str, boolean z17) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        jz5.f0 f0Var;
        if (z17) {
            spannableStringBuilder = new android.text.SpannableStringBuilder(" " + str);
        } else {
            spannableStringBuilder = new android.text.SpannableStringBuilder(str + " ");
        }
        android.graphics.drawable.Drawable drawable = getContext().getDrawable(com.p314xaae8f345.mm.R.raw.f80832xde18c21a);
        if (drawable != null) {
            android.graphics.drawable.Drawable mutate = drawable.mutate();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mutate, "mutate(...)");
            int a17 = com.p314xaae8f345.mm.ui.zk.a(getContext(), 24);
            int a18 = com.p314xaae8f345.mm.ui.zk.a(getContext(), 4);
            mutate.setBounds(0, 0, a17, a17);
            mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abx), android.graphics.PorterDuff.Mode.SRC_IN));
            ci2.a aVar = new ci2.a(mutate, a18, z17);
            int length = z17 ? 0 : str.length();
            spannableStringBuilder.setSpan(aVar, length, length + 1, 17);
            textView.setText(spannableStringBuilder);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            textView.setText(str);
        }
    }

    public final void b(xh2.e micTopicData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micTopicData, "micTopicData");
        boolean a17 = this.f123208e.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatVoiceRoomContentLayout", "updateWithMicTopicData, isAnchorOrAssistant: " + a17);
        java.lang.String str = micTopicData.f536077b;
        boolean z17 = str.length() > 0;
        fg2.o oVar = this.f123209f;
        int i17 = 4;
        oVar.f343710d.setVisibility(z17 ? 0 : 4);
        oVar.f343708b.setVisibility(z17 ? 0 : 4);
        android.widget.TextView textView = oVar.f343709c;
        if (!z17 && a17) {
            i17 = 0;
        }
        textView.setVisibility(i17);
        oVar.f343710d.setText(micTopicData.f536076a);
        if (!a17) {
            oVar.f343708b.setText(str);
            oVar.f343708b.setOnClickListener(null);
            oVar.f343709c.setOnClickListener(null);
        } else {
            android.widget.TextView finderLiveChatVoiceRoomContentMicTopicText = oVar.f343708b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveChatVoiceRoomContentMicTopicText, "finderLiveChatVoiceRoomContentMicTopicText");
            a(finderLiveChatVoiceRoomContentMicTopicText, str, false);
            oVar.f343708b.setOnClickListener(new ci2.b(this));
            oVar.f343709c.setOnClickListener(new ci2.c(this));
        }
    }

    /* renamed from: getPluginAbility */
    public final lj2.v0 m14909x3a33aac1() {
        return this.f123207d;
    }

    /* renamed from: getService */
    public final fi2.l m14910xb411027f() {
        return this.f123208e;
    }
}

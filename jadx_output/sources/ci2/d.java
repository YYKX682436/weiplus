package ci2;

/* loaded from: classes10.dex */
public final class d extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final lj2.v0 f41674d;

    /* renamed from: e, reason: collision with root package name */
    public final fi2.l f41675e;

    /* renamed from: f, reason: collision with root package name */
    public final fg2.o f41676f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, lj2.v0 pluginAbility, fi2.l service) {
        super(context);
        java.lang.String obj;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        this.f41674d = pluginAbility;
        this.f41675e = service;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.e9h, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i17 = com.tencent.mm.R.id.f484596th4;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f484596th4);
        if (textView != null) {
            i17 = com.tencent.mm.R.id.f484597th5;
            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f484597th5);
            if (textView2 != null) {
                i17 = com.tencent.mm.R.id.th6;
                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.th6);
                if (textView3 != null) {
                    this.f41676f = new fg2.o((androidx.constraintlayout.widget.ConstraintLayout) inflate, textView, textView2, textView3);
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
        android.graphics.drawable.Drawable drawable = getContext().getDrawable(com.tencent.mm.R.raw.pencil_rectangle_regular);
        if (drawable != null) {
            android.graphics.drawable.Drawable mutate = drawable.mutate();
            kotlin.jvm.internal.o.f(mutate, "mutate(...)");
            int a17 = com.tencent.mm.ui.zk.a(getContext(), 24);
            int a18 = com.tencent.mm.ui.zk.a(getContext(), 4);
            mutate.setBounds(0, 0, a17, a17);
            mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(getContext().getColor(com.tencent.mm.R.color.abx), android.graphics.PorterDuff.Mode.SRC_IN));
            ci2.a aVar = new ci2.a(mutate, a18, z17);
            int length = z17 ? 0 : str.length();
            spannableStringBuilder.setSpan(aVar, length, length + 1, 17);
            textView.setText(spannableStringBuilder);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            textView.setText(str);
        }
    }

    public final void b(xh2.e micTopicData) {
        kotlin.jvm.internal.o.g(micTopicData, "micTopicData");
        boolean a17 = this.f41675e.a();
        com.tencent.mars.xlog.Log.i("ChatVoiceRoomContentLayout", "updateWithMicTopicData, isAnchorOrAssistant: " + a17);
        java.lang.String str = micTopicData.f454544b;
        boolean z17 = str.length() > 0;
        fg2.o oVar = this.f41676f;
        int i17 = 4;
        oVar.f262177d.setVisibility(z17 ? 0 : 4);
        oVar.f262175b.setVisibility(z17 ? 0 : 4);
        android.widget.TextView textView = oVar.f262176c;
        if (!z17 && a17) {
            i17 = 0;
        }
        textView.setVisibility(i17);
        oVar.f262177d.setText(micTopicData.f454543a);
        if (!a17) {
            oVar.f262175b.setText(str);
            oVar.f262175b.setOnClickListener(null);
            oVar.f262176c.setOnClickListener(null);
        } else {
            android.widget.TextView finderLiveChatVoiceRoomContentMicTopicText = oVar.f262175b;
            kotlin.jvm.internal.o.f(finderLiveChatVoiceRoomContentMicTopicText, "finderLiveChatVoiceRoomContentMicTopicText");
            a(finderLiveChatVoiceRoomContentMicTopicText, str, false);
            oVar.f262175b.setOnClickListener(new ci2.b(this));
            oVar.f262176c.setOnClickListener(new ci2.c(this));
        }
    }

    public final lj2.v0 getPluginAbility() {
        return this.f41674d;
    }

    public final fi2.l getService() {
        return this.f41675e;
    }
}

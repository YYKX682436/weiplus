package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class FavChatVoiceView extends android.widget.TextView implements z30.a0, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f100299d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.AlphaAnimation f100300e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.AnimationDrawable f100301f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f100302g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f100303h;

    /* renamed from: i, reason: collision with root package name */
    public int f100304i;

    /* renamed from: m, reason: collision with root package name */
    public o72.q3 f100305m;

    public FavChatVoiceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f100299d = false;
        this.f100303h = "";
        this.f100302g = context;
        c();
    }

    public static void b(com.tencent.mm.plugin.fav.ui.FavChatVoiceView favChatVoiceView) {
        if (!favChatVoiceView.f100305m.e(favChatVoiceView.f100303h, favChatVoiceView.f100304i)) {
            dp.a.makeText(favChatVoiceView.getContext(), com.tencent.mm.R.string.f491220ce1, 1).show();
        } else {
            if (favChatVoiceView.f100299d) {
                return;
            }
            favChatVoiceView.f100299d = true;
            favChatVoiceView.setCompoundDrawablesWithIntrinsicBounds(favChatVoiceView.f100301f, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            favChatVoiceView.f100301f.stop();
            favChatVoiceView.f100301f.start();
        }
    }

    @Override // z30.a0
    public void a(java.lang.String str, int i17) {
        if (this.f100303h.equals(str)) {
            return;
        }
        d();
    }

    public final void c() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.1f, 1.0f);
        this.f100300e = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f100300e.setRepeatCount(-1);
        this.f100300e.setRepeatMode(2);
        this.f100301f = new ig5.a();
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new_f1);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f100301f.addFrame(drawable, 300);
        android.graphics.drawable.Drawable drawable2 = getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new_f2);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f100301f.addFrame(drawable2, 300);
        android.graphics.drawable.Drawable drawable3 = getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new_f3);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f100301f.addFrame(drawable3, 300);
        this.f100301f.setOneShot(false);
        this.f100301f.setVisible(true, true);
    }

    public void d() {
        android.view.animation.AlphaAnimation alphaAnimation = this.f100300e;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation(null);
        }
        this.f100299d = false;
        setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        this.f100301f.stop();
        this.f100305m.f();
    }

    @Override // z30.a0
    public void onFinish() {
        d();
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new com.tencent.mm.plugin.fav.ui.r0(this));
    }

    @Override // z30.a0
    public void onPause() {
        d();
    }

    public void setVoiceHelper(o72.q3 q3Var) {
        this.f100305m = q3Var;
        java.util.List list = q3Var.f343455o;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (this == ((z30.a0) it.next())) {
                return;
            }
        }
        ((java.util.LinkedList) list).add(this);
    }

    public FavChatVoiceView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f100299d = false;
        this.f100303h = "";
        this.f100302g = context;
        c();
    }
}

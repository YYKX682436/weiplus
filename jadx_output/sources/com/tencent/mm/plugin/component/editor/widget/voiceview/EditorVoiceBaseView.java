package com.tencent.mm.plugin.component.editor.widget.voiceview;

/* loaded from: classes12.dex */
public class EditorVoiceBaseView extends android.widget.TextView implements rx1.c, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f96644d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.AlphaAnimation f96645e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.AnimationDrawable f96646f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f96647g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f96648h;

    public EditorVoiceBaseView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f96644d = false;
        this.f96648h = "";
        this.f96647g = context;
        f();
    }

    public static void e(com.tencent.mm.plugin.component.editor.widget.voiceview.EditorVoiceBaseView editorVoiceBaseView) {
        editorVoiceBaseView.getClass();
        if (!rx1.d.b().d(editorVoiceBaseView.f96648h, 0)) {
            dp.a.makeText(editorVoiceBaseView.getContext(), com.tencent.mm.R.string.f491220ce1, 1).show();
        } else {
            if (editorVoiceBaseView.f96644d) {
                return;
            }
            editorVoiceBaseView.f96644d = true;
            editorVoiceBaseView.setCompoundDrawablesWithIntrinsicBounds(editorVoiceBaseView.f96646f, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            editorVoiceBaseView.f96646f.stop();
            editorVoiceBaseView.f96646f.start();
        }
    }

    @Override // rx1.c
    public void a() {
    }

    @Override // rx1.c
    public void b(java.lang.String str) {
    }

    @Override // rx1.c
    public void c() {
        g();
    }

    @Override // rx1.c
    public void d(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (str.equals(this.f96648h)) {
            return;
        }
        g();
    }

    public final void f() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.1f, 1.0f);
        this.f96645e = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f96645e.setRepeatCount(-1);
        this.f96645e.setRepeatMode(2);
        this.f96646f = new ig5.a();
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new_f1);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f96646f.addFrame(drawable, 300);
        android.graphics.drawable.Drawable drawable2 = getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new_f2);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f96646f.addFrame(drawable2, 300);
        android.graphics.drawable.Drawable drawable3 = getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new_f3);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f96646f.addFrame(drawable3, 300);
        this.f96646f.setOneShot(false);
        this.f96646f.setVisible(true, true);
    }

    public void g() {
        android.view.animation.AlphaAnimation alphaAnimation = this.f96645e;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation(null);
        }
        this.f96644d = false;
        setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        this.f96646f.stop();
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new rx1.a(this));
    }

    public EditorVoiceBaseView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f96644d = false;
        this.f96648h = "";
        this.f96647g = context;
        f();
    }
}

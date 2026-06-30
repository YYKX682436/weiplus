package com.tencent.mm.plugin.emoji.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmoticonCustomCreateResultView;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EmoticonCustomCreateResultView extends com.tencent.mm.ui.MMActivity {

    /* renamed from: e, reason: collision with root package name */
    public boolean f97860e;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f97862g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f97863h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.emoji.view.AbsEmojiView f97864i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f97865m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f97866n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.storage.emotion.EmojiInfo f97867o;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f97859d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f97861f = "";

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dq_;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        hideActionbarLine();
        java.lang.String stringExtra = getIntent().getStringExtra("md5");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f97859d = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("edie_session_id");
        this.f97861f = stringExtra2 != null ? stringExtra2 : "";
        this.f97860e = getIntent().getBooleanExtra("add_exceed_limit", false);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.rjc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f97864i = (com.tencent.mm.emoji.view.AbsEmojiView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rjf);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f97862g = (com.tencent.mm.ui.widget.button.WeButton) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.rjb);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f97863h = (com.tencent.mm.ui.widget.button.WeButton) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.rje);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f97865m = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.rjd);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f97866n = textView;
        if (this.f97860e) {
            textView.setVisibility(0);
            com.tencent.mm.ui.widget.button.WeButton weButton = this.f97863h;
            if (weButton == null) {
                kotlin.jvm.internal.o.o("doneBtn");
                throw null;
            }
            weButton.setVisibility(8);
            android.widget.TextView textView2 = this.f97865m;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("titleView");
                throw null;
            }
            textView2.setText(getString(com.tencent.mm.R.string.cw7));
            android.widget.TextView textView3 = this.f97866n;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("hintView");
                throw null;
            }
            textView3.setText(getString(com.tencent.mm.R.string.f489702cx4));
            setBackBtn(new com.tencent.mm.plugin.emoji.ui.u3(this), com.tencent.mm.R.raw.xmark_medium);
        } else {
            android.widget.TextView textView4 = this.f97865m;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("titleView");
                throw null;
            }
            textView4.setText(getString(com.tencent.mm.R.string.cvr));
            android.widget.TextView textView5 = this.f97866n;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("hintView");
                throw null;
            }
            textView5.setVisibility(8);
            setBackBtnVisible(false);
        }
        com.tencent.mm.ui.widget.button.WeButton weButton2 = this.f97863h;
        if (weButton2 == null) {
            kotlin.jvm.internal.o.o("doneBtn");
            throw null;
        }
        weButton2.setEnabled(false);
        com.tencent.mm.ui.widget.button.WeButton weButton3 = this.f97862g;
        if (weButton3 == null) {
            kotlin.jvm.internal.o.o("sendBtn");
            throw null;
        }
        weButton3.setEnabled(false);
        com.tencent.mm.ui.widget.button.WeButton weButton4 = this.f97863h;
        if (weButton4 == null) {
            kotlin.jvm.internal.o.o("doneBtn");
            throw null;
        }
        weButton4.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.v3(this));
        com.tencent.mm.ui.widget.button.WeButton weButton5 = this.f97862g;
        if (weButton5 == null) {
            kotlin.jvm.internal.o.o("sendBtn");
            throw null;
        }
        weButton5.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.w3(this));
        com.tencent.mm.emoji.view.AbsEmojiView absEmojiView = this.f97864i;
        if (absEmojiView == null) {
            kotlin.jvm.internal.o.o("emojiView");
            throw null;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.s(absEmojiView, 2);
        com.tencent.mm.emoji.view.AbsEmojiView absEmojiView2 = this.f97864i;
        if (absEmojiView2 == null) {
            kotlin.jvm.internal.o.o("emojiView");
            throw null;
        }
        absEmojiView2.setStatusListener(new com.tencent.mm.plugin.emoji.ui.x3(this));
        new hr.a(1, 0, kz5.b0.c(this.f97859d), null, null, 26, null).l().K(new com.tencent.mm.plugin.emoji.ui.y3(this));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AddEmojFeedbackEnsurePage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "AddEmojFeedbackEnsurePage");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(this, 12, 10, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "editstickersessionid", this.f97861f);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "result", java.lang.Integer.valueOf(this.f97860e ? 1 : 0));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "emojmd5", this.f97859d);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.ui.widget.button.WeButton weButton6 = this.f97863h;
        if (weButton6 == null) {
            kotlin.jvm.internal.o.o("doneBtn");
            throw null;
        }
        ((cy1.a) rVar).Tj(weButton6, 8, 10, false);
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.ui.widget.button.WeButton weButton7 = this.f97863h;
        if (weButton7 == null) {
            kotlin.jvm.internal.o.o("doneBtn");
            throw null;
        }
        ((cy1.a) rVar2).pk(weButton7, "emojfeedback_finsh");
        dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.ui.widget.button.WeButton weButton8 = this.f97862g;
        if (weButton8 == null) {
            kotlin.jvm.internal.o.o("sendBtn");
            throw null;
        }
        ((cy1.a) rVar3).Tj(weButton8, 8, 10, false);
        dy1.r rVar4 = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.ui.widget.button.WeButton weButton9 = this.f97862g;
        if (weButton9 != null) {
            ((cy1.a) rVar4).pk(weButton9, "emojfeedback_forward");
        } else {
            kotlin.jvm.internal.o.o("sendBtn");
            throw null;
        }
    }
}

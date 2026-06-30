package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes14.dex */
public abstract class EmojiBaseActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.r f97694d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.s f97695e;

    public abstract void T6(android.os.Message message);

    public abstract void U6(android.os.Message message);

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f97694d = new com.tencent.mm.plugin.emoji.ui.r(this, xu5.b.a("EmojiBaseActivity_handlerThread"));
        this.f97695e = new com.tencent.mm.plugin.emoji.ui.s(this, getMainLooper());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.emoji.ui.r rVar = this.f97694d;
        if (rVar != null && rVar.getLooper() != null) {
            this.f97694d.getSerial().f457303b.g();
        }
        this.f97694d = null;
        this.f97695e = null;
    }
}

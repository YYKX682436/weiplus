package com.tencent.mm.plugin.emoji.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmoticonEditorActivityDirectFinder;", "Lcom/tencent/mm/plugin/emoji/ui/EmojiEditorActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class EmoticonEditorActivityDirectFinder extends com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity {
    public long E;

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity
    public void T6(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String u17 = pm0.v.u(this.E);
        intent.putExtra("allow_add_exceed_limit", true);
        intent.putExtra("hide_added_toast", true);
        intent.putExtra("hide_exceed_limit_hint", true);
        intent.putExtra("extra_upload_scene", 3);
        intent.putExtra("feedId", u17);
        r45.sj0 sj0Var = new r45.sj0();
        sj0Var.f385771d = u17;
        intent.putExtra("upload_finder_link_info", sj0Var.toByteArray());
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity
    public long V6() {
        return 3L;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity
    public long W6() {
        return 3L;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity
    public void e7() {
        if (this.f97756d) {
            this.f97771v = new p12.x(this, b7());
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.EmojiEditorActivity+DirectFinder", "not video! it's not allowed to use in direct finder category");
        setResult(0);
        finish();
        this.f97774y = 1L;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity
    public void g7() {
        this.f97774y = 3L;
        i7();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity
    public int k7() {
        return 1000068;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity
    public void l7() {
        super.l7();
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.ojn)).setText(getString(com.tencent.mm.R.string.f490004i6));
        findViewById(com.tencent.mm.R.id.ojn).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.z3(this));
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1 && i18 != 1) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (intent == null) {
            intent = null;
        }
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("extra_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateResultView.class);
            intent2.putExtra("md5", stringExtra);
            intent2.putExtra("add_exceed_limit", i18 == 1);
            intent2.putExtra("edie_session_id", this.f97773x);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmoticonEditorActivityDirectFinder", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/emoji/ui/EmoticonEditorActivityDirectFinder", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        finish();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("feedId")) {
            this.E = getIntent().getLongExtra("feedId", 0L);
        }
    }
}

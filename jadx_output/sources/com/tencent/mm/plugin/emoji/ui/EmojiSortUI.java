package com.tencent.mm.plugin.emoji.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiSortUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class EmojiSortUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f97839f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f97840d = android.view.View.generateViewId();

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f97841e = jz5.h.b(new com.tencent.mm.plugin.emoji.ui.l3(this));

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View getLayoutView() {
        return (android.widget.FrameLayout) ((jz5.n) this.f97841e).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        androidx.fragment.app.Fragment emojiSortFragment;
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("type");
        if (stringExtra == null) {
            stringExtra = "type_sort_all";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("ip_set_key");
        if (kotlin.jvm.internal.o.b(stringExtra, "type_sort_all")) {
            emojiSortFragment = new com.tencent.mm.plugin.emoji.ui.EmojiSortFragment(new com.tencent.mm.plugin.emoji.model.n(gr.v.f274696a.c() && ((com.tencent.mm.feature.emoji.r4) i95.n0.c(com.tencent.mm.feature.emoji.r4.class)).Di()));
        } else if (kotlin.jvm.internal.o.b(stringExtra, "type_list_ip_set") && stringExtra2 != null) {
            emojiSortFragment = new com.tencent.mm.plugin.emoji.ui.EmojiMineListFragment(new com.tencent.mm.plugin.emoji.model.m(stringExtra2), stringExtra2);
        } else {
            if (!kotlin.jvm.internal.o.b(stringExtra, "type_sort_ip_set") || stringExtra2 == null) {
                finish();
                return;
            }
            emojiSortFragment = new com.tencent.mm.plugin.emoji.ui.EmojiSortFragment(new com.tencent.mm.plugin.emoji.model.m(stringExtra2));
        }
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.k(this.f97840d, emojiSortFragment, null);
        beginTransaction.d();
    }
}

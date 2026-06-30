package com.tencent.mm.chatroom.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/chatroom/ui/ChatRoomBindAppUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ChatRoomBindAppUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public vg3.i3 f63685d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488402sb;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        android.content.Intent intent = getIntent();
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("key_bind_param") : null;
        vg3.i3 i3Var = serializableExtra instanceof vg3.i3 ? (vg3.i3) serializableExtra : null;
        this.f63685d = i3Var;
        if (i3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatRoomBindAppUI", "openParam is null");
            finish();
            return;
        }
        setMMTitle("");
        setBackBtn(new com.tencent.mm.chatroom.ui.a(this), com.tencent.mm.R.raw.actionbar_icon_dark_close);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483480b00);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.Button) findViewById).setOnClickListener(new com.tencent.mm.chatroom.ui.d(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ol6);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object[] objArr = new java.lang.Object[1];
        vg3.i3 i3Var2 = this.f63685d;
        java.lang.String str = i3Var2 != null ? i3Var2.f436716h : null;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        textView.setText(context.getString(com.tencent.mm.R.string.axz, objArr));
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        vg3.i3 i3Var3 = this.f63685d;
        com.tencent.mm.storage.z3 n17 = Bi.n(i3Var3 != null ? i3Var3.f436718m : null, true);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatRoomBindAppUI", "contact is null");
            finish();
            return;
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.hke);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById3;
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        vg3.i3 i3Var4 = this.f63685d;
        ((com.tencent.mm.feature.avatar.w) zVar).Ai(imageView, i3Var4 != null ? i3Var4.f436718m : null, null);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.on_);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d17 = n17.d1();
        ((sg3.a) v0Var).getClass();
        ((android.widget.TextView) findViewById4).setText(((ke0.e) xVar).bj(context2, c01.a2.e(d17), i65.a.h(getContext(), com.tencent.mm.R.dimen.f479897ia)));
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.ol7);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById5;
        android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        vg3.i3 i3Var5 = this.f63685d;
        java.lang.String str2 = i3Var5 != null ? i3Var5.f436716h : null;
        objArr2[0] = str2 != null ? str2 : "";
        textView2.setText(context3.getString(com.tencent.mm.R.string.f490822ay0, objArr2));
    }
}

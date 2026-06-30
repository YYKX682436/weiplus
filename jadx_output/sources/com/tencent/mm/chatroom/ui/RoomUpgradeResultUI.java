package com.tencent.mm.chatroom.ui;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class RoomUpgradeResultUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f63881o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f63882d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63883e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f63884f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f63885g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f63886h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f63887i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f63888m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f63889n;

    public final void T6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.chatroom.ui.RoomUpgradeUI.class);
        intent.addFlags(67108864);
        intent.putExtra("finish_self", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/chatroom/ui/RoomUpgradeResultUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/chatroom/ui/RoomUpgradeResultUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void U6(java.lang.String str) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) <= 0) {
            return;
        }
        java.lang.String f27 = n17.f2();
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f63885g, str, null);
        this.f63886h.setVisibility(0);
        this.f63886h.setText(f27);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488418sr;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.i6t);
        setBackBtn(new com.tencent.mm.chatroom.ui.fa(this));
        this.f63884f = findViewById(com.tencent.mm.R.id.otm);
        this.f63885g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.otl);
        this.f63886h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.otn);
        this.f63887i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.otj);
        this.f63888m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.otk);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.h1y);
        this.f63882d = button;
        button.setOnClickListener(new com.tencent.mm.chatroom.ui.ga(this));
        this.f63882d.setVisibility(0);
        java.lang.String str = this.f63889n.field_roomowner;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) > 0) {
            U6(str);
        } else {
            ((c01.k7) c01.n8.a()).g(str, this.f63883e, 30, new com.tencent.mm.chatroom.ui.ia(this, str));
        }
        int w07 = this.f63889n.w0();
        this.f63887i.setVisibility(0);
        this.f63887i.setText(getString(com.tencent.mm.R.string.f492906i71, java.lang.Integer.valueOf(w07)));
        this.f63882d.setText(com.tencent.mm.R.string.i6w);
        this.f63888m.setVisibility(8);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("chatroom");
        this.f63883e = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomUpgradeResultUI", "the roomName is %s", stringExtra);
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f63883e);
        this.f63889n = z07;
        if (z07 == null) {
            T6();
        }
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        T6();
        return true;
    }
}

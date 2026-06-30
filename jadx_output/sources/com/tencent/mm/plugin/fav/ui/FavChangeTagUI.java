package com.tencent.mm.plugin.fav.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/fav/ui/FavChangeTagUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/fav/ui/n0", "ui-fav_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FavChangeTagUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.fav.ui.n0 f100297e = new com.tencent.mm.plugin.fav.ui.n0(null);

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f100298d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aav;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(i65.a.r(getContext(), com.tencent.mm.R.string.c9g));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.dhu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f100298d = (android.widget.EditText) findViewById;
        java.lang.String stringExtra = getIntent().getStringExtra("origin_name");
        android.widget.EditText editText = this.f100298d;
        if (editText == null) {
            kotlin.jvm.internal.o.o("coreEditText");
            throw null;
        }
        editText.setText(stringExtra);
        android.widget.EditText editText2 = this.f100298d;
        if (editText2 == null) {
            kotlin.jvm.internal.o.o("coreEditText");
            throw null;
        }
        editText2.requestFocus();
        android.widget.EditText editText3 = this.f100298d;
        if (editText3 == null) {
            kotlin.jvm.internal.o.o("coreEditText");
            throw null;
        }
        editText3.addTextChangedListener(new com.tencent.mm.plugin.fav.ui.o0());
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.fav.ui.p0(this, stringExtra), null, com.tencent.mm.ui.fb.GREEN);
        setBackBtn(new com.tencent.mm.plugin.fav.ui.q0(this));
    }
}

package com.tencent.mm.mj_template.test;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/mj_template/test/TemplateTestUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TemplateTestUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f70356e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f70357d = jz5.h.b(new qz0.a(this));

    public final android.widget.TextView T6() {
        java.lang.Object value = ((jz5.n) this.f70357d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dhm;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null) {
            return;
        }
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
            if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                return;
            }
            T6().append("select local image from gallery\n\n");
            for (java.lang.String str : stringArrayListExtra) {
                T6().append(str + '\n');
            }
            kotlinx.coroutines.l.d(i2Var, null, null, new qz0.f(new ny0.f(stringArrayListExtra), this, null), 3, null);
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("CropImage_OutputPath_List");
        if (stringArrayListExtra2 == null || stringArrayListExtra2.isEmpty()) {
            return;
        }
        T6().append("select local image from gallery\n\n");
        for (java.lang.String str2 : stringArrayListExtra2) {
            T6().append(str2 + '\n');
        }
        java.lang.Object X = kz5.n0.X(stringArrayListExtra2);
        kotlin.jvm.internal.o.f(X, "first(...)");
        kotlinx.coroutines.l.d(i2Var, null, null, new qz0.c(new my0.h((java.lang.String) X, null, my0.f.f332658e), this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        findViewById(com.tencent.mm.R.id.r0s).setOnClickListener(qz0.g.f367824d);
        findViewById(com.tencent.mm.R.id.q4r).setOnClickListener(new qz0.h(this));
        findViewById(com.tencent.mm.R.id.r0x).setOnClickListener(new qz0.i(this));
    }
}

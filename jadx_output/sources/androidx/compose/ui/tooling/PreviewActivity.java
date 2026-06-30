package androidx.compose.ui.tooling;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "ui-tooling_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes13.dex */
public final class PreviewActivity extends androidx.activity.ComponentActivity {
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra;
        java.lang.Class<?> cls;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        android.content.Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        java.lang.String t07 = r26.n0.t0(stringExtra, '.', null, 2, null);
        java.lang.String o07 = r26.n0.o0(stringExtra, '.', stringExtra);
        java.lang.String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            f.m.a(this, null, u0.j.c(-161032931, true, new m2.f0(t07, o07)), 1, null);
            return;
        }
        try {
            cls = java.lang.Class.forName(stringExtra2);
        } catch (java.lang.ClassNotFoundException unused) {
            cls = null;
        }
        f.m.a(this, null, u0.j.c(1507674311, true, new m2.g0(t07, o07, m2.h0.a(cls, getIntent().getIntExtra("parameterProviderIndex", -1)))), 1, null);
    }
}

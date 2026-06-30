package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class b extends x92.f {
    @Override // x92.f
    public java.lang.String a() {
        java.lang.String str;
        r45.e21 e21Var;
        r45.r03 r03Var = (r45.r03) this.f452691a;
        if (r03Var == null || (e21Var = (r45.e21) r03Var.getCustom(16)) == null || (str = e21Var.getString(5)) == null) {
            str = this.f452692b;
        }
        return str == null ? "" : str;
    }

    @Override // x92.f
    public void b(androidx.appcompat.app.AppCompatActivity activity) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(activity, "activity");
        android.content.Intent intent = activity.getIntent();
        if (intent == null || (str = intent.getStringExtra("key_cover_url")) == null) {
            str = "";
        }
        this.f452692b = str;
    }
}

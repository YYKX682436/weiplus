package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class c7 implements tg3.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f102065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f102066b;

    public c7(androidx.appcompat.app.AppCompatActivity appCompatActivity, kotlin.jvm.internal.h0 h0Var) {
        this.f102065a = appCompatActivity;
        this.f102066b = h0Var;
    }

    @Override // tg3.x0
    public final void a(int i17, int i18, java.util.List list, byte[] bArr) {
        r45.ok0 ok0Var;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f102065a;
        if (i17 == 0 && i18 == 0) {
            boolean z17 = false;
            if (list != null && (ok0Var = (r45.ok0) kz5.n0.Z(list)) != null && ok0Var.f382318e == 0) {
                z17 = true;
            }
            if (!z17) {
                db5.t7.g(appCompatActivity, appCompatActivity.getString(com.tencent.mm.R.string.cwy));
            }
        } else {
            db5.t7.g(appCompatActivity, appCompatActivity.getString(com.tencent.mm.R.string.cwy));
        }
        ((az2.f) this.f102066b.f310123d).b();
    }
}

package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes4.dex */
public class i4 implements vg3.j3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.j4 f288312a;

    public i4(com.p314xaae8f345.mm.ui.p2690x38b72420.j4 j4Var) {
        this.f288312a = j4Var;
    }

    @Override // vg3.j3
    public void a(boolean z17, java.lang.String str, java.lang.String str2) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", str2);
            intent.putExtra("key_has_create_new_group", 1);
            com.p314xaae8f345.mm.ui.p2690x38b72420.j4 j4Var = this.f288312a;
            j4Var.f288490d.setResult(-1, intent);
            j4Var.f288490d.finish();
        }
    }
}

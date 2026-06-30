package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class g5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.i9 f102191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f102192c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f102193d;

    public g5(android.content.Context context, zy2.i9 i9Var, int i17, int i18) {
        this.f102190a = context;
        this.f102191b = i9Var;
        this.f102192c = i17;
        this.f102193d = i18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.plugin.finder.assist.j5.f102284b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.finder.assist.j5.f102284b = null;
        android.content.Context context = this.f102190a;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        if (((appCompatActivity == null || (mo133getLifecycle = appCompatActivity.mo133getLifecycle()) == null) ? null : mo133getLifecycle.b()) != androidx.lifecycle.n.RESUMED) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protocal.protobuf.FinderContact contact = ((com.tencent.mm.protocal.protobuf.FinderUserPageResponse) fVar.f70618d).getContact();
            java.lang.String username = contact != null ? contact.getUsername() : null;
            if (username == null || username.length() == 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderOpenSdkApi", "realUsername empty");
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderOpenSdkApi", "realUsername:" + username);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", username);
                zy2.i9 i9Var = this.f102191b;
                intent.putExtra("key_interaction_action_type", i9Var.f477424e);
                intent.putExtra("key_extra_info", "");
                int i17 = this.f102192c;
                intent.putExtra("key_card_type", i17);
                intent.putExtra("key_enter_scene", this.f102193d);
                java.lang.String Bj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(11, i17, 32, intent);
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(Bj);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(i9Var.f477421b)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21140, Bj, i9Var.f477421b, 0, username);
                }
                com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                kotlin.jvm.internal.o.d(context);
                i0Var.mk(context, intent);
            }
        }
        return jz5.f0.f302826a;
    }
}

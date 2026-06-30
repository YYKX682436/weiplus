package com.tencent.mm.feature.ecs.gift.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/feature/ecs/gift/ui/EcsGiftSendThanksLogicUI;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "a", "plugin-gift_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsGiftSendThanksLogicUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f65617h = 0;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f65618e = new androidx.lifecycle.j0(null);

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f65619f;

    /* renamed from: g, reason: collision with root package name */
    public o00.w f65620g;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/feature/ecs/gift/ui/EcsGiftSendThanksLogicUI$a;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "com/tencent/mm/feature/ecs/gift/ui/a", "plugin-gift_release"}, k = 1, mv = {1, 9, 0})
    @mk0.a
    /* loaded from: classes.dex */
    public static final class a implements com.tencent.mm.ipcinvoker.j {
        static {
            new com.tencent.mm.feature.ecs.gift.ui.a(null);
        }

        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            com.tencent.mm.storage.k4 Bi;
            com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
            com.tencent.mm.storage.z3 z3Var = null;
            java.lang.String str = iPCString != null ? iPCString.f68406d : null;
            vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
            boolean z17 = true;
            if (x3Var != null && (Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) x3Var).Bi()) != null) {
                z3Var = Bi.n(str, true);
            }
            if (rVar != null) {
                if (z3Var == null) {
                    z17 = false;
                } else if (!com.tencent.mm.storage.z3.R4(z3Var.d1())) {
                    z17 = z3Var.r2();
                }
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17));
            }
        }
    }

    public static final void O6(com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI ecsGiftSendThanksLogicUI, boolean z17) {
        ecsGiftSendThanksLogicUI.getClass();
        if (!z17) {
            ((j00.d2) ((c00.m3) i95.n0.c(c00.m3.class))).Di(false);
            ecsGiftSendThanksLogicUI.finish();
            return;
        }
        bw5.kf0 kf0Var = new bw5.kf0();
        kf0Var.f29367d = ecsGiftSendThanksLogicUI.f65619f;
        boolean[] zArr = kf0Var.f29369f;
        zArr[2] = true;
        kf0Var.f29368e = 1;
        zArr[3] = true;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = kf0Var;
        lVar.f70665b = new bw5.lf0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmec_sendthankspresent";
        lVar.f70667d = 16308;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new o00.g(ecsGiftSendThanksLogicUI));
    }

    public final void P6() {
        kotlinx.coroutines.y0 b17 = v65.m.b(this);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new o00.h(this, null), 2, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("order_id");
        if (stringExtra == null || stringExtra.length() == 0) {
            P6();
            return;
        }
        this.f65619f = stringExtra;
        bw5.cf0 cf0Var = new bw5.cf0();
        cf0Var.f26073d = stringExtra;
        boolean[] zArr = cf0Var.f26075f;
        zArr[2] = true;
        cf0Var.f26074e = 1;
        zArr[3] = true;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = cf0Var;
        lVar.f70665b = new bw5.df0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmec_getpresentuserattr";
        lVar.f70667d = 20679;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new o00.j(this));
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f65618e.observe(this, new o00.i(this));
    }
}

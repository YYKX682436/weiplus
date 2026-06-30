package b04;

/* loaded from: classes5.dex */
public final class f extends wm3.a implements ll5.h {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f16889d;

    /* renamed from: e, reason: collision with root package name */
    public wd0.t1 f16890e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f16891f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f16889d = jz5.h.b(b04.e.f16887d);
        this.f16891f = jz5.h.b(new b04.d(this));
    }

    public final int T6() {
        return ((java.lang.Number) ((jz5.n) this.f16891f).getValue()).intValue();
    }

    @Override // ll5.h
    public android.view.View i2() {
        com.tencent.mm.ui.widget.code.CodeItemView codeItemView = new com.tencent.mm.ui.widget.code.CodeItemView(getContext(), null, 2, null);
        ll5.a aVar = new ll5.a();
        aVar.f319266d = com.tencent.mm.R.raw.my_qr_code;
        aVar.f319267e = codeItemView.getContext().getColor(com.tencent.mm.R.color.Yellow_100);
        java.lang.String string = codeItemView.getContext().getString(com.tencent.mm.R.string.mec);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        aVar.f319268f = string;
        java.lang.String string2 = codeItemView.getContext().getString(com.tencent.mm.R.string.meb);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        aVar.f319269g = string2;
        aVar.f319270h = true;
        ((hs.d0) ((kd0.i2) i95.n0.c(kd0.i2.class))).wi(kd0.g3.f306647i, aVar, T6(), null);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            aVar.f319272m = true ^ ((c01.z1.j() & 2) != 0);
            kd0.i2 i2Var = (kd0.i2) i95.n0.c(kd0.i2.class);
            kd0.g3 g3Var = kd0.g3.f306648m;
            int T6 = T6();
            b04.a aVar2 = new b04.a(mMActivity, this, aVar, codeItemView);
            ((hs.d0) i2Var).getClass();
            aVar.f319273n = new hs.c0(g3Var, aVar, T6, aVar2);
        }
        aVar.f319271i = new b04.b(this, aVar, codeItemView);
        codeItemView.setViewModel(aVar);
        return codeItemView;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        wd0.v1 v1Var = (wd0.v1) i95.n0.c(wd0.v1.class);
        android.app.Activity context = getContext();
        int T6 = T6();
        long longValue = ((java.lang.Number) ((jz5.n) this.f16889d).getValue()).longValue();
        ((vd0.w2) v1Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.setting.ui.setting.i0 i0Var = (com.tencent.mm.plugin.setting.ui.setting.i0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.setting.ui.setting.i0.class);
        if (i0Var != null) {
            v24.e eVar = new v24.e(com.tencent.mm.plugin.setting.ui.setting.l.f161260g, longValue);
            eVar.f432914e = T6;
            v24.e.c(eVar, 1, i0Var.W6(), null, null, 0, 28, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        wd0.t1 t1Var = this.f16890e;
        if (t1Var != null) {
            ((com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView) t1Var).m();
        }
    }
}

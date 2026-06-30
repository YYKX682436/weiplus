package b04;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.f f16877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ll5.a f16878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.code.CodeItemView f16879f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b04.f fVar, ll5.a aVar, com.tencent.mm.ui.widget.code.CodeItemView codeItemView) {
        super(2);
        this.f16877d = fVar;
        this.f16878e = aVar;
        this.f16879f = codeItemView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.widget.FrameLayout expandContainer = (android.widget.FrameLayout) obj2;
        kotlin.jvm.internal.o.g(expandContainer, "expandContainer");
        expandContainer.toString();
        expandContainer.getChildCount();
        int childCount = expandContainer.getChildCount();
        b04.f fVar = this.f16877d;
        if (childCount == 0) {
            java.lang.Object obj3 = fVar.f16890e;
            java.lang.Object obj4 = obj3;
            if (obj3 == null) {
                wd0.v1 v1Var = (wd0.v1) i95.n0.c(wd0.v1.class);
                androidx.appcompat.app.AppCompatActivity context = fVar.getActivity();
                int T6 = fVar.T6();
                long longValue = ((java.lang.Number) ((jz5.n) fVar.f16889d).getValue()).longValue();
                ((vd0.w2) v1Var).getClass();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView selfQrCodeView = new com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView(context, longValue);
                selfQrCodeView.setMyQrCodeEnterScene(T6);
                if (T6 == 7) {
                    selfQrCodeView.n();
                }
                selfQrCodeView.setQrCodeEventListener(new b04.c(fVar));
                fVar.f16890e = selfQrCodeView;
                obj4 = selfQrCodeView;
            }
            android.view.View view = (android.view.View) obj4;
            wd0.t1 t1Var = fVar.f16890e;
            if (t1Var != null) {
                ((com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView) t1Var).p(booleanValue);
            }
            wd0.t1 t1Var2 = fVar.f16890e;
            if (t1Var2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelfQrCodeView", "updateQrCode");
                android.content.Context context2 = ((com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView) t1Var2).getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.setting.ui.setting.i0) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.setting.ui.setting.i0.class)).Z6(false, 0);
            }
            expandContainer.addView(view);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
        }
        wd0.t1 t1Var3 = fVar.f16890e;
        if (t1Var3 != null) {
            ((com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView) t1Var3).p(booleanValue);
        }
        if (booleanValue) {
            boolean z17 = !((c01.z1.j() & 2) != 0);
            ll5.a aVar = this.f16878e;
            if (aVar.f319272m != z17) {
                aVar.f319272m = z17;
                this.f16879f.setViewModel(aVar);
            }
        }
        return jz5.f0.f302826a;
    }
}

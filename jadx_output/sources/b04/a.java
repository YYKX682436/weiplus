package b04;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f16872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b04.f f16873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ll5.a f16874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.code.CodeItemView f16875g;

    public a(com.tencent.mm.ui.MMActivity mMActivity, b04.f fVar, ll5.a aVar, com.tencent.mm.ui.widget.code.CodeItemView codeItemView) {
        this.f16872d = mMActivity;
        this.f16873e = fVar;
        this.f16874f = aVar;
        this.f16875g = codeItemView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/qrcode/AddFriendCodeUIC$createItemView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wd0.v1 v1Var = (wd0.v1) i95.n0.c(wd0.v1.class);
        b04.f fVar = this.f16873e;
        int T6 = fVar.T6();
        long longValue = ((java.lang.Number) ((jz5.n) fVar.f16889d).getValue()).longValue();
        vd0.w2 w2Var = (vd0.w2) v1Var;
        w2Var.getClass();
        com.tencent.mm.ui.MMActivity context = this.f16872d;
        kotlin.jvm.internal.o.g(context, "context");
        vd0.v2 v2Var = new vd0.v2(w2Var, context);
        v24.e eVar = new v24.e(com.tencent.mm.plugin.setting.ui.setting.l.f161260g, longValue);
        eVar.f432914e = T6;
        r14.y yVar = new r14.y(context, v2Var, eVar);
        yVar.b();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = yVar.f368637e;
        if (k0Var != null) {
            k0Var.v();
        }
        ll5.a aVar = this.f16874f;
        if (!aVar.f319270h) {
            aVar.f319270h = true;
            this.f16875g.setViewModel(aVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/qrcode/AddFriendCodeUIC$createItemView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

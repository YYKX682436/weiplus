package b04;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f16938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.code.CodeItemView f16939e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b04.z f16940f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.util.List list, com.tencent.mm.ui.widget.code.CodeItemView codeItemView, b04.z zVar) {
        super(1);
        this.f16938d = list;
        this.f16939e = codeItemView;
        this.f16940f = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.widget.code.CodeItemView view = (com.tencent.mm.ui.widget.code.CodeItemView) obj;
        kotlin.jvm.internal.o.g(view, "view");
        ll5.a viewModel = view.getViewModel();
        if (viewModel != null && viewModel.f319270h) {
            for (com.tencent.mm.ui.widget.code.CodeItemView codeItemView : this.f16938d) {
                if (!kotlin.jvm.internal.o.b(codeItemView, this.f16939e)) {
                    this.f16940f.getClass();
                    ll5.a viewModel2 = codeItemView.getViewModel();
                    if (viewModel2 != null && viewModel2.f319270h) {
                        viewModel2.f319270h = false;
                        codeItemView.setViewModel(viewModel2);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

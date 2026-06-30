package b85;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f18349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f18350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.view.View view, android.view.MotionEvent motionEvent) {
        super(1);
        this.f18349d = view;
        this.f18350e = motionEvent;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fo3.r a17;
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig it = (com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig) obj;
        android.view.View view = this.f18349d;
        kotlin.jvm.internal.o.g(it, "it");
        try {
            a17 = b85.i.a(b85.i.f18352a, view, it);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Acc.NASC", th6, "throw in view(%s)", com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE.getName(view.getId()));
        }
        if (a17 == null) {
            return java.lang.Boolean.FALSE;
        }
        fo3.p pVar = a17.f264944a;
        if (!fo3.p.f264924f.a(pVar)) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.String h17 = pVar.h();
        java.lang.String str = "<" + pVar + '>';
        int action = this.f18350e.getAction();
        fo3.s sVar = fo3.s.INSTANCE;
        if (action == 0) {
            a17.f264946c = 0;
            sVar.Z7(h17, str);
        } else if (action == 1) {
            sVar.qi(h17, this.f18350e, false, "", a17.f264946c);
            sVar.Qa(h17);
            w04.l.INSTANCE.eg(540999731, h17, a17);
        } else if (action == 2) {
            a17.f264946c++;
        }
        return java.lang.Boolean.FALSE;
    }
}

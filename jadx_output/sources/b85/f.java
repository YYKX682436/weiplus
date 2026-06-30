package b85;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f18348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.view.View view) {
        super(1);
        this.f18348d = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fo3.r a17;
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig it = (com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig) obj;
        android.view.View view = this.f18348d;
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
        fo3.s sVar = fo3.s.INSTANCE;
        sVar.Z7(h17, "<" + pVar + '>');
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535);
        sVar.mi(h17, obtain, true);
        sVar.Qa(h17);
        w04.l.INSTANCE.eg(540999732, h17, a17);
        obtain.recycle();
        return java.lang.Boolean.FALSE;
    }
}

package ei4;

/* loaded from: classes9.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f334763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.s f334764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l75.w0 w0Var, ei4.s sVar) {
        super(0);
        this.f334763d = w0Var;
        this.f334764e = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        l75.w0 w0Var = this.f334763d;
        java.lang.Object obj = w0Var.f398509d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.model.storage.TextStatusStrangerContact");
        mj4.w wVar = (mj4.w) obj;
        int i17 = w0Var.f398507b;
        if (i17 == 2 || i17 == 3) {
            ei4.s sVar = this.f334764e;
            java.util.LinkedList linkedList = sVar.f334772e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkedList, "<this>");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            int i18 = 0;
            for (java.lang.Object obj2 : linkedList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((hi4.e) obj2).f76597x1c3513c9, wVar.f76642xbed8694c)) {
                    linkedList2.add(java.lang.Integer.valueOf(i18));
                }
                i18 = i19;
            }
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                if (intValue >= 0 && intValue < linkedList.size()) {
                    sVar.m8147xed6e4d18(intValue);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}

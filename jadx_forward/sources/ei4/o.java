package ei4;

/* loaded from: classes9.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f334765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.s f334766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l75.w0 w0Var, ei4.s sVar) {
        super(0);
        this.f334765d = w0Var;
        this.f334766e = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj = this.f334765d.f398509d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.data.TextStatusConversation");
        hi4.a aVar = (hi4.a) obj;
        ei4.s sVar = this.f334766e;
        java.util.LinkedList linkedList = sVar.f334772e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkedList, "<this>");
        java.util.Iterator it = linkedList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((hi4.e) next).f76597x1c3513c9, aVar.f76582xbed8694c)) {
                break;
            }
            i17 = i18;
        }
        if (i17 >= 0 && i17 < linkedList.size()) {
            sVar.m8147xed6e4d18(i17);
        }
        return jz5.f0.f384359a;
    }
}

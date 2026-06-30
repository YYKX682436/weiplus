package hi4;

/* loaded from: classes11.dex */
public final class b implements wn.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f363076a;

    public b(int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f363076a = (i19 & 2) != 0 ? 1 : i18;
    }

    @Override // wn.b
    public java.util.List a(int i17) {
        l75.n0 c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.storage.TextStatusConversationStorage");
        return ((li4.a) c17).L0(i17, 60, null, this.f363076a);
    }

    @Override // wn.b
    public java.util.List b() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        l75.n0 c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.storage.TextStatusConversationStorage");
        java.util.List L0 = ((li4.a) c17).L0(0, 15, null, this.f363076a);
        if (!L0.isEmpty()) {
            linkedList.addAll(L0);
        }
        ni4.x.f419309d.k().getClass();
        return linkedList;
    }

    @Override // wn.b
    public l75.n0 c() {
        return ni4.x.f419309d.h();
    }
}

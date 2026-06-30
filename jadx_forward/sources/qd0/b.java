package qd0;

/* loaded from: classes9.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f443060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, java.util.LinkedList linkedList) {
        super(0);
        this.f443059d = str;
        this.f443060e = linkedList;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ti3.c cVar = ti3.c.f501112a;
        java.lang.String msgTalker = this.f443059d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        java.util.LinkedList recentAtRecord = this.f443060e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recentAtRecord, "recentAtRecord");
        g15.b a17 = cVar.a(msgTalker);
        if (a17 == null) {
            a17 = new g15.b();
        }
        a17.r(recentAtRecord);
        cVar.b().a(msgTalker, a17.m126747x696739c(), false);
        return jz5.f0.f384359a;
    }
}

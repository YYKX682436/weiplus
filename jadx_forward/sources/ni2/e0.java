package ni2;

/* loaded from: classes10.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.h0 f418815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ni2.h0 h0Var) {
        super(1);
        this.f418815d = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        aj2.d it = (aj2.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it instanceof aj2.e) {
            ni2.h0 h0Var = this.f418815d;
            if (h0Var.f418849r.f292896x) {
                java.lang.String str3 = h0Var.f418852u;
                java.lang.String str4 = "";
                km2.q qVar = ((aj2.e) it).f86835a;
                if (qVar == null || (str = qVar.f390703a) == null) {
                    str = "";
                }
                h0Var.e(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str));
                if (qVar != null && (str2 = qVar.f390703a) != null) {
                    str4 = str2;
                }
                h0Var.f418852u = str4;
                bj2.b bVar = h0Var.B;
                java.util.LinkedList linkedList = bVar.f102680f;
                if (linkedList != null) {
                    bVar.b(h0Var.f418855x == 2 ? 4 : 2, linkedList, str4);
                }
                java.util.Iterator it6 = ((java.util.ArrayList) ((jz5.n) h0Var.D).mo141623x754a37bb()).iterator();
                while (true) {
                    java.lang.String str5 = null;
                    if (!it6.hasNext()) {
                        break;
                    }
                    aj2.a aVar = (aj2.a) it6.next();
                    km2.q qVar2 = aVar.f86825d;
                    if (qVar2 != null) {
                        str5 = qVar2.f390703a;
                    }
                    aVar.f86826e = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, h0Var.f418852u);
                }
                aj2.f fVar = h0Var.E;
                if (fVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("focusSelectAdapter");
                    throw null;
                }
                fVar.m8146xced61ae5();
            }
        }
        return jz5.f0.f384359a;
    }
}

package ch2;

/* loaded from: classes10.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f41384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(ch2.o2 o2Var, java.util.LinkedList linkedList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41383d = o2Var;
        this.f41384e = linkedList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.j1(this.f41383d, this.f41384e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ch2.j1 j1Var = (ch2.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ch2.o2 o2Var = this.f41383d;
        om2.g q76 = o2Var.q7();
        java.util.LinkedList list = this.f41384e;
        kotlin.jvm.internal.o.f(list, "$list");
        if (!q76.N6(list)) {
            kotlin.jvm.internal.o.f(list, "$list");
            java.util.Iterator it = list.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (kotlin.jvm.internal.o.b(((r45.yx1) it.next()).f391469r, o2Var.h7().m8())) {
                    break;
                }
                i17++;
            }
            if (i17 > 0) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.mjn, new java.lang.Integer(i17)), 0).show();
            }
        }
        return jz5.f0.f302826a;
    }
}

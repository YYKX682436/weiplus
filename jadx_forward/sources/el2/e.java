package el2;

/* loaded from: classes3.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f335311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f335312e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(el2.i0 i0Var, android.content.Context context) {
        super(1);
        this.f335311d = i0Var;
        this.f335312e = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        long longValue = ((java.lang.Number) obj).longValue();
        el2.i0 i0Var = this.f335311d;
        java.util.LinkedList linkedList = i0Var.Q.f103895e;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                boolean z17 = false;
                if (((r45.z42) obj2).m75942xfb822ef2(0) == longValue) {
                    z17 = true;
                }
                if (z17) {
                    break;
                }
            }
            r45.z42 z42Var = (r45.z42) obj2;
            if (z42Var != null) {
                wt2.a aVar = i0Var.I;
                if (aVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                    throw null;
                }
                aVar.O1(z42Var, new el2.d(this.f335312e, i0Var));
            }
        }
        return jz5.f0.f384359a;
    }
}

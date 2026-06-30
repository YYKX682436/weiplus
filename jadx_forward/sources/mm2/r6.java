package mm2;

/* loaded from: classes3.dex */
public final class r6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.w6 f410914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.o6 f410915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(mm2.w6 w6Var, mm2.o6 o6Var) {
        super(0);
        this.f410914d = w6Var;
        this.f410915e = o6Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mm2.o6 o6Var;
        java.lang.Object obj;
        mm2.w6 w6Var = this.f410914d;
        java.util.Iterator it = w6Var.f411051f.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            o6Var = this.f410915e;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.o6) obj).f410870a.f410890d, o6Var.f410870a.f410890d)) {
                break;
            }
        }
        if (obj == null) {
            java.util.LinkedList linkedList = w6Var.f411051f;
            linkedList.add(o6Var);
            if (linkedList.size() > 1) {
                kz5.g0.t(linkedList, new mm2.q6());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveToastManagerSlice", "offer state: " + o6Var + " toastList: " + linkedList);
        }
        return jz5.f0.f384359a;
    }
}

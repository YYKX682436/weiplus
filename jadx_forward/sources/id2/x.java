package id2;

/* loaded from: classes3.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(id2.v1 v1Var) {
        super(1);
        this.f372403d = v1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        dl2.g gVar = (dl2.g) obj;
        if (gVar != null) {
            int i17 = gVar.f316753a;
            id2.v1 v1Var = this.f372403d;
            v1Var.L = i17;
            v1Var.W6(null);
            long j17 = gVar.f316754b;
            ((android.widget.TextView) ((jz5.n) v1Var.f372371h).mo141623x754a37bb()).setText(java.lang.String.valueOf(j17));
            v1Var.H = j17;
            java.util.LinkedList<dl2.f> linkedList = gVar.f316755c;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (dl2.f fVar : linkedList) {
                boolean z17 = fVar.f316728a;
                r45.n30 n30Var = fVar.f316729b;
                if (!z17) {
                    n30Var.set(1, 0);
                }
                arrayList.add(n30Var);
            }
            v1Var.D = new java.util.LinkedList(arrayList);
            ((id2.q) ((jz5.n) v1Var.B).mo141623x754a37bb()).x();
        }
        return jz5.f0.f384359a;
    }
}

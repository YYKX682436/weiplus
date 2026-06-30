package f0;

/* loaded from: classes5.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.q f339578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(f0.q qVar) {
        super(1);
        this.f339578d = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object needle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(needle, "needle");
        f0.q qVar = this.f339578d;
        f0.c2 c2Var = new f0.c2(qVar);
        int e17 = ((f0.s) qVar).e();
        int i17 = 0;
        while (true) {
            if (i17 >= e17) {
                i17 = -1;
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c2Var.mo146xb9724478(java.lang.Integer.valueOf(i17)), needle)) {
                break;
            }
            i17++;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
